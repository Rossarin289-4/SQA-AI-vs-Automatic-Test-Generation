package com.google.javascript.rhino;

import org.junit.Test;
import static org.junit.Assert.*;

public class TokenStreamTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testIsKeyword_emptyString() throws Exception {
        assertFalse(TokenStream.isKeyword(""));
    }

    @Test
    public void testIsKeyword_shortKeywords_if() throws Exception {
        assertTrue(TokenStream.isKeyword("if"));
    }

    @Test
    public void testIsKeyword_shortKeywords_in() throws Exception {
        assertTrue(TokenStream.isKeyword("in"));
    }

    @Test
    public void testIsKeyword_shortKeywords_do() throws Exception {
        assertTrue(TokenStream.isKeyword("do"));
    }
    
    @Test
    public void testIsKeyword_threeLetterKeywords_for() throws Exception {
        assertTrue(TokenStream.isKeyword("for"));
    }

    @Test
    public void testIsKeyword_threeLetterKeywords_int() throws Exception {
        assertTrue(TokenStream.isKeyword("int"));
    }

    @Test
    public void testIsKeyword_threeLetterKeywords_new() throws Exception {
        assertTrue(TokenStream.isKeyword("new"));
    }

    @Test
    public void testIsKeyword_threeLetterKeywords_try() throws Exception {
        assertTrue(TokenStream.isKeyword("try"));
    }

    @Test
    public void testIsKeyword_threeLetterKeywords_var() throws Exception {
        assertTrue(TokenStream.isKeyword("var"));
    }
    
    @Test
    public void testIsKeyword_fourLetterKeywords_byte() throws Exception {
        assertTrue(TokenStream.isKeyword("byte"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_case() throws Exception {
        assertTrue(TokenStream.isKeyword("case"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_else() throws Exception {
        assertTrue(TokenStream.isKeyword("else"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_goto() throws Exception {
        assertTrue(TokenStream.isKeyword("goto"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_long() throws Exception {
        assertTrue(TokenStream.isKeyword("long"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_null() throws Exception {
        assertTrue(TokenStream.isKeyword("null"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_true() throws Exception {
        assertTrue(TokenStream.isKeyword("true"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_void() throws Exception {
        assertTrue(TokenStream.isKeyword("void"));
    }

    @Test
    public void testIsKeyword_fourLetterKeywords_with() throws Exception {
        assertTrue(TokenStream.isKeyword("with"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_class() throws Exception {
        assertTrue(TokenStream.isKeyword("class"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_break() throws Exception {
        assertTrue(TokenStream.isKeyword("break"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_while() throws Exception {
        assertTrue(TokenStream.isKeyword("while"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_false() throws Exception {
        assertTrue(TokenStream.isKeyword("false"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_const() throws Exception {
        assertTrue(TokenStream.isKeyword("const"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_final() throws Exception {
        assertTrue(TokenStream.isKeyword("final"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_float() throws Exception {
        assertTrue(TokenStream.isKeyword("float"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_short() throws Exception {
        assertTrue(TokenStream.isKeyword("short"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_super() throws Exception {
        assertTrue(TokenStream.isKeyword("super"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_throw() throws Exception {
        assertTrue(TokenStream.isKeyword("throw"));
    }

    @Test
    public void testIsKeyword_fiveLetterKeywords_catch() throws Exception {
        assertTrue(TokenStream.isKeyword("catch"));
    }
    
    @Test
    public void testIsKeyword_sixLetterKeywords_native() throws Exception {
        assertTrue(TokenStream.isKeyword("native"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_delete() throws Exception {
        assertTrue(TokenStream.isKeyword("delete"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_return() throws Exception {
        assertTrue(TokenStream.isKeyword("return"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_throws() throws Exception {
        assertTrue(TokenStream.isKeyword("throws"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_import() throws Exception {
        assertTrue(TokenStream.isKeyword("import"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_double() throws Exception {
        assertTrue(TokenStream.isKeyword("double"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_static() throws Exception {
        assertTrue(TokenStream.isKeyword("static"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_public() throws Exception {
        assertTrue(TokenStream.isKeyword("public"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_switch() throws Exception {
        assertTrue(TokenStream.isKeyword("switch"));
    }
    
    @Test
    public void testIsKeyword_sixLetterKeywords_export() throws Exception {
        assertTrue(TokenStream.isKeyword("export"));
    }

    @Test
    public void testIsKeyword_sixLetterKeywords_typeof() throws Exception {
        assertTrue(TokenStream.isKeyword("typeof"));
    }

    @Test
    public void testIsKeyword_sevenLetterKeywords_package() throws Exception {
        assertTrue(TokenStream.isKeyword("package"));
    }

    @Test
    public void testIsKeyword_sevenLetterKeywords_default() throws Exception {
        assertTrue(TokenStream.isKeyword("default"));
    }

    @Test
    public void testIsKeyword_sevenLetterKeywords_finally() throws Exception {
        assertTrue(TokenStream.isKeyword("finally"));
    }

    @Test
    public void testIsKeyword_sevenLetterKeywords_boolean() throws Exception {
        assertTrue(TokenStream.isKeyword("boolean"));
    }

    @Test
    public void testIsKeyword_sevenLetterKeywords_private() throws Exception {
        assertTrue(TokenStream.isKeyword("private"));
    }

    @Test
    public void testIsKeyword_sevenLetterKeywords_extends() throws Exception {
        assertTrue(TokenStream.isKeyword("extends"));
    }
    
    @Test
    public void testIsKeyword_eightLetterKeywords_abstract() throws Exception {
        assertTrue(TokenStream.isKeyword("abstract"));
    }

    @Test
    public void testIsKeyword_eightLetterKeywords_continue() throws Exception {
        assertTrue(TokenStream.isKeyword("continue"));
    }

    @Test
    public void testIsKeyword_eightLetterKeywords_debugger() throws Exception {
        assertTrue(TokenStream.isKeyword("debugger"));
    }

    @Test
    public void testIsKeyword_eightLetterKeywords_function() throws Exception {
        assertTrue(TokenStream.isKeyword("function"));
    }
    
    @Test
    public void testIsKeyword_eightLetterKeywords_volatile() throws Exception {
        assertTrue(TokenStream.isKeyword("volatile"));
    }

    @Test
    public void testIsKeyword_nineLetterKeywords_interface() throws Exception {
        assertTrue(TokenStream.isKeyword("interface"));
    }

    @Test
    public void testIsKeyword_nineLetterKeywords_protected() throws Exception {
        assertTrue(TokenStream.isKeyword("protected"));
    }

    @Test
    public void testIsKeyword_nineLetterKeywords_transient() throws Exception {
        assertTrue(TokenStream.isKeyword("transient"));
    }

    @Test
    public void testIsKeyword_tenLetterKeywords_implements() throws Exception {
        assertTrue(TokenStream.isKeyword("implements"));
    }

    @Test
    public void testIsKeyword_tenLetterKeywords_instanceof() throws Exception {
        assertTrue(TokenStream.isKeyword("instanceof"));
    }

    @Test
    public void testIsKeyword_twelveLetterKeywords_synchronized() throws Exception {
        assertTrue(TokenStream.isKeyword("synchronized"));
    }
    
    @Test
    public void testIsKeyword_nonKeyword() throws Exception {
        assertFalse(TokenStream.isKeyword("myKeyword"));
    }
    
    @Test
    public void testIsKeyword_invalidPartialMatch() throws Exception {
        assertFalse(TokenStream.isKeyword("clas")); // partial match for "class"
    }

    @Test
    public void testIsJSIdentifier_emptyString() throws Exception {
        assertFalse(TokenStream.isJSIdentifier(""));
    }

    @Test
    public void testIsJSIdentifier_validIdentifier() throws Exception {
        assertTrue(TokenStream.isJSIdentifier("myVar"));
    }

    @Test
    public void testIsJSIdentifier_validIdentifierWithDollar() throws Exception {
        assertTrue(TokenStream.isJSIdentifier("$myVar"));
    }
    
    @Test
    public void testIsJSIdentifier_validIdentifierWithUnderscore() throws Exception {
        assertTrue(TokenStream.isJSIdentifier("_myVar"));
    }

    @Test
    public void testIsJSIdentifier_validIdentifierWithUnicode() throws Exception {
        // Unicode character U+00C5 (LATIN CAPITAL LETTER A WITH RING ABOVE)
        assertTrue(TokenStream.isJSIdentifier("a\u00C5b"));
    }

    @Test
    public void testIsJSIdentifier_invalidStartDigit() throws Exception {
        assertFalse(TokenStream.isJSIdentifier("123"));
    }
    
    @Test
    public void testIsJSIdentifier_invalidStartHyphen() throws Exception {
        assertFalse(TokenStream.isJSIdentifier("-myVar"));
    }
    
    @Test
    public void testIsJSIdentifier_invalidStartExclamation() throws Exception {
        assertFalse(TokenStream.isJSIdentifier("!myVar"));
    }

    @Test
    public void testIsJSIdentifier_invalidPartSymbol() throws Exception {
        assertFalse(TokenStream.isJSIdentifier("my-Var"));
    }
    
    @Test
    public void testIsJSIdentifier_invalidPartHash() throws Exception {
        assertFalse(TokenStream.isJSIdentifier("my#Var"));
    }

    @Test
    public void testIsJSIdentifier_identifierIgnorableCharacter() throws Exception {
        // The Java documentation for Character.isIdentifierIgnorable states that
        // it returns true for certain Unicode characters that are ignorable in identifiers.
        // The method `isJSIdentifier` explicitly checks for these characters and returns false.
        // Therefore, a string containing such a character should result in false.
        // U+200C ZERO WIDTH NON-JOINER is an ignorable character.
        assertFalse(TokenStream.isJSIdentifier("a\u200Cb"));
    }
}
