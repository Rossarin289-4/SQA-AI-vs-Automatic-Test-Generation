package org.apache.commons.jxpath.ri.compiler;

import java.util.List;

import junit.framework.TestCase;

import org.apache.commons.jxpath.ClassFunctions;
import org.apache.commons.jxpath.FunctionLibrary;
import org.apache.commons.jxpath.JXPathContext;
import org.apache.commons.jxpath.PackageFunctions;
import org.apache.commons.jxpath.TestBean;
import org.apache.commons.jxpath.Variables;

public class JxPath2GeminiTest extends TestCase {

    public void testNodeSetFunctionReturnsUnderlyingNodes() {
        TestBean testBean = new TestBean();
        JXPathContext context = JXPathContext.newContext(testBean);

        Variables vars = context.getVariables();
        vars.declareVariable("test", new TestFunctions(4, "test"));

        FunctionLibrary lib = new FunctionLibrary();
        lib.addFunctions(new ClassFunctions(TestFunctions.class, "test"));
        lib.addFunctions(new ClassFunctions(TestFunctions2.class, "test"));
        lib.addFunctions(new PackageFunctions("", "call"));
        lib.addFunctions(
            new PackageFunctions(
                "org.apache.commons.jxpath.ri.compiler.",
                "jxpathtest"));
        lib.addFunctions(new PackageFunctions("", null));

        context.setFunctions(lib);

        List nodes = context.selectNodes("test:nodeSet()");

        assertEquals(2, nodes.size());
        assertEquals(testBean.getBeans()[0], nodes.get(0));
        assertEquals(testBean.getBeans()[1], nodes.get(1));
    }
}
