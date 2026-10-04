package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.helper.HttpConnection;
import org.jsoup.helper.Validate;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FormElementTest {
    @Test
    public void testElementsInitiallyEmpty() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testAddElementIncreasesElementsCount() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        form.addElement(input);
        assertEquals(1, form.elements().size());
    }

    @Test
    public void testAddElementAddsTheSameInstance() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        form.addElement(input);
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testRemoveChildRemovesFromElements() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        form.addElement(input);
        // Before removing, the element is in the list
        assertEquals(1, form.elements().size());
        form.removeChild(input);
        // After removing, the element should be gone from the list
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testSubmitWithEmptyActionDefaultsToBaseUri() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/path", new Attributes());
        Connection connection = form.submit();
        assertEquals("http://example.com/path", connection.request().url().toString());
    }

    @Test
    public void testSubmitWithActionAttributeUsesAction() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        form.attr("action", "/submit");
        Connection connection = form.submit();
        assertEquals("http://example.com/submit", connection.request().url().toString());
    }

    @Test
    public void testSubmitWithAbsoluteActionAttributeUsesAbsoluteAction() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        form.attr("action", "http://other.com/submit");
        Connection connection = form.submit();
        assertEquals("http://other.com/submit", connection.request().url().toString());
    }

    @Test
    public void testSubmitDefaultsToGetMethod() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void testSubmitWithMethodPostUsesPostMethod() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        form.attr("method", "POST");
        Connection connection = form.submit();
        assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test
    public void testFormDataWithNoElementsIsEmpty() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void testFormDataWithTextInput() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input.attr("name", "username");
        input.attr("value", "testuser");
        form.addElement(input);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("testuser", data.get(0).value());
    }

    @Test
    public void testFormDataWithTextInputNoValue() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input.attr("name", "username");
        form.addElement(input);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("", data.get(0).value());
    }

    @Test
    public void testFormDataWithHiddenInput() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element hidden = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        hidden.attr("type", "hidden");
        hidden.attr("name", "secret");
        hidden.attr("value", "mysecretvalue");
        form.addElement(hidden);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("secret", data.get(0).key());
        assertEquals("mysecretvalue", data.get(0).value());
    }

    @Test
    public void testFormDataWithSelectOneOption() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes());
        select.attr("name", "country");
        Element option1 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option1.attr("value", "us");
        option1.attr("selected", "");
        Element option2 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option2.attr("value", "ca");
        select.appendChild(option1);
        select.appendChild(option2);
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("country", data.get(0).key());
        assertEquals("us", data.get(0).value());
    }

    @Test
    public void testFormDataWithSelectOneNoSelectedOption() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes());
        select.attr("name", "country");
        Element option1 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option1.attr("value", "us");
        Element option2 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option2.attr("value", "ca");
        select.appendChild(option1);
        select.appendChild(option2);
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("country", data.get(0).key());
        assertEquals("us", data.get(0).value()); // First option is selected by default
    }
    
    @Test
    public void testFormDataWithSelectMultipleSelectedOptions() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes());
        select.attr("name", "languages");
        select.attr("multiple", "");
        Element option1 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option1.attr("value", "java");
        option1.attr("selected", "");
        Element option2 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option2.attr("value", "python");
        option2.attr("selected", "");
        Element option3 = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option3.attr("value", "c++");
        select.appendChild(option1);
        select.appendChild(option2);
        select.appendChild(option3);
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("languages", data.get(0).key());
        assertEquals("java", data.get(0).value());
        assertEquals("languages", data.get(1).key());
        assertEquals("python", data.get(1).value());
    }

    @Test
    public void testFormDataWithCheckboxChecked() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "subscribe");
        checkbox.attr("checked", "");
        checkbox.attr("value", "yes");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("subscribe", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testFormDataWithCheckboxCheckedDefaultValue() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "agree");
        checkbox.attr("checked", "");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("agree", data.get(0).key());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testFormDataWithCheckboxUnchecked() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "terms");
        checkbox.attr("value", "agreed");
        form.addElement(checkbox);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void testFormDataWithRadioChecked() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.attr("checked", "");
        radio.attr("value", "male");
        form.addElement(radio);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("gender", data.get(0).key());
        assertEquals("male", data.get(0).value());
    }

    @Test
    public void testFormDataWithRadioUnchecked() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element radio = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        radio.attr("type", "radio");
        radio.attr("name", "gender");
        radio.attr("value", "female");
        form.addElement(radio);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void testFormDataWithDisabledElementIsSkipped() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input.attr("name", "disabled_field");
        input.attr("value", "some_value");
        input.attr("disabled", "");
        form.addElement(input);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void testFormDataWithEmptyNameIsSkipped() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input.attr("name", "");
        input.attr("value", "some_value");
        form.addElement(input);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void testFormDataWithButtonTypeIsSkipped() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element button = new Element(Tag.valueOf("button"), "http://example.com", new Attributes());
        button.attr("name", "submit_button");
        button.attr("type", "button");
        button.attr("value", "Click Me");
        form.addElement(button);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void testFormDataWithSubmitTypeIsIncluded() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element submit = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        submit.attr("type", "submit");
        submit.attr("name", "action");
        submit.attr("value", "save");
        form.addElement(submit);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("action", data.get(0).key());
        assertEquals("save", data.get(0).value());
    }

    @Test
    public void testFormDataWithMultipleElements() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        
        Element input1 = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        input1.attr("name", "q");
        input1.attr("value", "test query");
        form.addElement(input1);

        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes());
        select.attr("name", "region");
        Element option = new Element(Tag.valueOf("option"), "http://example.com", new Attributes());
        option.attr("value", "us");
        option.attr("selected", "");
        select.appendChild(option);
        form.addElement(select);

        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes());
        checkbox.attr("type", "checkbox");
        checkbox.attr("name", "remember");
        checkbox.attr("checked", "");
        checkbox.attr("value", "true");
        form.addElement(checkbox);

        List<Connection.KeyVal> data = form.formData();
        assertEquals(3, data.size());
        assertEquals("q", data.get(0).key());
        assertEquals("test query", data.get(0).value());
        assertEquals("region", data.get(1).key());
        assertEquals("us", data.get(1).value());
        assertEquals("remember", data.get(2).key());
        assertEquals("true", data.get(2).value());
    }

    @Test
    public void testSubmitThrowsExceptionIfActionIsMissingAndNoBaseUri() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes()); // Empty baseUri
        try {
            form.submit();
            fail("Expected IllegalArgumentException for missing action URL");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Could not determine a form action URL"));
        }
    }

    @Test
    public void testFormDataWithTextarea() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com", new Attributes());
        textarea.attr("name", "message");
        textarea.appendText("This is a message.");
        form.addElement(textarea);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("message", data.get(0).key());
        assertEquals("This is a message.", data.get(0).value());
    }

     @Test
    public void testFormDataWithTextareaEmpty() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com", new Attributes());
        textarea.attr("name", "message");
        form.addElement(textarea);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("message", data.get(0).key());
        assertEquals("", data.get(0).value());
    }
}
