package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.select.Evaluator;
import org.jsoup.select.QueryParser;
import org.jsoup.parser.Tag;
import java.io.IOException;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.helper.StringUtil;
import org.jsoup.parser.TokenQueue;
import java.util.ArrayList;
// Removed incorrect imports for non-public classes
// import org.jsoup.select.CombiningEvaluator;
// import org.jsoup.select.StructuralEvaluator;
import org.jsoup.select.Elements; // Added import for Elements used in some evaluators


public class PseudoTextElementTest {
    @Test
    public void testConstructor() throws Exception {
        Tag tag = Tag.valueOf("div");
        String baseUri = "http://example.com";
        Attributes attributes = new Attributes();
        attributes.put("id", "testId");
        PseudoTextElement pse = new PseudoTextElement(tag, baseUri, attributes);
        assertNotNull(pse);
        assertEquals("div", pse.tagName());
        assertEquals(baseUri, pse.baseUri());
        assertEquals("testId", pse.id());
    }

    @Test
    public void testOuterHtmlHeadDoesNothing() throws Exception {
        Tag tag = Tag.valueOf("div");
        String baseUri = "http://example.com";
        Attributes attributes = new Attributes();
        PseudoTextElement pse = new PseudoTextElement(tag, baseUri, attributes);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        pse.outerHtmlHead(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void testOuterHtmlTailDoesNothing() throws Exception {
        Tag tag = Tag.valueOf("div");
        String baseUri = "http://example.com";
        Attributes attributes = new Attributes();
        PseudoTextElement pse = new PseudoTextElement(tag, baseUri, attributes);
        StringBuilder accum = new StringBuilder();
        Document.OutputSettings out = new Document.OutputSettings();
        pse.outerHtmlTail(accum, 0, out);
        assertEquals("", accum.toString());
    }

    @Test
    public void testIsRootMatchesDocumentRoot() throws Exception {
        Document doc = Document.createShell("http://example.com");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("body"), "http://example.com", new Attributes());
        doc.appendChild(pse);
        Evaluator evaluator = QueryParser.parse(":root");
        assertTrue(evaluator.matches(doc, pse));
    }

    @Test
    public void testIsRootDoesNotMatchNonRoot() throws Exception {
        Document doc = Document.createShell("http://example.com");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", new Attributes());
        doc.body().appendChild(pse);
        Evaluator evaluator = QueryParser.parse(":root");
        assertFalse(evaluator.matches(doc, pse));
    }

    @Test
    public void testTagEvaluatorMatchesCorrectTag() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("p"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.Tag("p");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testTagEvaluatorDoesNotMatchIncorrectTag() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("p"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.Tag("div");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testTagEvaluatorIsCaseInsensitive() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("P"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.Tag("p");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testTagEndsWithEvaluatorMatches() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.TagEndsWith("div");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testTagEndsWithEvaluatorDoesNotMatch() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("span"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.TagEndsWith("div");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testIdEvaluatorMatchesCorrectId() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("id", "myId");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.Id("myId");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testIdEvaluatorDoesNotMatchIncorrectId() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("id", "myId");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.Id("otherId");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testClassEvaluatorMatchesCorrectClass() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("class", "myClass");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.Class("myClass");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testClassEvaluatorDoesNotMatchIncorrectClass() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("class", "myClass");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.Class("otherClass");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeEvaluatorMatchesExistingAttribute() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.Attribute("data-key");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeEvaluatorDoesNotMatchMissingAttribute() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.Attribute("data-key");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeStartingEvaluatorMatches() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeStarting("data-");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeStartingEvaluatorDoesNotMatch() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeStarting("other-");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueMatchesExactValue() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "specific value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValue("data-key", "specific value");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueIsCaseInsensitive() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "Specific Value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValue("data-key", "specific value");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueDoesNotMatchDifferentValue() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "different value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValue("data-key", "specific value");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueNotMatchesDifferentValue() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "different value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueNot("data-key", "specific value");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueNotDoesNotMatchSameValue() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "specific value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueNot("data-key", "specific value");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueStartingMatchesPrefix() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "prefix-value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueStarting("data-key", "prefix-");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueStartingDoesNotMatchDifferentPrefix() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "other-value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueStarting("data-key", "prefix-");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueEndingMatchesSuffix() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value-suffix");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueEnding("data-key", "-suffix");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueEndingDoesNotMatchDifferentSuffix() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "value-othersuffix");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueEnding("data-key", "-suffix");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueContainingMatchesSubstring() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "some-middle-value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueContaining("data-key", "-middle-");
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueContainingDoesNotMatchDifferentSubstring() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "some-other-value");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Evaluator evaluator = new Evaluator.AttributeWithValueContaining("data-key", "-middle-");
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueMatchingMatchesRegex() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "abc123xyz");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Pattern pattern = Pattern.compile("^[a-z]+\\d+[a-z]+$");
        Evaluator evaluator = new Evaluator.AttributeWithValueMatching("data-key", pattern);
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testAttributeWithValueMatchingDoesNotMatchRegex() throws Exception {
        Attributes attributes = new Attributes();
        attributes.put("data-key", "abcxyz");
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", attributes);
        Pattern pattern = Pattern.compile("^[a-z]+\\d+[a-z]+$");
        Evaluator evaluator = new Evaluator.AttributeWithValueMatching("data-key", pattern);
        assertFalse(evaluator.matches(null, pse));
    }

    @Test
    public void testAllElementsEvaluatorAlwaysMatches() throws Exception {
        PseudoTextElement pse = new PseudoTextElement(Tag.valueOf("div"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.AllElements();
        assertTrue(evaluator.matches(null, pse));
    }

    @Test
    public void testIndexLessThanEvaluatorMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IndexLessThan(2);
        assertTrue(evaluator.matches(doc.body(), div1));
        assertTrue(evaluator.matches(doc.body(), div2));
        assertFalse(evaluator.matches(doc.body(), div3));
    }

    @Test
    public void testIndexGreaterThanEvaluatorMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IndexGreaterThan(0);
        assertFalse(evaluator.matches(doc.body(), div1));
        assertTrue(evaluator.matches(doc.body(), div2));
        assertTrue(evaluator.matches(doc.body(), div3));
    }

    @Test
    public void testIndexEqualsEvaluatorMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IndexEquals(1);
        assertFalse(evaluator.matches(doc.body(), div1));
        assertTrue(evaluator.matches(doc.body(), div2));
        assertFalse(evaluator.matches(doc.body(), div3));
    }

