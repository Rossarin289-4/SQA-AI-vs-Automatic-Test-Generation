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
    @Test
    public void testElementsInitiallyEmpty() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testAddElementReturnsFormAndStoresSameElement() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element input = new Element("input");
        assertSame(form, form.addElement(input));
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testFormDataIsEmptyWithoutControls() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testSubmitsNamedTextInput() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element input = new Element("input").attr("name", "q").attr("value", "abc");
        form.addElement(input);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("q", data.get(0).key());
        assertEquals("abc", data.get(0).value());
    }

    @Test
    public void testSkipsControlWithoutName() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("value", "abc"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testSkipsDisabledControl() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "q").attr("value", "abc").attr("disabled", ""));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testSkipsButtonType() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "q").attr("type", "button").attr("value", "abc"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testUncheckedCheckboxIsSkipped() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "agree").attr("type", "checkbox").attr("value", "yes"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testCheckedCheckboxUsesExplicitValue() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "agree").attr("type", "checkbox")
                .attr("checked", "").attr("value", "yes"));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testCheckedCheckboxWithoutValueUsesOn() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "agree").attr("type", "checkbox").attr("checked", ""));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testCheckedRadioSubmitsValue() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "choice").attr("type", "radio")
                .attr("checked", "").attr("value", "a"));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("choice", data.get(0).key());
        assertEquals("a", data.get(0).value());
    }

    @Test
    public void testSelectSubmitsSelectedOptions() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element("select").attr("name", "color");
        select.append("<option value='r' selected>Red</option><option value='b'>Blue</option>");
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("color", data.get(0).key());
        assertEquals("r", data.get(0).value());
    }

    @Test
    public void testSelectWithoutSelectedOptionUsesFirstOption() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element("select").attr("name", "color");
        select.append("<option value='r'>Red</option><option value='b'>Blue</option>");
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("r", data.get(0).value());
    }

    @Test
    public void testSelectWithoutOptionsAddsNoData() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("select").attr("name", "color"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataReturnsCopyOfDataList() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element("input").attr("name", "q").attr("value", "abc"));
        List<Connection.KeyVal> data = form.formData();
        data.clear();
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testSubmitFailsWithoutActionOrBaseUri() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        try {
            form.submit();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }

    @Test
    public void testSubmitUsesBaseUriWhenActionAbsent() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/path", new Attributes());
        Connection connection = form.submit();
        assertEquals("http://example.com/path", connection.request().url().toString());
    }

    @Test
    public void testSubmitUsesPostMethod() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("action", "http://example.com/");
        attributes.put("method", "post");
        FormElement form = new FormElement(Tag.valueOf("form"), "", attributes);
        assertEquals(Connection.Method.POST, form.submit().request().method());
    }

    @Test
    public void testSubmitDefaultsToGetMethod() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("action", "http://example.com/");
        FormElement form = new FormElement(Tag.valueOf("form"), "", attributes);
        assertEquals(Connection.Method.GET, form.submit().request().method());
    }
}
