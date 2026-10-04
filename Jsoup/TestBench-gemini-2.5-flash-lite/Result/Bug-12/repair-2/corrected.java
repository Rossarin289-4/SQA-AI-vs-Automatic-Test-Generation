package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Tag; // Import Tag
import org.jsoup.parser.TokenQueue;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.List; // Import List

public class SelectorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Helper method to create a simple root element for testing
    private Element createRootElement() {
        Element root = new Element(Tag.valueOf("body"), "");
        Element div = new Element(Tag.valueOf("div"), "");
        div.attr("id", "main");
        div.addClass("content");
        Element p1 = new Element(Tag.valueOf("p"), "");
        p1.appendText("Hello");
        Element p2 = new Element(Tag.valueOf("p"), "");
        p2.addClass("nested");
        p2.appendText("World");

        div.appendChild(p1);
        div.appendChild(p2);
        root.appendChild(div);

        Element header = new Element(Tag.valueOf("header"), "");
        header.appendChild(new Element(Tag.valueOf("h1"), "").appendText("Title"));
        Element footer = new Element(Tag.valueOf("footer"), "");
        footer.appendChild(new Element(Tag.valueOf("p"), "").appendText("Copyright"));
        root.appendChild(header);
        root.appendChild(footer);

        Element section1 = new Element(Tag.valueOf("section"), "");
        section1.appendChild(new Element(Tag.valueOf("h2"), "").appendText("Section 1"));
        section1.appendChild(new Element(Tag.valueOf("p"), "").appendText("Para 1.1"));
        section1.appendChild(new Element(Tag.valueOf("p"), "").appendText("Para 1.2"));

        Element section2 = new Element(Tag.valueOf("section"), "");
        section2.appendChild(new Element(Tag.valueOf("h2"), "").appendText("Section 2"));
        section2.appendChild(new Element(Tag.valueOf("p"), "").appendText("Para 2.1"));
        section2.appendChild(new Element(Tag.valueOf("p"), "").appendText("Para 2.2"));

        root.appendChild(section1);
        root.appendChild(section2);

        Element datasetDiv = new Element(Tag.valueOf("div"), "");
        datasetDiv.attr("data-id", "123");
        datasetDiv.attr("data-type", "user");
        root.appendChild(datasetDiv);

        Element attrElement = new Element(Tag.valueOf("a"), "");
        attrElement.attr("href", "http://example.com/page");
        attrElement.attr("title", "A link");
        root.appendChild(attrElement);

        Element regexAttrElement = new Element(Tag.valueOf("img"), "");
        regexAttrElement.attr("src", "/images/photo.jpg");
        root.appendChild(regexAttrElement);

        return root;
    }

    @Test
    public void testUniversalSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("*", root);
        assertEquals(11, selected.size());
    }

    @Test
    public void testTagSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("p", root);
        assertEquals(5, selected.size());
    }

    @Test
    public void testIdSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("#main", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testClassSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select(".content", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorExists() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[title]", root);
        assertEquals(1, selected.size());
        assertEquals("a", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueEquals() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("p[class=nested]", root);
        assertEquals(1, selected.size());
        assertEquals("p", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueStartsWith() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("a[href^=http:]", root);
        assertEquals(1, selected.size());
        assertEquals("a", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueEndsWith() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("img[src$=.jpg]", root);
        assertEquals(1, selected.size());
        assertEquals("img", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueContaining() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("a[href*=example]", root);
        assertEquals(1, selected.size());
        assertEquals("a", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueMatchingRegex() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("img[src~=(?i)\\.(png|jpe?g)]", root);
        assertEquals(1, selected.size());
        assertEquals("img", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorStartsWithPrefix() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[^data-id]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testCombinatorDescendant() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("body div p", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testCombinatorDirectChild() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("div > p", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testCombinatorAdjacentSibling() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("h2 + p", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testCombinatorGeneralSibling() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("h2 ~ p", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testCombinatorGroupOr() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("h1, h2, h3", root);
        assertEquals(3, selected.size());
    }

    @Test
    public void testPseudoSelectorLessThan() throws Exception {
        Element parent = new Element(Tag.valueOf("parent"), "");
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("1"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("2"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("3"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("4"));
        Elements selected = Selector.select("child:lt(2)", parent);
        assertEquals(2, selected.size());
        assertEquals("1", selected.get(0).text());
        assertEquals("2", selected.get(1).text());
    }

    @Test
    public void testPseudoSelectorGreaterThan() throws Exception {
        Element parent = new Element(Tag.valueOf("parent"), "");
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("1"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("2"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("3"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("4"));
        Elements selected = Selector.select("child:gt(1)", parent);
        assertEquals(2, selected.size());
        assertEquals("3", selected.get(0).text());
        assertEquals("4", selected.get(1).text());
    }

    @Test
    public void testPseudoSelectorEquals() throws Exception {
        Element parent = new Element(Tag.valueOf("parent"), "");
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("1"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("2"));
        Elements selected = Selector.select("child:eq(1)", parent);
        assertEquals(1, selected.size());
        assertEquals("2", selected.get(0).text());
    }

    @Test
    public void testPseudoSelectorHas() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("div:has(p.nested)", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testPseudoSelectorNot() throws Exception {
        Element parent = new Element(Tag.valueOf("parent"), "");
        parent.appendChild(new Element(Tag.valueOf("child"), "").addClass("a"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").addClass("b"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").addClass("a"));
        Elements selected = Selector.select("child:not(.a)", parent);
        assertEquals(1, selected.size());
        assertEquals("b", selected.get(0).text());
    }

    @Test
    public void testPseudoSelectorContainsText() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("p:contains(Hello)", root);
        assertEquals(1, selected.size());
        assertEquals("Hello", selected.first().text());
    }

    @Test
    public void testPseudoSelectorContainsOwnText() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("p:containsOwn(Hello)", root);
        assertEquals(1, selected.size());
        assertEquals("Hello", selected.first().text());
    }

    @Test
    public void testPseudoSelectorMatchesRegex() throws Exception {
        Element parent = new Element(Tag.valueOf("parent"), "");
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("123"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("abc"));
        Elements selected = Selector.select("child:matches(\\d+)", parent);
        assertEquals(1, selected.size());
        assertEquals("123", selected.get(0).text());
    }

    @Test
    public void testPseudoSelectorMatchesOwnRegex() throws Exception {
        Element parent = new Element(Tag.valueOf("parent"), "");
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("123"));
        parent.appendChild(new Element(Tag.valueOf("child"), "").appendText("abc"));
        Elements selected = Selector.select("child:matchesOwn(\\d+)", parent);
        assertEquals(1, selected.size());
        assertEquals("123", selected.get(0).text());
    }

    @Test
    public void testCombinedSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("div.content p", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testSelectorWithMultipleAttributes() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("div[id=main][class=content]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testAttributeSelectorCaseInsensitive() throws Exception {
        Element root = createRootElement();
        Element caseDiv = new Element(Tag.valueOf("div"), "");
        caseDiv.attr("CLASS", "Content");
        root.appendChild(caseDiv);
        Elements selected = Selector.select("div[class=content]", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testAttributeSelectorRegexCaseInsensitive() throws Exception {
        Element root = createRootElement();
        Element regexImg = new Element(Tag.valueOf("img"), "");
        regexImg.attr("src", "/images/photo.JPG");
        root.appendChild(regexImg);
        Elements selected = Selector.select("img[src~=(?i)\\.(png|jpe?g)]", root);
        assertEquals(2, selected.size());
    }

    @Test
    public void testNamespaceSelector() throws Exception {
        Element root = createRootElement();
        Element nsElement = new Element(Tag.valueOf("fb|name"), "");
        root.appendChild(nsElement);
        Elements selected = Selector.select("fb|name", root);
        assertEquals(1, selected.size());
        assertEquals("fb:name", selected.first().tagName());
    }

    @Test
    public void testEmptyQuery() throws Exception {
        Element root = createRootElement();
        try {
            Selector.select("", root);
            fail("Expected exception for empty query");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testWhitespaceQuery() throws Exception {
        Element root = createRootElement();
        try {
            Selector.select("   ", root);
            fail("Expected exception for whitespace only query");
        } catch (IllegalArgumentException e) {
        }
    }

    @Test
    public void testQueryStartingWithCombinator() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("> div", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testComplexSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("body > section > h2 ~ p", root);
        assertEquals(4, selected.size());
    }

    @Test
    public void testDatasetAttributeSelector() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[data-id=123]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testDatasetAttributeSelectorStartsWith() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[data-type^=user]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testDatasetAttributeSelectorEndsWith() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[data-id$=23]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testDatasetAttributeSelectorContaining() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[data-id*=1]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testDatasetAttributeSelectorRegex() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[data-id~=(?i)^[0-9]+$]", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testAttributeNotEquals() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("div[id!=main]", root);
        assertEquals(0, selected.size());
    }

    @Test
    public void testTagWithNamespace() throws Exception {
        Element root = createRootElement();
        Element nsElement = new Element(Tag.valueOf("ns|tag"), "");
        root.appendChild(nsElement);
        Elements selected = Selector.select("ns|tag", root);
        assertEquals(1, selected.size());
        assertEquals("ns:tag", selected.first().tagName());
    }

    @Test
    public void testAllElementsAttribute() throws Exception {
        Element root = createRootElement();
        Elements selected = Selector.select("[^data-]", root); // Any attribute starting with data-
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testElementWithMultipleClasses() throws Exception {
        Element root = createRootElement();
        Element multiClassDiv = new Element(Tag.valueOf("div"), "");
        multiClassDiv.attr("class", "class1 class2 class3");
        root.appendChild(multiClassDiv);
        Elements selected = Selector.select("div.class1.class2", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }

    @Test
    public void testElementWithWhitespaceInClass() throws Exception {
        Element root = createRootElement();
        Element whitespaceDiv = new Element(Tag.valueOf("div"), "");
        whitespaceDiv.attr("class", " class1   class2 ");
        root.appendChild(whitespaceDiv);
        Elements selected = Selector.select("div.class1", root);
        assertEquals(1, selected.size());
        assertEquals("div", selected.first().tagName());
    }
}
