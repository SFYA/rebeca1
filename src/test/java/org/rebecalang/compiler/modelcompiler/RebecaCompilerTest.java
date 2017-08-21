package org.rebecalang.compiler.modelcompiler;

import org.junit.*;
import org.rebecalang.compiler.modelcompiler.corerebeca.objectmodel.RebecaModel;
import org.rebecalang.compiler.utils.CompilerFeature;
import org.rebecalang.compiler.utils.ExceptionContainer;
import org.rebecalang.compiler.utils.Pair;

import java.io.File;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by farzad on 6/22/17.
 */
public class RebecaCompilerTest {
    @Test
    public void test1() {
        assert (true);
    }

    @Test
    public void testCompileMethod1() throws ExceptionContainer {
        File rebecaFile = new File("/home/farzad/Projects/rebeca/SampleCodes/Dining-Philosophers/phils.rebeca");

        Set<CompilerFeature> features = new HashSet<CompilerFeature>();
        features.add(CompilerFeature.CORE_2_1);
        RebecaCompiler compiler = new RebecaCompiler();
        compiler.compileRebecaFile(rebecaFile, features);
        if (compiler.getExceptionContainer().getExceptions().size() != 0) {
            throw compiler.getExceptionContainer();
        }
    }
}
