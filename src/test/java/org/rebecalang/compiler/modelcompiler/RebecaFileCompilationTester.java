package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.utils.ExceptionContainer;

import java.io.*;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by farzad on 7/12/17.
 */
public class RebecaFileCompilationTester {
    private static String errorComment = "/*ERROR*/";

    private Logger logger = Logger.getLogger(this.getClass().getName());
    private File rebecaFile;
    private int firstErrorLine;

    public RebecaFileCompilationTester(File rebecaFile) throws Exception {
        if (! CompilerTestUtils.isRebecaFile(rebecaFile))
            throw new Exception("Not a Rebeca file");
        this.rebecaFile = rebecaFile;
        findFirstErrorLine();
    }

    public boolean testCompilation() throws IOException {
        logger.log(Level.INFO, "testing compialation of file " + rebecaFile.getName());
        int firstErrorLineByCompilation = findFirstErrorLineByCompilation();
        if (firstErrorLine != firstErrorLineByCompilation) {
            logger.log(Level.SEVERE, rebecaFile.getName() + " Was not compiled as expected: ");
            logger.log(Level.SEVERE, "FirstErrorLine = " + firstErrorLine + ", FirstErrorLineByCompilation" +
                    " = " + firstErrorLineByCompilation);
            return false;
        }
        return true;
    }

    //0 if no error
    private void findFirstErrorLine() throws IOException {
        LineNumberReader lineReader = new LineNumberReader(new FileReader(rebecaFile));

        String lineContents;
        while (true) {
            lineContents = lineReader.readLine();
            if (lineContents == null) {
                firstErrorLine = 0;
                break;
            }
            if (lineContents.contains(errorComment)) {
                firstErrorLine = lineReader.getLineNumber() - 1;
                break;
            }
        }
    }

    private int findFirstErrorLineByCompilation() {
        int firstErrorLineByCompilation = 0;
        try {
            CompilerTestUtils.compileRebecaFile(rebecaFile);
        } catch (ExceptionContainer ec) {
            Set<Exception> exceptions = ec.getExceptions();
            for (Exception e : exceptions) {
                firstErrorLineByCompilation = extractExceptionLineNumber(e);
//                break;
            }
        }
        return firstErrorLineByCompilation;
    }

    private int extractExceptionLineNumber(Exception e) {
        String msg = e.toString();
        int colonIdx = msg.indexOf(":");
        int camaIdx = msg.indexOf(",");
        String lineNumberStr = msg.substring(colonIdx+1, camaIdx);
        return Integer.parseInt(lineNumberStr);
    }
}
