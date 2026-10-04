package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.*;
import org.jsoup.parser.Tag;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CleanerTest {

    @Test
    public void testCleanWithNullDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        try {
            cleaner.clean(null);
            fail("Expected NullPointerException or similar for null document.");
        } catch (NullPointerException e) {
            // Expected behavior for null input to Validate.notNull
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testCleanWithEmptyBody() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("");
        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(0, cleanedDoc.body().children().size());
        assertEquals(0, cleanedDoc.body().text().length());
    }

    @Test
    public void testCleanWithBasicWhitelist() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("p"), ""));
        body.appendChild(new Element(Tag.valueOf("script"), "")); // Should be removed
        body.appendChild(new Element(Tag.valueOf("a"), ""));
        body.appendChild(new TextNode("Some text", ""));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(3, cleanedDoc.body().children().size()); // p, a, textNode
        assertEquals("p", cleanedDoc.body().child(0).tagName());
        assertEquals("a", cleanedDoc.body().child(1).tagName());
        assertEquals("Some text", cleanedDoc.body().child(2).outerHtml());
    }

    @Test
    public void testCleanWithAllTagsAllowed() {
        // Need to manually construct the set of tags from Whitelist.basic() as .get() is not available
        Set<String> basicTags = new HashSet<>();
        basicTags.add("a"); basicTags.add("b"); basicTags.add("blockquote"); basicTags.add("br");
        basicTags.add("cite"); basicTags.add("code"); basicTags.add("dd"); basicTags.add("dl");
        basicTags.add("dt"); basicTags.add("em"); basicTags.add("i"); basicTags.add("li");
        basicTags.add("ol"); basicTags.add("p"); basicTags.add("pre"); basicTags.add("q");
        basicTags.add("small"); basicTags.add("strike"); basicTags.add("strong");
        basicTags.add("sub"); basicTags.add("sup"); basicTags.add("u"); basicTags.add("ul");

        Whitelist whitelist = new Whitelist();
        whitelist.addTags(basicTags.toArray(new String[0]));
        whitelist.addTags("script", "div", "span"); // Add custom tags
        whitelist.addAttributes("a", "href");
        whitelist.addAttributes("img", "src");


        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("p"), ""));
        body.appendChild(new Element(Tag.valueOf("script"), ""));
        body.appendChild(new Element(Tag.valueOf("div"), ""));
        body.appendChild(new Element(Tag.valueOf("span"), ""));
        body.appendChild(new Element(Tag.valueOf("img"), "").attr("src", "http://example.com"));
        body.appendChild(new Element(Tag.valueOf("a"), "").attr("href", "http://example.com"));


        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(6, cleanedDoc.body().children().size());
        assertEquals("p", cleanedDoc.body().child(0).tagName());
        assertEquals("script", cleanedDoc.body().child(1).tagName());
        assertEquals("div", cleanedDoc.body().child(2).tagName());
        assertEquals("span", cleanedDoc.body().child(3).tagName());
        assertEquals("img", cleanedDoc.body().child(4).tagName());
        assertEquals("a", cleanedDoc.body().child(5).tagName());
    }

    @Test
    public void testCleanWithEnforcedAttributes() {
        Whitelist whitelist = Whitelist.basic().addEnforcedAttribute("a", "rel", "nofollow");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("a"), "").attr("href", "http://example.com"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        Element anchor = cleanedDoc.body().child(0);
        assertEquals("nofollow", anchor.attr("rel"));
    }

    @Test
    public void testCleanWithRelativeLinksPreserved() {
        Whitelist whitelist = Whitelist.basic().preserveRelativeLinks(true).addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("http://example.com");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("a"), "").attr("href", "/path/to/page"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        Element anchor = cleanedDoc.body().child(0);
        assertEquals("/path/to/page", anchor.attr("href"));
    }

    @Test
    public void testCleanWithRelativeLinksNotPreserved() {
        Whitelist whitelist = Whitelist.basic().preserveRelativeLinks(false).addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("http://example.com");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("a"), "").attr("href", "/path/to/page"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        Element anchor = cleanedDoc.body().child(0);
        assertEquals("http://example.com/path/to/page", anchor.attr("href"));
    }

    @Test
    public void testIsValidWithValidDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("");
        dirtyDoc.body().appendChild(new Element(Tag.valueOf("p"), ""));
        assertTrue(cleaner.isValid(dirtyDoc));
    }

    @Test
    public void testIsValidWithInvalidDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("");
        dirtyDoc.body().appendChild(new Element(Tag.valueOf("script"), ""));
        assertFalse(cleaner.isValid(dirtyDoc));
    }

    @Test
    public void testIsValidWithEmptyDocument() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("");
        assertTrue(cleaner.isValid(dirtyDoc));
    }

    @Test
    public void testIsValidWithDocumentWithOnlyText() {
        Cleaner cleaner = new Cleaner(Whitelist.basic());
        Document dirtyDoc = Document.createShell("");
        dirtyDoc.body().appendChild(new TextNode("Some text", ""));
        assertTrue(cleaner.isValid(dirtyDoc));
    }

    @Test
    public void testCleanWithImgTagAndSafeProtocol() {
        Whitelist whitelist = Whitelist.basicWithImages().addProtocols("img", "src", "http", "https");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("img"), "").attr("src", "http://example.com/image.png"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(1, cleanedDoc.body().children().size());
        assertEquals("img", cleanedDoc.body().child(0).tagName());
        assertEquals("http://example.com/image.png", cleanedDoc.body().child(0).attr("src"));
    }

    @Test
    public void testCleanWithImgTagAndUnsafeProtocol() {
        Whitelist whitelist = Whitelist.basicWithImages().addProtocols("img", "src", "http", "https");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("img"), "").attr("src", "ftp://example.com/image.png"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(0, cleanedDoc.body().children().size());
    }

    @Test
    public void testCleanWithCustomAttributes() {
        Whitelist whitelist = Whitelist.basic().addAttributes("p", "id", "class").addAttributes("a", "href", "target");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("p"), "").attr("id", "my-para").attr("style", "color: red;"));
        body.appendChild(new Element(Tag.valueOf("a"), "").attr("href", "http://example.com").attr("target", "_blank").attr("data-custom", "ignore"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        Element p = cleanedDoc.body().child(0);
        assertEquals("my-para", p.attr("id"));
        assertFalse(p.hasAttr("style"));

        Element a = cleanedDoc.body().child(1);
        assertEquals("http://example.com", a.attr("href"));
        assertEquals("_blank", a.attr("target"));
        assertFalse(a.hasAttr("data-custom"));
    }

    @Test
    public void testCleanWithNestedSafeTags() {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendChild(new Element(Tag.valueOf("strong"), "").appendChild(new TextNode("Bold text", "")));
        body.appendChild(p);

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(1, cleanedDoc.body().children().size());
        Element cleanedP = cleanedDoc.body().child(0);
        assertEquals("p", cleanedP.tagName());
        assertEquals(1, cleanedP.children().size());
        Element cleanedStrong = cleanedP.child(0);
        assertEquals("strong", cleanedStrong.tagName());
        assertEquals(1, cleanedStrong.children().size());
        assertEquals("Bold text", cleanedStrong.child(0).outerHtml());
    }

    @Test
    public void testCleanWithNestedUnsafeTags() {
        Whitelist whitelist = Whitelist.simpleText(); // Allows strong, em, b, u, i
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        Element p = new Element(Tag.valueOf("p"), "");
        p.appendChild(new Element(Tag.valueOf("script"), "").appendChild(new TextNode("alert('xss')", "")));
        body.appendChild(p);

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(1, cleanedDoc.body().children().size());
        Element cleanedP = cleanedDoc.body().child(0);
        assertEquals("p", cleanedP.tagName());
        assertEquals(0, cleanedP.children().size()); // Script tag should be removed
    }

    @Test
    public void testCleanWithMixedContent() {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("p"), "").appendChild(new TextNode("Start ", "")).appendChild(new Element(Tag.valueOf("b"), "").appendChild(new TextNode("bold", ""))).appendChild(new TextNode(" end", "")));
        body.appendChild(new Element(Tag.valueOf("div"), "").appendChild(new TextNode("should be removed", "")));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals(1, cleanedDoc.body().children().size());
        Element cleanedP = cleanedDoc.body().child(0);
        assertEquals("p", cleanedP.tagName());
        assertEquals("Start bold end", cleanedP.text());
        assertEquals(3, cleanedP.childNodes().size());
        assertEquals("Start ", cleanedP.childNode(0).outerHtml());
        assertEquals("b", cleanedP.childNode(1).outerHtml().substring(0, 1)); // Simplified check for tag name start
        assertEquals(" end", cleanedP.childNode(2).outerHtml());
    }

    @Test
    public void testCleanWithNullWhitelist() {
        try {
            new Cleaner(null);
            fail("Expected NullPointerException for null whitelist.");
        } catch (NullPointerException e) {
            // Expected
        } catch (Exception e) {
            fail("Caught unexpected exception: " + e.getMessage());
        }
    }

    @Test
    public void testIsValidWithComplexHtml() {
        Whitelist whitelist = Whitelist.basic();
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.html("<div><p>Hello <b>world</b>!</p><script>alert('hi')</script></div>");
        assertFalse(cleaner.isValid(dirtyDoc));
    }

    @Test
    public void testCleanWithMaxAttributes() {
        Whitelist whitelist = Whitelist.basic().addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        Element a = new Element(Tag.valueOf("a"), "");
        a.attr("href", "http://example.com");
        // Add more attributes than allowed, should be stripped
        for (int i = 0; i < 50; i++) { // Assuming a reasonable limit, checking for side effects
            a.attr("data-attr-" + i, "value-" + i);
        }
        body.appendChild(a);

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        Element cleanedA = cleanedDoc.body().child(0);
        assertEquals("http://example.com", cleanedA.attr("href"));
        // Check that only the allowed attribute is present
        assertEquals(1, cleanedA.attributes().size());
    }
    
    @Test
    public void testCleanWithNoTagsAllowed() {
        Cleaner cleaner = new Cleaner(Whitelist.none());
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.html("<p>Some text</p><b>Bold</b>");
        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals("", cleanedDoc.body().html());
        assertEquals(0, cleanedDoc.body().children().size());
    }

    @Test
    public void testCleanWithOnlyTextAllowed() {
        Cleaner cleaner = new Cleaner(Whitelist.simpleText());
        Document dirtyDoc = Document.createShell("");
        Element body = dirtyDoc.body();
        body.html("This is text. <p>Paragraph</p> <strong>Strong</strong>");
        Document cleanedDoc = cleaner.clean(dirtyDoc);
        assertEquals("This is text. Paragraph Strong", cleanedDoc.body().text());
        assertEquals(0, cleanedDoc.body().children().size()); // P and strong should be stripped
    }
    
    @Test
    public void testCleanWithBaseUriInElement() {
        Whitelist whitelist = Whitelist.basic().addAttributes("a", "href");
        Cleaner cleaner = new Cleaner(whitelist);
        Document dirtyDoc = Document.createShell("http://example.com/path/");
        Element body = dirtyDoc.body();
        body.appendChild(new Element(Tag.valueOf("a"), "").attr("href", "page.html"));

        Document cleanedDoc = cleaner.clean(dirtyDoc);
        Element anchor = cleanedDoc.body().child(0);
        assertEquals("http://example.com/path/page.html", anchor.attr("href"));
    }
}
