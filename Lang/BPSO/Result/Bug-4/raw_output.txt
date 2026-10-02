package org.apache.commons.lang3.text.translate;

import static org.junit.Assert.assertEquals;
import java.io.StringWriter;
import org.junit.Test;

public class LookupTranslatorBPSOTest {

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
    public void test03_stringbuilder_key_string_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("red"), "BLUE"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "red";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("BLUE", writer.toString());
    }

    @Test
    public void test04_string_key_stringbuffer_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{"fish", "SEA"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuffer("fish");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("SEA", writer.toString());
    }

    @Test
    public void test05_builder_key_builder_input() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("sun"), "DAY"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuilder("sun");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("DAY", writer.toString());
    }

    @Test
    public void test06_non_zero_index_builder() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("cat"), "ANIMAL"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "xxcat";
        int consumed = translator.translate(input, 2, writer);
        assertEquals(3, consumed);
        assertEquals("ANIMAL", writer.toString());
    }

    @Test
    public void test07_greedy_builder() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("abc"), "SHORT"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "abcdef";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(3, consumed);
        assertEquals("SHORT", writer.toString());
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
    public void test09_builder_key_string_input_world() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("world"), "EARTH"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "world";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(5, consumed);
        assertEquals("EARTH", writer.toString());
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
    public void test11_builder_key_builder_input_blue() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("blue"), "B"}});
        StringWriter writer = new StringWriter();
        CharSequence input = new StringBuilder("blue");
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("B", writer.toString());
    }

    @Test
    public void test12_builder_key_string_input_java() throws Exception {
        LookupTranslator translator = new LookupTranslator(new CharSequence[][] {{new StringBuilder("java"), "CODE"}});
        StringWriter writer = new StringWriter();
        CharSequence input = "java";
        int consumed = translator.translate(input, 0, writer);
        assertEquals(4, consumed);
        assertEquals("CODE", writer.toString());
    }

}
