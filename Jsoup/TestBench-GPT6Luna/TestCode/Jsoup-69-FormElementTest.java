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
        Element parsed = Jsoup.parse("<form></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        assertEquals(0, form.elements().size());
    }

    @Test
    public void testAddElementReturnsFormAndRegistersElement() throws Exception {
        Element parsed = Jsoup.parse("<form><input name=x></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        Element input = parsed.selectFirst("input");
        assertSame(form, form.addElement(input));
        assertEquals(1, form.elements().size());
        assertSame(input, form.elements().get(0));
    }

    @Test
    public void testFormDataSkipsNonSubmittableElement() throws Exception {
        Element parsed = Jsoup.parse("<form><div name=x>v</div></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("div"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataSkipsDisabledControl() throws Exception {
        Element parsed = Jsoup.parse("<form><input name=x disabled value=v></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataSkipsControlWithoutName() throws Exception {
        Element parsed = Jsoup.parse("<form><input value=v></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataIncludesNamedTextInput() throws Exception {
        Element parsed = Jsoup.parse("<form><input name=x value=v></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testFormDataSkipsUncheckedCheckbox() throws Exception {
        Element parsed = Jsoup.parse("<form><input type=checkbox name=x></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        assertEquals(0, form.formData().size());
    }

    @Test
    public void testFormDataCheckedCheckboxHasDefaultValue() throws Exception {
        Element parsed = Jsoup.parse("<form><input type=checkbox name=x checked></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testFormDataCheckedRadioWithExplicitValue() throws Exception {
        Element parsed = Jsoup.parse("<form><input type=radio name=x value=yes checked></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testFormDataSelectsSelectedOptions() throws Exception {
        Element parsed = Jsoup.parse("<form><select name=x><option>a</option><option selected>b</option></select></form>",
                "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("select"));
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testFormDataSelectWithoutSelectedOptionUsesFirstOption() throws Exception {
        Element parsed = Jsoup.parse("<form><select name=x><option>a</option><option>b</option></select></form>",
                "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("select"));
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testFormDataReturnsIndependentList() throws Exception {
        Element parsed = Jsoup.parse("<form><input name=x value=v></form>", "http://example.com").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        form.addElement(parsed.selectFirst("input"));
        List<Connection.KeyVal> first = form.formData();
        first.clear();
        assertEquals(1, form.formData().size());
    }

    @Test
    public void testSubmitUsesFormBaseUriWhenActionAbsent() throws Exception {
        Element parsed = Jsoup.parse("<form></form>", "http://example.com/path").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        assertNotNull(form.submit());
    }

    @Test
    public void testSubmitUsesResolvableAction() throws Exception {
        Element parsed = Jsoup.parse("<form action='/send'></form>", "http://example.com/path").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), parsed.baseUri(), parsed.attributes());
        assertNotNull(form.submit());
    }

    @Test
    public void testSubmitRejectsMissingActionAndBaseUri() throws Exception {
        Element parsed = Jsoup.parse("<form></form>").selectFirst("form");
        FormElement form = new FormElement(parsed.tag(), "", parsed.attributes());
        try {
            form.submit();
            fail("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
        }
    }
}
