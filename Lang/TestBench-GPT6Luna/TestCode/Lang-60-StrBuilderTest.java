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
    public void testCapacityConstructionAndEnsure() throws Exception {
        StrBuilder b = new StrBuilder(2);
        assertEquals(2, b.capacity());
        b.append("abc");
        assertEquals(3, b.length());
        assertEquals("abc", b.toString());
        assertTrue(b.capacity() >= 3);
    }

    @Test
    public void testSetLengthAndZeroFill() throws Exception {
        StrBuilder b = new StrBuilder("ab");
        b.setLength(4);
        assertEquals(4, b.length());
        assertEquals('a', b.charAt(0));
        assertEquals('\0', b.charAt(2));
        b.setLength(1);
        assertEquals("a", b.toString());
    }

    @Test
    public void testSetLengthNegativeThrows() throws Exception {
        try {
            new StrBuilder().setLength(-1);
            fail("expected StringIndexOutOfBoundsException");
        } catch (StringIndexOutOfBoundsException expected) {
        }
    }

    @Test
    public void testMinimizeCapacityAndClear() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        b.minimizeCapacity();
        assertEquals(3, b.capacity());
        b.clear();
        assertTrue(b.isEmpty());
        assertEquals(0, b.size());
    }

    @Test
    public void testCharMutationAndDeleteEdges() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        b.setCharAt(0, 'x');
        assertEquals('x', b.charAt(0));
        b.deleteCharAt(2);
        assertEquals("xb", b.toString());
        b.deleteCharAt(0);
        assertEquals("b", b.toString());
    }

    @Test
    public void testCharacterArrayCopies() throws Exception {
        StrBuilder b = new StrBuilder("abcd");
        assertArrayEquals(new char[] {'b', 'c'}, b.toCharArray(1, 3));
        assertArrayEquals(new char[] {'a', 'b', 'c', 'd'}, b.toCharArray());
        char[] target = new char[6];
        assertSame(target, b.getChars(target));
        assertArrayEquals(new char[] {'a', 'b', 'c', 'd', '\0', '\0'}, target);
    }

    @Test
    public void testNewLineAndNullConfiguration() throws Exception {
        StrBuilder b = new StrBuilder();
        assertSame(b, b.setNullText("nil"));
        b.appendNull();
        assertEquals("nil", b.toString());
        b.clear().setNewLineText("|").appendNewLine();
        assertEquals("|", b.toString());
        assertEquals("|", b.getNewLineText());
    }

    @Test
    public void testAppendObjectAndSeparators() throws Exception {
        StrBuilder b = new StrBuilder();
        b.append((Object) "A");
        b.appendWithSeparators(new Object[] {"B", null, "D"}, ",");
        assertEquals("AB,,D", b.toString());
    }

    @Test
    public void testPaddingAndFixedWidthTruncation() throws Exception {
        StrBuilder b = new StrBuilder();
        b.appendPadding(2, '.');
        b.appendFixedWidthPadLeft("abcde", 3, '_');
        b.appendFixedWidthPadRight("xy", 4, '_');
        assertEquals("..cdexy__", b.toString());
    }

    @Test
    public void testInsertAndDeleteRangeEdges() throws Exception {
        StrBuilder b = new StrBuilder("ac");
        b.insert(1, (Object) "b");
        assertEquals("abc", b.toString());
        b.delete(1, 99);
        assertEquals("a", b.toString());
        b.insert(1, (Object) "z");
        assertEquals("az", b.toString());
    }

    @Test
    public void testReplaceAllAndFirst() throws Exception {
        StrBuilder b = new StrBuilder("banana");
        b.replaceFirst('a', 'o');
        assertEquals("bonana", b.toString());
        b.replaceAll("na", "X");
        assertEquals("boXX", b.toString());
    }

    @Test
    public void testReverseTrimAndBounds() throws Exception {
        StrBuilder b = new StrBuilder("  ab  ");
        b.trim();
        assertEquals("ab", b.toString());
        b.reverse();
        assertEquals("ba", b.toString());
        assertEquals("", b.leftString(0));
        assertEquals("ba", b.rightString(9));
        assertEquals("ba", b.midString(-1, 9));
    }

    @Test
    public void testPrefixSuffixAndSubstringRanges() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        assertTrue(b.startsWith(""));
        assertFalse(b.startsWith(null));
        assertTrue(b.endsWith("bc"));
        assertEquals("bc", b.substring(1, 99));
        assertEquals("abc", b.substring(0));
    }

    @Test
    public void testContainsAndSearchBoundaries() throws Exception {
        StrBuilder b = new StrBuilder("ababa");
        assertTrue(b.contains('a'));
        assertEquals(0, b.indexOf('a'));
        assertEquals(4, b.lastIndexOf('a'));
        assertEquals(2, b.indexOf("aba", 1));
        assertEquals(2, b.lastIndexOf("aba"));
        assertEquals(-1, b.indexOf("z"));
    }

    @Test
    public void testMatcherSearchAndReplacement() throws Exception {
        StrBuilder b = new StrBuilder("a,b,c");
        StrMatcher comma = StrMatcher.commaMatcher();
        assertTrue(b.contains(comma));
        assertEquals(1, b.indexOf(comma));
        assertEquals(3, b.lastIndexOf(comma));
        b.replaceAll(comma, ":");
        assertEquals("a:b:c", b.toString());
    }

    @Test
    public void testReaderMarkSkipAndEnd() throws Exception {
        StrBuilder b = new StrBuilder("abc");
        Reader r = b.asReader();
        assertTrue(r.markSupported());
        assertEquals((int) 'a', r.read());
        r.mark(4);
        assertEquals(2, r.skip(9));
        assertEquals(-1, r.read());
        r.reset();
        assertEquals((int) 'b', r.read());
        assertEquals((int) 'c', r.read());
    }

    @Test
    public void testWriterWritesIntoBuilder() throws Exception {
        StrBuilder b = new StrBuilder("A");
        Writer w = b.asWriter();
        w.write('B');
        w.write(new char[] {'C', 'D'}, 1, 1);
        w.write("xyz", 1, 2);
        assertEquals("ABDyz", b.toString());
    }

    @Test
    public void testEqualityHashAndStringBuffer() throws Exception {
        StrBuilder b = new StrBuilder("Ab");
        StrBuilder same = new StrBuilder("Ab");
        StrBuilder differentCase = new StrBuilder("aB");
        assertTrue(b.equals(same));
        assertTrue(b.equalsIgnoreCase(differentCase));
        assertEquals(b.hashCode(), same.hashCode());
        assertEquals("Ab", b.toStringBuffer().toString());
    }

    @Test
    public void testNullTextGetterAndEmptyConfiguration() throws Exception {
        StrBuilder b = new StrBuilder();
        assertEquals(null, b.getNullText());
        b.setNullText("");
        assertEquals(null, b.getNullText());
        b.appendNull();
        assertEquals("", b.toString());
        b.setNullText("nil");
        assertEquals("nil", b.getNullText());
    }

    @Test
    public void testEnsureCapacityBoundaryAndNoShrinking() throws Exception {
        StrBuilder b = new StrBuilder(2);
        b.append("ab");
        b.ensureCapacity(2);
        assertEquals(2, b.capacity());
        b.ensureCapacity(3);
        assertEquals(3, b.capacity());
        assertEquals("ab", b.toString());
    }

    @Test
    public void testDeleteAllCharactersIncludingAdjacentRuns() throws Exception {
        StrBuilder b = new StrBuilder("a--b---c-");
        b.deleteAll('-');
        assertEquals("abc", b.toString());
    }

    @Test
    public void testDeleteFirstCharacterOnly() throws Exception {
        StrBuilder b = new StrBuilder("a-b-c");
        b.deleteFirst('-');
        assertEquals("ab-c", b.toString());
    }

    @Test
    public void testReplaceRangeWithDifferentLengthAndNull() throws Exception {
        StrBuilder b = new StrBuilder("abcdef");
        b.replace(1, 4, "XY");
        assertEquals("aXYef", b.toString());
        b.replace(1, 3, null);
        assertEquals("aef", b.toString());
    }

    @Test
    public void testTokenizerUsesBuilderContentAndReset() throws Exception {
        StrBuilder b = new StrBuilder("one two");
        StrTokenizer tokenizer = b.asTokenizer();
        assertArrayEquals(new String[] {"one", "two"}, tokenizer.getTokenArray());
        assertEquals("one two", tokenizer.getContent());
        b.append(" three");
        assertArrayEquals(new String[] {"one", "two"}, tokenizer.getTokenArray());
        tokenizer.reset();
        assertArrayEquals(new String[] {"one", "two", "three"}, tokenizer.getTokenArray());
    }

    @Test
    public void testReaderReadyAndClose() throws Exception {
        StrBuilder b = new StrBuilder("x");
        Reader r = b.asReader();
        assertTrue(r.ready());
        assertEquals((int) 'x', r.read());
        assertFalse(r.ready());
        r.close();
        assertEquals(-1, r.read());
    }

    @Test
    public void testWriterFlushDoesNotChangeContent() throws Exception {
        StrBuilder b = new StrBuilder("start");
        Writer w = b.asWriter();
        w.flush();
        assertEquals("start", b.toString());
        w.write('!');
        w.flush();
        assertEquals("start!", b.toString());
    }
}
