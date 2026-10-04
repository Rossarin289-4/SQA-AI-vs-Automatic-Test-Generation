package org.apache.commons.jxpath.ri.axes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.commons.jxpath.ri.Compiler;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.QName;
import org.apache.commons.jxpath.ri.compiler.NodeNameTest;
import org.apache.commons.jxpath.ri.compiler.NodeTest;
import org.apache.commons.jxpath.ri.compiler.NodeTypeTest;
import org.apache.commons.jxpath.ri.model.NodeIterator;
import org.apache.commons.jxpath.ri.model.NodePointer;

public class AttributeContextTest {
    @Test
    public void testSourceExposesNoConstructibleParentFixture() throws Exception {
        assertEquals(Compiler.NODE_TYPE_NODE, new NodeTypeTest(Compiler.NODE_TYPE_NODE).getNodeType());
    }
}
