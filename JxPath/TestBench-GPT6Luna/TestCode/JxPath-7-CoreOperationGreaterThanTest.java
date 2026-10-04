package org.apache.commons.jxpath.ri.compiler;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import org.apache.commons.jxpath.ri.EvalContext;
import org.apache.commons.jxpath.ri.InfoSetUtil;
import org.apache.commons.jxpath.ri.axes.InitialContext;
import org.apache.commons.jxpath.ri.axes.SelfContext;

public class CoreOperationGreaterThanTest {
    @Test
    public void testSymbol() throws Exception {
        assertEquals(">", new CoreOperationGreaterThan(null, null).getSymbol());
    }

    @Test
    public void testGreaterNumbers() throws Exception {
        assertTrue(new CoreOperationGreaterThan(
                new Literal(2), new Literal(1)).computeValue(null).equals(Boolean.TRUE));
    }

    private static class Literal extends Expression {
        private final Object value;

        Literal(Object value) {
            this.value = value;
        }

        public boolean computeContextDependent() {
            return false;
        }

        public Object computeValue(EvalContext context) {
            return value;
        }

        public Object compute(EvalContext context) {
            return computeValue(context);
        }
    }
}
