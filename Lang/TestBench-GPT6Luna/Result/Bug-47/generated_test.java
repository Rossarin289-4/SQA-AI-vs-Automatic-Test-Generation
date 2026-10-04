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
    public void testSetLengthAndNullFill() throws Exception {
        StrBuilder b = new StrBuilder("abc").setLength(5);
        assertEquals(5, b.length());
        assertEquals("abc\u0000\u0000", b.toString());
        b.setLength(2);
        assertEquals("ab", b.toString());
    }

    @Test
    public void testCapacityGrowthAndMinimize() throws Exception {
        StrBuilder b = new StrBuilder(1).append("ab");
        assertEquals(2, b.capacity());
        b.ensureCapacity(5);
        assertEquals(5, b.capacity());
        b.minimizeCapacity();
        assertEquals(2, b.capacity());
        assertEquals("ab", b.toString());
    }

    @Test
    public void testClearAndEmptyState() throws Exception {
        StrBuilder b = new StrBuilder("x");
        assertEquals(1, b.size());
        assertFalse(b.isEmpty());
        b.clear();
        assertEquals(0, b.size());
        assertTrue(b.isEmpty());
    }

    @Test
    public void testCharacterAndArrayEdges() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        assertEquals('a', b.charAt(0));
        assertEquals('b', b.charAt(1));
        b.setCharAt(0, 'z');
        assertEquals("zb", b.toString());
        b.deleteCharAt(1);
        assertEquals("z", b.toString());
        assertArrayEquals(new char[] {'z'}, b.toCharArray());
    }

    @Test
    public void testGetCharsReusesSufficientDestination() throws Exception {
        StrBuilder b = new StrBuilder("cat");
        char[] target = new char[] {'?', '?', '?', '?'};
        assertSame(target, b.getChars(target));
        assertArrayEquals(new char[] {'c', 'a', 't', '?'}, target);
        assertArrayEquals(new char[] {'c', 'a', 't'}, b.getChars(null));
    }

    @Test
    public void testNewLineAndNullTextConfiguration() throws Exception {
        StrBuilder b = new StrBuilder();
        b.setNullText("").appendNull();
        assertNull(b.getNullText());
        b.setNewLineText("|").appendNewLine();
        assertEquals("|", b.toString());
        b.setNullText("nil").appendNull();
        assertEquals("nil", b.getNullText());
        assertEquals("|nil", b.toString());
    }

    @Test
    public void testAppendObjectAndLine() throws Exception {
        StrBuilder b = new StrBuilder().append((Object) "a").appendln((Object) "b");
        assertEquals("ab" + SystemUtils.LINE_SEPARATOR, b.toString());
    }

    @Test
    public void testAppendAllAndSeparators() throws Exception {
        StrBuilder b = new StrBuilder();
        b.appendAll(new Object[] {"a", null, "b"});
        assertEquals("ab", b.toString());
        b.clear().appendWithSeparators(new Object[] {"a", null, "b"}, ",");
        assertEquals("a,,b", b.toString());
        b.clear().appendWithSeparators(new Object[] {"a", "b"}, null);
        assertEquals("ab", b.toString());
    }

    @Test
    public void testConditionalSeparatorAndPadding() throws Exception {
        StrBuilder b = new StrBuilder().appendSeparator(",");
        assertEquals("", b.toString());
        b.append('x').appendSeparator(",").appendPadding(2, '.');
        assertEquals("x,..", b.toString());
        b.appendPadding(-1, '!').appendSeparator(",", 0).appendSeparator(",", 1);
        assertEquals("x,..,", b.toString());
    }

    @Test
    public void testFixedWidthPaddingTruncatesOnCorrectSide() throws Exception {
        StrBuilder b = new StrBuilder()
            .appendFixedWidthPadLeft("1234", 3, '_')
            .appendFixedWidthPadRight("x", 3, '_')
            .appendFixedWidthPadLeft(null, 2, '_');
        assertEquals("234x____", b.toString());
    }

    @Test
    public void testInsertAtBothValidEdges() throws Exception {
        StrBuilder b = new StrBuilder("ac");
        b.insert(1, (Object) "b");
        b.insert(0, '!');
        b.insert(b.length(), "!");
        assertEquals("!abc!", b.toString());
    }

    @Test
    public void testDeleteAndReplaceRanges() throws Exception {
        StrBuilder b = new StrBuilder("abcdef");
        b.delete(1, 3);
        assertEquals("adef", b.toString());
        b.replace(1, 3, "XYZ");
        assertEquals("aXYZf", b.toString());
        b.delete(1, 99);
        assertEquals("a", b.toString());
    }

    @Test
    public void testDeleteOccurrencesAndReplaceCharacters() throws Exception {
        StrBuilder b = new StrBuilder("ababa");
        b.deleteAll('a');
        assertEquals("bb", b.toString());
        b.append("bbb").deleteFirst('b');
        assertEquals("bbbb", b.toString());
        b.replaceAll('b', 'c').replaceFirst('c', 'd');
        assertEquals("dccc", b.toString());
    }

    @Test
    public void testReverseAndTrim() throws Exception {
        StrBuilder b = new StrBuilder("  abc \t").trim();
        assertEquals("abc", b.toString());
        b.reverse();
        assertEquals("cba", b.toString());
    }

    @Test
    public void testPrefixSuffixAndSubstringBoundaries() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertTrue(b.startsWith(""));
        assertFalse(b.startsWith(null));
        assertTrue(b.endsWith("cd"));
        assertFalse(b.endsWith("abcdx"));
        assertEquals("cd", b.substring(2));
        assertEquals("cd", b.substring(2, 99));
        assertEquals("", b.leftString(0));
        assertEquals("abcd", b.rightString(99));
    }

    @Test
    public void testMidStringClampsIndexAndLength() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertEquals("ab", b.midString(-1, 2));
        assertEquals("cd", b.midString(2, 99));
        assertEquals("", b.midString(4, 1));
        assertEquals("", b.midString(0, -1));
    }

    @Test
    public void testSearchAndContainsAtBoundaries() throws Exception {
        StrBuilder b = new StrBuilder("ababa");
        assertTrue(b.contains('a'));
        assertTrue(b.contains("bab"));
        assertEquals(0, b.indexOf('a'));
        assertEquals(4, b.lastIndexOf('a'));
        assertEquals(-1, b.indexOf('z'));
        assertFalse(b.contains("z"));
    }

    @Test
    public void testBuilderEqualityAndHash() throws Exception {
        StrBuilder a = new StrBuilder("Ab");
        StrBuilder same = new StrBuilder("Ab");
        StrBuilder differentCase = new StrBuilder("aB");
        assertTrue(a.equals(same));
        assertFalse(a.equals(differentCase));
        assertTrue(a.equalsIgnoreCase(differentCase));
        assertEquals(a.hashCode(), same.hashCode());
        assertEquals("Ab", a.toStringBuffer().toString());
    }

    @Test
    public void testReaderReadMarkSkipAndEnd() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        Reader r = b.asReader();
        assertTrue(r.markSupported());
        assertEquals((int) 'a', r.read());
        r.mark(3);
        assertEquals(2L, r.skip(99));
        assertFalse(r.ready());
        r.reset();
        assertEquals((int) 'b', r.read());
        assertEquals((int) 'c', r.read());
        assertEquals(-1, r.read());
    }

    @Test
    public void testWriterAppendsSelectedRange() throws Exception {
        StrBuilder b = new StrBuilder("a");
        Writer w = b.asWriter();
        w.write("xyz", 1, 2);
        w.write('!');
        w.flush();
        assertEquals("ayz!", b.toString());
    }

    @Test
    public void testTokenizerReadsBuilderContents() throws Exception {
        StrBuilder b = new StrBuilder("one two");
        StrTokenizer tokenizer = b.asTokenizer();
        assertEquals("one two", tokenizer.getContent());
        assertArrayEquals(new String[] {"one", "two"}, tokenizer.getTokenArray());
    }
}