    @Test
    public void testIsLastChildMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);

        Evaluator evaluator = new Evaluator.IsLastChild();
        assertFalse(evaluator.matches(doc.body(), div1));
        assertTrue(evaluator.matches(doc.body(), div2));
    }

    @Test
    public void testIsFirstOfTypeMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element span1 = doc.createElement("span");
        Element div2 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(span1);
        doc.body().appendChild(div2);

        Evaluator evaluator = new Evaluator.IsFirstOfType();
        assertTrue(evaluator.matches(doc.body(), div1));
        assertFalse(evaluator.matches(doc.body(), span1));
        assertFalse(evaluator.matches(doc.body(), div2));
    }

    @Test
    public void testIsLastOfTypeMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element span1 = doc.createElement("span");
        Element div2 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(span1);
        doc.body().appendChild(div2);

        Evaluator evaluator = new Evaluator.IsLastOfType();
        assertFalse(evaluator.matches(doc.body(), div1));
        assertFalse(evaluator.matches(doc.body(), span1));
        assertTrue(evaluator.matches(doc.body(), div2));
    }

    @Test
    public void testIsNthChildMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IsNthChild(1, 2); // 2n+1 (1-based index)
        assertTrue(evaluator.matches(doc.body(), div1)); // index 0, position 1
        assertFalse(evaluator.matches(doc.body(), div2)); // index 1, position 2
        assertTrue(evaluator.matches(doc.body(), div3)); // index 2, position 3
    }

    @Test
    public void testIsNthLastChildMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IsNthLastChild(1, 1); // 1n+1 (from end)
        assertTrue(evaluator.matches(doc.body(), div3)); // index 2, position 1 from end
        assertFalse(evaluator.matches(doc.body(), div2)); // index 1, position 2 from end
        assertTrue(evaluator.matches(doc.body(), div1)); // index 0, position 3 from end
    }

    @Test
    public void testIsNthOfTypeMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element span1 = doc.createElement("span");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(span1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IsNthOfType(1, 2); // 2n+1 (1-based index of type div)
        assertTrue(evaluator.matches(doc.body(), div1)); // 1st div
        assertFalse(evaluator.matches(doc.body(), span1)); // not a div
        assertFalse(evaluator.matches(doc.body(), div2)); // 2nd div
        assertTrue(evaluator.matches(doc.body(), div3)); // 3rd div
    }

    @Test
    public void testIsNthLastOfTypeMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element span1 = doc.createElement("span");
        Element div2 = doc.createElement("div");
        Element div3 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(span1);
        doc.body().appendChild(div2);
        doc.body().appendChild(div3);

        Evaluator evaluator = new Evaluator.IsNthLastOfType(1, 1); // 1n+1 (from end of type div)
        assertTrue(evaluator.matches(doc.body(), div3)); // 1st div from end
        assertFalse(evaluator.matches(doc.body(), div2)); // 2nd div from end
        assertTrue(evaluator.matches(doc.body(), div1)); // 3rd div from end
    }

    @Test
    public void testIsFirstChildMatches() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);

        Evaluator evaluator = new Evaluator.IsFirstChild();
        assertTrue(evaluator.matches(doc.body(), div1));
        assertFalse(evaluator.matches(doc.body(), div2));
    }

    @Test
    public void testIsOnlyChildMatchesWhenOnlyChild() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        doc.body().appendChild(div1);

        Evaluator evaluator = new Evaluator.IsOnlyChild();
        assertTrue(evaluator.matches(doc.body(), div1));
    }

    @Test
    public void testIsOnlyChildDoesNotMatchWhenNotOnlyChild() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element div2 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(div2);

        Evaluator evaluator = new Evaluator.IsOnlyChild();
        assertFalse(evaluator.matches(doc.body(), div1));
        assertFalse(evaluator.matches(doc.body(), div2));
    }

    @Test
    public void testIsOnlyOfTypeMatchesWhenOnlyOfType() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        doc.body().appendChild(div1);

        Evaluator evaluator = new Evaluator.IsOnlyOfType();
        assertTrue(evaluator.matches(doc.body(), div1));
    }

    @Test
    public void testIsOnlyOfTypeDoesNotMatchWhenNotOnlyOfType() throws Exception {
        Document doc = Document.createShell("http://example.com");
        Element div1 = doc.createElement("div");
        Element span1 = doc.createElement("span");
        Element div2 = doc.createElement("div");
        doc.body().appendChild(div1);
        doc.body().appendChild(span1);
        doc.body().appendChild(div2);

        Evaluator evaluator = new Evaluator.IsOnlyOfType();
        assertFalse(evaluator.matches(doc.body(), div1));
        assertFalse(evaluator.matches(doc.body(), span1));
        assertFalse(evaluator.matches(doc.body(), div2));
    }

    @Test
    public void testIsEmptyMatchesWhenEmpty() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        Evaluator evaluator = new Evaluator.IsEmpty();
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testIsEmptyDoesNotMatchWhenNotEmpty() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("some text");
        Evaluator evaluator = new Evaluator.IsEmpty();
        assertFalse(evaluator.matches(null, element));
    }

    @Test
    public void testIsEmptyMatchesWhenOnlyComment() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendChild(new Comment("comment"));
        Evaluator evaluator = new Evaluator.IsEmpty();
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsTextMatches() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("This is some text.");
        Evaluator evaluator = new Evaluator.ContainsText("some text");
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsTextIsCaseInsensitive() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("This is Some Text.");
        Evaluator evaluator = new Evaluator.ContainsText("some text");
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsTextDoesNotMatch() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("This is some text.");
        Evaluator evaluator = new Evaluator.ContainsText("nonexistent");
        assertFalse(evaluator.matches(null, element));
    }

    @Test
    public void testContainsDataMatches() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendChild(new DataNode("some data content")); // Assuming DataNode exists and is importable
        Evaluator evaluator = new Evaluator.ContainsData("data content");
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsDataIsCaseInsensitive() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendChild(new DataNode("Some Data Content")); // Assuming DataNode exists and is importable
        Evaluator evaluator = new Evaluator.ContainsData("data content");
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsDataDoesNotMatch() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendChild(new DataNode("some data content")); // Assuming DataNode exists and is importable
        Evaluator evaluator = new Evaluator.ContainsData("nonexistent");
        assertFalse(evaluator.matches(null, element));
    }

    @Test
    public void testContainsOwnTextMatches() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        Element child = new Element(Tag.valueOf("span"), "http://example.com", new Attributes());
        child.appendText("child text");
        element.appendChild(child);
        element.appendText("own text");

        Evaluator evaluator = new Evaluator.ContainsOwnText("own text");
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsOwnTextIsCaseInsensitive() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("Own Text");
        Evaluator evaluator = new Evaluator.ContainsOwnText("own text");
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testContainsOwnTextDoesNotMatchChildText() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        Element child = new Element(Tag.valueOf("span"), "http://example.com", new Attributes());
        child.appendText("child text");
        element.appendChild(child);
        element.appendText("own text");

        Evaluator evaluator = new Evaluator.ContainsOwnText("child text");
        assertFalse(evaluator.matches(null, element));
    }

    @Test
    public void testMatchesMatchesRegex() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("abc123xyz");
        Pattern pattern = Pattern.compile("^[a-z]+\\d+[a-z]+$");
        Evaluator evaluator = new Evaluator.Matches(pattern);
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testMatchesDoesNotMatchRegex() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("abcxyz");
        Pattern pattern = Pattern.compile("^[a-z]+\\d+[a-z]+$");
        Evaluator evaluator = new Evaluator.Matches(pattern);
        assertFalse(evaluator.matches(null, element));
    }

    @Test
    public void testMatchesOwnMatchesRegex() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("own123text");
        Pattern pattern = Pattern.compile("^own\\d+text$");
        Evaluator evaluator = new Evaluator.MatchesOwn(pattern);
        assertTrue(evaluator.matches(null, element));
    }

    @Test
    public void testMatchesOwnDoesNotMatchRegex() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        element.appendText("childtext");
        Pattern pattern = Pattern.compile("^own\\d+text$");
        Evaluator evaluator = new Evaluator.MatchesOwn(pattern);
        assertFalse(evaluator.matches(null, element));
    }

    @Test
    public void testMatchTextConvertsTextNodeToPseudoTextElement() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        TextNode tn = new TextNode("some text");
        element.appendChild(tn);

        Evaluator evaluator = new Evaluator.MatchText();
        assertFalse(evaluator.matches(null, element)); // It returns false by design
        // Check if the child is now a PseudoTextElement
        assertTrue(element.childNode(0) instanceof PseudoTextElement);
        assertEquals("some text", ((TextNode) element.childNode(0).childNode(0)).text());
    }

    @Test
    public void testMatchTextDoesNotConvertPseudoTextElement() throws Exception {
        Element element = new Element(Tag.valueOf("div"), "http://example.com", new Attributes());
        PseudoTextElement pseChild = new PseudoTextElement(Tag.valueOf("span"), "http://example.com", new Attributes());
        pseChild.appendChild(new TextNode("inner text"));
        element.appendChild(pseChild);

        int initialChildCount = element.childNodeSize();
        Evaluator evaluator = new Evaluator.MatchText();
        assertFalse(evaluator.matches(null, element)); // Should return false
        assertEquals(initialChildCount, element.childNodeSize()); // Ensure no change
        assertTrue(element.childNode(0) instanceof PseudoTextElement); // Ensure it's still a PSE
    }
}
