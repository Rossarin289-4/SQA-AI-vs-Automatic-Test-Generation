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
    public void testNullTextConfiguration() throws Exception {
        StrBuilder b = new StrBuilder();
        assertNull(b.getNullText());
        assertSame(b, b.setNullText(""));
        assertNull(b.getNullText());
        b.setNullText("nil");
        b.append((Object) null);
        assertEquals("nil", b.toString());
    }

    @Test
    public void testLengthCapacityAndClear() throws Exception {
        StrBuilder b = new StrBuilder(0);
        assertEquals(32, b.capacity());
        b.append("abc");
        assertEquals(3, b.length());
        assertEquals(3, b.size());
        assertFalse(b.isEmpty());
        int capacity = b.capacity();
        b.clear();
        assertTrue(b.isEmpty());
        assertEquals(0, b.length());
        assertEquals(capacity, b.capacity());
    }

    @Test
    public void testSetLengthGrowthAndShrink() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        b.setLength(4);
        assertEquals(4, b.length());
        assertEquals('\0', b.charAt(2));
        assertEquals('\0', b.charAt(3));
        b.setLength(1);
        assertEquals("a", b.toString());
    }

    @Test
    public void testSetLengthRejectsNegative() throws Exception {
        StrBuilder b = new StrBuilder("x");
        try {
            b.setLength(-1);
            fail("expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {
            assertEquals(1, b.length());
        }
    }

    @Test
    public void testCapacityManagement() throws Exception {
        StrBuilder b = new StrBuilder(2);
        b.append("abc");
        assertEquals(3, b.capacity());
        b.ensureCapacity(8);
        assertEquals(8, b.capacity());
        b.minimizeCapacity();
        assertEquals(3, b.capacity());
    }

    @Test
    public void testCharacterMutationAndDeletion() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        b.setCharAt(0, 'x');
        assertEquals('x', b.charAt(0));
        b.deleteCharAt(1);
        assertEquals("xc", b.toString());
    }

    @Test
    public void testCharacterArrayCopies() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        assertArrayEquals(new char[] {'a', 'b', 'c'}, b.toCharArray());
        char[] destination = new char[5];
        assertSame(destination, b.getChars(destination));
        assertArrayEquals(new char[] {'a', 'b', 'c', '\0', '\0'}, destination);
        assertArrayEquals(new char[] {'a', 'b', 'c'}, b.getChars(null));
    }

    @Test
    public void testNewLineConfigurationAndNullAppend() throws Exception {
        StrBuilder b = new StrBuilder("a");
        b.setNewLineText("!");
        b.appendNewLine();
        assertEquals("a!", b.toString());
        b.setNullText("nil").appendNull();
        assertEquals("a!nil", b.toString());
    }

    @Test
    public void testAppendArrayWithSeparators() throws Exception {
        StrBuilder b = new StrBuilder();
        b.appendWithSeparators(new Object[] {"a", null, "c"}, "|");
        assertEquals("a||c", b.toString());
    }

    @Test
    public void testPaddingAndFixedWidthEdges() throws Exception {
        StrBuilder b = new StrBuilder();
        b.appendPadding(0, '_');
        b.appendPadding(-1, '_');
        b.appendFixedWidthPadLeft("abcd", 3, '_');
        b.appendFixedWidthPadRight("x", 3, '_');
        assertEquals("bcdx__", b.toString());
    }

    @Test
    public void testInsertAtBeginningAndEnd() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        b.insert(0, "X");
        b.insert(b.length(), '!');
        assertEquals("Xab!", b.toString());
    }

    @Test
    public void testDeleteRangeClampsEnd() throws Exception {
        StrBuilder b = new StrBuilder("abcdef");
        b.delete(2, 100);
        assertEquals("ab", b.toString());
    }

    @Test
    public void testDeleteAllAndFirstCharacter() throws Exception {
        StrBuilder b = new StrBuilder("baaaac");
        b.deleteFirst('a');
        assertEquals("baaac", b.toString());
        b.deleteAll('a');
        assertEquals("bc", b.toString());
    }

    @Test
    public void testReplaceRangeAndCharacters() throws Exception {
        StrBuilder b = new StrBuilder("abcabc");
        b.replace(1, 3, "XY");
        assertEquals("aXYabc", b.toString());
        b.replaceAll('a', 'z');
        assertEquals("zXYzbc", b.toString());
        b.replaceFirst('z', 'q');
        assertEquals("qXYzbc", b.toString());
    }

    @Test
    public void testReverseAndTrim() throws Exception {
        StrBuilder b = new StrBuilder("  ab \t");
        b.trim();
        assertEquals("ab", b.toString());
        b.reverse();
        assertEquals("ba", b.toString());
    }

    @Test
    public void testPrefixSuffixAndSubstringBoundaries() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        assertTrue(b.startsWith(""));
        assertFalse(b.startsWith(null));
        assertTrue(b.endsWith("bc"));
        assertFalse(b.endsWith("abcd"));
        assertEquals("bc", b.substring(1));
        assertEquals("bc", b.substring(1, 99));
    }

    @Test
    public void testLeftRightAndMiddleSlices() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertEquals("", b.leftString(0));
        assertEquals("abcd", b.leftString(9));
        assertEquals("cd", b.rightString(2));
        assertEquals("abcd", b.rightString(9));
        assertEquals("ab", b.midString(-2, 2));
        assertEquals("", b.midString(4, 1));
    }

    @Test
    public void testSearchAndContainsAtEdges() throws Exception {
        StrBuilder b = new StrBuilder("abca");
        assertTrue(b.contains('a'));
        assertTrue(b.contains("ca"));
        assertEquals(0, b.indexOf('a'));
        assertEquals(3, b.lastIndexOf('a'));
        assertEquals(-1, b.indexOf('z'));
    }

    @Test
    public void testTokenizerView() throws Exception {
        StrBuilder b = new StrBuilder("one two");
        StrTokenizer tokenizer = b.asTokenizer();
        assertArrayEquals(new String[] {"one", "two"}, tokenizer.getTokenArray());
    }

    @Test
    public void testReaderViewAndEndBoundary() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        Reader reader = b.asReader();
        assertTrue(reader.markSupported());
        assertEquals((int) 'a', reader.read());
        reader.mark(1);
        assertEquals((int) 'b', reader.read());
        assertEquals(-1, reader.read());
        reader.reset();
        assertEquals((int) 'b', reader.read());
    }

    @Test
    public void testWriterView() throws Exception {
        StrBuilder b = new StrBuilder("a");
        Writer writer = b.asWriter();
        writer.write('b');
        writer.write("cd");
        writer.flush();
        writer.close();
        assertEquals("abcd", b.toString());
    }

    @Test
    public void testEqualityHashAndStringBuffer() throws Exception {
        StrBuilder a = new StrBuilder("abc");
        StrBuilder b = new StrBuilder("abc");
        assertTrue(a.equals(b));
        assertTrue(a.equalsIgnoreCase(new StrBuilder("ABC")));
        assertEquals(a.hashCode(), b.hashCode());
        assertEquals("abc", a.toStringBuffer().toString());
        assertEquals("abc", a.toString());
    }

    @Test
    public void testNewLineTextGetterAndClearingConfiguration() throws Exception {
        StrBuilder b = new StrBuilder();
        assertNull(b.getNewLineText());
        assertSame(b, b.setNewLineText("!"));
        assertEquals("!", b.getNewLineText());
        b.setNewLineText(null);
        assertNull(b.getNewLineText());
    }

    @Test
    public void testReaderReadyAndSkipBoundaries() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        Reader reader = b.asReader();
        assertTrue(reader.ready());
        assertEquals(2L, reader.skip(2));
        assertTrue(reader.ready());
        assertEquals((int) 'c', reader.read());
        assertFalse(reader.ready());
        assertEquals(0L, reader.skip(1));
    }

    @Test
    public void testReaderSkipNegativeAndPastEnd() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        Reader reader = b.asReader();
        assertEquals(0L, reader.skip(-1));
        assertEquals(2L, reader.skip(9));
        assertFalse(reader.ready());
        assertEquals(-1, reader.read());
    }

    @Test
    public void testReaderBulkReadAtEndAndZeroLength() throws Exception {
        StrBuilder b = new StrBuilder("xy");
        Reader reader = b.asReader();
        char[] out = new char[3];
        assertEquals(2, reader.read(out, 0, 3));
        assertArrayEquals(new char[] {'x', 'y', '\0'}, out);
        assertEquals(0, reader.read(out, 0, 0));
        assertEquals(-1, reader.read(out, 0, 1));
    }

    @Test
    public void testReaderMarkResetAndBuilderGrowth() throws Exception {
        StrBuilder b = new StrBuilder("a");
        Reader reader = b.asReader();
        reader.mark(0);
        assertEquals((int) 'a', reader.read());
        b.append("b");
        assertEquals((int) 'b', reader.read());
        reader.reset();
        assertEquals((int) 'a', reader.read());
    }

    @Test
    public void testTokenizerContentAndResetAfterBuilderAppend() throws Exception {
        StrBuilder b = new StrBuilder("one two");
        StrTokenizer tokenizer = b.asTokenizer();
        assertEquals("one two", tokenizer.getContent());
        assertArrayEquals(new String[] {"one", "two"}, tokenizer.getTokenArray());
        b.append(" three");
        tokenizer.reset();
        assertArrayEquals(new String[] {"one", "two", "three"}, tokenizer.getTokenArray());
        assertEquals("one two three", tokenizer.getContent());
    }

    @Test
    public void testTokenizerContentTracksEmptyBuilder() throws Exception {
        StrBuilder b = new StrBuilder();
        StrTokenizer tokenizer = b.asTokenizer();
        assertEquals("", tokenizer.getContent());
        b.append("word");
        tokenizer.reset();
        assertEquals("word", tokenizer.getContent());
    }

    @Test
    public void testWriterWritesCharacterArraySlice() throws Exception {
        StrBuilder b = new StrBuilder();
        Writer writer = b.asWriter();
        writer.write(new char[] {'a', 'b', 'c'}, 1, 2);
        assertEquals("bc", b.toString());
    }

    @Test
    public void testWriterWritesStringSlice() throws Exception {
        StrBuilder b = new StrBuilder("x");
        Writer writer = b.asWriter();
        writer.write("abcd", 1, 2);
        assertEquals("xbc", b.toString());
    }
}
