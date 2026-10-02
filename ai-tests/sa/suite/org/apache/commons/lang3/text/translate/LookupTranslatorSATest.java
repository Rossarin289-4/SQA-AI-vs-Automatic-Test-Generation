package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import java.io.StringWriter;
import org.junit.Test;

public class LookupTranslatorSATest {

    @Test
    public void test01_string_key_string_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{"cat", "DOG"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "cat";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("DOG", writer.toString());
    }

    @Test
    public void test02_stringbuffer_key_string_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuffer("cat"), "DOG"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "cat";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("DOG", writer.toString());
    }

    @Test
    public void test03_string_key_stringbuilder_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{"cat", "DOG"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuilder("cat");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("DOG", writer.toString());
    }

    @Test
    public void test04_builder_key_builder_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("red"), "BLUE"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuilder("red");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("BLUE", writer.toString());
    }

    @Test
    public void test05_greedy_buffer() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuffer("abcd"), "LONG"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "abcd";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("LONG", writer.toString());
    }

    @Test
    public void test06_buffer_key_string_input_bird() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuffer("bird"), "WING"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "bird";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("WING", writer.toString());
    }

    @Test
    public void test07_buffer_key_buffer_input_moon() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuffer("moon"), "NIGHT"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuffer("moon");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("NIGHT", writer.toString());
    }

    @Test
    public void test08_buffer_key_string_input_hello() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuffer("hello"), "HI"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "hello";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(5, consumed);
        assertEquals("HI", writer.toString());
    }

    @Test
    public void test09_builder_key_string_input_pqrs() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("pqrs"), "PQRS"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "00pqrs";
        int consumed = translator.translate(input, 2, writer);
        assertEquals(4, consumed);
        assertEquals("PQRS", writer.toString());
    }

    @Test
    public void test10_buffer_key_string_input_long() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuffer("long"), "L"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "long";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("L", writer.toString());
    }

    @Test
    public void test11_builder_key_string_input_short() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("short"), "S"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "short";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(5, consumed);
        assertEquals("S", writer.toString());
    }

    @Test
    public void test12_builder_key_builder_input_blue() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("blue"), "B"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuilder("blue");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("B", writer.toString());
    }

}
