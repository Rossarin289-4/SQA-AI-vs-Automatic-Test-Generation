```java
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
    public void testAppendSuper_NullString() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        StringBuffer buffer = new StringBuffer();
        style.appendSuper(buffer, null);
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendSuper_EmptyString() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        StringBuffer buffer = new StringBuffer();
        style.appendSuper(buffer, "");
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendSuper_ValidString() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setContentStart("[");
        style.setContentEnd("]");
        style.setFieldSeparator(",");
        StringBuffer buffer = new StringBuffer();
        style.appendSuper(buffer, "SomeClass@123[field1=value1,field2=value2]");
        assertEquals("field1=value1,field2=value2,", buffer.toString());
    }

    @Test
    public void testAppendSuper_ValidString_NoContent() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setContentStart("");
        style.setContentEnd("");
        style.setFieldSeparator(",");
        StringBuffer buffer = new StringBuffer();
        style.appendSuper(buffer, "SomeClass@123field1=value1,field2=value2");
        assertEquals("field1=value1,field2=value2", buffer.toString());
    }

    @Test
    public void testAppendToString_NullString() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        StringBuffer buffer = new StringBuffer();
        style.appendToString(buffer, null);
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendToString_EmptyString() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        StringBuffer buffer = new StringBuffer();
        style.appendToString(buffer, "");
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendToString_ValidString() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setContentStart("[");
        style.setContentEnd("]");
        style.setFieldSeparator(",");
        style.setFieldSeparatorAtStart(true); // This should be removed by removeLastFieldSeparator
        StringBuffer buffer = new StringBuffer();
        style.appendToString(buffer, "SomeClass@123[field1=value1,field2=value2]");
        assertEquals("field1=value1,field2=value2,", buffer.toString());
    }

    @Test
    public void testAppendToString_ValidString_NoContent() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setContentStart("");
        style.setContentEnd("");
        style.setFieldSeparator(",");
        StringBuffer buffer = new StringBuffer();
        style.appendToString(buffer, "SomeClass@123field1=value1,field2=value2");
        assertEquals("field1=value1,field2=value2", buffer.toString());
    }

    @Test
    public void testAppendStart_NullObject() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        StringBuffer buffer = new StringBuffer();
        style.appendStart(buffer, null);
        assertEquals("", buffer.toString());
    }

    @Test
    public void testAppendStart_NonNullObject_DefaultSettings() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        style.appendStart(buffer, obj);
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj)) + "[";
        assertEquals(expected, buffer.toString());
    }

    @Test
    public void testAppendStart_NonNullObject_NoClassName() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setUseClassName(false);
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        style.appendStart(buffer, obj);
        String expected = "@" + Integer.toHexString(System.identityHashCode(obj)) + "[";
        assertEquals(expected, buffer.toString());
    }

    @Test
    public void testAppendStart_NonNullObject_NoIdentityHashCode() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setUseIdentityHashCode(false);
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        style.appendStart(buffer, obj);
        String expected = obj.getClass().getName() + "[";
        assertEquals(expected, buffer.toString());
    }

    @Test
    public void testAppendStart_NonNullObject_ShortClassName() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setUseShortClassName(true);
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        style.appendStart(buffer, obj);
        String expected = ClassUtils.getShortClassName(obj.getClass()) + "@" + Integer.toHexString(System.identityHashCode(obj)) + "[";
        assertEquals(expected, buffer.toString());
    }

    @Test
    public void testAppendStart_NonNullObject_FieldSeparatorAtStart() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparatorAtStart(true);
        style.setFieldSeparator(",");
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        style.appendStart(buffer, obj);
        String expected = obj.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(obj)) + ",[";
        assertEquals(expected, buffer.toString());
    }

    @Test
    public void testAppendEnd_DefaultSettings() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc"); // Simulate some content
        style.appendEnd(buffer, obj);
        assertEquals("abc]", buffer.toString());
    }

    @Test
    public void testAppendEnd_FieldSeparatorAtEnd_True() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparatorAtEnd(true);
        style.setFieldSeparator(",");
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc,"); // Simulate content with trailing separator
        style.appendEnd(buffer, obj);
        assertEquals("abc,]", buffer.toString());
    }

    @Test
    public void testAppendEnd_FieldSeparatorAtEnd_False() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparatorAtEnd(false);
        style.setFieldSeparator(",");
        Object obj = new Object();
        StringBuffer buffer = new StringBuffer();
        buffer.append("abc,"); // Simulate content with trailing separator
        style.appendEnd(buffer, obj);
        assertEquals("abc]", buffer.toString());
    }

    @Test
    public void testAppend_NullValue() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setNullText("<null>");
        style.setFieldSeparator(",");
        StringBuffer buffer = new StringBuffer();
        style.append(buffer, "fieldName", null, null);
        assertEquals("fieldName=<null>,", buffer.toString());
    }

    @Test
    public void testAppend_ObjectValue_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        StringBuffer buffer = new StringBuffer();
        String value = "testValue";
        style.append(buffer, "fieldName", value, Boolean.TRUE);
        assertEquals("fieldName=testValue,", buffer.toString());
    }

    @Test
    public void testAppend_ObjectValue_SummaryDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setSummaryObjectStartText("<");
        style.setSummaryObjectEndText(">");
        StringBuffer buffer = new StringBuffer();
        String value = "testValue";
        style.append(buffer, "fieldName", value, Boolean.FALSE);
        assertEquals("fieldName=<String>,", buffer.toString());
    }

    @Test
    public void testAppend_ObjectValue_DefaultDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        StringBuffer buffer = new StringBuffer();
        style.setDefaultFullDetail(true);
        String value = "testValue";
        style.append(buffer, "fieldName", value, null);
        assertEquals("fieldName=testValue,", buffer.toString());

        buffer.setLength(0);
        style.setDefaultFullDetail(false);
        style.setSummaryObjectStartText("<");
        style.setSummaryObjectEndText(">");
        style.append(buffer, "fieldName", value, null);
        assertEquals("fieldName=<String>,", buffer.toString());
    }

    @Test
    public void testAppend_LongArray_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setArrayStart("{");
        style.setArrayEnd("}");
        style.setArraySeparator("|");
        StringBuffer buffer = new StringBuffer();
        long[] array = {1L, 2L, 3L};
        style.append(buffer, "fieldName", array, Boolean.TRUE);
        assertEquals("fieldName={1|2|3},", buffer.toString());
    }

    @Test
    public void testAppend_LongArray_Summary() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setSizeStartText("<size=");
        style.setSizeEndText(">");
        StringBuffer buffer = new StringBuffer();
        long[] array = {1L, 2L, 3L};
        style.append(buffer, "fieldName", array, Boolean.FALSE);
        assertEquals("fieldName=<size=3>,", buffer.toString());
    }

    @Test
    public void testAppend_IntArray_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setArrayStart("{");
        style.setArrayEnd("}");
        style.setArraySeparator("|");
        StringBuffer buffer = new StringBuffer();
        int[] array = {1, 2, 3};
        style.append(buffer, "fieldName", array, Boolean.TRUE);
        assertEquals("fieldName={1|2|3},", buffer.toString());
    }

    @Test
    public void testAppend_IntArray_Summary() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setSizeStartText("<size=");
        style.setSizeEndText(">");
        StringBuffer buffer = new StringBuffer();
        int[] array = {1, 2, 3};
        style.append(buffer, "fieldName", array, Boolean.FALSE);
        assertEquals("fieldName=<size=3>,", buffer.toString());
    }

    @Test
    public void testAppend_CharArray_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setArrayStart("{");
        style.setArrayEnd("}");
        style.setArraySeparator("|");
        StringBuffer buffer = new StringBuffer();
        char[] array = {'a', 'b', 'c'};
        style.append(buffer, "fieldName", array, Boolean.TRUE);
        assertEquals("fieldName={a|b|c},", buffer.toString());
    }

    @Test
    public void testAppend_CharArray_Summary() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setSizeStartText("<size=");
        style.setSizeEndText(">");
        StringBuffer buffer = new StringBuffer();
        char[] array = {'a', 'b', 'c'};
        style.append(buffer, "fieldName", array, Boolean.FALSE);
        assertEquals("fieldName=<size=3>,", buffer.toString());
    }

    @Test
    public void testAppend_FloatArray_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setArrayStart("{");
        style.setArrayEnd("}");
        style.setArraySeparator("|");
        StringBuffer buffer = new StringBuffer();
        float[] array = {1.1f, 2.2f, 3.3f};
        style.append(buffer, "fieldName", array, Boolean.TRUE);
        assertEquals("fieldName={1.1|2.2|3.3},", buffer.toString());
    }

    @Test
    public void testAppend_FloatArray_Summary() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setSizeStartText("<size=");
        style.setSizeEndText(">");
        StringBuffer buffer = new StringBuffer();
        float[] array = {1.1f, 2.2f, 3.3f};
        style.append(buffer, "fieldName", array, Boolean.FALSE);
        assertEquals("fieldName=<size=3>,", buffer.toString());
    }

    @Test
    public void testAppend_BooleanArray_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setArrayStart("{");
        style.setArrayEnd("}");
        style.setArraySeparator("|");
        StringBuffer buffer = new StringBuffer();
        boolean[] array = {true, false, true};
        style.append(buffer, "fieldName", array, Boolean.TRUE);
        assertEquals("fieldName={true|false|true},", buffer.toString());
    }

    @Test
    public void testAppend_BooleanArray_Summary() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setSizeStartText("<size=");
        style.setSizeEndText(">");
        StringBuffer buffer = new StringBuffer();
        boolean[] array = {true, false, true};
        style.append(buffer, "fieldName", array, Boolean.FALSE);
        assertEquals("fieldName=<size=3>,", buffer.toString());
    }

    @Test
    public void testAppend_EmptyObjectArray_FullDetail() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setArrayStart("{");
        style.setArrayEnd("}");
        StringBuffer buffer = new StringBuffer();
        Object[] array = {};
        style.append(buffer, "fieldName", array, Boolean.TRUE);
        assertEquals("fieldName={},", buffer.toString());
    }

    @Test
    public void testAppend_NullObjectArray() throws Exception {
        ToStringStyle style = new MockToStringStyle();
        style.setFieldSeparator(",");
        style.setNullText("<null>");
        StringBuffer buffer = new StringBuffer();
        // The ambiguous method call for boolean[] and float[] was fixed by explicitly casting.
        // For null, it's best to explicitly cast to Object[] to avoid ambiguity.
        style.append(buffer, "fieldName", (Object[]) null, Boolean.TRUE);
        assertEquals("fieldName=<null>,", buffer.toString());
    }

    // Mock class to allow testing of abstract methods and protected setters
    private static class MockToStringStyle extends ToStringStyle {
        private static final long serialVersionUID = 1L;

        @Override
        protected void appendDetail(StringBuffer buffer, String fieldName, Object value) {
            if (value instanceof String) {
                buffer.append(value);
            } else if (value instanceof Number) {
                buffer.append(value);
            } else if (value instanceof Boolean) {
                buffer.append(value);
            } else if (value instanceof Character) {
                buffer.append(value);
            } else if (value instanceof Collection) {
                buffer.append(((Collection<?>) value).size());
            } else if (value.getClass().isArray()) {
                // For simplicity in testing, we won't deeply append arrays here.
                // The public append methods handle array details.
                buffer.append("[array]");
            } else {
                buffer.append(value.getClass().getSimpleName());
            }
        }

        // Override to make it easier to test behavior without actual reflection
        @Override
        protected void appendInternal(StringBuffer buffer, String fieldName, Object value, boolean detail) {
            if (value == null) {
                appendNullText(buffer, fieldName);
            } else if (isRegistered(value) && !(value instanceof Number || value instanceof Boolean || value instanceof Character)) {
                appendCyclicObject(buffer, fieldName, value);
            } else {
                register(value);
                try {
                    if (value instanceof Collection<?>) {
                        if (detail) {
                            appendDetail(buffer, fieldName, (Collection<?>) value);
                        } else {
                            appendSummarySize(buffer, fieldName, ((Collection<?>) value).size());
                        }
                    } else if (value instanceof Map<?, ?>) {
                        if (detail) {
                            appendDetail(buffer, fieldName, (Map<?, ?>) value);
                        } else {
                            appendSummarySize(buffer, fieldName, ((Map<?, ?>) value).size());
                        }
                    } else if (value.getClass().isArray()) {
                        // Delegate to public append methods for arrays
                        if (value instanceof long[]) {
                            append(buffer, fieldName, (long[]) value, detail);
                        } else if (value instanceof int[]) {
                            append(buffer, fieldName, (int[]) value, detail);
                        } else if (value instanceof short[]) {
                            append(buffer, fieldName, (short[]) value, detail);
                        } else if (value instanceof byte[]) {
                            append(buffer, fieldName, (byte[]) value, detail);
                        } else if (value instanceof char[]) {
                            append(buffer, fieldName, (char[]) value, detail);
                        } else if (value instanceof double[]) {
                            append(buffer, fieldName, (double[]) value, detail);
                        } else if (value instanceof float[]) {
                            append(buffer, fieldName, (float[]) value, detail);
                        } else if (value instanceof boolean[]) {
                            append(buffer, fieldName, (boolean[]) value, detail);
                        } else {
                            append(buffer, fieldName, (Object[]) value, detail);
                        }
                    } else {
                        if (detail) {
                            appendDetail(buffer, fieldName, value);
                        } else {
                            appendSummary(buffer, fieldName, value);
                        }
                    }
                } finally {
                    unregister(value);
                }
            }
        }
    }
}
```