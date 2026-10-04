package org.apache.commons.lang.text;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.apache.commons.lang.ArrayUtils;
import org.apache.commons.lang.SystemUtils;

public class StrBuilderTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testStrBuilder_DefaultConstructor() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
    }

    @Test
    public void testStrBuilder_IntConstructor() throws Exception {
        StrBuilder sb = new StrBuilder(100);
        assertEquals(0, sb.length());
        assertEquals(100, sb.capacity());
    }

    @Test
    public void testStrBuilder_IntConstructor_Zero() throws Exception {
        StrBuilder sb = new StrBuilder(0);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testStrBuilder_IntConstructor_Negative() throws Exception {
        StrBuilder sb = new StrBuilder(-5);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testStrBuilder_StringConstructor_Null() throws Exception {
        StrBuilder sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
    }

    @Test
    public void testStrBuilder_StringConstructor_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
    }

    @Test
    public void testStrBuilder_StringConstructor_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals("hello", sb.toString());
        assertTrue(sb.capacity() >= "hello".length() + 32);
    }

    @Test
    public void testGetSetNewLineText_Default() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testGetSetNewLineText_Set() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("\n");
        assertEquals("\n", sb.getNewLineText());
    }

    @Test
    public void testGetSetNullText_Default() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNullText());
    }

    @Test
    public void testGetSetNullText_Set() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
    }

    @Test
    public void testGetSetNullText_SetEmptyToNull() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("");
        assertNull(sb.getNullText());
    }

    @Test
    public void testLength() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.length());
    }

    @Test
    public void testSetLength_Shorter() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSetLength_Longer() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setLength(6);
        assertEquals(6, sb.length());
        assertEquals("abc\0\0\0", sb.toString());
    }

    @Test
    public void testSetLength_Zero() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setLength(0);
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetLength_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setLength(-1);
    }

    @Test
    public void testCapacity() throws Exception {
        StrBuilder sb = new StrBuilder(50);
        assertEquals(50, sb.capacity());
    }

    @Test
    public void testEnsureCapacity_Sufficient() throws Exception {
        StrBuilder sb = new StrBuilder(50);
        sb.ensureCapacity(60);
        assertEquals(60, sb.capacity());
    }

    @Test
    public void testEnsureCapacity_Insufficient() throws Exception {
        StrBuilder sb = new StrBuilder(50);
        sb.ensureCapacity(40);
        assertEquals(50, sb.capacity());
    }

    @Test
    public void testMinimizeCapacity() throws Exception {
        StrBuilder sb = new StrBuilder(50);
        sb.append("abc");
        sb.minimizeCapacity();
        assertEquals(3, sb.capacity());
    }

    @Test
    public void testMinimizeCapacity_Empty() throws Exception {
        StrBuilder sb = new StrBuilder(50);
        sb.minimizeCapacity();
        assertEquals(0, sb.capacity());
    }

    @Test
    public void testSize() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.size());
    }

    @Test
    public void testIsEmpty_True() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testIsEmpty_False() throws Exception {
        StrBuilder sb = new StrBuilder("a");
        assertFalse(sb.isEmpty());
    }

    @Test
    public void testClear() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.clear();
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    @Test
    public void testCharAt_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals('b', sb.charAt(1));
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAt_InvalidIndexNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.charAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testCharAt_InvalidIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.charAt(3);
    }

    @Test
    public void testSetCharAt_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setCharAt(1, 'x');
        assertEquals("axc", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAt_InvalidIndexNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setCharAt(-1, 'x');
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSetCharAt_InvalidIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setCharAt(3, 'x');
    }

    @Test
    public void testDeleteCharAt_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(1);
        assertEquals("ac", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAt_InvalidIndexNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(-1);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDeleteCharAt_InvalidIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(3);
    }

    @Test
    public void testToCharArray_Empty() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray());
    }

    @Test
    public void testToCharArray_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertArrayEquals(new char[]{'a', 'b', 'c'}, sb.toCharArray());
    }

    @Test
    public void testToCharArray_Range_Full() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertArrayEquals(new char[]{'a', 'b', 'c'}, sb.toCharArray(0, 3));
    }

    @Test
    public void testToCharArray_Range_Partial() throws Exception {
        StrBuilder sb = new StrBuilder("abcde");
        assertArrayEquals(new char[]{'b', 'c'}, sb.toCharArray(1, 3));
    }

    @Test
    public void testToCharArray_Range_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertArrayEquals(ArrayUtils.EMPTY_CHAR_ARRAY, sb.toCharArray(1, 1));
    }

    @Test
    public void testToCharArray_Range_EndIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertArrayEquals(new char[]{'b', 'c'}, sb.toCharArray(1, 5)); // endIndex treated as size
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArray_Range_StartIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.toCharArray(3, 5);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testToCharArray_Range_StartGreaterThanEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.toCharArray(2, 1);
    }

    @Test
    public void testGetChars_DestinationNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        char[] result = sb.getChars(null);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
        assertEquals(3, result.length);
    }

    @Test
    public void testGetChars_DestinationSufficient() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertArrayEquals(new char[]{'a', 'b', 'c', '\0', '\0'}, result);
        assertEquals(5, result.length);
        assertSame(dest, result);
    }

    @Test
    public void testGetChars_DestinationTooSmall() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[2];
        char[] result = sb.getChars(dest);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
        assertEquals(3, result.length);
        assertNotSame(dest, result);
    }

    @Test
    public void testGetChars_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder();
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertArrayEquals(new char[5], result); // all zeros
        assertEquals(5, result.length);
        assertSame(dest, result);
    }

    @Test
    public void testGetChars_WithIndices() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] dest = new char[10];
        sb.getChars(1, 4, dest, 2); // copy "bcd" to dest starting at index 2
        assertArrayEquals(new char[]{'\0', '\0', 'b', 'c', 'd', '\0', '\0', '\0', '\0', '\0'}, dest);
    }

    @Test
    public void testAppendNewLine_Default() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendNewLine();
        assertEquals(SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendNewLine_Custom() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNewLineText("custom_nl");
        sb.appendNewLine();
        assertEquals("custom_nl", sb.toString());
    }

    @Test
    public void testAppendNull_Default() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendNull();
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendNull_Custom() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("NULL", sb.toString());
    }

    @Test
    public void testAppend_Object_Null() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NullText");
        sb.append((Object) null);
        assertEquals("NullText", sb.toString());
    }

    @Test
    public void testAppend_Object_String() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) "hello");
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testAppend_Object_Integer() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append((Object) Integer.valueOf(123));
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppend_String_Null() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NullText");
        sb.append((String) null);
        assertEquals("NullText", sb.toString());
    }

    @Test
    public void testAppend_String_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppend_String_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("end");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppend_String_WithStartIndexLength_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("abcdef", 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppend_String_WithStartIndexLength_EmptyAppend() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("abcdef", 1, 0);
        assertEquals("start", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_String_WithStartIndexLength_InvalidStartIndex() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("abcdef", -1, 3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_String_WithStartIndexLength_InvalidLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("abcdef", 1, 10);
    }

    @Test
    public void testAppend_StringBuffer_Null() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NullText");
        sb.append((StringBuffer) null);
        assertEquals("NullText", sb.toString());
    }

    @Test
    public void testAppend_StringBuffer_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer(""));
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppend_StringBuffer_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer("end"));
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppend_StringBuffer_WithStartIndexLength_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer sbuf = new StringBuffer("abcdef");
        sb.append(sbuf, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppend_StringBuffer_WithStartIndexLength_EmptyAppend() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer sbuf = new StringBuffer("abcdef");
        sb.append(sbuf, 1, 0);
        assertEquals("start", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_StringBuffer_WithStartIndexLength_InvalidStartIndex() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer sbuf = new StringBuffer("abcdef");
        sb.append(sbuf, -1, 3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_StringBuffer_WithStartIndexLength_InvalidLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer sbuf = new StringBuffer("abcdef");
        sb.append(sbuf, 1, 10);
    }

    @Test
    public void testAppend_StrBuilder_Null() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NullText");
        sb.append((StrBuilder) null);
        assertEquals("NullText", sb.toString());
    }

    @Test
    public void testAppend_StrBuilder_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder(""));
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppend_StrBuilder_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder("end"));
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppend_StrBuilder_WithStartIndexLength_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder other = new StrBuilder("abcdef");
        sb.append(other, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppend_StrBuilder_WithStartIndexLength_EmptyAppend() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder other = new StrBuilder("abcdef");
        sb.append(other, 1, 0);
        assertEquals("start", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_StrBuilder_WithStartIndexLength_InvalidStartIndex() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder other = new StrBuilder("abcdef");
        sb.append(other, -1, 3);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_StrBuilder_WithStartIndexLength_InvalidLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder other = new StrBuilder("abcdef");
        sb.append(other, 1, 10);
    }

    @Test
    public void testAppend_CharArray_Null() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.setNullText("NullText");
        sb.append((char[]) null);
        assertEquals("NullText", sb.toString());
    }

    @Test
    public void testAppend_CharArray_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[]{});
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppend_CharArray_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[]{'e', 'n', 'd'});
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppend_CharArray_WithStartIndexLength_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        sb.append(chars, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppend_CharArray_WithStartIndexLength_EmptyAppend() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        sb.append(chars, 1, 0);
        assertEquals("start", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_CharArray_WithStartIndexLength_InvalidStartIndex() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        char[] chars = {'a', 'b', 'c'};
        sb.append(chars, -1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testAppend_CharArray_WithStartIndexLength_InvalidLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        char[] chars = {'a', 'b', 'c'};
        sb.append(chars, 1, 10);
    }

    @Test
    public void testAppend_boolean_True() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append(true);
        assertEquals("true", sb.toString());
    }

    @Test
    public void testAppend_boolean_False() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append(false);
        assertEquals("false", sb.toString());
    }

    @Test
    public void testAppend_char_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.append('d');
        assertEquals("abcd", sb.toString());
    }

    @Test
    public void testAppend_int() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append(123);
        assertEquals("123", sb.toString());
    }

    @Test
    public void testAppend_long() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append(1234567890123L);
        assertEquals("1234567890123", sb.toString());
    }

    @Test
    public void testAppend_float() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append(1.23f);
        assertEquals("1.23", sb.toString());
    }

    @Test
    public void testAppend_double() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.append(1.23456789);
        assertEquals("1.23456789", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_ObjectArray_NullArray() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_ObjectArray_EmptyArray() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_ObjectArray_SingleElement() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[]{"A"}, ",");
        assertEquals("startA", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_ObjectArray_MultipleElements() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[]{"A", "B", "C"}, ",");
        assertEquals("startA,B,C", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_ObjectArray_NullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[]{"A", "B"}, null);
        assertEquals("startAB", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Collection_NullCollection() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators((Collection) null, ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Collection_EmptyCollection() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new java.util.ArrayList(), ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Collection_SingleElement() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        Collection<String> coll = new java.util.ArrayList<>();
        coll.add("A");
        sb.appendWithSeparators(coll, ",");
        assertEquals("startA", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Collection_MultipleElements() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        Collection<String> coll = new java.util.ArrayList<>();
        coll.add("A");
        coll.add("B");
        coll.add("C");
        sb.appendWithSeparators(coll, ",");
        assertEquals("startA,B,C", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Collection_NullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        Collection<String> coll = new java.util.ArrayList<>();
        coll.add("A");
        coll.add("B");
        sb.appendWithSeparators(coll, null);
        assertEquals("startAB", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Iterator_NullIterator() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators((Iterator) null, ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Iterator_EmptyIterator() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new java.util.ArrayList<String>().iterator(), ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Iterator_SingleElement() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(java.util.Collections.singletonList("A").iterator(), ",");
        assertEquals("startA", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Iterator_MultipleElements() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(java.util.Arrays.asList("A", "B", "C").iterator(), ",");
        assertEquals("startA,B,C", sb.toString());
    }

    @Test
    public void testAppendWithSeparators_Iterator_NullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(java.util.Arrays.asList("A", "B").iterator(), null);
        assertEquals("startAB", sb.toString());
    }

    @Test
    public void testAppendPadding_PositiveLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendPadding(3, '*');
        assertEquals("start***", sb.toString());
    }

    @Test
    public void testAppendPadding_ZeroLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendPadding(0, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendPadding_NegativeLength() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendPadding(-5, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_SufficientSpace() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", 5, '*');
        assertEquals("start**abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_ExactFit() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", 3, '*');
        assertEquals("startabc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_StringTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abcdef", 3, '*');
        assertEquals("startdef", sb.toString()); // rightmost 3 chars
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_Null() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.appendFixedWidthPadLeft(null, 5, '*');
        assertEquals("start**NULL", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_Null_NoNullText() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft(null, 5, '*');
        assertEquals("start*****", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_ZeroWidth() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", 0, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Object_NegativeWidth() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", -5, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Int_SufficientSpace() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft(123, 5, '*');
        assertEquals("start**123", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Int_ExactFit() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft(123, 3, '*');
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeft_Int_NumberTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft(123456, 3, '*');
        assertEquals("start456", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_SufficientSpace() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", 5, '*');
        assertEquals("startabc**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_ExactFit() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", 3, '*');
        assertEquals("startabc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_StringTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abcdef", 3, '*');
        assertEquals("startabc", sb.toString()); // leftmost 3 chars
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_Null() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.appendFixedWidthPadRight(null, 5, '*');
        assertEquals("startNULL**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_Null_NoNullText() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight(null, 5, '*');
        assertEquals("start*****", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_ZeroWidth() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", 0, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Object_NegativeWidth() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", -5, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Int_SufficientSpace() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight(123, 5, '*');
        assertEquals("start123**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Int_ExactFit() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight(123, 3, '*');
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRight_Int_NumberTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight(123456, 3, '*');
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testInsert_Object_Null() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.setNullText("NULL");
        sb.insert(0, (Object) null);
        assertEquals("NULLend", sb.toString());
    }

    @Test
    public void testInsert_Object_String() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, "start");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsert_Object_Integer() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, 123);
        assertEquals("123end", sb.toString());
    }

    @Test
    public void testInsert_String_Null() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.setNullText("NULL");
        sb.insert(0, (String) null);
        assertEquals("NULLend", sb.toString());
    }

    @Test
    public void testInsert_String_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, "");
        assertEquals("end", sb.toString());
    }

    @Test
    public void testInsert_String_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, "start");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsert_CharArray_Null() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.setNullText("NULL");
        sb.insert(0, (char[]) null);
        assertEquals("NULLend", sb.toString());
    }

    @Test
    public void testInsert_CharArray_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, new char[]{});
        assertEquals("end", sb.toString());
    }

    @Test
    public void testInsert_CharArray_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, new char[]{'s', 't', 'a', 'r', 't'});
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsert_CharArray_WithOffsetLength_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        sb.insert(0, chars, 1, 3); // insert "bcd"
        assertEquals("bcdend", sb.toString());
    }

    @Test
    public void testInsert_CharArray_WithOffsetLength_EmptyInsert() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        char[] chars = {'a', 'b', 'c'};
        sb.insert(0, chars, 1, 0);
        assertEquals("end", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_CharArray_WithOffsetLength_InvalidOffset() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        char[] chars = {'a', 'b', 'c'};
        sb.insert(0, chars, -1, 2);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testInsert_CharArray_WithOffsetLength_InvalidLength() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        char[] chars = {'a', 'b', 'c'};
        sb.insert(0, chars, 1, 10);
    }

    @Test
    public void testInsert_boolean_True() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, true);
        assertEquals("trueend", sb.toString());
    }

    @Test
    public void testInsert_boolean_False() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, false);
        assertEquals("falseend", sb.toString());
    }

    @Test
    public void testInsert_char_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, 's');
        assertEquals("send", sb.toString());
    }

    @Test
    public void testInsert_int() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, 123);
        assertEquals("123end", sb.toString());
    }

    @Test
    public void testInsert_long() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, 1234567890123L);
        assertEquals("1234567890123end", sb.toString());
    }

    @Test
    public void testInsert_float() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, 1.23f);
        assertEquals("1.23end", sb.toString());
    }

    @Test
    public void testInsert_double() throws Exception {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, 1.23456789);
        assertEquals("1.23456789end", sb.toString());
    }

    @Test
    public void testDelete_ValidRange() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(1, 4); // delete "bcd"
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testDelete_RangeToEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(3, 6); // delete "def"
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDelete_RangeFromStart() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(0, 3); // delete "abc"
        assertEquals("def", sb.toString());
    }

    @Test
    public void testDelete_EmptyRange() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(2, 2);
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDelete_EndIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(1, 10); // delete "bc"
        assertEquals("a", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDelete_StartIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(3, 5);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testDelete_StartGreaterThanEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(2, 1);
    }

    @Test
    public void testDelete_All() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(0, 6);
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAll_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.deleteAll('a');
        assertEquals("b", sb.toString());
    }

    @Test
    public void testDeleteAll_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAll_char_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.deleteAll('a');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAll_char_Consecutive() throws Exception {
        StrBuilder sb = new StrBuilder("aaabbbccc");
        sb.deleteAll('a');
        assertEquals("bbbccc", sb.toString());
    }

    @Test
    public void testDeleteFirst_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.deleteFirst('a');
        assertEquals("baba", sb.toString());
    }

    @Test
    public void testDeleteFirst_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirst_char_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.deleteFirst('a');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAll_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababab");
        sb.deleteAll("aba");
        assertEquals("b", sb.toString());
    }

    @Test
    public void testDeleteAll_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll("x");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAll_String_NullString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAll_String_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll("");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAll_String_Overlapping() throws Exception {
        StrBuilder sb = new StrBuilder("aaaaa");
        sb.deleteAll("aa"); // Should delete all "aa" occurrences
        assertEquals("a", sb.toString()); // "aa" "aa" a
    }

    @Test
    public void testDeleteFirst_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababab");
        sb.deleteFirst("aba");
        assertEquals("bab", sb.toString());
    }

    @Test
    public void testDeleteFirst_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst("x");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirst_String_NullString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst((String) null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirst_String_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst("");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplace_ValidRange() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "XYZ"); // replace "bcd" with "XYZ"
        assertEquals("aXYZef", sb.toString());
    }

    @Test
    public void testReplace_RangeShorterReplacement() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "X"); // replace "bcd" with "X"
        assertEquals("aXef", sb.toString());
    }

    @Test
    public void testReplace_RangeLongerReplacement() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "XYZW"); // replace "bcd" with "XYZW"
        assertEquals("aXYZWef", sb.toString());
    }

    @Test
    public void testReplace_RangeWithNullReplacement() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, null); // delete "bcd"
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testReplace_EmptyRangeWithReplacement() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(2, 2, "XYZ"); // insert "XYZ" at index 2
        assertEquals("abXYZcdef", sb.toString());
    }

    @Test
    public void testReplace_EndIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(1, 5, "XYZ"); // replace "bc" with "XYZ"
        assertEquals("aXYZ", sb.toString());
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_StartIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(3, 5, "XYZ");
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testReplace_StartGreaterThanEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(2, 1, "XYZ");
    }

    @Test
    public void testReplaceAll_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.replaceAll('a', 'x');
        assertEquals("xbxbx", sb.toString());
    }

    @Test
    public void testReplaceAll_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll('x', 'y');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAll_char_SameChar() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirst_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.replaceFirst('a', 'x');
        assertEquals("xbaba", sb.toString());
    }

    @Test
    public void testReplaceFirst_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst('x', 'y');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirst_char_SameChar() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAll_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceAll("aba", "X");
        assertEquals("XbX", sb.toString());
    }

    @Test
    public void testReplaceAll_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll("x", "Y");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAll_String_NullSearch() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll((String) null, "Y");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAll_String_NullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll("b", null); // equivalent to empty string
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testReplaceAll_String_EmptySearch() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll("", "Y"); // does nothing
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAll_String_EmptyReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll("b", "");
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testReplaceAll_String_Overlapping() throws Exception {
        StrBuilder sb = new StrBuilder("aaaaa");
        sb.replaceAll("aa", "X");
        assertEquals("Xa", sb.toString()); // "aa" "aa" a -> X X a
    }

    @Test
    public void testReplaceFirst_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceFirst("aba", "X");
        assertEquals("Xbab", sb.toString());
    }

    @Test
    public void testReplaceFirst_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("x", "Y");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirst_String_NullSearch() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst((String) null, "Y");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirst_String_NullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("b", null); // equivalent to empty string
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testReplaceFirst_String_EmptySearch() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("", "Y"); // does nothing
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirst_String_EmptyReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("b", "");
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testReverse_Empty() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.reverse();
        assertEquals("", sb.toString());
    }

    @Test
    public void testReverse_SingleChar() throws Exception {
        StrBuilder sb = new StrBuilder("a");
        sb.reverse();
        assertEquals("a", sb.toString());
    }

    @Test
    public void testReverse_MultipleChars() throws Exception {
        StrBuilder sb = new StrBuilder("abcde");
        sb.reverse();
        assertEquals("edcba", sb.toString());
    }

    @Test
    public void testReverse_EvenLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcd");
        sb.reverse();
        assertEquals("dcba", sb.toString());
    }

    @Test
    public void testTrim_LeadingAndTrailingSpaces() throws Exception {
        StrBuilder sb = new StrBuilder("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_OnlyLeadingSpaces() throws Exception {
        StrBuilder sb = new StrBuilder("  abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_OnlyTrailingSpaces() throws Exception {
        StrBuilder sb = new StrBuilder("abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_NoSpaces() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrim_OnlySpaces() throws Exception {
        StrBuilder sb = new StrBuilder("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrim_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrim_IncludesTabsNewlines() throws Exception {
        StrBuilder sb = new StrBuilder("\t abc \n");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testStartsWith_True() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.startsWith("abc"));
    }

    @Test
    public void testStartsWith_False() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.startsWith("bcd"));
    }

    @Test
    public void testStartsWith_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testStartsWith_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWith_StringLongerThanBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.startsWith("abcdef"));
    }

    @Test
    public void testStartsWith_EmptyBuilder_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWith_EmptyBuilder_NonEmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.startsWith("a"));
    }

    @Test
    public void testEndsWith_True() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.endsWith("def"));
    }

    @Test
    public void testEndsWith_False() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.endsWith("bcd"));
    }

    @Test
    public void testEndsWith_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.endsWith(null));
    }

    @Test
    public void testEndsWith_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWith_StringLongerThanBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.endsWith("abcdef"));
    }

    @Test
    public void testEndsWith_EmptyBuilder_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWith_EmptyBuilder_NonEmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.endsWith("a"));
    }

    @Test
    public void testSubstring_Start() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cdef", sb.substring(2));
    }

    @Test
    public void testSubstring_StartEnd_Valid() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cde", sb.substring(2, 5));
    }

    @Test
    public void testSubstring_StartEnd_EndIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("bc", sb.substring(1, 5)); // endIndex treated as size
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstring_StartEnd_StartIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.substring(3, 5);
    }

    @Test(expected = StringIndexOutOfBoundsException.class)
    public void testSubstring_StartEnd_StartGreaterThanEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.substring(2, 1);
    }

    @Test
    public void testSubstring_StartEnd_EmptySubstring() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.substring(1, 1));
    }

    @Test
    public void testSubstring_StartEnd_FullString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.substring(0, 3));
    }

    @Test
    public void testLeftString_PositiveLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftString_LengthEqualToSize() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abcdef", sb.leftString(6));
    }

    @Test
    public void testLeftString_LengthGreaterThanSize() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abcdef", sb.leftString(10));
    }

    @Test
    public void testLeftString_ZeroLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.leftString(0));
    }

    @Test
    public void testLeftString_NegativeLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.leftString(-5));
    }

    @Test
    public void testLeftString_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.leftString(5));
    }

    @Test
    public void testRightString_PositiveLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.rightString(3));
    }

    @Test
    public void testRightString_LengthEqualToSize() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abcdef", sb.rightString(6));
    }

    @Test
    public void testRightString_LengthGreaterThanSize() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abcdef", sb.rightString(10));
    }

    @Test
    public void testRightString_ZeroLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.rightString(0));
    }

    @Test
    public void testRightString_NegativeLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.rightString(-5));
    }

    @Test
    public void testRightString_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.rightString(5));
    }

    @Test
    public void testMidString_ValidIndexLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("bcd", sb.midString(1, 3));
    }

    @Test
    public void testMidString_IndexZeroLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.midString(0, 3));
    }

    @Test
    public void testMidString_IndexEndLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.midString(3, 3));
    }

    @Test
    public void testMidString_LengthTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cdef", sb.midString(2, 10)); // gets rest of string
    }

    @Test
    public void testMidString_IndexNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.midString(-5, 3)); // index treated as 0
    }

    @Test
    public void testMidString_IndexGreaterThanSize() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(10, 3)); // index treated as size
    }

    @Test
    public void testMidString_LengthZero() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(2, 0));
    }

    @Test
    public void testMidString_LengthNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(2, -5));
    }

    @Test
    public void testMidString_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.midString(0, 5));
    }

    @Test
    public void testContains_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains('c'));
    }

    @Test
    public void testContains_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains('x'));
    }

    @Test
    public void testContains_char_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.contains('a'));
    }

    @Test
    public void testContains_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains("bcd"));
    }

    @Test
    public void testContains_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains("bce"));
    }

    @Test
    public void testContains_String_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains((String) null));
    }

    @Test
    public void testContains_String_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains(""));
    }

    @Test
    public void testContains_String_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertTrue(sb.contains(""));
    }

    @Test
    public void testContains_String_EmptyBuilder_NonEmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.contains("a"));
    }

    @Test
    public void testContains_StrMatcher_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertTrue(sb.contains(StrMatcher.charSetMatcher("0123456789")));
    }

    @Test
    public void testContains_StrMatcher_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.contains(StrMatcher.charSetMatcher("0123456789")));
    }

    @Test
    public void testContains_StrMatcher_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOf_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(2, sb.indexOf('c'));
    }

    @Test
    public void testIndexOf_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf('x'));
    }

    @Test
    public void testIndexOf_char_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.indexOf('a'));
    }

    @Test
    public void testIndexOf_char_WithStartIndex_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(2, sb.indexOf('a', 1));
    }

    @Test
    public void testIndexOf_char_WithStartIndex_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(-1, sb.indexOf('a', 3));
    }

    @Test
    public void testIndexOf_char_WithStartIndex_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(0, sb.indexOf('a', -5)); // rounded to 0
    }

    @Test
    public void testIndexOf_char_WithStartIndex_TooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(-1, sb.indexOf('a', 10)); // startIndex >= size
    }

    @Test
    public void testIndexOf_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(6, sb.indexOf("abc"));
    }

    @Test
    public void testIndexOf_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(-1, sb.indexOf("abd"));
    }

    @Test
    public void testIndexOf_String_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf((String) null));
    }

    @Test
    public void testIndexOf_String_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(0, sb.indexOf(""));
    }

    @Test
    public void testIndexOf_String_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.indexOf("a"));
    }

    @Test
    public void testIndexOf_String_EmptyBuilder_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(0, sb.indexOf(""));
    }

    @Test
    public void testIndexOf_String_WithStartIndex_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(6, sb.indexOf("abc", 1));
    }

    @Test
    public void testIndexOf_String_WithStartIndex_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(-1, sb.indexOf("abc", 7));
    }

    @Test
    public void testIndexOf_String_WithStartIndex_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(0, sb.indexOf("abc", -5)); // rounded to 0
    }

    @Test
    public void testIndexOf_String_WithStartIndex_TooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(-1, sb.indexOf("abc", 10)); // startIndex >= size
    }

    @Test
    public void testIndexOf_StrMatcher_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(1, sb.indexOf(StrMatcher.charSetMatcher("0123456789")));
    }

    @Test
    public void testIndexOf_StrMatcher_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf(StrMatcher.charSetMatcher("0123456789")));
    }

    @Test
    public void testIndexOf_StrMatcher_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf((StrMatcher) null));
    }

    @Test
    public void testIndexOf_StrMatcher_WithStartIndex_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(1, sb.indexOf(StrMatcher.charSetMatcher("0123456789"), 0));
    }

    @Test
    public void testIndexOf_StrMatcher_WithStartIndex_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(-1, sb.indexOf(StrMatcher.charSetMatcher("0123456789"), 4));
    }

    @Test
    public void testIndexOf_StrMatcher_WithStartIndex_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(1, sb.indexOf(StrMatcher.charSetMatcher("0123456789"), -5)); // rounded to 0
    }

    @Test
    public void testIndexOf_StrMatcher_WithStartIndex_TooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(-1, sb.indexOf(StrMatcher.charSetMatcher("0123456789"), 10)); // startIndex >= size
    }

    @Test
    public void testLastIndexOf_char_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(4, sb.lastIndexOf('a'));
    }

    @Test
    public void testLastIndexOf_char_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(-1, sb.lastIndexOf('x'));
    }

    @Test
    public void testLastIndexOf_char_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.lastIndexOf('a'));
    }

    @Test
    public void testLastIndexOf_char_WithStartIndex_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(2, sb.lastIndexOf('a', 3));
    }

    @Test
    public void testLastIndexOf_char_WithStartIndex_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(-1, sb.lastIndexOf('a', 1));
    }

    @Test
    public void testLastIndexOf_char_WithStartIndex_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(4, sb.lastIndexOf('a', -1)); // rounded to size-1
    }

    @Test
    public void testLastIndexOf_char_WithStartIndex_TooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        assertEquals(4, sb.lastIndexOf('a', 10)); // rounded to size-1
    }

    @Test
    public void testLastIndexOf_String_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(3, sb.lastIndexOf("abc"));
    }

    @Test
    public void testLastIndexOf_String_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(-1, sb.lastIndexOf("abd"));
    }

    @Test
    public void testLastIndexOf_String_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf((String) null));
    }

    @Test
    public void testLastIndexOf_String_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.lastIndexOf(""));
    }

    @Test
    public void testLastIndexOf_String_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.lastIndexOf("a"));
    }

    @Test
    public void testLastIndexOf_String_EmptyBuilder_EmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(0, sb.lastIndexOf(""));
    }

    @Test
    public void testLastIndexOf_String_WithStartIndex_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(0, sb.lastIndexOf("abc", 2));
    }

    @Test
    public void testLastIndexOf_String_WithStartIndex_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(-1, sb.lastIndexOf("abc", 2));
    }

    @Test
    public void testLastIndexOf_String_WithStartIndex_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(3, sb.lastIndexOf("abc", -1)); // rounded to size-1
    }

    @Test
    public void testLastIndexOf_String_WithStartIndex_TooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        assertEquals(3, sb.lastIndexOf("abc", 10)); // rounded to size-1
    }

    @Test
    public void testLastIndexOf_StrMatcher_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(5, sb.lastIndexOf(StrMatcher.charSetMatcher("0123456789")));
    }

    @Test
    public void testLastIndexOf_StrMatcher_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charSetMatcher("0123456789")));
    }

    @Test
    public void testLastIndexOf_StrMatcher_Null() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOf_StrMatcher_WithStartIndex_Existing() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(5, sb.lastIndexOf(StrMatcher.charSetMatcher("0123456789"), 6));
    }

    @Test
    public void testLastIndexOf_StrMatcher_WithStartIndex_NonExisting() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.charSetMatcher("0123456789"), 0));
    }

    @Test
    public void testLastIndexOf_StrMatcher_WithStartIndex_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(5, sb.lastIndexOf(StrMatcher.charSetMatcher("0123456789"), -1)); // rounded to size-1
    }

    @Test
    public void testLastIndexOf_StrMatcher_WithStartIndex_TooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("a1b2c3d");
        assertEquals(5, sb.lastIndexOf(StrMatcher.charSetMatcher("0123456789"), 10)); // rounded to size-1
    }

    @Test
    public void testAsTokenizer() throws Exception {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tokenizer = sb.asTokenizer();
        assertNotNull(tokenizer);
        assertEquals("a", tokenizer.nextToken());
        assertEquals("b", tokenizer.nextToken());
        assertEquals("c", tokenizer.nextToken());
        // Removed the line that caused the compilation error.
        // StrTokenizer does not have hasMoreTokens(), but hasNext()
        assertFalse(tokenizer.hasNext());
    }

    @Test
    public void testAsReader_ReadEmpty() throws Exception {
        StrBuilder sb = new StrBuilder();
        Reader reader = sb.asReader();
        assertEquals(-1, reader.read());
    }

    @Test
    public void testAsReader_ReadChar() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        assertEquals('a', reader.read());
        assertEquals('b', reader.read());
        assertEquals('c', reader.read());
        assertEquals(-1, reader.read());
    }

    @Test
    public void testAsReader_ReadCharsArray() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader reader = sb.asReader();
        char[] buffer = new char[3];
        assertEquals(3, reader.read(buffer));
        assertArrayEquals(new char[]{'a', 'b', 'c'}, buffer);
        assertEquals(3, reader.read(buffer));
        assertArrayEquals(new char[]{'d', 'e', 'f'}, buffer);
        assertEquals(-1, reader.read(buffer));
    }

    @Test
    public void testAsReader_ReadCharsArray_PartialRead() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader reader = sb.asReader();
        char[] buffer = new char[10];
        assertEquals(6, reader.read(buffer));
        assertArrayEquals(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, buffer);
        assertEquals(-1, reader.read(buffer));
    }

    @Test
    public void testAsReader_Skip() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader reader = sb.asReader();
        assertEquals(3, reader.skip(3));
        assertEquals('d', reader.read());
        assertEquals(10, reader.skip(10)); // skips to end
        assertEquals(-1, reader.read());
    }

    @Test
    public void testAsReader_MarkReset() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader reader = sb.asReader();
        reader.read();
        reader.read();
        reader.markSupported();
        reader.mark(0); // mark at 'c'
        reader.read();
        reader.read();
        reader.reset(); // reset to 'c'
        assertEquals('c', reader.read());
        assertEquals('d', reader.read());
        assertEquals('e', reader.read());
        assertEquals('f', reader.read());
        assertEquals(-1, reader.read());
    }

    @Test
    public void testAsWriter_AppendChar() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write('a');
        writer.write('b');
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testAsWriter_AppendCharsArray() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write(new char[]{'a', 'b', 'c'});
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriter_AppendCharsArray_WithOffsetLength() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write(new char[]{'x', 'a', 'b', 'c', 'y'}, 1, 3);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriter_AppendString() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write("abc");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAsWriter_AppendString_WithOffsetLength() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write("xabcy", 1, 3);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testEqualsIgnoreCase_SameContent() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("ABC");
        assertTrue(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCase_DifferentContent() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abd");
        assertFalse(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCase_DifferentLength() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("ab");
        assertFalse(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCase_NullOther() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        assertFalse(sb1.equalsIgnoreCase(null));
    }

    @Test
    public void testEqualsIgnoreCase_EmptyBuilders() throws Exception {
        StrBuilder sb1 = new StrBuilder("");
        StrBuilder sb2 = new StrBuilder("");
        assertTrue(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEquals_SameContent() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        assertTrue(sb1.equals(sb2));
    }

    @Test
    public void testEquals_DifferentContent() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abd");
        assertFalse(sb1.equals(sb2));
    }

    @Test
    public void testEquals_DifferentLength() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("ab");
        assertFalse(sb1.equals(sb2));
    }

    @Test
    public void testEquals_NullOther() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        assertFalse(sb1.equals(null));
    }

    @Test
    public void testEquals_EmptyBuilders() throws Exception {
        StrBuilder sb1 = new StrBuilder("");
        StrBuilder sb2 = new StrBuilder("");
        assertTrue(sb1.equals(sb2));
    }

    @Test
    public void testEquals_ObjectSameInstance() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        assertTrue(sb1.equals((Object) sb1));
    }

    @Test
    public void testEquals_ObjectDifferentType() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        String other = "abc";
        assertFalse(sb1.equals((Object) other));
    }

    @Test
    public void testHashCode_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(0, sb.hashCode());
    }

    @Test
    public void testHashCode_NonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(31 * (31 * ('a') + 'b') + 'c', sb.hashCode());
    }

    @Test
    public void testToString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testToString_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.toString());
    }

    @Test
    public void testToStringBuffer() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        StringBuffer sbuf = sb.toStringBuffer();
        assertEquals("abc", sbuf.toString());
        assertEquals(3, sbuf.length());
    }

    @Test
    public void testToStringBuffer_Empty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        StringBuffer sbuf = sb.toStringBuffer();
        assertEquals("", sbuf.toString());
        assertEquals(0, sbuf.length());
    }

    // --- New Tests for Uncovered Methods ---

    @Test
    public void testGetContent() throws Exception {
        // The StrBuilder class does not expose a getContent() method directly.
        // It seems this method might belong to StrTokenizer or a similar class.
        // As per the API outline, StrTokenizer has a getContent() method.
        // Since we are testing StrBuilder, and it doesn't have this method,
        // this test cannot be implemented as is.
        // If StrBuilder.getContent() were a valid method, we would test it like:
        // StrBuilder sb = new StrBuilder("some content");
        // assertEquals("some content", sb.getContent());
    }

    @Test
    public void testClose_Writer() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.close(); // Should do nothing.
        assertEquals("", sb.toString()); // Ensure no side effects.
    }

    @Test
    public void testClose_Reader() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        reader.close(); // Should do nothing.
        assertEquals('a', reader.read()); // Ensure no side effects.
    }

    @Test
    public void testRead_EmptyBuilder() throws Exception {
        StrBuilder sb = new StrBuilder();
        Reader reader = sb.asReader();
        assertEquals(-1, reader.read());
    }

    @Test
    public void testRead_AfterReadingAllChars() throws Exception {
        StrBuilder sb = new StrBuilder("a");
        Reader reader = sb.asReader();
        reader.read(); // read 'a'
        assertEquals(-1, reader.read()); // should be end of stream
    }

    @Test
    public void testSkip_ToEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        long skipped = reader.skip(5); // Skip more than available
        assertEquals(3, skipped);
        assertEquals(-1, reader.read());
    }

    @Test
    public void testSkip_Negative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        long skipped = reader.skip(-5); // Skip negative
        assertEquals(0, skipped);
        assertEquals('a', reader.read()); // First char should still be readable
    }

    @Test
    public void testReady_True() throws Exception {
        StrBuilder sb = new StrBuilder("a");
        Reader reader = sb.asReader();
        assertTrue(reader.ready());
    }

    @Test
    public void testReady_False() throws Exception {
        StrBuilder sb = new StrBuilder("a");
        Reader reader = sb.asReader();
        reader.read(); // Consume the character
        assertFalse(reader.ready());
    }

    @Test
    public void testMarkSupported() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        assertTrue(reader.markSupported());
    }

    @Test
    public void testFlush_Writer() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write('a');
        writer.flush(); // Should do nothing.
        assertEquals("a", sb.toString()); // Ensure no side effects.
    }

    @Test
    public void testWrite_Int() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write(97); // ASCII for 'a'
        assertEquals("a", sb.toString());
    }

    @Test
    public void testWrite_CharArrayOffsetLength() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        char[] data = {'x', 'y', 'z', 'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        writer.write(data, 3, 4); // Write 'a', 'b', 'c', 'd'
        assertEquals("abcd", sb.toString());
    }

    @Test
    public void testWrite_StringOffsetLength() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        writer.write("xyzabcdefg", 3, 4); // Write 'a', 'b', 'c', 'd'
        assertEquals("abcd", sb.toString());
    }

}
