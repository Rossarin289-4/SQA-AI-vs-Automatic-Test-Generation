package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsEqualsCustomTest {

    // Custom CharSequence implementation for rigorous testing
    private static final class CustomCharSequence implements CharSequence {
        private final CharSequence inner;

        public CustomCharSequence(CharSequence inner) {
            this.inner = inner;
        }

        @Override
        public int length() {
            return inner.length();
        }

        @Override
        public char charAt(int index) {
            return inner.charAt(index);
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new CustomCharSequence(inner.subSequence(start, end));
        }

        @Override
        public String toString() {
            return inner.toString();
        }

        @Override
        public boolean equals(Object obj) {
            // Intentionally avoid standard String equals to test StringUtils handling
            if (obj instanceof CharSequence) {
                CharSequence other = (CharSequence) obj;
                if (this.length() != other.length()) {
                    return false;
                }
                for (int i = 0; i < this.length(); i++) {
                    if (this.charAt(i) != other.charAt(i)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }

        @Override
        public int hashCode() {
            return inner.hashCode();
        }
    }

    @Test
    public void testEqualsWithStringBuilderAndString() {
        CharSequence sb = new StringBuilder("commons-lang");
        String str = "commons-lang";
        assertTrue("StringBuilder and String with same content should be equal",
                StringUtils.equals(sb, str));
        assertTrue("String and StringBuilder with same content should be equal",
                StringUtils.equals(str, sb));
    }

    @Test
    public void testEqualsWithStringBufferAndStringBuilder() {
        CharSequence sbuf = new StringBuffer("test-buffer");
        CharSequence sbuild = new StringBuilder("test-buffer");
        assertTrue("StringBuffer and StringBuilder with same content should be equal",
                StringUtils.equals(sbuf, sbuild));
    }

    @Test
    public void testEqualsWithCustomCharSequence() {
        CharSequence custom = new CustomCharSequence("custom-seq");
        CharSequence str = "custom-seq";
        assertTrue("CustomCharSequence and String with same content should be equal",
                StringUtils.equals(custom, str));
        assertTrue("String and CustomCharSequence with same content should be equal",
                StringUtils.equals(str, custom));
    }

    @Test
    public void testEqualsWithDifferentCharSequenceTypesDifferentContent() {
        CharSequence sb = new StringBuilder("abc");
        CharSequence custom = new CustomCharSequence("xyz");
        assertFalse("Different content across different CharSequence types should not be equal",
                StringUtils.equals(sb, custom));
    }
}
