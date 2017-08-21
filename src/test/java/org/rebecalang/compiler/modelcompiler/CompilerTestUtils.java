package org.rebecalang.compiler.modelcompiler;

import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;

import java.io.File;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by farzad on 7/6/17.
 */
public class CompilerTestUtils {


    public static void compileRebecaFile(File rebecaFile) throws ExceptionContainer {
        Set<CompilerFeature> features = new HashSet<CompilerFeature>();
        features.add(CompilerFeature.CORE_2_1);
        RebecaCompiler compiler = new RebecaCompiler();
        compiler.compileRebecaFile(rebecaFile, features);
//        System.out.println(rebecaFile.getName() + " compiled.");
        if (compiler.getExceptionContainer().getExceptions().size() != 0) {
            throw compiler.getExceptionContainer();
        }
    }

    public static boolean isRebecaFile(File file) {
        return file.getName().endsWith(".rebeca");
    }

}
