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
        Element input = new Element(Tag.valueOf("input"), "").attr("name", "q");
        assertSame(form, form.addElement(input));
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testAddSeveralElementsPreservesOrder() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element first = new Element(Tag.valueOf("input"), "").attr("name", "a");
        Element last = new Element(Tag.valueOf("input"), "").attr("name", "b");
        form.addElement(first).addElement(last);
        assertEquals(2, form.elements().size());
        assertSame(first, form.elements().get(0));
        assertSame(last, form.elements().get(1));
    }

    @Test
    public void testFormDataSkipsUnsubmittableTag() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("div"), "").attr("name", "x").attr("value", "y"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataSkipsDisabledControl() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "x").attr("value", "y").attr("disabled", ""));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataSkipsControlWithoutName() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "").attr("value", "y"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataIncludesNamedOrdinaryControl() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "q").attr("value", "tea"));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("q", data.get(0).key());
        assertEquals("tea", data.get(0).value());
    }

    @Test
    public void testFormDataIncludesEmptyValue() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "").attr("name", "q"));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("", data.get(0).value());
    }

    @Test
    public void testUncheckedCheckboxIsSkipped() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "c").attr("type", "checkbox").attr("value", "yes"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testCheckedCheckboxWithValue() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "c").attr("type", "checkbox")
                .attr("value", "yes").attr("checked", ""));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("yes", data.get(0).value());
    }

    @Test
    public void testCheckedCheckboxWithoutValueSubmitsOn() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "c").attr("type", "checkbox").attr("checked", ""));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("on", data.get(0).value());
    }

    @Test
    public void testCheckedRadioIsIncluded() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "r").attr("type", "radio")
                .attr("value", "v").attr("checked", ""));
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("r", data.get(0).key());
        assertEquals("v", data.get(0).value());
    }

    @Test
    public void testSelectUsesFirstOptionWhenNoneSelected() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "").attr("name", "s");
        select.appendElement("option").attr("value", "first");
        select.appendElement("option").attr("value", "second");
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(1, data.size());
        assertEquals("first", data.get(0).value());
    }

    @Test
    public void testSelectIncludesEverySelectedOption() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        Element select = new Element(Tag.valueOf("select"), "").attr("name", "s");
        select.appendElement("option").attr("value", "a").attr("selected", "");
        select.appendElement("option").attr("value", "b").attr("selected", "");
        form.addElement(select);
        List<Connection.KeyVal> data = form.formData();
        assertEquals(2, data.size());
        assertEquals("a", data.get(0).value());
        assertEquals("b", data.get(1).value());
    }

    @Test
    public void testSelectWithNoOptionsContributesNoData() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("select"), "").attr("name", "s"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataReturnsIndependentList() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        form.addElement(new Element(Tag.valueOf("input"), "")
                .attr("name", "q").attr("value", "v"));
        List<Connection.KeyVal> data = form.formData();
        data.clear();
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testSubmitUsesGetUnlessMethodIsPost() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/path");
        FormElement form = new FormElement(Tag.valueOf("form"), "", attrs);
        Connection connection = form.submit();
        assertEquals(Connection.Method.GET, connection.request().method());
    }

    @Test
    public void testSubmitUsesPostForPostMethod() throws Exception {
        Attributes attrs = new Attributes();
        attrs.put("action", "http://example.com/path");
        attrs.put("method", "POST");
        FormElement form = new FormElement(Tag.valueOf("form"), "", attrs);
        assertEquals(Connection.Method.POST, form.submit().request().method());
    }

    @Test
    public void testSubmitUsesBaseUriWhenActionAbsent() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "http://example.com/base", new Attributes());
        assertEquals("http://example.com/base", form.submit().request().url().toString());
    }

    @Test
    public void testEqualsSelf() throws Exception {
        FormElement form = new FormElement(Tag.valueOf("form"), "", new Attributes());
        assertTrue(form.equals(form));
    }
}
