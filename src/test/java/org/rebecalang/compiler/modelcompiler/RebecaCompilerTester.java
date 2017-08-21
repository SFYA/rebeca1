package org.rebecalang.compiler.modelcompiler;

import org.junit.*;
import org.rebecalang.compiler.utils.ExceptionContainer;

import java.io.File;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.fail;

/**
 * Created by farzad on 7/6/17.
 */
public class RebecaCompilerTester {

//    private static String baseDir = "/home/farzad/Projects/rebeca/SampleCodes/CorrectFiles/";
//    private static String baseDir = "/home/farzad/Projects/rebeca/SampleCodes/tests/";
    private static String baseDir = "./sampleRebecaFiles";
    private Logger logger = Logger.getLogger(this.getClass().getName());

    @Test
    public void testFilesCompilation() {

        boolean allFilesCompiledAsExpected = true;


        File folder = new File(baseDir);
        File[] rebecaFiles = folder.listFiles();
        if (rebecaFiles != null) {
            for (File rebecaFile : rebecaFiles) {
                try {
                    if (CompilerTestUtils.isRebecaFile(rebecaFile)) {
                        if (!new RebecaFileCompilationTester(rebecaFile).testCompilation())
                            allFilesCompiledAsExpected = false;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } else {
            logger.log(Level.SEVERE, "Error while listing correct files in directory");
            fail();
        }

        assertEquals(true, allFilesCompiledAsExpected);
    }

    private void printExceptionContainerMsgs(ExceptionContainer ec) {
        Set<Exception> exceptions = ec.getExceptions();
        logger.log(Level.INFO, "EXEPTIONS MSGS : ");
        for (Exception e : exceptions) {
            System.out.println(e.toString());
        }
    }
}
