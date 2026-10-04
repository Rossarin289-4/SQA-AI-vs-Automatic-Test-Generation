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
    public void testLengthAndConfiguredLengthChanges() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        assertEquals(3, b.length());
        b.setLength(1);
        assertEquals("a", b.toString());
        b.setLength(3);
        assertEquals(3, b.size());
        assertEquals('\0', b.charAt(2));
    }

    @Test
    public void testSetLengthZeroAndNegativeEdge() throws Exception {
        StrBuilder b = new StrBuilder("x");
        b.setLength(0);
        assertTrue(b.isEmpty());
        try {
            b.setLength(-1);
            fail("expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testCapacityGrowthAndMinimization() throws Exception {
        StrBuilder b = new StrBuilder(1);
        b.append("ab");
        assertTrue(b.capacity() >= 2);
        b.minimizeCapacity();
        assertEquals(2, b.capacity());
        assertEquals("ab", b.toString());
    }

    @Test
    public void testClearRetainsCapacity() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        int cap = b.capacity();
        b.clear();
        assertEquals(0, b.size());
        assertTrue(b.isEmpty());
        assertEquals(cap, b.capacity());
    }

    @Test
    public void testCharacterMutationAndDeleteAtLastIndex() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        b.setCharAt(0, 'x');
        assertEquals('x', b.charAt(0));
        b.deleteCharAt(2);
        assertEquals("xb", b.toString());
    }

    @Test
    public void testCharacterArrayCopiesAndSubrange() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertArrayEquals(new char[] {'a', 'b', 'c', 'd'}, b.toCharArray());
        assertArrayEquals(new char[] {'b', 'c'}, b.toCharArray(1, 3));
        char[] destination = new char[] {'?', '?', '?', '?', '?'};
        assertSame(destination, b.getChars(destination));
        assertArrayEquals(new char[] {'a', 'b', 'c', 'd', '?'}, destination);
    }

    @Test
    public void testNullTextAndNewLineConfiguration() throws Exception {
        StrBuilder b = new StrBuilder("a");
        assertSame(b, b.setNullText("nil"));
        b.appendNull();
        assertEquals("anil", b.toString());
        b.setNullText("");
        assertNull(b.getNullText());
        b.setNewLineText("!");
        b.appendNewLine();
        assertEquals("anil!", b.toString());
    }

    @Test
    public void testAppendSeparatorsNullAndEmptyEdges() throws Exception {
        StrBuilder b = new StrBuilder();
        b.appendWithSeparators(new Object[] {"a", null, "b"}, ",");
        assertEquals("a,,b", b.toString());
        b.clear();
        b.appendWithSeparators(new Object[0], ",");
        assertEquals("", b.toString());
        b.appendWithSeparators(new Object[] {"x", "y"}, null);
        assertEquals("xy", b.toString());
    }

    @Test
    public void testPaddingAndFixedWidthTruncation() throws Exception {
        StrBuilder b = new StrBuilder();
        b.appendPadding(2, '.');
        b.appendFixedWidthPadLeft("abcd", 3, '_');
        b.appendFixedWidthPadRight("xy", 4, '_');
        assertEquals("..bcdxy__", b.toString());
    }

    @Test
    public void testInsertAtBothValidEdges() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        b.insert(0, "x");
        b.insert(b.length(), "y");
        assertEquals("xaby", b.toString());
    }

    @Test
    public void testRangeDeleteAndReplacement() throws Exception {
        StrBuilder b = new StrBuilder("abcdef");
        b.delete(1, 3);
        assertEquals("adef", b.toString());
        b.replace(1, 3, "XYZ");
        assertEquals("aXYZf", b.toString());
        b.replace(1, 4, null);
        assertEquals("af", b.toString());
    }

    @Test
    public void testDeleteFirstAndAllRepeatedCharacters() throws Exception {
        StrBuilder b = new StrBuilder("aabbaba");
        b.deleteFirst('a');
        assertEquals("abbaba", b.toString());
        b.deleteAll('b');
        assertEquals("aaa", b.toString());
    }

    @Test
    public void testReplaceAllAndFirstCharacter() throws Exception {
        StrBuilder b = new StrBuilder("banana");
        b.replaceFirst('a', 'o');
        assertEquals("bonana", b.toString());
        b.replaceAll('a', '!');
        assertEquals("bon!n!", b.toString());
    }

    @Test
    public void testReverseAndTrimWhitespaceEdges() throws Exception {
        StrBuilder b = new StrBuilder("  abc \t");
        b.trim();
        assertEquals("abc", b.toString());
        b.reverse();
        assertEquals("cba", b.toString());
    }

    @Test
    public void testPrefixSuffixAndSubstringBoundary() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertTrue(b.startsWith(""));
        assertTrue(b.startsWith("ab"));
        assertTrue(b.endsWith("cd"));
        assertFalse(b.endsWith("abcde"));
        assertEquals("cd", b.substring(2, 99));
    }

    @Test
    public void testLeftRightAndMiddleExtractionEdges() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertEquals("", b.leftString(0));
        assertEquals("abcd", b.leftString(4));
        assertEquals("cd", b.rightString(2));
        assertEquals("", b.rightString(-1));
        assertEquals("ab", b.midString(-1, 2));
        assertEquals("d", b.midString(3, 9));
    }

    @Test
    public void testContainsAndCharacterSearchBounds() throws Exception {
        StrBuilder b = new StrBuilder("abca");
        assertTrue(b.contains('a'));
        assertFalse(b.contains('z'));
        assertEquals(0, b.indexOf('a'));
        assertEquals(3, b.lastIndexOf('a'));
    }

    @Test
    public void testReaderReadMarkAndSkip() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        Reader r = b.asReader();
        assertTrue(r.markSupported());
        assertEquals((int) 'a', r.read());
        r.mark(2);
        assertEquals(1L, r.skip(1));
        assertEquals((int) 'c', r.read());
        r.reset();
        assertEquals((int) 'b', r.read());
        assertEquals((int) 'c', r.read());
        assertEquals(-1, r.read());
    }

    @Test
    public void testWriterAppendsStringAndCharacterArrayRange() throws Exception {
        StrBuilder b = new StrBuilder();
        Writer w = b.asWriter();
        w.write("abc");
        w.write(new char[] {'x', 'y', 'z'}, 1, 2);
        assertEquals("abcyz", b.toString());
    }

    @Test
    public void testTokenizerUsesBuilderContent() throws Exception {
        StrBuilder b = new StrBuilder("one two");
        StrTokenizer tokenizer = b.asTokenizer();
        assertArrayEquals(new String[] {"one", "two"}, tokenizer.getTokenArray());
        assertEquals("one two", tokenizer.getContent());
    }

    @Test
    public void testEqualityHashAndStringBuffer() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        StrBuilder same = new StrBuilder("ab");
        assertTrue(b.equals(same));
        assertTrue(b.equalsIgnoreCase(new StrBuilder("AB")));
        assertEquals(b.hashCode(), same.hashCode());
        assertEquals("ab", b.toStringBuffer().toString());
        assertFalse(b.equals(new StrBuilder("ba")));
    }

    @Test
    public void testGetNewLineTextAndSetNullNewLine() throws Exception {
        StrBuilder b = new StrBuilder();
        assertNull(b.getNewLineText());
        assertSame(b, b.setNewLineText("!"));
        assertEquals("!", b.getNewLineText());
        b.setNewLineText(null);
        assertNull(b.getNewLineText());
    }

    @Test
    public void testEnsureCapacityBelowEqualAndAboveCurrentCapacity() throws Exception {
        StrBuilder b = new StrBuilder(2);
        int initialCapacity = b.capacity();
        b.append("ab");
        b.ensureCapacity(initialCapacity);
        assertEquals(initialCapacity, b.capacity());
        b.ensureCapacity(initialCapacity + 1);
        assertEquals(initialCapacity + 1, b.capacity());
        assertEquals("ab", b.toString());
    }

    @Test
    public void testReaderCloseDoesNotPreventReading() throws Exception {
        StrBuilder b = new StrBuilder("q");
        Reader reader = b.asReader();
        reader.close();
        assertTrue(reader.ready());
        assertEquals((int) 'q', reader.read());
        assertFalse(reader.ready());
    }

    @Test
    public void testReaderBulkReadWithOffsetAndEndOfInput() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        Reader reader = b.asReader();
        char[] destination = new char[] {'?', '?', '?', '?', '?'};
        assertEquals(2, reader.read(destination, 1, 2));
        assertArrayEquals(new char[] {'?', 'a', 'b', '?', '?'}, destination);
        assertEquals(1, reader.read(destination, 0, 3));
        assertEquals('c', destination[0]);
        assertEquals(-1, reader.read(destination, 0, 1));
    }

    @Test
    public void testReaderZeroLengthReadAtEnd() throws Exception {
        StrBuilder b = new StrBuilder();
        Reader reader = b.asReader();
        assertEquals(0, reader.read(new char[0], 0, 0));
        assertEquals(-1, reader.read(new char[1], 0, 1));
    }

    @Test
    public void testReaderSkipNegativeAndPastEnd() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        Reader reader = b.asReader();
        assertEquals(0L, reader.skip(-1));
        assertEquals(3L, reader.skip(9));
        assertFalse(reader.ready());
        assertEquals(-1, reader.read());
    }

    @Test
    public void testWriterCloseAndFlushDoNotPreventWriting() throws Exception {
        StrBuilder b = new StrBuilder();
        Writer writer = b.asWriter();
        writer.close();
        writer.flush();
        writer.write('x');
        assertEquals("x", b.toString());
    }
}
