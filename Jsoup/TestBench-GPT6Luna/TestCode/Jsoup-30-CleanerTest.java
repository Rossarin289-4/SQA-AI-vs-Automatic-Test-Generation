package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import java.util.List;

public class CleanerTest {
    @Test
    public void testCleanCopiesAllowedText() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<p>hello</p>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("hello", clean.body().html());
    }

    @Test
    public void testCleanStripsDisallowedTagButKeepsText() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<div>hello</div>");
        Document clean = new Cleaner(Whitelist.none()).clean(dirty);
        assertEquals("hello", clean.body().html());
    }

    @Test
    public void testCleanKeepsAllowedNestedElements() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<p><b>x</b></p>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>x</b>", clean.body().html());
    }

    @Test
    public void testCleanRemovesDisallowedAttribute() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<b title=x>hi</b>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>hi</b>", clean.body().html());
    }

    @Test
    public void testCleanRetainsAllowedLinkAttribute() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<a href='https://example.org'>x</a>");
        Document clean = new Cleaner(Whitelist.basic()).clean(dirty);
        assertEquals("<a href=\"https://example.org\" rel=\"nofollow\">x</a>", clean.body().html());
    }

    @Test
    public void testCleanAppliesEnforcedAttribute() throws Exception {
        Whitelist whitelist = new Whitelist().addTags("p").addEnforcedAttribute("p", "class", "safe");
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<p>x</p>");
        Document clean = new Cleaner(whitelist).clean(dirty);
        assertEquals("<p class=\"safe\">x</p>", clean.body().html());
    }

    @Test
    public void testCleanKeepsTextFromDisallowedParent() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<div><b>x</b></div>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>x</b>", clean.body().html());
    }

    @Test
    public void testCleanIgnoresComments() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("a<!--c-->b");
        Document clean = new Cleaner(Whitelist.none()).clean(dirty);
        assertEquals("ab", clean.body().html());
    }

    @Test
    public void testCleanKeepsOnlyBodyContent() throws Exception {
        Document dirty = org.jsoup.Jsoup.parse("<head><title>t</title></head><body><b>x</b></body>");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("<b>x</b>", clean.body().html());
    }

    @Test
    public void testCleanPreservesBaseUri() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<p>x</p>", "https://example.org/");
        Document clean = new Cleaner(Whitelist.simpleText()).clean(dirty);
        assertEquals("https://example.org/", clean.baseUri());
    }

    @Test
    public void testIsValidAllowedMarkup() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<b>x</b>");
        assertTrue(new Cleaner(Whitelist.simpleText()).isValid(dirty));
    }

    @Test
    public void testIsValidRejectsDisallowedElement() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<div>x</div>");
        assertFalse(new Cleaner(Whitelist.simpleText()).isValid(dirty));
    }

    @Test
    public void testIsValidRejectsDisallowedAttribute() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<b title=x>x</b>");
        assertFalse(new Cleaner(Whitelist.simpleText()).isValid(dirty));
    }

    @Test
    public void testIsValidCountsDiscardedComment() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("x<!--c-->");
        assertFalse(new Cleaner(Whitelist.none()).isValid(dirty));
    }

    @Test
    public void testIsValidAcceptsEmptyBody() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("");
        assertTrue(new Cleaner(Whitelist.none()).isValid(dirty));
    }

    @Test
    public void testCleanStripsNestedDisallowedElementsButPreservesText() throws Exception {
        Document dirty = org.jsoup.Jsoup.parseBodyFragment("<div><span>x</span></div>");
        Document clean = new Cleaner(Whitelist.none()).clean(dirty);
        assertEquals("x", clean.body().html());
    }
}
