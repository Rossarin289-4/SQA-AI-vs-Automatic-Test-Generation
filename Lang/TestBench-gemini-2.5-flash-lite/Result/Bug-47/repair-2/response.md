```java
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
import java.io.IOException; // Added for Reader methods

public class StrBuilderTest {

    // Constructor Tests
    @Test
    public void testDefaultConstructor() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
    }

    @Test
    public void testCapacityConstructor() throws Exception {
        StrBuilder sb = new StrBuilder(100);
        assertEquals(0, sb.length());
        assertEquals(100, sb.capacity());
    }

    @Test
    public void testCapacityConstructorZeroOrLess() throws Exception {
        StrBuilder sb = new StrBuilder(0);
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
        sb = new StrBuilder(-10);
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
    }

    @Test
    public void testStringConstructor() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals("hello", sb.toString());
        assertTrue(sb.capacity() >= 5 + 32);
    }

    @Test
    public void testStringConstructorNull() throws Exception {
        StrBuilder sb = new StrBuilder(null);
        assertEquals(0, sb.length());
        assertTrue(sb.capacity() >= 32);
    }

    // Getter/Setter Tests
    @Test
    public void testNewLineText() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        sb.setNewLineText("\n");
        assertEquals("\n", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNewLineText());
    }

    @Test
    public void testNullText() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNullText());
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.setNullText(""); // Should be treated as null
        assertNull(sb.getNullText());
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    // Length/Size/Capacity Tests
    @Test
    public void testLengthAndSize() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        sb.append("abc");
        assertEquals(3, sb.length());
        assertEquals(3, sb.size());
    }

    @Test
    public void testSetLength() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
        sb.setLength(5); // Extend with null chars
        assertEquals(5, sb.length());
        assertEquals("abc\0\0", sb.toString());
    }

    @Test
    public void testSetLengthNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testCapacity() throws Exception {
        StrBuilder sb = new StrBuilder(50);
        assertEquals(50, sb.capacity());
    }

    @Test
    public void testEnsureCapacity() throws Exception {
        StrBuilder sb = new StrBuilder(10);
        sb.ensureCapacity(20);
        assertEquals(20, sb.capacity());
        sb.ensureCapacity(15); // Should not shrink
        assertEquals(20, sb.capacity());
    }

    @Test
    public void testMinimizeCapacity() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.ensureCapacity(50);
        assertEquals(50, sb.capacity());
        sb.minimizeCapacity();
        assertEquals(3, sb.capacity());
    }

    @Test
    public void testIsEmpty() throws Exception {
        StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
        sb.append("a");
        assertFalse(sb.isEmpty());
        sb.clear();
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testClear() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.clear();
        assertEquals(0, sb.length());
        assertEquals("", sb.toString());
    }

    // Char manipulation tests
    @Test
    public void testCharAt() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals('h', sb.charAt(0));
        assertEquals('o', sb.charAt(4));
    }

    @Test
    public void testCharAtInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.charAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.charAt(3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testSetCharAt() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        sb.setCharAt(0, 'H');
        assertEquals('H', sb.charAt(0));
        assertEquals("Hello", sb.toString());
    }

    @Test
    public void testSetCharAtInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.setCharAt(-1, 'X');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.setCharAt(3, 'X');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testDeleteCharAt() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        sb.deleteCharAt(0);
        assertEquals("ello", sb.toString());
        sb.deleteCharAt(sb.length() - 1); // delete 'o'
        assertEquals("ell", sb.toString());
    }

    @Test
    public void testDeleteCharAtInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.deleteCharAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.deleteCharAt(3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    // Char array retrieval tests
    @Test
    public void testToCharArray() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        char[] expected = {'h', 'e', 'l', 'l', 'o'};
        assertArrayEquals(expected, sb.toCharArray());
    }

    @Test
    public void testToCharArrayEmpty() throws Exception {
        StrBuilder sb = new StrBuilder();
        char[] expected = ArrayUtils.EMPTY_CHAR_ARRAY;
        assertArrayEquals(expected, sb.toCharArray());
    }

    @Test
    public void testToCharArrayRange() throws Exception {
        StrBuilder sb = new StrBuilder("hello world");
        char[] expected = {'l', 'l', 'o'};
        assertArrayEquals(expected, sb.toCharArray(2, 5));
    }

    @Test
    public void testToCharArrayRangeInvalid() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        try {
            sb.toCharArray(-1, 3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.toCharArray(2, 6);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.toCharArray(4, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testGetChars() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        char[] destination = new char[10];
        char[] result = sb.getChars(destination);
        assertSame(destination, result);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o', '\0', '\0', '\0', '\0', '\0'}, destination);
    }

    @Test
    public void testGetCharsNewArray() throws Exception {
        StrBuilder sb = new StrBuilder("hello");
        char[] result = sb.getChars(null);
        assertNotNull(result);
        assertArrayEquals(new char[]{'h', 'e', 'l', 'l', 'o'}, result);
    }

    @Test
    public void testGetCharsWithRangeAndDestinationIndex() throws Exception {
        StrBuilder sb = new StrBuilder("hello world");
        char[] destination = new char[20];
        sb.getChars(6, 11, destination, 3); // "world" starting at index 3
        assertEquals("   world", new String(destination, 0, 11));
    }

    // Append Tests
    @Test
    public void testAppendNewLine() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendNewLine();
        assertEquals("start" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendNewLineWithCustomNewLine() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNewLineText("::");
        sb.appendNewLine();
        assertEquals("start::", sb.toString());
    }

    @Test
    public void testAppendNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendNull();
        assertEquals("start", sb.toString()); // Default nullText is null
        sb.setNullText("NULL");
        sb.appendNull();
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendObject() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append((Object) "middle");
        assertEquals("startmiddle", sb.toString());
    }

    @Test
    public void testAppendObjectNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((Object) null);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendString() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("middle");
        assertEquals("startmiddle", sb.toString());
    }

    @Test
    public void testAppendStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((String) null);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendStringRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append("middle", 1, 3); // "idd"
        assertEquals("startidd", sb.toString());
    }

    @Test
    public void testAppendStringRangeNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        // The following line will cause ambiguity as append(String, int, int) and append(nullText) are both valid.
        // To resolve, we explicitly cast null to String.
        sb.append((String) null, 0, 3);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendStringRangeInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.append("def", -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.append("def", 0, 4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testAppendStringBuffer() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer("middle"));
        assertEquals("startmiddle", sb.toString());
    }

    @Test
    public void testAppendStringBufferNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((StringBuffer) null);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendStringBufferRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer("middle"), 1, 3); // "idd"
        assertEquals("startidd", sb.toString());
    }

    @Test
    public void testAppendStringBufferRangeNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((StringBuffer) null, 0, 3);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendStringBufferRangeInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.append(new StringBuffer("def"), -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.append(new StringBuffer("def"), 0, 4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testAppendStrBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder("middle"));
        assertEquals("startmiddle", sb.toString());
    }

    @Test
    public void testAppendStrBuilderNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((StrBuilder) null);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendStrBuilderRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder("middle"), 1, 3); // "idd"
        assertEquals("startidd", sb.toString());
    }

    @Test
    public void testAppendStrBuilderRangeNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((StrBuilder) null, 0, 3);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendStrBuilderRangeInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        StrBuilder toAppend = new StrBuilder("def");
        try {
            sb.append(toAppend, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.append(toAppend, 0, 4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testAppendCharArray() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[]{'m', 'i', 'd', 'd', 'l', 'e'});
        assertEquals("startmiddle", sb.toString());
    }

    @Test
    public void testAppendCharArrayNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((char[]) null);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendCharArrayRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[]{'m', 'i', 'd', 'd', 'l', 'e'}, 1, 3); // "idd"
        assertEquals("startidd", sb.toString());
    }

    @Test
    public void testAppendCharArrayRangeNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.append((char[]) null, 0, 3);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testAppendCharArrayRangeInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        char[] chars = {'d', 'e', 'f'};
        try {
            sb.append(chars, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.append(chars, 0, 4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testAppendBooleanTrue() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(true);
        assertEquals("starttrue", sb.toString());
    }

    @Test
    public void testAppendBooleanFalse() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(false);
        assertEquals("startfalse", sb.toString());
    }

    @Test
    public void testAppendChar() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append('!');
        assertEquals("start!", sb.toString());
    }

    @Test
    public void testAppendInt() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(123);
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testAppendLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(1234567890123L);
        assertEquals("start1234567890123", sb.toString());
    }

    @Test
    public void testAppendFloat() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(1.23f);
        assertEquals("start1.23", sb.toString());
    }

    @Test
    public void testAppendDouble() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.append(1.23456789);
        assertEquals("start1.23456789", sb.toString());
    }

    // Appendln Tests
    @Test
    public void testAppendlnObject() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln("middle");
        assertEquals("startmiddle" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnString() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln("middle");
        assertEquals("startmiddle" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnStringRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln("middle", 1, 3); // "idd"
        assertEquals("startidd" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnStringBuffer() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(new StringBuffer("middle"));
        assertEquals("startmiddle" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnStringBufferRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(new StringBuffer("middle"), 1, 3); // "idd"
        assertEquals("startidd" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnStrBuilder() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(new StrBuilder("middle"));
        assertEquals("startmiddle" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnStrBuilderRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(new StrBuilder("middle"), 1, 3); // "idd"
        assertEquals("startidd" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnCharArray() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(new char[]{'m', 'i', 'd', 'd', 'l', 'e'});
        assertEquals("startmiddle" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnCharArrayRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(new char[]{'m', 'i', 'd', 'd', 'l', 'e'}, 1, 3); // "idd"
        assertEquals("startidd" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnBoolean() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(true);
        assertEquals("starttrue" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnChar() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln('!');
        assertEquals("start!" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnInt() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(123);
        assertEquals("start123" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(1234567890123L);
        assertEquals("start1234567890123" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnFloat() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(1.23f);
        assertEquals("start1.23" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendlnDouble() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.appendln(1.23456789);
        assertEquals("start1.23456789" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    // AppendAll Tests
    @Test
    public void testAppendAllObjects() throws Exception {
        StrBuilder sb = new StrBuilder();
        Object[] array = {"a", "b", "c"};
        sb.appendAll(array);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendAllObjectsEmpty() throws Exception {
        StrBuilder sb = new StrBuilder();
        Object[] array = {};
        sb.appendAll(array);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllObjectsNull() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Object[]) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllCollection() throws Exception {
        StrBuilder sb = new StrBuilder();
        Collection<String> coll = java.util.Arrays.asList("a", "b", "c");
        sb.appendAll(coll);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendAllCollectionEmpty() throws Exception {
        StrBuilder sb = new StrBuilder();
        Collection<String> coll = new java.util.ArrayList<>();
        sb.appendAll(coll);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllCollectionNull() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Collection) null);
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendAllIterator() throws Exception {
        StrBuilder sb = new StrBuilder();
        Iterator<String> it = java.util.Arrays.asList("a", "b", "c").iterator();
        sb.appendAll(it);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendAllIteratorNull() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendAll((Iterator) null);
        assertEquals("", sb.toString());
    }

    // AppendWithSeparators Tests
    @Test
    public void testAppendWithSeparatorsObjects() throws Exception {
        StrBuilder sb = new StrBuilder();
        Object[] array = {"a", "b", "c"};
        sb.appendWithSeparators(array, ",");
        assertEquals("a,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectsNullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder();
        Object[] array = {"a", "b", "c"};
        sb.appendWithSeparators(array, null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectsEmptyArray() throws Exception {
        StrBuilder sb = new StrBuilder();
        Object[] array = {};
        sb.appendWithSeparators(array, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectsNullArray() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollection() throws Exception {
        StrBuilder sb = new StrBuilder();
        Collection<String> coll = java.util.Arrays.asList("a", "b", "c");
        sb.appendWithSeparators(coll, ",");
        assertEquals("a,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder();
        Collection<String> coll = java.util.Arrays.asList("a", "b", "c");
        sb.appendWithSeparators(coll, null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionEmpty() throws Exception {
        StrBuilder sb = new StrBuilder();
        Collection<String> coll = new java.util.ArrayList<>();
        sb.appendWithSeparators(coll, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNull() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Collection) null, ",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIterator() throws Exception {
        StrBuilder sb = new StrBuilder();
        Iterator<String> it = java.util.Arrays.asList("a", "b", "c").iterator();
        sb.appendWithSeparators(it, ",");
        assertEquals("a,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder();
        Iterator<String> it = java.util.Arrays.asList("a", "b", "c").iterator();
        sb.appendWithSeparators(it, null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNull() throws Exception {
        StrBuilder sb = new StrBuilder();
        sb.appendWithSeparators((Iterator) null, ",");
        assertEquals("", sb.toString());
    }

    // AppendSeparator Tests
    @Test
    public void testAppendSeparatorStringNonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(",");
        assertEquals("abc,", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.appendSeparator(",");
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(null);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharNonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(',');
        assertEquals("abc,", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.appendSeparator(',');
        assertEquals("", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringAndLoopIndexNonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(",", 1);
        assertEquals("abc,", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringAndLoopIndexZero() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(",", 0);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendSeparatorStringAndLoopIndexNullSeparator() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(null, 1);
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharAndLoopIndexNonEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(',', 1);
        assertEquals("abc,", sb.toString());
    }

    @Test
    public void testAppendSeparatorCharAndLoopIndexZero() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendSeparator(',', 0);
        assertEquals("abc", sb.toString());
    }

    // AppendPadding Tests
    @Test
    public void testAppendPaddingPositiveLength() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendPadding(3, '*');
        assertEquals("abc***", sb.toString());
    }

    @Test
    public void testAppendPaddingZeroLength() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendPadding(0, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendPaddingNegativeLength() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendPadding(-2, '*');
        assertEquals("abc", sb.toString());
    }

    // AppendFixedWidthPadLeft Tests
    @Test
    public void testAppendFixedWidthPadLeft() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadLeft("def", 5, '*');
        assertEquals("abc**def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadLeft("defghi", 5, '*');
        assertEquals("abcghi", sb.toString()); // "def" is lost from the left
    }

    @Test
    public void testAppendFixedWidthPadLeftNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setNullText("NULL");
        sb.appendFixedWidthPadLeft(null, 5, '*');
        assertEquals("abc**NULL", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftZeroWidth() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadLeft("def", 0, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftNegativeWidth() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadLeft("def", -5, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftInt() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadLeft(123, 5, '*');
        assertEquals("abc**123", sb.toString());
    }

    // AppendFixedWidthPadRight Tests
    @Test
    public void testAppendFixedWidthPadRight() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadRight("def", 5, '*');
        assertEquals("abc*def", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadRight("defghi", 5, '*');
        assertEquals("abcdef", sb.toString()); // "ghi" is lost from the right
    }

    @Test
    public void testAppendFixedWidthPadRightNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.setNullText("NULL");
        sb.appendFixedWidthPadRight(null, 5, '*');
        assertEquals("abc*NULL", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightZeroWidth() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadRight("def", 0, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightNegativeWidth() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadRight("def", -5, '*');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightInt() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.appendFixedWidthPadRight(123, 5, '*');
        assertEquals("abc*123", sb.toString());
    }

    // Insert Tests
    @Test
    public void testInsertObject() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, "end");
        assertEquals("startend", sb.toString());
        sb.insert(0, "BEGIN ");
        assertEquals("BEGIN startend", sb.toString());
    }

    @Test
    public void testInsertObjectNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.insert(5, null); // Explicitly call insert(int, String)
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testInsertString() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, "end");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.insert(5, (String) null);
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testInsertCharArray() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, new char[]{'e', 'n', 'd'});
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertCharArrayNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.insert(5, (char[]) null); // Explicitly call insert(int, String)
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testInsertCharArrayRange() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, new char[]{'a', 'b', 'c', 'd', 'e'}, 1, 3); // "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testInsertCharArrayRangeNull() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("NULL");
        sb.insert(5, (char[]) null, 0, 3); // Explicitly call insert(int, String)
        assertEquals("startNULL", sb.toString());
    }

    @Test
    public void testInsertCharArrayRangeInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        char[] chars = {'d', 'e', 'f'};
        try {
            sb.insert(3, chars, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.insert(3, chars, 0, 4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testInsertBooleanTrue() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, true);
        assertEquals("starttrue", sb.toString());
    }

    @Test
    public void testInsertBooleanFalse() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, false);
        assertEquals("startfalse", sb.toString());
    }

    @Test
    public void testInsertChar() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, '!');
        assertEquals("start!", sb.toString());
    }

    @Test
    public void testInsertInt() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 123);
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testInsertLong() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 1234567890123L);
        assertEquals("start1234567890123", sb.toString());
    }

    @Test
    public void testInsertFloat() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 1.23f);
        assertEquals("start1.23", sb.toString());
    }

    @Test
    public void testInsertDouble() throws Exception {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 1.23456789);
        assertEquals("start1.23456789", sb.toString());
    }

    @Test
    public void testInsertIndexOutOfBounds() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.insert(-1, "test");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.insert(4, "test"); // index > size
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    // Delete Tests
    @Test
    public void testDelete() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefghi");
        sb.delete(2, 5); // delete "cde"
        assertEquals("abfghi", sb.toString());
    }

    @Test
    public void testDeleteToEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefghi");
        sb.delete(2, 100); // delete from index 2 to end
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testDeleteEmptyRange() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefghi");
        sb.delete(2, 2);
        assertEquals("abcdefghi", sb.toString());
    }

    @Test
    public void testDeleteInvalidRange() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.delete(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.delete(4, 5); // startIndex > size
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.delete(2, 1); // endIndex < startIndex
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testDeleteAllChar() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.deleteAll('a');
        assertEquals("bbb", sb.toString());
    }

    @Test
    public void testDeleteAllCharNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("bbb");
        sb.deleteAll('a');
        assertEquals("bbb", sb.toString());
    }

    @Test
    public void testDeleteAllCharEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.deleteAll('a');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteFirstChar() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.deleteFirst('a');
        assertEquals("baba", sb.toString());
    }

    @Test
    public void testDeleteFirstCharNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("bbb");
        sb.deleteFirst('a');
        assertEquals("bbb", sb.toString());
    }

    @Test
    public void testDeleteFirstCharEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.deleteFirst('a');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAllString() throws Exception {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.deleteAll("abc");
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAllStringPartial() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.deleteAll("aba");
        assertEquals("b", sb.toString());
    }

    @Test
    public void testDeleteAllStringNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll("def");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((String) null); // Explicitly call delete all String
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstString() throws Exception {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.deleteFirst("abc");
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst("def");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst((String) null); // Explicitly call delete first String
        assertEquals("abc", sb.toString());
    }

    // Replace Tests
    @Test
    public void testReplaceRange() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefghi");
        sb.replace(2, 5, "XYZ"); // replace "cde" with "XYZ"
        assertEquals("abXYZfghi", sb.toString());
    }

    @Test
    public void testReplaceRangeWithEmptyString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefghi");
        sb.replace(2, 5, ""); // delete "cde"
        assertEquals("abfghi", sb.toString());
    }

    @Test
    public void testReplaceRangeWithLongerString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(1, 2, "XXXX"); // replace "b" with "XXXX"
        assertEquals("aXXXXc", sb.toString());
    }

    @Test
    public void testReplaceRangeWithNullReplaceString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefghi");
        sb.replace(2, 5, null); // delete "cde"
        assertEquals("abfghi", sb.toString());
    }

    @Test
    public void testReplaceRangeInvalidIndex() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.replace(-1, 2, "X");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.replace(4, 5, "X");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.replace(2, 1, "X");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReplaceAllChar() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.replaceAll('a', 'X');
        assertEquals("XbXbX", sb.toString());
    }

    @Test
    public void testReplaceAllCharSameChar() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.replaceAll('a', 'a');
        assertEquals("ababa", sb.toString());
    }

    @Test
    public void testReplaceAllCharNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("bbb");
        sb.replaceAll('a', 'X');
        assertEquals("bbb", sb.toString());
    }

    @Test
    public void testReplaceFirstChar() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.replaceFirst('a', 'X');
        assertEquals("Xbaba", sb.toString());
    }

    @Test
    public void testReplaceFirstCharSameChar() throws Exception {
        StrBuilder sb = new StrBuilder("ababa");
        sb.replaceFirst('a', 'a');
        assertEquals("ababa", sb.toString());
    }

    @Test
    public void testReplaceFirstCharNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("bbb");
        sb.replaceFirst('a', 'X');
        assertEquals("bbb", sb.toString());
    }

    @Test
    public void testReplaceAllString() throws Exception {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceAll("abc", "XYZ");
        assertEquals("XYZXYZXYZ", sb.toString());
    }

    @Test
    public void testReplaceAllStringOverlap() throws Exception {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceAll("aba", "X");
        assertEquals("XbX", sb.toString());
    }

    @Test
    public void testReplaceAllStringWithEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll("b", "");
        assertEquals("acac", sb.toString());
    }

    @Test
    public void testReplaceAllStringWithNullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll("b", null);
        assertEquals("acac", sb.toString());
    }

    @Test
    public void testReplaceAllStringNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll("def", "XYZ");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringNullSearch() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll((String) null, "XYZ"); // Explicitly call replaceAll(String, String)
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstString() throws Exception {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceFirst("abc", "XYZ");
        assertEquals("XYZabcabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringOverlap() throws Exception {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceFirst("aba", "X");
        assertEquals("Xbab", sb.toString());
    }

    @Test
    public void testReplaceFirstStringWithEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst("b", "");
        assertEquals("acabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringWithNullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst("b", null);
        assertEquals("acabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst("def", "XYZ");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNullSearch() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst((String) null, "XYZ"); // Explicitly call replaceFirst(String, String)
        assertEquals("abc", sb.toString());
    }

    // Reverse Test
    @Test
    public void testReverse() throws Exception {
        StrBuilder sb = new StrBuilder("abcde");
        sb.reverse();
        assertEquals("edcba", sb.toString());
    }

    @Test
    public void testReverseEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.reverse();
        assertEquals("", sb.toString());
    }

    @Test
    public void testReverseSingleChar() throws Exception {
        StrBuilder sb = new StrBuilder("a");
        sb.reverse();
        assertEquals("a", sb.toString());
    }

    // Trim Test
    @Test
    public void testTrim() throws Exception {
        StrBuilder sb = new StrBuilder("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimLeading() throws Exception {
        StrBuilder sb = new StrBuilder("  abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimTrailing() throws Exception {
        StrBuilder sb = new StrBuilder("abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimNoWhitespace() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimAllWhitespace() throws Exception {
        StrBuilder sb = new StrBuilder("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        sb.trim();
        assertEquals("", sb.toString());
    }

    // StartsWith/EndsWith Tests
    @Test
    public void testStartsWith() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.startsWith("abc"));
        assertFalse(sb.startsWith("bcd"));
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWithNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testStartsWithLongerString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.startsWith("abcdef"));
    }

    @Test
    public void testEndsWith() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.endsWith("def"));
        assertFalse(sb.endsWith("abc"));
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWithNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.endsWith(null));
    }

    @Test
    public void testEndsWithLongerString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.endsWith("abcdef"));
    }

    // Substring Tests
    @Test
    public void testSubstringStart() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.substring(3));
    }

    @Test
    public void testSubstringStartEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.substring(6));
    }

    @Test
    public void testSubstringStartInvalid() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.substring(4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.substring(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testSubstringStartEnd() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cde", sb.substring(2, 5));
    }

    @Test
    public void testSubstringStartEndFull() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abcdef", sb.substring(0, 6));
    }

    @Test
    public void testSubstringStartEndEndTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.substring(3, 100)); // treated as endIndex = size
    }

    @Test
    public void testSubstringStartEndInvalid() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.substring(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
        try {
            sb.substring(2, 1); // end < start
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testLeftString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.leftString(5));
    }

    @Test
    public void testLeftStringNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.leftString(-1));
    }

    @Test
    public void testLeftStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.leftString(5));
    }

    @Test
    public void testRightString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.rightString(3));
    }

    @Test
    public void testRightStringTooLong() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.rightString(5));
    }

    @Test
    public void testRightStringNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.rightString(-1));
    }

    @Test
    public void testRightStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.rightString(5));
    }

    @Test
    public void testMidString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("cde", sb.midString(2, 3));
    }

    @Test
    public void testMidStringIndexNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.midString(-2, 3)); // index treated as 0
    }

    @Test
    public void testMidStringLengthNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(2, -3));
    }

    @Test
    public void testMidStringIndexTooLarge() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(10, 3)); // index >= size
    }

    @Test
    public void testMidStringLengthInsufficient() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("ef", sb.midString(4, 10)); // gets remaining chars
    }

    @Test
    public void testMidStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.midString(0, 5));
    }

    // Contains Tests
    @Test
    public void testContainsChar() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains('c'));
        assertFalse(sb.contains('z'));
    }

    @Test
    public void testContainsCharEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.contains('a'));
    }

    @Test
    public void testContainsString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains("cde"));
        assertFalse(sb.contains("xyz"));
    }

    @Test
    public void testContainsStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.contains("a"));
    }

    @Test
    public void testContainsStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.contains((String) null)); // Explicitly call contains(String)
    }

    @Test
    public void testContainsMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        assertTrue(sb.contains(StrMatcher.stringMatcher("123")));
        assertFalse(sb.contains(StrMatcher.stringMatcher("xyz")));
    }

    @Test
    public void testContainsMatcherNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.contains((StrMatcher) null)); // Explicitly call contains(StrMatcher)
    }

    // IndexOf Tests
    @Test
    public void testIndexOfChar() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(2, sb.indexOf('c'));
        assertEquals(8, sb.indexOf('c', 3));
    }

    @Test
    public void testIndexOfCharNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf('d'));
        assertEquals(-1, sb.indexOf('a', 3));
    }

    @Test
    public void testIndexOfCharEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.indexOf('a'));
    }

    @Test
    public void testIndexOfString() throws Exception {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(2, sb.indexOf("cde"));
        assertEquals(8, sb.indexOf("abc", 3));
    }

    @Test
    public void testIndexOfStringNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf("def"));
        assertEquals(-1, sb.indexOf("abc", 3));
    }

    @Test
    public void testIndexOfStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.indexOf("a"));
    }

    @Test
    public void testIndexOfStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf((String) null)); // Explicitly call indexOf(String)
        assertEquals(-1, sb.indexOf((String) null, 0)); // Explicitly call indexOf(String, int)
    }

    @Test
    public void testIndexOfMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def456");
        assertEquals(3, sb.indexOf(StrMatcher.stringMatcher("123")));
        assertEquals(9, sb.indexOf(StrMatcher.stringMatcher("456"), 4));
    }

    @Test
    public void testIndexOfMatcherNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf(StrMatcher.stringMatcher("def")));
    }

    @Test
    public void testIndexOfMatcherNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf((StrMatcher) null)); // Explicitly call indexOf(StrMatcher)
        assertEquals(-1, sb.indexOf((StrMatcher) null, 0)); // Explicitly call indexOf(StrMatcher, int)
    }

    // LastIndexOf Tests
    @Test
    public void testLastIndexOfChar() throws Exception {
        StrBuilder sb = new StrBuilder("abcabcabc");
        assertEquals(5, sb.lastIndexOf('c'));
        assertEquals(2, sb.lastIndexOf('c', 3));
    }

    @Test
    public void testLastIndexOfCharNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf('d'));
        assertEquals(-1, sb.lastIndexOf('c', -1));
    }

    @Test
    public void testLastIndexOfCharEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.lastIndexOf('a'));
    }

    @Test
    public void testLastIndexOfString() throws Exception {
        StrBuilder sb = new StrBuilder("abcabcabc");
        assertEquals(6, sb.lastIndexOf("abc"));
        assertEquals(2, sb.lastIndexOf("abc", 3));
    }

    @Test
    public void testLastlastIndexOfStringNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf("def"));
        assertEquals(-1, sb.lastIndexOf("abc", 1));
    }

    @Test
    public void testLastlastIndexOfStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals(-1, sb.lastIndexOf("a"));
    }

    @Test
    public void testLastIndexOfStringNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf((String) null)); // Explicitly call lastIndexOf(String)
        assertEquals(-1, sb.lastIndexOf((String) null, 0)); // Explicitly call lastIndexOf(String, int)
    }

    @Test
    public void testLastIndexOfMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def456");
        assertEquals(9, sb.lastIndexOf(StrMatcher.stringMatcher("456")));
        assertEquals(3, sb.lastIndexOf(StrMatcher.stringMatcher("123"), 5));
    }

    @Test
    public void testLastIndexOfMatcherNotFound() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.stringMatcher("def")));
    }

    @Test
    public void testLastIndexOfMatcherNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null)); // Explicitly call lastIndexOf(StrMatcher)
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null, 0)); // Explicitly call lastIndexOf(StrMatcher, int)
    }

    // Equality Tests
    @Test
    public void testEqualsBuilderEqual() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        assertTrue(sb1.equals(sb2));
    }

    @Test
    public void testEqualsBuilderNotEqual() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("def");
        assertFalse(sb1.equals(sb2));
    }

    @Test
    public void testEqualsBuilderDifferentLength() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abcd");
        assertFalse(sb1.equals(sb2));
    }

    @Test
    public void testEqualsBuilderSelf() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertTrue(sb.equals(sb));
    }

    @Test
    public void testEqualsBuilderNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.equals(null));
    }

    @Test
    public void testEqualsBuilderOtherType() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.equals("abc"));
    }

    @Test
    public void testEqualsIgnoreCaseBuilderEqual() throws Exception {
        StrBuilder sb1 = new StrBuilder("aBc");
        StrBuilder sb2 = new StrBuilder("AbC");
        assertTrue(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCaseBuilderNotEqual() throws Exception {
        StrBuilder sb1 = new StrBuilder("aBc");
        StrBuilder sb2 = new StrBuilder("AbD");
        assertFalse(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCaseBuilderDifferentLength() throws Exception {
        StrBuilder sb1 = new StrBuilder("aBc");
        StrBuilder sb2 = new StrBuilder("aBcD");
        assertFalse(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCaseBuilderSelf() throws Exception {
        StrBuilder sb = new StrBuilder("aBc");
        assertTrue(sb.equalsIgnoreCase(sb));
    }

    @Test
    public void testEqualsIgnoreCaseBuilderNull() throws Exception {
        StrBuilder sb = new StrBuilder("aBc");
        assertFalse(sb.equalsIgnoreCase(null));
    }

    // HashCode Test
    @Test
    public void testHashCode() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abc");
        assertEquals(sb1.hashCode(), sb2.hashCode());
    }

    @Test
    public void testHashCodeDifferent() throws Exception {
        StrBuilder sb1 = new StrBuilder("abc");
        StrBuilder sb2 = new StrBuilder("abd");
        assertNotEquals(sb1.hashCode(), sb2.hashCode());
    }

    // toString Tests
    @Test
    public void testToString() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testToStringEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        assertEquals("", sb.toString());
    }

    @Test
    public void testToStringBuffer() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        StringBuffer sf = sb.toStringBuffer();
        assertEquals("abc", sf.toString());
        // Ensure it's a different object
        assertNotSame(sb, sf);
    }

    @Test
    public void testToStringBufferEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        StringBuffer sf = sb.toStringBuffer();
        assertEquals("", sf.toString());
        assertNotSame(sb, sf);
    }

    // Miscellaneous Tests
    @Test
    public void testAsTokenizer() throws Exception {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tokenizer = sb.asTokenizer();
        assertNotNull(tokenizer);
        assertEquals("a", tokenizer.nextToken());
        assertEquals("b", tokenizer.nextToken());
        assertEquals("c", tokenizer.nextToken());
        assertFalse(tokenizer.hasNext());
    }

    @Test
    public void testAsReader() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        char[] buffer = new char[5];
        int len = reader.read(buffer, 0, 5);
        assertEquals(3, len);
        assertArrayEquals(new char[]{'a', 'b', 'c', '\0', '\0'}, buffer);
        assertEquals(-1, reader.read());
        reader.close(); // should do nothing
    }

    @Test
    public void testAsWriter() throws Exception {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        assertNotNull(writer);
        writer.write("hello");
        writer.write('!');
        writer.flush(); // should do nothing
        assertEquals("hello!", sb.toString());
        writer.close(); // should do nothing
        assertEquals("hello!", sb.toString());
    }

    // New tests for uncovered methods

    @Test
    public void testReplaceAllMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def456");
        sb.replaceAll(StrMatcher.stringMatcher("123"), "XYZ");
        assertEquals("abcXYZdef456", sb.toString());
    }

    @Test
    public void testReplaceAllMatcherWithNullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        sb.replaceAll(StrMatcher.stringMatcher("123"), null);
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def123");
        sb.replaceFirst(StrMatcher.stringMatcher("123"), "XYZ");
        assertEquals("abcXYZdef123", sb.toString());
    }

    @Test
    public void testReplaceFirstMatcherWithNullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        sb.replaceFirst(StrMatcher.stringMatcher("123"), null);
        assertEquals("abcdef", sb.toString());
    }
    
    @Test
    public void testReplaceRangeWithMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        sb.replace(StrMatcher.stringMatcher("123"), "XYZ", 0, sb.length(), -1);
        assertEquals("abcXYZdef", sb.toString());
    }

    @Test
    public void testReplaceRangeWithMatcherAndCount() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def123");
        sb.replace(StrMatcher.stringMatcher("123"), "XYZ", 0, sb.length(), 1);
        assertEquals("abcXYZdef123", sb.toString());
    }
    
    @Test
    public void testReplaceRangeWithMatcherAndCountZero() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def123");
        sb.replace(StrMatcher.stringMatcher("123"), "XYZ", 0, sb.length(), 0);
        assertEquals("abc123def123", sb.toString());
    }

    @Test
    public void testReplaceRangeWithMatcherAndNullReplace() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        sb.replace(StrMatcher.stringMatcher("123"), null, 0, sb.length(), -1);
        assertEquals("abcdef", sb.toString());
    }
    
    @Test
    public void testReplaceRangeWithMatcherInvalidRange() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        try {
            sb.replace(StrMatcher.stringMatcher("123"), "XYZ", -1, 10, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected
        }
    }

    @Test
    public void testReplaceRangeWithMatcherInvalidEndRange() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def");
        sb.replace(StrMatcher.stringMatcher("123"), "XYZ", 0, 100, -1); // endIndex too large
        assertEquals("abcXYZdef", sb.toString());
    }

    @Test
    public void testDeleteAllMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def456");
        sb.deleteAll(StrMatcher.stringMatcher("123"));
        assertEquals("abcdef456", sb.toString());
    }

    @Test
    public void testDeleteAllMatcherNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll((StrMatcher) null); // Explicitly call deleteAll(StrMatcher)
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstMatcher() throws Exception {
        StrBuilder sb = new StrBuilder("abc123def123");
        sb.deleteFirst(StrMatcher.stringMatcher("123"));
        assertEquals("abc123def", sb.toString());
    }

    @Test
    public void testDeleteFirstMatcherNull() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst((StrMatcher) null); // Explicitly call deleteFirst(StrMatcher)
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSkipReader() throws Exception {
        StrBuilder sb = new StrBuilder("abcde");
        Reader reader = sb.asReader();
        long skipped = reader.skip(3);
        assertEquals(3, skipped);
        assertEquals('d', reader.read());
        reader.close();
    }

    @Test
    public void testSkipReaderMoreThanAvailable() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        long skipped = reader.skip(10);
        assertEquals(3, skipped);
        assertEquals(-1, reader.read());
        reader.close();
    }

    @Test
    public void testSkipReaderNegative() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        long skipped = reader.skip(-5);
        assertEquals(0, skipped);
        assertEquals('a', reader.read());
        reader.close();
    }

    @Test
    public void testReadyReader() throws Exception {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        assertTrue(reader.ready());
        reader.read();
        reader.read();
        reader.read();
        assertFalse(reader.ready());
        reader.close();
    }

    @Test
    public void testReadyReaderEmpty() throws Exception {
        StrBuilder sb = new StrBuilder("");
        Reader reader = sb.asReader();
        assertFalse(reader.ready());
        reader.close();
    }

    @Test
    public void testMarkAndResetReader() throws Exception {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader reader = sb.asReader();
        assertEquals('a', reader.read());
        reader.mark(1);
        assertEquals('b', reader.read());
        assertEquals('c', reader.read());
        assertEquals('d', reader.read());
        reader.reset();
        assertEquals('b', reader.read());
        reader.close();
    }
}
```

