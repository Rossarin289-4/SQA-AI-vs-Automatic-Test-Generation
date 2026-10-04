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

public class StrBuilderTest {

    @Test
    public void testConstructorDefault() {
        StrBuilder sb = new StrBuilder();
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorInitialCapacityZero() {
        StrBuilder sb = new StrBuilder(0);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorInitialCapacityNegative() {
        StrBuilder sb = new StrBuilder(-10);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorInitialCapacityPositive() {
        StrBuilder sb = new StrBuilder(100);
        assertEquals(0, sb.length());
        assertEquals(100, sb.capacity());
    }

    @Test
    public void testConstructorStringNull() {
        StrBuilder sb = new StrBuilder((String) null);
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorStringEmpty() {
        StrBuilder sb = new StrBuilder("");
        assertEquals(0, sb.length());
        assertEquals(32, sb.capacity());
    }

    @Test
    public void testConstructorStringWithContent() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals(5, sb.length());
        assertEquals("hello", sb.toString());
        assertTrue(sb.capacity() >= 5 + 32);
    }

    @Test
    public void testGetSetNewLineText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNewLineText());
        sb.setNewLineText("\n");
        assertEquals("\n", sb.getNewLineText());
        sb.setNewLineText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testGetSetNullText() {
        StrBuilder sb = new StrBuilder();
        assertNull(sb.getNullText());
        sb.setNullText("NULL");
        assertEquals("NULL", sb.getNullText());
        sb.setNullText(""); // Should set to null
        assertNull(sb.getNullText());
        sb.setNullText(null);
        assertNull(sb.getNullText());
    }

    @Test
    public void testLength() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.length());
        sb.append("de");
        assertEquals(5, sb.length());
        sb.delete(1, 3); // deletes "bc"
        assertEquals(3, sb.length());
    }

    @Test
    public void testSetLengthShorter() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.setLength(3);
        assertEquals(3, sb.length());
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testSetLengthLonger() {
        StrBuilder sb = new StrBuilder("abc");
        sb.setLength(5);
        assertEquals(5, sb.length());
        assertEquals("abc\0\0", sb.toString()); // Null characters are used as filler
    }

    @Test
    public void testSetLengthNegative() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.setLength(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testCapacity() {
        StrBuilder sb = new StrBuilder(50);
        assertEquals(50, sb.capacity());
    }

    @Test
    public void testEnsureCapacitySufficient() {
        StrBuilder sb = new StrBuilder(50);
        sb.ensureCapacity(50);
        assertEquals(50, sb.capacity());
    }

    @Test
    public void testEnsureCapacityIncrease() {
        StrBuilder sb = new StrBuilder(50);
        sb.ensureCapacity(100);
        assertEquals(100, sb.capacity());
    }

    @Test
    public void testMinimizeCapacity() {
        StrBuilder sb = new StrBuilder(100);
        sb.append("hello");
        assertEquals(100, sb.capacity());
        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testMinimizeCapacityNoChange() {
        StrBuilder sb = new StrBuilder("hello");
        sb.minimizeCapacity();
        assertEquals(5, sb.capacity());
        assertEquals("hello", sb.toString());
    }

    @Test
    public void testSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.size());
    }

    @Test
    public void testIsEmptyTrue() {
        StrBuilder sb = new StrBuilder();
        assertTrue(sb.isEmpty());
    }

    @Test
    public void testIsEmptyFalse() {
        StrBuilder sb = new StrBuilder("a");
        assertFalse(sb.isEmpty());
    }

    @Test
    public void testClear() {
        StrBuilder sb = new StrBuilder("abc");
        sb.clear();
        assertEquals(0, sb.length());
        assertEquals(0, sb.size());
        assertEquals("", sb.toString());
        assertEquals(5, sb.capacity()); // Capacity is not reduced
    }

