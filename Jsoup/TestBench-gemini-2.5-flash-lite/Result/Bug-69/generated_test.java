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

public class FormElementTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    @Test
    public void testElementsReturnsEmptyListInitially() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testAddElementAddsToElementsList() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("name", "test"));
        form.addElement(input);
        assertFalse(form.elements().isEmpty());
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testRemoveChildRemovesFromElementsList() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("name", "test"));
        form.addElement(input);
        // The removeChild method in Element first removes the child from its parent.
        // If the element is part of the form's elements list, it should also be removed.
        // The original test failed because `form.removeChild(input)` was called directly
        // without input being added to the form's actual children list (which `removeChild` operates on).
        // To fix this, we first append the input to the form, then remove it.
        form.appendChild(input); // Add to parent first
        form.removeChild(input); // Then remove from parent and its internal elements list.
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void testSubmitWithEmptyActionDefaultsToBaseUri() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection connection = form.submit();
        assertEquals("http://example.com", connection.request().url().toString());
    }

    @Test
    public void testSubmitWithActionAttribute() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes().put("action", "/submit");
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection connection = form.submit();
        assertEquals("http://example.com/submit", connection.request().url().toString());
    }

    @Test
    public void testSubmitWithAbsoluteActionAttribute() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes().put("action", "http://other.com/submit");
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection connection = form.submit();
        assertEquals("http://other.com/submit", connection.request().url().toString());
    }

    @Test
    public void testSubmitDefaultsToGetMethod() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes().put("action", "/submit");
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void testSubmitWithPostMethod() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes().put("action", "/submit").put("method", "POST");
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection connection = form.submit();
        assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test
    public void testFormDataWithOneInput() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("name", "test").put("value", "value1"));
        form.addElement(input);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("value1", formData.get(0).value());
    }

    @Test
    public void testFormDataWithMultipleInputs() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input1 = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("name", "test1").put("value", "value1"));
        Element input2 = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("name", "test2").put("value", "value2"));
        form.addElement(input1);
        form.addElement(input2);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(2, formData.size());
        assertEquals("test1", formData.get(0).key());
        assertEquals("value1", formData.get(0).value());
        assertEquals("test2", formData.get(1).key());
        assertEquals("value2", formData.get(1).value());
    }

    @Test
    public void testFormDataIgnoresDisabledInputs() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("name", "test").put("value", "value1").put("disabled", "true"));
        form.addElement(input);
        List<Connection.KeyVal> formData = form.formData();
        assertTrue(formData.isEmpty());
    }

    @Test
    public void testFormDataIgnoresInputsWithoutName() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("value", "value1"));
        form.addElement(input);
        List<Connection.KeyVal> formData = form.formData();
        assertTrue(formData.isEmpty());
    }

    @Test
    public void testFormDataHandlesSelectWithSelectedOption() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes().put("name", "test"));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt1")));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt2").put("selected", "true")));
        form.addElement(select);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("opt2", formData.get(0).value());
    }

    @Test
    public void testFormDataHandlesSelectWithoutSelectedOption() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes().put("name", "test"));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt1")));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt2")));
        form.addElement(select);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("opt1", formData.get(0).value()); // first option is taken
    }

    @Test
    public void testFormDataHandlesCheckboxChecked() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("type", "checkbox").put("name", "test").put("checked", "true").put("value", "checked_value"));
        form.addElement(checkbox);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("checked_value", formData.get(0).value());
    }

    @Test
    public void testFormDataHandlesCheckboxCheckedWithValueOn() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("type", "checkbox").put("name", "test").put("checked", "true"));
        form.addElement(checkbox);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("on", formData.get(0).value()); // default value is "on"
    }

    @Test
    public void testFormDataHandlesCheckboxNotChecked() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element checkbox = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("type", "checkbox").put("name", "test").put("value", "checked_value"));
        form.addElement(checkbox);
        List<Connection.KeyVal> formData = form.formData();
        assertTrue(formData.isEmpty());
    }

    @Test
    public void testFormDataHandlesRadioChecked() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element radio = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("type", "radio").put("name", "test").put("checked", "true").put("value", "radio_value"));
        form.addElement(radio);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("radio_value", formData.get(0).value());
    }

    @Test
    public void testFormDataHandlesRadioNotChecked() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element radio = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("type", "radio").put("name", "test").put("value", "radio_value"));
        form.addElement(radio);
        List<Connection.KeyVal> formData = form.formData();
        assertTrue(formData.isEmpty());
    }

    @Test
    public void testFormDataHandlesTextarea() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com", new Attributes().put("name", "test"));
        textarea.appendText("textarea value");
        form.addElement(textarea);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("textarea value", formData.get(0).value());
    }

    @Test
    public void testFormDataHandlesEmptyTextarea() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element textarea = new Element(Tag.valueOf("textarea"), "http://example.com", new Attributes().put("name", "test"));
        form.addElement(textarea);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(1, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("", formData.get(0).value());
    }

    @Test
    public void testFormDataDoesNotIncludeNonFormSubmittableTags() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element div = new Element(Tag.valueOf("div"), "http://example.com", new Attributes().put("name", "test").put("value", "value1"));
        form.addElement(div);
        List<Connection.KeyVal> formData = form.formData();
        assertTrue(formData.isEmpty());
    }

    @Test
    public void testFormDataHandlesMultipleSelectedOptionsInMultiSelect() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element select = new Element(Tag.valueOf("select"), "http://example.com", new Attributes().put("name", "test").put("multiple", "true"));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt1").put("selected", "true")));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt2").put("selected", "true")));
        select.appendChild(new Element(Tag.valueOf("option"), "http://example.com", new Attributes().put("value", "opt3")));
        form.addElement(select);
        List<Connection.KeyVal> formData = form.formData();
        assertEquals(2, formData.size());
        assertEquals("test", formData.get(0).key());
        assertEquals("opt1", formData.get(0).value());
        assertEquals("test", formData.get(1).key());
        assertEquals("opt2", formData.get(1).value());
    }

     @Test
    public void testSubmitWithEmptyForm() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Connection connection = form.submit();
        assertEquals(0, connection.request().data().size());
    }

    @Test
    public void testFormDataWithEmptyNameAttribute() throws Exception {
        Tag tag = Tag.valueOf("form");
        Attributes attributes = new Attributes();
        FormElement form = new FormElement(tag, "http://example.com", attributes);
        Element input = new Element(Tag.valueOf("input"), "http://example.com", new Attributes().put("value", "value1"));
        form.addElement(input);
        List<Connection.KeyVal> formData = form.formData();
        assertTrue(formData.isEmpty());
    }
}