1. SOURCE CODE ANALYSIS - The tests cover constructor behaviors, string manipulation methods like append, insert, delete, replace, reverse, trim, and string comparison methods like startsWith, endsWith, substring, indexOf, lastIndexOf, equals. The `StrBuilderTokenizer`, `StrBuilderReader`, and `StrBuilderWriter` inner classes are also exercised.
2. TEST CASE DESIGN - Each test method focuses on a specific aspect or edge case of a StrBuilder method, verifying expected output or behavior. For example, `testAppendStringRange` checks appending a substring, `testSetLengthNegative` checks invalid input for `setLength`, and `testReplaceAllStringOverlap` checks the behavior with overlapping patterns.
4. DEFECT DETECTION STRATEGY - The tests aim to cover various input scenarios, including valid inputs, edge cases (empty strings, nulls, boundary indices), and invalid inputs, to ensure the method behaves as expected according to the reference source. This strategy helps detect defects that might arise from incorrect handling of these specific conditions.
5. SUMMARY - 180 tests.
6. LIMITATIONS - Some tests for methods like `insert(int index, Object obj)` and `contains(char ch)` where `null` could be ambiguous between overloaded methods have been made explicit by casting `null` to the desired type. Actual defect detection is unknown until the unchanged test suite is executed against the reference and the defective versions.