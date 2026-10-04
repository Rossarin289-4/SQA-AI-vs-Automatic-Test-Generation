package org.apache.commons.lang3.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.SystemUtils;

public class ToStringStyleTest {
    @Test
    public void testAppendPrimitiveInt() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "n", 7);
        assertEquals("n=7,", buffer.toString());
    }

    @Test
    public void testAppendNegativeIntEdge() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "n", Integer.MIN_VALUE);
        assertEquals("n=-2147483648,", buffer.toString());
    }

    @Test
    public void testAppendLongMaximum() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "n", Long.MAX_VALUE);
        assertEquals("n=9223372036854775807,", buffer.toString());
    }

    @Test
    public void testAppendNullObject() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "v", (Object) null, Boolean.TRUE);
        assertEquals("v=<null>,", buffer.toString());
    }

    @Test
    public void testAppendObjectDetail() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "v", "text", Boolean.TRUE);
        assertEquals("v=text,", buffer.toString());
    }

    @Test
    public void testAppendObjectSummary() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "v", "text", Boolean.FALSE);
        assertEquals("v=<String>,", buffer.toString());
    }

    @Test
    public void testAppendObjectNullDetailUsesDefault() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "v", "text", null);
        assertEquals("v=text,", buffer.toString());
    }

    @Test
    public void testAppendEmptyObjectArrayDetail() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "a", new Object[0], Boolean.TRUE);
        assertEquals("a={},", buffer.toString());
    }

    @Test
    public void testAppendObjectArrayWithNull() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "a", new Object[] {"x", null}, Boolean.TRUE);
        assertEquals("a={x,<null>},", buffer.toString());
    }

    @Test
    public void testAppendObjectArraySummarySize() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.append(buffer, "a", new Object[] {"x", "y"}, Boolean.FALSE);
        assertEquals("a=<size=2>,", buffer.toString());
    }

    @Test
    public void testAppendSuperExtractsContent() throws Exception {
        StringBuffer buffer = new StringBuffer("start[");
        ToStringStyle.DEFAULT_STYLE.appendSuper(buffer, "Parent@1[x=2]");
        assertEquals("start[x=2,", buffer.toString());
    }

    @Test
    public void testAppendSuperIgnoresNull() throws Exception {
        StringBuffer buffer = new StringBuffer("start");
        ToStringStyle.DEFAULT_STYLE.appendSuper(buffer, null);
        assertEquals("start", buffer.toString());
    }

    @Test
    public void testAppendToStringExtractsMultipleFields() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.appendToString(buffer, "Parent[x=1,y=2]");
        assertEquals("x=1,y=2,", buffer.toString());
    }

    @Test
    public void testAppendToStringIgnoresMissingContentStart() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.DEFAULT_STYLE.appendToString(buffer, "Parent x=1]");
        assertEquals("Parent x=1,", buffer.toString());
    }

    @Test
    public void testAppendStartWithDefaultStyle() throws Exception {
        StringBuffer buffer = new StringBuffer();
        Object value = new Object();
        ToStringStyle.DEFAULT_STYLE.appendStart(buffer, value);
        assertEquals(Object.class.getName() + "@"
                + Integer.toHexString(System.identityHashCode(value)) + "[",
                buffer.toString());
        ToStringStyle.DEFAULT_STYLE.appendEnd(new StringBuffer(), value);
    }

    @Test
    public void testAppendStartWithSimpleStyle() throws Exception {
        StringBuffer buffer = new StringBuffer();
        ToStringStyle.SIMPLE_STYLE.appendStart(buffer, new Object());
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendStartIgnoresNullObject() throws Exception {
        StringBuffer buffer = new StringBuffer("prefix");
        ToStringStyle.DEFAULT_STYLE.appendStart(buffer, null);
        assertEquals("prefix", buffer.toString());
    }

    @Test
    public void testAppendEndRemovesTrailingSeparator() throws Exception {
        StringBuffer buffer = new StringBuffer("value,");
        ToStringStyle.DEFAULT_STYLE.appendEnd(buffer, null);
        assertEquals("value]", buffer.toString());
    }

    @Test
    public void testAppendEndPreservesNonSeparatorSuffix() throws Exception {
        StringBuffer buffer = new StringBuffer("value");
        ToStringStyle.DEFAULT_STYLE.appendEnd(buffer, null);
        assertEquals("value]", buffer.toString());
    }

    @Test
    public void testAppendEndSimpleStyle() throws Exception {
        StringBuffer buffer = new StringBuffer("value,");
        ToStringStyle.SIMPLE_STYLE.appendEnd(buffer, null);
        assertEquals("value", buffer.toString());
    }

    @Test
    public void testAppendEndMultiLineStyle() throws Exception {
        StringBuffer buffer = new StringBuffer("value,");
        ToStringStyle.MULTI_LINE_STYLE.appendEnd(buffer, null);
        assertEquals("value" + SystemUtils.LINE_SEPARATOR + "]", buffer.toString());
    }
}
