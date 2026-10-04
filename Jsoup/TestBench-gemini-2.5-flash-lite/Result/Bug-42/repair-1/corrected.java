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
import java.io.IOException;
import java.net.URL;
import java.io.InputStream;

public class FormElementTest {

    // Helper method to create a simple FormElement with base URI
    private FormElement createForm(String baseUri) {
        return new FormElement(Tag.valueOf("form"), baseUri, new Attributes());
    }

    // Helper method to create a simple input element
    private Element createInput(String tagName, String name, String type, String value) {
        Attributes attributes = new Attributes();
        attributes.put("name", name);
        if (type != null) {
            attributes.put("type", type);
        }
        attributes.put("value", value);
        return new Element(Tag.valueOf(tagName), "", attributes);
    }
    
    // Helper method to create a simple input element without value
    private Element createInput(String tagName, String name, String type) {
        Attributes attributes = new Attributes();
        attributes.put("name", name);
        if (type != null) {
            attributes.put("type", type);
        }
        return new Element(Tag.valueOf(tagName), "", attributes);
    }

    @Test
    public void elementsReturnsEmptyListWhenNoElementsAdded() {
        FormElement form = createForm("http://example.com");
        assertTrue(form.elements().isEmpty());
    }

    @Test
    public void addElementAddsElementToInternalList() {
        FormElement form = createForm("http://example.com");
        Element input = createInput("input", "username", null, "testuser");
        form.addElement(input);
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().first());
    }

    @Test
    public void addElementsAddsMultipleElements() {
        FormElement form = createForm("http://example.com");
        Element input1 = createInput("input", "username", null, "testuser");
        Element input2 = createInput("input", "password", null, "pass123");
        form.addElement(input1);
        form.addElement(input2);
        assertEquals(2, form.elements().size());
        assertSame(input1, form.elements().get(0));
        assertSame(input2, form.elements().get(1));
    }

    @Test
    public void formDataReturnsEmptyListForEmptyForm() {
        FormElement form = createForm("http://example.com");
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void formDataIncludesSimpleInputValues() {
        FormElement form = createForm("http://example.com");
        Element input = createInput("input", "username", null, "testuser");
        form.addElement(input);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("username", data.get(0).key());
        assertEquals("testuser", data.get(0).value());
    }

    @Test
    public void formDataSkipsInputsWithoutName() {
        FormElement form = createForm("http://example.com");
        Element input = new Element(Tag.valueOf("input"), "", new Attributes()); // No name attribute
        form.addElement(input);
        assertTrue(form.formData().isEmpty());
    }
    
    @Test
    public void formDataSkipsDisabledInputs() {
        FormElement form = createForm("http://example.com");
        Element input = createInput("input", "username", null, "testuser");
        input.attr("disabled", "disabled");
        form.addElement(input);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void formDataHandlesSelectWithSelectedOption() {
        FormElement form = createForm("http://example.com");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes().put("name", "country"));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "USA")));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "Canada")).attr("selected", "selected"));
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("country", data.get(0).key());
        assertEquals("Canada", data.get(0).value());
    }
    
    @Test
    public void formDataHandlesSelectWithNoSelectedOption() {
        FormElement form = createForm("http://example.com");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes().put("name", "country"));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "USA")));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "Canada")));
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("country", data.get(0).key());
        assertEquals("USA", data.get(0).value()); // first option is selected if none explicitly
    }

    @Test
    public void formDataHandlesSelectWithNoOptions() {
        FormElement form = createForm("http://example.com");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes().put("name", "country"));
        form.addElement(select);
        assertTrue(form.formData().isEmpty());
    }
    
    @Test
    public void formDataHandlesCheckboxChecked() {
        FormElement form = createForm("http://example.com");
        Element checkbox = createInput("input", "newsletter", "checkbox", "yes");
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("newsletter", data.get(0).key());
        assertEquals("yes", data.get(0).value());
    }
    
    @Test
    public void formDataHandlesCheckboxCheckedWithValueOn() {
        FormElement form = createForm("http://example.com");
        Element checkbox = createInput("input", "terms", "checkbox", ""); // Empty value
        checkbox.attr("checked", "checked");
        form.addElement(checkbox);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("terms", data.get(0).key());
        assertEquals("on", data.get(0).value()); // Default value is "on"
    }

    @Test
    public void formDataHandlesCheckboxUnchecked() {
        FormElement form = createForm("http://example.com");
        Element checkbox = createInput("input", "newsletter", "checkbox", "yes");
        // Not checked
        form.addElement(checkbox);
        assertTrue(form.formData().isEmpty());
    }

    @Test
    public void formDataHandlesRadioChecked() {
        FormElement form = createForm("http://example.com");
        Element radio = createInput("input", "gender", "radio", "male");
        radio.attr("checked", "checked");
        form.addElement(radio);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("gender", data.get(0).key());
        assertEquals("male", data.get(0).value());
    }

    @Test
    public void formDataHandlesRadioCheckedWithValueOn() {
        FormElement form = createForm("http://example.com");
        Element radio = createInput("input", "preference", "radio", ""); // Empty value
        radio.attr("checked", "checked");
        form.addElement(radio);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("preference", data.get(0).key());
        assertEquals("on", data.get(0).value()); // Default value is "on"
    }

    @Test
    public void formDataHandlesRadioUnchecked() {
        FormElement form = createForm("http://example.com");
        Element radio = createInput("input", "gender", "radio", "male");
        // Not checked
        form.addElement(radio);
        assertTrue(form.formData().isEmpty());
    }
    
    @Test
    public void formDataHandlesMultipleInputsWithSameName() {
        FormElement form = createForm("http://example.com");
        Element input1 = createInput("input", "colors", null, "red");
        Element input2 = createInput("input", "colors", null, "blue");
        form.addElement(input1);
        form.addElement(input2);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("colors", data.get(0).key());
        assertEquals("red", data.get(0).value());
        assertEquals("colors", data.get(1).key());
        assertEquals("blue", data.get(1).value());
    }
    
    @Test
    public void formDataHandlesMultipleSelectOptionsWithSameName() {
        FormElement form = createForm("http://example.com");
        Element select = new Element(Tag.valueOf("select"), "", new Attributes().put("name", "sizes"));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "S")));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "M")).attr("selected", "selected"));
        select.appendChild(new Element(Tag.valueOf("option"), "", new Attributes().put("value", "L")).attr("selected", "selected"));
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("sizes", data.get(0).key());
        assertEquals("M", data.get(0).value());
        assertEquals("sizes", data.get(1).key());
        assertEquals("L", data.get(1).value());
    }

    @Test
    public void submitUsesFormActionAsUrlWhenPresent() {
        FormElement form = createForm("http://example.com/default");
        form.attr("action", "/submit");
        Connection connection = form.submit();
        assertEquals("http://example.com/submit", connection.request().url().toExternalForm());
    }

    @Test
    public void submitUsesFormBaseUriWhenActionIsAbsent() {
        FormElement form = createForm("http://example.com/default");
        Connection connection = form.submit();
        assertEquals("http://example.com/default", connection.request().url().toExternalForm());
    }

    @Test
    public void submitUsesPostMethodWhenMethodIsPost() {
        FormElement form = createForm("http://example.com");
        form.attr("method", "POST");
        Connection connection = form.submit();
        assertEquals(Connection.Method.POST, connection.request().method());
    }

    @Test
    public void submitUsesGetMethodWhenMethodIsGet() {
        FormElement form = createForm("http://example.com");
        form.attr("method", "GET");
        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }
    
    @Test
    public void submitUsesGetMethodWhenMethodIsAbsent() {
        FormElement form = createForm("http://example.com");
        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void submitSetsFormData() {
        FormElement form = createForm("http://example.com");
        Element input = createInput("input", "username", null, "testuser");
        form.addElement(input);
        Connection connection = form.submit();
        // The connection.request().data() returns a List<Connection.KeyVal>, which is not an ArrayList.
        // We need to use the correct method to access its elements.
        // Since KeyVal is an interface, and HttpConnection.KeyVal is a concrete implementation,
        // we can assume it implements the KeyVal interface.
        assertEquals(1, connection.request().data().size());
        assertEquals("username", connection.request().data().get(0).key());
        assertEquals("testuser", connection.request().data().get(0).value());
    }

    @Test
    public void submitWithEmptyActionThrowsException() {
        FormElement form = createForm(""); // Empty base URI
        form.attr("action", ""); // Empty action
        try {
            form.submit();
            fail("Expected IllegalArgumentException for empty action URL");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Could not determine a form action URL"));
        }
    }

    @Test
    public void submitHandlesNonFormSubmittableTagsGracefully() {
        FormElement form = createForm("http://example.com");
        Element div = new Element(Tag.valueOf("div"), "", new Attributes().put("name", "mydiv"));
        form.addElement(div); // div is not formSubmittable
        assertTrue(form.formData().isEmpty());
        Connection connection = form.submit();
        assertTrue(connection.request().data().isEmpty());
    }
    
    @Test
    public void equalsReturnsTrueForSameInstance() {
        FormElement form = createForm("http://example.com");
        assertTrue(form.equals(form));
    }
    
    @Test
    public void equalsReturnsFalseForDifferentInstance() {
        FormElement form1 = createForm("http://example.com");
        FormElement form2 = createForm("http://example.com");
        assertFalse(form1.equals(form2));
    }
    
    @Test
    public void equalsUsesSuperClassImplementation() {
        FormElement form1 = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        FormElement form2 = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        // Since FormElement overrides equals but just calls super.equals(), and super.equals() is likely based on Object's default
        // or Element's implementation which might compare attributes, ID etc.
        // We expect false unless the super implementation considers them equal.
        // Given the reference source, it's likely comparing base element properties.
        // However, the crucial point is that `equals` is not re-implemented with specific logic for FormElement.
        // The test here will reflect the behavior of Element.equals() if it's inherited and not overridden effectively.
        // Based on the provided source, FormElement.equals just calls super.equals().
        // The superclass for Element is Node. The equals in Node compares node name and children.
        // Element equals likely also compares attributes and tag.
        // Let's construct two forms that might be considered different by Element.equals.
        Attributes attrs1 = new Attributes();
        attrs1.put("id", "form1");
        FormElement form3 = new FormElement(Tag.valueOf("form"), "http://example.com", attrs1);

        Attributes attrs2 = new Attributes();
        attrs2.put("id", "form2");
        FormElement form4 = new FormElement(Tag.valueOf("form"), "http://example.com", attrs2);
        
        assertFalse(form3.equals(form4)); // Expecting false due to different attributes

        FormElement form5 = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        FormElement form6 = new FormElement(Tag.valueOf("form"), "http://example.com", new Attributes());
        assertFalse(form5.equals(form6)); // Even with same attributes, different instances are likely false based on object identity or Node equality.
        
        // The key is that FormElement itself doesn't add any specific equality logic.
        // It relies on the parent Element's equals method.
    }
}