    @Test
    public void testCharAtValid() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals('a', sb.charAt(0));
        assertEquals('c', sb.charAt(2));
    }

    @Test
    public void testCharAtInvalidLow() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.charAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testCharAtInvalidHigh() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.charAt(3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSetCharAtValid() {
        StrBuilder sb = new StrBuilder("abc");
        sb.setCharAt(1, 'X');
        assertEquals("aXc", sb.toString());
    }

    @Test
    public void testSetCharAtInvalidLow() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.setCharAt(-1, 'X');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSetCharAtInvalidHigh() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.setCharAt(3, 'X');
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteCharAtValid() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(1);
        assertEquals("ac", sb.toString());
    }

    @Test
    public void testDeleteCharAtFirst() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(0);
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testDeleteCharAtLast() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteCharAt(2);
        assertEquals("ab", sb.toString());
    }

    @Test
    public void testDeleteCharAtInvalidLow() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.deleteCharAt(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteCharAtInvalidHigh() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.deleteCharAt(3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testToCharArrayEmpty() {
        StrBuilder sb = new StrBuilder();
        char[] result = sb.toCharArray();
        assertEquals(0, result.length);
        assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, result);
    }

    @Test
    public void testToCharArrayNonEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        char[] result = sb.toCharArray();
        assertEquals(3, result.length);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testToCharArrayRangeValid() {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] result = sb.toCharArray(1, 4); // bcd
        assertEquals(3, result.length);
        assertArrayEquals(new char[]{'b', 'c', 'd'}, result);
    }

    @Test
    public void testToCharArrayRangeFull() {
        StrBuilder sb = new StrBuilder("abc");
        char[] result = sb.toCharArray(0, 3);
        assertEquals(3, result.length);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testToCharArrayRangeEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        char[] result = sb.toCharArray(1, 1);
        assertEquals(0, result.length);
        assertSame(ArrayUtils.EMPTY_CHAR_ARRAY, result);
    }

    @Test
    public void testToCharArrayRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        char[] result = sb.toCharArray(1, 10); // should be treated as end of string
        assertEquals(2, result.length); // bc
        assertArrayEquals(new char[]{'b', 'c'}, result);
    }

    @Test
    public void testToCharArrayRangeInvalidStart() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.toCharArray(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testToCharArrayRangeInvalidEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.toCharArray(1, -1); // Invalid because endIndex < 0
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }
    
    @Test
    public void testToCharArrayRangeInvalidStartGreaterThanEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.toCharArray(2, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetCharsDestinationNull() {
        StrBuilder sb = new StrBuilder("abc");
        char[] result = sb.getChars(null);
        assertEquals(3, result.length);
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
    }

    @Test
    public void testGetCharsDestinationSufficient() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[5];
        char[] result = sb.getChars(dest);
        assertEquals(5, result.length);
        assertArrayEquals(new char[]{'a', 'b', 'c', '\0', '\0'}, result);
        assertSame(dest, result);
    }

    @Test
    public void testGetCharsDestinationTooSmall() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[2];
        char[] result = sb.getChars(dest);
        assertEquals(3, result.length); // A new array is created
        assertArrayEquals(new char[]{'a', 'b', 'c'}, result);
        assertNotSame(dest, result);
    }

    @Test
    public void testGetCharsRangeValid() {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] dest = new char[6];
        sb.getChars(1, 4, dest, 0); // Copy "bcd" starting at index 0 in dest
        assertArrayEquals(new char[]{'b', 'c', 'd', '\0', '\0', '\0'}, dest);
    }

    @Test
    public void testGetCharsRangeOffset() {
        StrBuilder sb = new StrBuilder("abcdef");
        char[] dest = new char[10];
        sb.getChars(1, 4, dest, 3); // Copy "bcd" starting at index 3 in dest
        assertArrayEquals(new char[]{'\0', '\0', '\0', 'b', 'c', 'd', '\0', '\0', '\0', '\0'}, dest);
    }

    @Test
    public void testGetCharsRangeEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[3];
        sb.getChars(1, 1, dest, 0);
        assertArrayEquals(new char[]{'\0', '\0', '\0'}, dest);
    }

    @Test
    public void testGetCharsRangeInvalidStart() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[3];
        try {
            sb.getChars(-1, 2, dest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetCharsRangeInvalidEnd() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[3];
        try {
            sb.getChars(0, 4, dest, 0); // endIndex > length
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }
    
    @Test
    public void testGetCharsRangeInvalidStartGreaterThanEnd() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[3];
        try {
            sb.getChars(2, 1, dest, 0);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testGetCharsRangeInvalidDestinationIndex() {
        StrBuilder sb = new StrBuilder("abc");
        char[] dest = new char[3];
        try {
            sb.getChars(0, 2, dest, 3);
            fail("Expected IndexOutOfBoundsException");
        } catch (IndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendNewLineSystemDefault() {
        StrBuilder sb = new StrBuilder("hello");
        sb.appendNewLine();
        assertEquals("hello" + SystemUtils.LINE_SEPARATOR, sb.toString());
    }

    @Test
    public void testAppendNewLineCustom() {
        StrBuilder sb = new StrBuilder("hello");
        sb.setNewLineText("\n");
        sb.appendNewLine();
        assertEquals("hello\n", sb.toString());
    }

    @Test
    public void testAppendNullDefault() {
        StrBuilder sb = new StrBuilder("hello");
        sb.appendNull();
        assertEquals("hello", sb.toString()); // Default is to append nothing
    }

    @Test
    public void testAppendNullCustom() {
        StrBuilder sb = new StrBuilder("hello");
        sb.setNullText("N/A");
        sb.appendNull();
        assertEquals("helloN/A", sb.toString());
    }

    @Test
    public void testAppendObjectNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append((Object) null);
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendObjectNotNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(Integer.valueOf(123));
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testAppendStringNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append((String) null);
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendStringEmpty() {
        StrBuilder sb = new StrBuilder("start");
        sb.append("");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendStringValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.append("end");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppendStringWithStartIndexAndLength() {
        StrBuilder sb = new StrBuilder("start");
        String source = "abcdef";
        sb.append(source, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppendStringWithStartIndexAndLengthNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append((String) null, 0, 1); // Explicitly cast to String to resolve ambiguity
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendStringWithStartIndexAndLengthEmptyString() {
        StrBuilder sb = new StrBuilder("start");
        sb.append("abcdef", 1, 0); // Append nothing
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendStringWithStartIndexAndLengthInvalidStartIndex() {
        StrBuilder sb = new StrBuilder("start");
        String source = "abcdef";
        try {
            sb.append(source, -1, 3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStringWithStartIndexAndLengthInvalidLength() {
        StrBuilder sb = new StrBuilder("start");
        String source = "abcdef";
        try {
            sb.append(source, 1, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStringWithStartIndexAndLengthInvalidEndIndex() {
        StrBuilder sb = new StrBuilder("start");
        String source = "abcdef";
        try {
            sb.append(source, 1, 6); // startIndex + length > source.length()
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStringBufferNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append((StringBuffer) null);
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendStringBufferEmpty() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer(""));
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendStringBufferValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer("end"));
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppendStringBufferWithStartIndexAndLength() {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer source = new StringBuffer("abcdef");
        sb.append(source, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppendStringBufferWithStartIndexAndLengthNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(null, 0, 1); // Ambiguous, need to specify which append(String, int, int)
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendStringBufferWithStartIndexAndLengthEmptyBuffer() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StringBuffer("abcdef"), 1, 0); // Append nothing
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendStringBufferWithStartIndexAndLengthInvalidStartIndex() {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer source = new StringBuffer("abcdef");
        try {
            sb.append(source, -1, 3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStringBufferWithStartIndexAndLengthInvalidLength() {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer source = new StringBuffer("abcdef");
        try {
            sb.append(source, 1, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStringBufferWithStartIndexAndLengthInvalidEndIndex() {
        StrBuilder sb = new StrBuilder("start");
        StringBuffer source = new StringBuffer("abcdef");
        try {
            sb.append(source, 1, 6); // startIndex + length > source.length()
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStrBuilderNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append((StrBuilder) null);
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendStrBuilderEmpty() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder(""));
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendStrBuilderValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder("end"));
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppendStrBuilderWithStartIndexAndLength() {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder source = new StrBuilder("abcdef");
        sb.append(source, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppendStrBuilderWithStartIndexAndLengthNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(null, 0, 1); // Ambiguous, need to specify which append(String, int, int)
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendStrBuilderWithStartIndexAndLengthEmptyBuilder() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new StrBuilder("abcdef"), 1, 0); // Append nothing
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendStrBuilderWithStartIndexAndLengthInvalidStartIndex() {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder source = new StrBuilder("abcdef");
        try {
            sb.append(source, -1, 3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStrBuilderWithStartIndexAndLengthInvalidLength() {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder source = new StrBuilder("abcdef");
        try {
            sb.append(source, 1, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendStrBuilderWithStartIndexAndLengthInvalidEndIndex() {
        StrBuilder sb = new StrBuilder("start");
        StrBuilder source = new StrBuilder("abcdef");
        try {
            sb.append(source, 1, 6); // startIndex + length > source.length()
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendCharArrayNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append((char[]) null);
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendCharArrayEmpty() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[0]);
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendCharArrayValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[]{'e', 'n', 'd'});
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testAppendCharArrayWithStartIndexAndLength() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c', 'd', 'e', 'f'};
        sb.append(source, 1, 3); // append "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testAppendCharArrayWithStartIndexAndLengthNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(null, 0, 1); // Ambiguous, need to specify which append(String, int, int)
        assertEquals("start", sb.toString()); // Default null text is null
    }

    @Test
    public void testAppendCharArrayWithStartIndexAndLengthEmptyArray() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(new char[]{'a', 'b', 'c', 'd', 'e', 'f'}, 1, 0); // Append nothing
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendCharArrayWithStartIndexAndLengthInvalidStartIndex() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            sb.append(source, -1, 3);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendCharArrayWithStartIndexAndLengthInvalidLength() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            sb.append(source, 1, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendCharArrayWithStartIndexAndLengthInvalidEndIndex() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c', 'd', 'e', 'f'};
        try {
            sb.append(source, 1, 6); // startIndex + length > source.length()
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testAppendBooleanTrue() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(true);
        assertEquals("starttrue", sb.toString());
    }

    @Test
    public void testAppendBooleanFalse() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(false);
        assertEquals("startfalse", sb.toString());
    }

    @Test
    public void testAppendChar() {
        StrBuilder sb = new StrBuilder("start");
        sb.append('!');
        assertEquals("start!", sb.toString());
    }

    @Test
    public void testAppendInt() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(123);
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testAppendLong() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(1234567890123L);
        assertEquals("start1234567890123", sb.toString());
    }

    @Test
    public void testAppendFloat() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(1.23f);
        assertEquals("start1.23", sb.toString());
    }

    @Test
    public void testAppendDouble() {
        StrBuilder sb = new StrBuilder("start");
        sb.append(1.23456789);
        assertEquals("start1.23456789", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayNullArray() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators((Object[]) null, ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayEmptyArray() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[0], ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayNullSeparator() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[]{"a", "b"}, null);
        assertEquals("startab", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsObjectArrayValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new Object[]{"a", "b", "c"}, ",");
        assertEquals("starta,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionNullCollection() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators((Collection) null, ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionEmptyCollection() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators(new java.util.ArrayList<String>(), ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsCollectionValid() {
        StrBuilder sb = new StrBuilder("start");
        List<String> list = new java.util.ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        sb.appendWithSeparators(list, ",");
        assertEquals("starta,b,c", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorNullIterator() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendWithSeparators((Iterator) null, ",");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendWithSeparatorsIteratorValid() {
        StrBuilder sb = new StrBuilder("start");
        List<String> list = new java.util.ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        sb.appendWithSeparators(list.iterator(), ",");
        assertEquals("starta,b,c", sb.toString());
    }

    @Test
    public void testAppendPaddingPositiveLength() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendPadding(3, '*');
        assertEquals("start***", sb.toString());
    }

    @Test
    public void testAppendPaddingZeroLength() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendPadding(0, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendPaddingNegativeLength() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendPadding(-1, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", 5, '*');
        assertEquals("start**abc", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectTooLong() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abcdef", 5, '*');
        assertEquals("startbcde", sb.toString()); // Left side is lost
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("N/A");
        sb.appendFixedWidthPadLeft(null, 5, '*');
        assertEquals("start**N/A", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectWidthZero() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", 0, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftObjectWidthNegative() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft("abc", -5, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftIntValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft(123, 5, '*');
        assertEquals("start**123", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadLeftIntTooLong() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadLeft(123456, 5, '*');
        assertEquals("start23456", sb.toString()); // Left side is lost
    }

    @Test
    public void testAppendFixedWidthPadRightObjectValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", 5, '*');
        assertEquals("startabc**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightObjectTooLong() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abcdef", 5, '*');
        assertEquals("startabcde", sb.toString()); // Right side is lost
    }

    @Test
    public void testAppendFixedWidthPadRightObjectNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("N/A");
        sb.appendFixedWidthPadRight(null, 5, '*');
        assertEquals("startN/A**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightObjectWidthZero() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", 0, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightObjectWidthNegative() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight("abc", -5, '*');
        assertEquals("start", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightIntValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight(123, 5, '*');
        assertEquals("start123**", sb.toString());
    }

    @Test
    public void testAppendFixedWidthPadRightIntTooLong() {
        StrBuilder sb = new StrBuilder("start");
        sb.appendFixedWidthPadRight(123456, 5, '*');
        assertEquals("start12345", sb.toString()); // Right side is lost
    }

    @Test
    public void testInsertObjectValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, "end");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertObjectNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("N/A");
        sb.insert(5, (Object) null);
        assertEquals("startN/A", sb.toString());
    }

    @Test
    public void testInsertObjectAtBeginning() {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, "start");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertStringNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("N/A");
        sb.insert(5, (String) null);
        assertEquals("startN/A", sb.toString());
    }

    @Test
    public void testInsertStringEmpty() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, "");
        assertEquals("start", sb.toString());
    }

    @Test
    public void testInsertStringValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, "end");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertStringAtBeginning() {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, "start");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertStringAtIndex() {
        StrBuilder sb = new StrBuilder("stend");
        sb.insert(2, "art");
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertCharArrayNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("N/A");
        sb.insert(5, (char[]) null);
        assertEquals("startN/A", sb.toString());
    }

    @Test
    public void testInsertCharArrayEmpty() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, new char[0]);
        assertEquals("start", sb.toString());
    }

    @Test
    public void testInsertCharArrayValid() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, new char[]{'e', 'n', 'd'});
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertCharArrayAtBeginning() {
        StrBuilder sb = new StrBuilder("end");
        sb.insert(0, new char[]{'s', 't', 'a', 'r', 't'});
        assertEquals("startend", sb.toString());
    }

    @Test
    public void testInsertCharArrayPartValid() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c', 'd', 'e', 'f'};
        sb.insert(5, source, 1, 3); // insert "bcd"
        assertEquals("startbcd", sb.toString());
    }

    @Test
    public void testInsertCharArrayPartNull() {
        StrBuilder sb = new StrBuilder("start");
        sb.setNullText("N/A");
        sb.insert(5, null, 0, 1); // Ambiguous, need to specify which insert(String, int, int, int)
        assertEquals("startN/A", sb.toString());
    }

    @Test
    public void testInsertCharArrayPartEmpty() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c'};
        sb.insert(5, source, 0, 0); // Insert nothing
        assertEquals("start", sb.toString());
    }

    @Test
    public void testInsertCharArrayPartInvalidOffset() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c'};
        try {
            sb.insert(5, source, -1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testInsertCharArrayPartInvalidLength() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c'};
        try {
            sb.insert(5, source, 0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testInsertCharArrayPartInvalidEndIndex() {
        StrBuilder sb = new StrBuilder("start");
        char[] source = {'a', 'b', 'c'};
        try {
            sb.insert(5, source, 0, 4); // offset + length > source.length()
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testInsertBooleanTrue() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, true);
        assertEquals("starttrue", sb.toString());
    }

    @Test
    public void testInsertBooleanFalse() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, false);
        assertEquals("startfalse", sb.toString());
    }

    @Test
    public void testInsertChar() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, '!');
        assertEquals("start!", sb.toString());
    }

    @Test
    public void testInsertInt() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 123);
        assertEquals("start123", sb.toString());
    }

    @Test
    public void testInsertLong() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 1234567890123L);
        assertEquals("start1234567890123", sb.toString());
    }

    @Test
    public void testInsertFloat() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 1.23f);
        assertEquals("start1.23", sb.toString());
    }

    @Test
    public void testInsertDouble() {
        StrBuilder sb = new StrBuilder("start");
        sb.insert(5, 1.23456789);
        assertEquals("start1.23456789", sb.toString());
    }

    @Test
    public void testDeleteValidRange() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(1, 4); // delete "bcd"
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testDeleteRangeAtStart() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(0, 3); // delete "abc"
        assertEquals("def", sb.toString());
    }

    @Test
    public void testDeleteRangeAtEnd() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(3, 6); // delete "def"
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteEmptyRange() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.delete(2, 2); // delete nothing
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        sb.delete(1, 10); // delete "bc"
        assertEquals("a", sb.toString());
    }

    @Test
    public void testDeleteRangeInvalidStart() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.delete(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteRangeInvalidEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.delete(0, -1); // invalid, as endIndex < 0
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteRangeInvalidStartGreaterThanEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.delete(2, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testDeleteAllCharValid() {
        StrBuilder sb = new StrBuilder("abacaba");
        sb.deleteAll('a');
        assertEquals("bc", sb.toString());
    }

    @Test
    public void testDeleteAllCharNotFound() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteAll('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteAllCharEmpty() {
        StrBuilder sb = new StrBuilder("");
        sb.deleteAll('a');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteFirstCharValid() {
        StrBuilder sb = new StrBuilder("abacaba");
        sb.deleteFirst('a');
        assertEquals("bacaba", sb.toString());
    }

    @Test
    public void testDeleteFirstCharNotFound() {
        StrBuilder sb = new StrBuilder("abc");
        sb.deleteFirst('x');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testDeleteFirstCharEmpty() {
        StrBuilder sb = new StrBuilder("");
        sb.deleteFirst('a');
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAllStringNull() {
        StrBuilder sb = new StrBuilder("abcdefabc");
        sb.deleteAll((String) null);
        assertEquals("abcdefabc", sb.toString());
    }

    @Test
    public void testDeleteAllStringEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.deleteAll("");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteAllStringValid() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.deleteAll("abc");
        assertEquals("", sb.toString());
    }

    @Test
    public void testDeleteAllStringPartial() {
        StrBuilder sb = new StrBuilder("abcxyzabc");
        sb.deleteAll("abc");
        assertEquals("xyz", sb.toString());
    }

    @Test
    public void testDeleteAllStringNotFound() {
        StrBuilder sb = new StrBuilder("abcxyz");
        sb.deleteAll("def");
        assertEquals("abcxyz", sb.toString());
    }

    @Test
    public void testDeleteAllStringOverlapping() {
        StrBuilder sb = new StrBuilder("ababab");
        sb.deleteAll("aba");
        assertEquals("b", sb.toString()); // "aba" at 0 deleted, remaining "bab", "aba" at 3 deleted.
    }

    @Test
    public void testDeleteFirstStringNull() {
        StrBuilder sb = new StrBuilder("abcdefabc");
        sb.deleteFirst((String) null);
        assertEquals("abcdefabc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.deleteFirst("");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testDeleteFirstStringValid() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.deleteFirst("abc");
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testDeleteFirstStringNotFound() {
        StrBuilder sb = new StrBuilder("abcxyz");
        sb.deleteFirst("def");
        assertEquals("abcxyz", sb.toString());
    }

    @Test
    public void testReplaceValidRange() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "XYZ"); // replace "bcd" with "XYZ"
        assertEquals("aXYZef", sb.toString());
    }

    @Test
    public void testReplaceRangeShrinking() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "X"); // replace "bcd" with "X"
        assertEquals("aXef", sb.toString());
    }

    @Test
    public void testReplaceRangeExpanding() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, "XYZW"); // replace "bcd" with "XYZW"
        assertEquals("aXYZWef", sb.toString());
    }

    @Test
    public void testReplaceRangeWithNull() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(1, 4, null); // delete "bcd"
        assertEquals("aef", sb.toString());
    }

    @Test
    public void testReplaceRangeEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replace(2, 2, "XYZ"); // replace "" with "XYZ" at index 2
        assertEquals("abXYZcdef", sb.toString());
    }

    @Test
    public void testReplaceRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replace(1, 10, "XYZ"); // replace "bc" with "XYZ"
        assertEquals("aXYZ", sb.toString());
    }

    @Test
    public void testReplaceRangeInvalidStart() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.replace(-1, 2, "X");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReplaceRangeInvalidEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.replace(0, -1, "X"); // invalid endIndex
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }
    
    @Test
    public void testReplaceRangeInvalidStartGreaterThanEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.replace(2, 1, "X");
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testReplaceAllCharValid() {
        StrBuilder sb = new StrBuilder("abacaba");
        sb.replaceAll('a', 'X');
        assertEquals("XbXcXbX", sb.toString());
    }

    @Test
    public void testReplaceAllCharNoChange() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll('x', 'Y');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllCharSameChar() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceAll('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstCharValid() {
        StrBuilder sb = new StrBuilder("abacaba");
        sb.replaceFirst('a', 'X');
        assertEquals("Xbacaba", sb.toString());
    }

    @Test
    public void testReplaceFirstCharNoChange() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst('x', 'Y');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceFirstCharSameChar() {
        StrBuilder sb = new StrBuilder("abc");
        sb.replaceFirst('a', 'a');
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testReplaceAllStringNullSearch() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll((String) null, "X");
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testReplaceAllStringEmptySearch() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceAll("", "X");
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testReplaceAllStringValid() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceAll("abc", "X");
        assertEquals("XXX", sb.toString());
    }

    @Test
    public void testReplaceAllStringShrinking() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceAll("abc", "Y");
        assertEquals("YYY", sb.toString());
    }

    @Test
    public void testReplaceAllStringExpanding() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceAll("abc", "XYZ");
        assertEquals("XYZXYZXYZ", sb.toString());
    }

    @Test
    public void testReplaceAllStringNullReplace() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceAll("abc", null); // null replace is equivalent to empty string
        assertEquals("", sb.toString());
    }

    @Test
    public void testReplaceAllStringNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replaceAll("xyz", "X");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testReplaceAllStringOverlapping() {
        StrBuilder sb = new StrBuilder("ababab");
        sb.replaceAll("aba", "X");
        assertEquals("XbX", sb.toString()); // "aba" at 0 replaced, then "aba" at 4 replaced.
    }

    @Test
    public void testReplaceFirstStringNullSearch() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst((String) null, "X");
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringEmptySearch() {
        StrBuilder sb = new StrBuilder("abcabc");
        sb.replaceFirst("", "X");
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringValid() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceFirst("abc", "X");
        assertEquals("Xabcabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringExpanding() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceFirst("abc", "XYZ");
        assertEquals("XYZabcabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNullReplace() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        sb.replaceFirst("abc", null);
        assertEquals("abcabc", sb.toString());
    }

    @Test
    public void testReplaceFirstStringNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.replaceFirst("xyz", "X");
        assertEquals("abcdef", sb.toString());
    }

    @Test
    public void testReverseEmpty() {
        StrBuilder sb = new StrBuilder("");
        sb.reverse();
        assertEquals("", sb.toString());
    }

    @Test
    public void testReverseSingleChar() {
        StrBuilder sb = new StrBuilder("a");
        sb.reverse();
        assertEquals("a", sb.toString());
    }

    @Test
    public void testReverseEvenLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        sb.reverse();
        assertEquals("fedcba", sb.toString());
    }

    @Test
    public void testReverseOddLength() {
        StrBuilder sb = new StrBuilder("abcde");
        sb.reverse();
        assertEquals("edcba", sb.toString());
    }

    @Test
    public void testTrimEmpty() {
        StrBuilder sb = new StrBuilder("");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimNoWhitespace() {
        StrBuilder sb = new StrBuilder("abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimLeadingWhitespace() {
        StrBuilder sb = new StrBuilder("  abc");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimTrailingWhitespace() {
        StrBuilder sb = new StrBuilder("abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimBothWhitespace() {
        StrBuilder sb = new StrBuilder("  abc  ");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimAllWhitespace() {
        StrBuilder sb = new StrBuilder("   ");
        sb.trim();
        assertEquals("", sb.toString());
    }

    @Test
    public void testTrimMixedWhitespace() {
        StrBuilder sb = new StrBuilder("\t\n abc \r\f");
        sb.trim();
        assertEquals("abc", sb.toString());
    }

    @Test
    public void testTrimInternalWhitespace() {
        StrBuilder sb = new StrBuilder(" a b c ");
        sb.trim();
        assertEquals("a b c", sb.toString());
    }

    @Test
    public void testStartsWithNull() {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.startsWith(null));
    }

    @Test
    public void testStartsWithEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        assertTrue(sb.startsWith(""));
    }

    @Test
    public void testStartsWithValidPrefix() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.startsWith("abc"));
    }

    @Test
    public void testStartsWithInvalidPrefix() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.startsWith("abd"));
    }

    @Test
    public void testStartsWithPrefixLongerThanBuilder() {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.startsWith("abcd"));
    }

    @Test
    public void testEndsWithNull() {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.endsWith(null));
    }

    @Test
    public void testEndsWithEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        assertTrue(sb.endsWith(""));
    }

    @Test
    public void testEndsWithValidSuffix() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.endsWith("def"));
    }

    @Test
    public void testEndsWithInvalidSuffix() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.endsWith("gef"));
    }

    @Test
    public void testEndsWithSuffixLongerThanBuilder() {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.endsWith("abcd"));
    }

    @Test
    public void testSubstringValid() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("bcd", sb.substring(1, 4));
    }

    @Test
    public void testSubstringFull() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.substring(0, 3));
    }

    @Test
    public void testSubstringEmpty() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.substring(1, 1));
    }

    @Test
    public void testSubstringEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("bc", sb.substring(1, 10)); // endIndex treated as size
    }

    @Test
    public void testSubstringInvalidStart() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.substring(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testSubstringInvalidEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.substring(0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }
    
    @Test
    public void testSubstringInvalidStartGreaterThanEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.substring(2, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testLeftStringPositiveLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringLengthEqualsSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.leftString(3));
    }

    @Test
    public void testLeftStringLengthGreaterThanSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.leftString(5)); // returns whole string
    }

    @Test
    public void testLeftStringZeroLength() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.leftString(0));
    }

    @Test
    public void testLeftStringNegativeLength() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.leftString(-2));
    }

    @Test
    public void testRightStringPositiveLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.rightString(3));
    }

    @Test
    public void testRightStringLengthEqualsSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.rightString(3));
    }

    @Test
    public void testRightStringLengthGreaterThanSize() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("abc", sb.rightString(5)); // returns whole string
    }

    @Test
    public void testRightStringZeroLength() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.rightString(0));
    }

    @Test
    public void testRightStringNegativeLength() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals("", sb.rightString(-2));
    }

    @Test
    public void testMidStringValid() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("bcd", sb.midString(1, 3));
    }

    @Test
    public void testMidStringIndexZero() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.midString(0, 3));
    }

    @Test
    public void testMidStringLengthEqualsRemaining() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.midString(3, 3));
    }

    @Test
    public void testMidStringLengthGreaterThanRemaining() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("def", sb.midString(3, 5)); // returns remaining
    }

    @Test
    public void testMidStringIndexTooLarge() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(6, 3));
    }

    @Test
    public void testMidStringNegativeIndex() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("abc", sb.midString(-2, 3)); // index treated as 0
    }

    @Test
    public void testMidStringNegativeLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(1, -3));
    }

    @Test
    public void testMidStringZeroLength() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals("", sb.midString(1, 0));
    }

    @Test
    public void testContainsCharTrue() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains('c'));
    }

    @Test
    public void testContainsCharFalse() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains('x'));
    }

    @Test
    public void testContainsCharEmpty() {
        StrBuilder sb = new StrBuilder("");
        assertFalse(sb.contains('a'));
    }

    @Test
    public void testContainsStringTrue() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains("bcd"));
    }

    @Test
    public void testContainsStringFalse() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains("bce"));
    }

    @Test
    public void testContainsStringEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertTrue(sb.contains(""));
    }

    @Test
    public void testContainsStringNull() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains((String) null));
    }

    @Test
    public void testContainsMatcherTrue() {
        StrBuilder sb = new StrBuilder("abc123def");
        assertTrue(sb.contains(StrMatcher.stringMatcher("123")));
    }

    @Test
    public void testContainsMatcherFalse() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertFalse(sb.contains(StrMatcher.stringMatcher("123")));
    }

    @Test
    public void testContainsMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        assertFalse(sb.contains((StrMatcher) null));
    }

    @Test
    public void testIndexOfCharValid() {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(0, sb.indexOf('a'));
        assertEquals(3, sb.indexOf('d'));
        assertEquals(6, sb.indexOf('a', 1));
    }

    @Test
    public void testIndexOfCharNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf('x'));
        assertEquals(-1, sb.indexOf('a', 1));
    }

    @Test
    public void testIndexOfCharStartIndexAtEnd() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf('a', 6));
    }

    @Test
    public void testIndexOfCharStartIndexNegative() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(0, sb.indexOf('a', -5));
    }

    @Test
    public void testIndexOfStringValid() {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(0, sb.indexOf("abc"));
        assertEquals(6, sb.indexOf("abc", 1));
    }

    @Test
    public void testIndexOfStringNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf("xyz"));
        assertEquals(-1, sb.indexOf("abc", 1));
    }

    @Test
    public void testIndexOfStringEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(0, sb.indexOf(""));
        assertEquals(3, sb.indexOf("", 3));
    }

    @Test
    public void testIndexOfStringNull() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf((String) null));
    }

    @Test
    public void testIndexOfStringStartIndexAtEnd() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf("abc", 6));
    }

    @Test
    public void testIndexOfStringStartIndexNegative() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(0, sb.indexOf("abc", -5));
    }

    @Test
    public void testIndexOfMatcherValid() {
        StrBuilder sb = new StrBuilder("abc123def");
        assertEquals(3, sb.indexOf(StrMatcher.stringMatcher("123")));
        assertEquals(0, sb.indexOf(StrMatcher.stringMatcher("abc")));
    }

    @Test
    public void testIndexOfMatcherNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.indexOf(StrMatcher.stringMatcher("123")));
    }

    @Test
    public void testIndexOfMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf((StrMatcher) null));
    }

    @Test
    public void testIndexOfMatcherStartIndexValid() {
        StrBuilder sb = new StrBuilder("abc123def123");
        assertEquals(3, sb.indexOf(StrMatcher.stringMatcher("123"), 0));
        assertEquals(9, sb.indexOf(StrMatcher.stringMatcher("123"), 4));
    }

    @Test
    public void testIndexOfMatcherStartIndexAtEnd() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.indexOf(StrMatcher.stringMatcher("a"), 3));
    }

    @Test
    public void testIndexOfMatcherStartIndexNegative() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(0, sb.indexOf(StrMatcher.stringMatcher("a"), -5));
    }

    @Test
    public void testLastIndexOfCharValid() {
        StrBuilder sb = new StrBuilder("abcdefabc");
        assertEquals(6, sb.lastIndexOf('a'));
        assertEquals(3, sb.lastIndexOf('d'));
        assertEquals(0, sb.lastIndexOf('a', 5));
    }

    @Test
    public void testLastIndexOfCharNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.lastIndexOf('x'));
        assertEquals(-1, sb.lastIndexOf('a', 5));
    }

    @Test
    public void testLastIndexOfCharStartIndexNegative() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.lastIndexOf('a', -5));
    }

    @Test
    public void testLastIndexOfStringValid() {
        StrBuilder sb = new StrBuilder("abcabcabc");
        assertEquals(6, sb.lastIndexOf("abc"));
        assertEquals(0, sb.lastIndexOf("abc", 5));
    }

    @Test
    public void testLastIndexOfStringNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.lastIndexOf("xyz"));
        assertEquals(-1, sb.lastIndexOf("abc", 5));
    }

    @Test
    public void testLastIndexOfStringEmpty() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(6, sb.lastIndexOf("")); // endIndex is size
        assertEquals(3, sb.lastIndexOf("", 3));
    }

    @Test
    public void testLastIndexOfStringNull() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.lastIndexOf((String) null));
    }

    @Test
    public void testLastIndexOfStringStartIndexNegative() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.lastIndexOf("abc", -5));
    }

    @Test
    public void testLastIndexOfMatcherValid() {
        StrBuilder sb = new StrBuilder("abc123def123");
        assertEquals(9, sb.lastIndexOf(StrMatcher.stringMatcher("123")));
        assertEquals(3, sb.lastIndexOf(StrMatcher.stringMatcher("123"), 5));
    }

    @Test
    public void testLastIndexOfMatcherNotFound() {
        StrBuilder sb = new StrBuilder("abcdef");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.stringMatcher("123")));
    }

    @Test
    public void testLastIndexOfMatcherNull() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf((StrMatcher) null));
    }

    @Test
    public void testLastIndexOfMatcherStartIndexValid() {
        StrBuilder sb = new StrBuilder("abc123def123");
        assertEquals(9, sb.lastIndexOf(StrMatcher.stringMatcher("123"), 11));
        assertEquals(3, sb.lastIndexOf(StrMatcher.stringMatcher("123"), 5));
    }

    @Test
    public void testLastIndexOfMatcherStartIndexNegative() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(-1, sb.lastIndexOf(StrMatcher.stringMatcher("a"), -1));
    }

    @Test
    public void testToString() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("hello", sb.toString());
        StrBuilder emptySb = new StrBuilder();
        assertEquals("", emptySb.toString());
    }

    @Test
    public void testToStringBuffer() {
        StrBuilder sb = new StrBuilder("hello");
        assertEquals("hello", sb.toStringBuffer().toString());
        StrBuilder emptySb = new StrBuilder();
        assertEquals("", emptySb.toStringBuffer().toString());
    }

    @Test
    public void testEqualsTrueSameInstance() {
        StrBuilder sb = new StrBuilder("hello");
        assertTrue(sb.equals(sb));
    }

    @Test
    public void testEqualsTrueSameContent() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("hello");
        assertTrue(sb1.equals(sb2));
    }

    @Test
    public void testEqualsFalseDifferentContent() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("world");
        assertFalse(sb1.equals(sb2));
    }

    @Test
    public void testEqualsFalseDifferentLength() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("hell");
        assertFalse(sb1.equals(sb2));
    }

    @Test
    public void testEqualsNull() {
        StrBuilder sb = new StrBuilder("hello");
        assertFalse(sb.equals(null));
    }

    @Test
    public void testEqualsDifferentType() {
        StrBuilder sb = new StrBuilder("hello");
        assertFalse(sb.equals("hello"));
    }

    @Test
    public void testEqualsIgnoreCaseTrue() {
        StrBuilder sb1 = new StrBuilder("HeLlO");
        StrBuilder sb2 = new StrBuilder("hElLo");
        assertTrue(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testEqualsIgnoreCaseFalse() {
        StrBuilder sb1 = new StrBuilder("HeLlO");
        StrBuilder sb2 = new StrBuilder("HeLlA");
        assertFalse(sb1.equalsIgnoreCase(sb2));
    }

    @Test
    public void testHashCode() {
        StrBuilder sb1 = new StrBuilder("hello");
        StrBuilder sb2 = new StrBuilder("hello");
        assertEquals(sb1.hashCode(), sb2.hashCode());
        StrBuilder sb3 = new StrBuilder("world");
        assertNotEquals(sb1.hashCode(), sb3.hashCode());
    }

    // The following methods (asTokenizer, asReader, asWriter) are more complex
    // and rely on inner classes or external dependencies. Testing them thoroughly
    // would require more setup. For this task, we'll focus on the core String
    // manipulation methods.
    // We can add a basic test to ensure they don't throw exceptions for common cases.

    @Test
    public void testAsTokenizer() {
        StrBuilder sb = new StrBuilder("a b c");
        StrTokenizer tokenizer = sb.asTokenizer();
        assertNotNull(tokenizer);
        // Basic check to see if it produces expected tokens
        String[] tokens = tokenizer.getTokenArray();
        assertArrayEquals(new String[]{"a", "b", "c"}, tokens);
    }
    
    @Test
    public void testAsTokenizerReset() {
        StrBuilder sb = new StrBuilder("a b");
        StrTokenizer tokenizer = sb.asTokenizer();
        tokenizer.getTokenArray(); // consume tokens
        sb.append(" c");
        tokenizer.reset(); // reset to pick up changes
        String[] tokens = tokenizer.getTokenArray();
        assertArrayEquals(new String[]{"a", "b", "c"}, tokens);
    }

    @Test
    public void testAsReader() {
        StrBuilder sb = new StrBuilder("read me");
        Reader reader = sb.asReader();
        assertNotNull(reader);
        try {
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals("read me".length(), len);
            assertEquals("read me", new String(buffer, 0, len));
        } catch (java.io.IOException e) {
            fail("IOException during read: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
    
    @Test
    public void testAsReaderMarkReset() {
        StrBuilder sb = new StrBuilder("read me");
        Reader reader = sb.asReader();
        try {
            reader.read(); // 'r'
            reader.mark(0);
            reader.read(); // 'e'
            reader.read(); // 'a'
            reader.reset();
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals("ad me".length(), len);
            assertEquals("ad me", new String(buffer, 0, len));
        } catch (java.io.IOException e) {
            fail("IOException during mark/reset: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testAsWriter() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        assertNotNull(writer);
        try {
            writer.write("write this");
            assertEquals("write this", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write: " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
    
    @Test
    public void testAsWriterAppend() {
        StrBuilder sb = new StrBuilder("initial");
        Writer writer = sb.asWriter();
        try {
            writer.write(" appended");
            assertEquals("initial appended", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write: " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testValidateRangeValid() {
        StrBuilder sb = new StrBuilder("abcde");
        assertEquals(5, sb.validateRange(0, 5));
        assertEquals(3, sb.validateRange(1, 3));
    }

    @Test
    public void testValidateRangeEndTooLarge() {
        StrBuilder sb = new StrBuilder("abc");
        assertEquals(3, sb.validateRange(1, 10));
    }

    @Test
    public void testValidateRangeInvalidStart() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.validateRange(-1, 2);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testValidateRangeInvalidEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.validateRange(0, -1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testValidateRangeStartGreaterThanEnd() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.validateRange(2, 1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testValidateIndexValid() {
        StrBuilder sb = new StrBuilder("abc");
        sb.validateIndex(0);
        sb.validateIndex(3); // Index == size is valid for insert
    }

    @Test
    public void testValidateIndexInvalidLow() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.validateIndex(-1);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testValidateIndexInvalidHigh() {
        StrBuilder sb = new StrBuilder("abc");
        try {
            sb.validateIndex(4);
            fail("Expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException e) {
            // expected
        }
    }
    
    // New tests for uncalled methods
    
    @Test
    public void testGetContent() {
        StrBuilder sb = new StrBuilder("content");
        assertEquals("content", sb.getContent());
        StrBuilder emptySb = new StrBuilder();
        assertEquals("", emptySb.getContent());
    }

    @Test
    public void testSkipZero() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        try {
            long skipped = reader.skip(0);
            assertEquals(0, skipped);
            // Accessing pos directly is not allowed, need to use public methods if available or skip this test
            // For now, we'll assume read() and other methods work as expected and not directly access pos.
            // Alternatively, if we had a public getter for pos, we could use it.
            // Since we cannot access it directly, we will check its effect via read().
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals(3, len); // All characters should still be available
            assertEquals("abc", new String(buffer, 0, len));

        } catch (java.io.IOException e) {
            fail("IOException during skip: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testSkipPositive() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        try {
            long skipped = reader.skip(1);
            assertEquals(1, skipped);
            // Check that the character is skipped by attempting to read the next one
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals(2, len);
            assertEquals("bc", new String(buffer, 0, len));

        } catch (java.io.IOException e) {
            fail("IOException during skip: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
    
    @Test
    public void testSkipMoreThanLength() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        try {
            long skipped = reader.skip(10);
            assertEquals(3, skipped); // Should only skip up to the length of the builder
            // Check that all characters are skipped
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals(-1, len); // Should return -1 as no more characters are available

        } catch (java.io.IOException e) {
            fail("IOException during skip: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
    
    @Test
    public void testSkipNegative() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        try {
            long skipped = reader.skip(-5);
            assertEquals(0, skipped); // Negative skip should do nothing
            // Check that characters are still available
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals(3, len);
            assertEquals("abc", new String(buffer, 0, len));
        } catch (java.io.IOException e) {
            fail("IOException during skip: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testReadyTrue() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        try {
            assertTrue(reader.ready());
        } catch (java.io.IOException e) {
            fail("IOException during ready: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testReadyFalse() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        try {
            reader.skip(3); // Read all characters
            assertFalse(reader.ready());
        } catch (java.io.IOException e) {
            fail("IOException during ready: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
    
    @Test
    public void testMarkSupportedTrue() {
        StrBuilder sb = new StrBuilder("abc");
        Reader reader = sb.asReader();
        assertTrue(reader.markSupported());
        try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
    }

    @Test
    public void testMarkAndReset() {
        StrBuilder sb = new StrBuilder("abcdef");
        Reader reader = sb.asReader();
        try {
            reader.read(); // 'a'
            reader.mark(10); // Mark at position 1
            reader.read(); // 'b'
            reader.read(); // 'c'
            reader.reset(); // Reset to position 1
            char[] buffer = new char[10];
            int len = reader.read(buffer);
            assertEquals("bcdef".length(), len);
            assertEquals("bcdef", new String(buffer, 0, len));
        } catch (java.io.IOException e) {
            fail("IOException during mark/reset test: " + e.getMessage());
        } finally {
            try { reader.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
    
    @Test
    public void testFlush() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        try {
            writer.write("test flush");
            writer.flush(); // Should do nothing, but not throw exception
            assertEquals("test flush", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during flush test: " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testWriteChar() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        try {
            writer.write('a');
            assertEquals("a", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write(int): " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testWriteCharArray() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        char[] chars = {'b', 'c'};
        try {
            writer.write(chars);
            assertEquals("bc", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write(char[]): " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testWriteCharArrayWithOffsetAndLength() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        char[] chars = {'a', 'b', 'c', 'd', 'e'};
        try {
            writer.write(chars, 1, 3); // write "bcd"
            assertEquals("bcd", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write(char[], int, int): " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testWriteString() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        try {
            writer.write("test string");
            assertEquals("test string", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write(String): " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }

    @Test
    public void testWriteStringWithOffsetAndLength() {
        StrBuilder sb = new StrBuilder();
        Writer writer = sb.asWriter();
        String str = "abcdefg";
        try {
            writer.write(str, 1, 3); // write "bcd"
            assertEquals("bcd", sb.toString());
        } catch (java.io.IOException e) {
            fail("IOException during write(String, int, int): " + e.getMessage());
        } finally {
            try { writer.close(); } catch (java.io.IOException e) { /* ignore */ }
        }
    }
}
```