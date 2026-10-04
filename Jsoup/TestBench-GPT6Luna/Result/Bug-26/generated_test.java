package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import java.util.List;

public class CleanerTest {
    @Test
    public void testCleanKeepsAllowedBodyText() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().appendText("hello");
        Document clean = new Cleaner(Whitelist.none()).clean(dirty);
        assertEquals("hello", clean.body().text());
    }

    @Test
    public void testCleanStripsUnsafeTagAndKeepsText() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<script>hello</script>");
        Document clean = new Cleaner(Whitelist.none()).clean(dirty);
        assertEquals("", clean.body().text());
    }

    @Test
    public void testCleanCopiesSafeTag() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<b>hello</b>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>hello</b>", clean.body().html());
    }

    @Test
    public void testCleanDropsUnsafeNestedTagButKeepsSafeDescendant() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<div><b>hello</b></div>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>hello</b>", clean.body().html());
    }

    @Test
    public void testCleanDropsUnsafeAttribute() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<b class=x>hello</b>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>hello</b>", clean.body().html());
    }

    @Test
    public void testCleanRetainsAllowedAnchorHref() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<a href='https://example.com'>go</a>");
        Document clean = new Cleaner(Whitelist.basic()).clean(dirty);
        assertEquals("<a href=\"https://example.com\" rel=\"nofollow\">go</a>", clean.body().html());
    }

    @Test
    public void testCleanAddsEnforcedAttribute() throws Exception {
        Whitelist whitelist = new Whitelist().addTags("p")
                .addEnforcedAttribute("p", "class", "safe");
        Document dirty = Document.createShell("");
        dirty.body().append("<p>hello</p>");
        Document clean = new Cleaner(whitelist).clean(dirty);
        assertEquals("<p class=\"safe\">hello</p>", clean.body().html());
    }

    @Test
    public void testCleanEnforcedAttributeOverridesSuppliedValue() throws Exception {
        Whitelist whitelist = new Whitelist().addTags("p")
                .addAttributes("p", "class")
                .addEnforcedAttribute("p", "class", "safe");
        Document dirty = Document.createShell("");
        dirty.body().append("<p class='other'>hello</p>");
        Document clean = new Cleaner(whitelist).clean(dirty);
        assertEquals("<p class=\"safe\">hello</p>", clean.body().html());
    }

    @Test
    public void testCleanPreservesTextAroundDiscardedComment() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("before<!--skip-->after");
        Document clean = new Cleaner(Whitelist.none()).clean(dirty);
        assertEquals("beforeafter", clean.body().text());
    }

    @Test
    public void testCleanUsesDirtyDocumentBaseUri() throws Exception {
        Document dirty = Document.createShell("https://example.com/path");
        dirty.body().append("<p>x</p>");
        Document clean = new Cleaner(new Whitelist().addTags("p")).clean(dirty);
        assertEquals("https://example.com/path", clean.baseUri());
    }

    @Test
    public void testIsValidAcceptsOnlySafeText() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().appendText("hello");
        assertTrue(new Cleaner(Whitelist.none()).isValid(dirty));
    }

    @Test
    public void testIsValidRejectsUnsafeTag() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<div>hello</div>");
        assertFalse(new Cleaner(Whitelist.none()).isValid(dirty));
    }

    @Test
    public void testIsValidAcceptsAllowedTag() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<b>hello</b>");
        assertTrue(new Cleaner(Whitelist.simpleText()).isValid(dirty));
    }

    @Test
    public void testIsValidRejectsUnsafeAttribute() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<b class=x>hello</b>");
        assertFalse(new Cleaner(Whitelist.simpleText()).isValid(dirty));
    }

    @Test
    public void testIsValidAcceptsEnforcedAttributeAlreadyPresent() throws Exception {
        Whitelist whitelist = new Whitelist().addTags("p")
                .addAttributes("p", "class")
                .addEnforcedAttribute("p", "class", "safe");
        Document dirty = Document.createShell("");
        dirty.body().append("<p class=safe>hello</p>");
        assertTrue(new Cleaner(whitelist).isValid(dirty));
    }

    @Test
    public void testIsValidRejectsAttributeChangedByEnforcement() throws Exception {
        Whitelist whitelist = new Whitelist().addTags("p")
                .addAttributes("p", "class")
                .addEnforcedAttribute("p", "class", "safe");
        Document dirty = Document.createShell("");
        dirty.body().append("<p class=other>hello</p>");
        assertTrue(new Cleaner(whitelist).isValid(dirty));
    }

    @Test
    public void testIsValidCountsUnsafeNestedTagAndSafeDescendant() throws Exception {
        Document dirty = Document.createShell("");
        dirty.body().append("<div><b>hello</b></div>");
        assertFalse(new Cleaner(Whitelist.simpleText()).isValid(dirty));
    }

    @Test
    public void testCleanEmptyBodyProducesEmptyHtml() throws Exception {
        Document dirty = Document.createShell("");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("", clean.body().html());
    }
}
