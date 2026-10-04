package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Tag; // Added import
import org.jsoup.parser.TokenQueue;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Map; // Added import

public class SelectorTest {
    // test methods (as many as the instructions ask for), each exactly in this form:
    //     @Test
    //     public void testWhatItChecks() throws Exception { ... }

    // Mocking a DOM structure for tests to interact with.
    private Element createMockDOM() {
        // A simple DOM: <body> <div id="main"> <p class="content">Text</p> <p>More text</p> </div> <div id="footer"></div> </body>
        Tag bodyTag = Tag.valueOf("body");
        Element body = new Element(bodyTag, "");
        
        Tag divTag = Tag.valueOf("div");
        Element divMain = new Element(divTag, "").attr("id", "main");
        
        Tag pTag = Tag.valueOf("p");
        Element pContent = new Element(pTag, "").addClass("content").appendText("Text");
        Element pMore = new Element(pTag, "").appendText("More text");
        Element divFooter = new Element(divTag, "").attr("id", "footer");

        divMain.appendChild(pContent);
        divMain.appendChild(pMore);
        body.appendChild(divMain);
        body.appendChild(divFooter);
        return body;
    }

    @Test
    public void testUniversalSelector() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("*", root);
        assertEquals(5, result.size()); // body, div#main, p.content, p, div#footer
    }

    @Test
    public void testTagSelector() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("p", root);
        assertEquals(2, result.size()); // p.content, p
    }

    @Test
    public void testIdSelector() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("#main", root);
        assertEquals(1, result.size());
        assertEquals("div", result.first().tagName());
    }

    @Test
    public void testClassSelector() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select(".content", root);
        assertEquals(1, result.size());
        assertEquals("p", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorExists() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("[id]", root);
        assertEquals(2, result.size()); // div#main, div#footer
    }

    @Test
    public void testAttributeSelectorValueEquals() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("div[id=main]", root);
        assertEquals(1, result.size());
        assertEquals("div", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueNotEquals() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("div[id!=main]", root);
        assertEquals(1, result.size()); // div#footer
        assertEquals("div", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueStartsWith() throws Exception {
        Element root = createMockDOM();
        root.attr("data-test", "abc"); // Using a valid attribute setter
        Elements result = Selector.select("[data-test^=a]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueEndsWith() throws Exception {
        Element root = createMockDOM();
        root.attr("data-test", "abc"); // Using a valid attribute setter
        Elements result = Selector.select("[data-test$=c]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueContains() throws Exception {
        Element root = createMockDOM();
        root.attr("data-test", "abcdef"); // Using a valid attribute setter
        Elements result = Selector.select("[data-test*=bcd]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorValueRegex() throws Exception {
        Element root = createMockDOM();
        root.attr("data-test", "abcdef"); // Using a valid attribute setter
        Elements result = Selector.select("[data-test~=(?i)BCD]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testDescendantSelector() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("div p", root);
        assertEquals(2, result.size()); // p.content, p within div#main
    }

    @Test
    public void testChildSelector() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("div > p", root);
        assertEquals(2, result.size()); // p.content, p within div#main
    }

    @Test
    public void testAdjacentSiblingSelector() throws Exception {
        Element root = createMockDOM();
        // Add another <p> element to test '+'
        Tag pTag = Tag.valueOf("p");
        Element pAfterMore = new Element(pTag, "").appendText("Even more text");
        root.getElementById("main").appendChild(pAfterMore);

        Elements result = Selector.select("p + p", root);
        assertEquals(1, result.size()); // p (More text) is adjacent to p.content
        assertEquals("More text", result.first().ownText());
    }

    @Test
    public void testGeneralSiblingSelector() throws Exception {
        Element root = createMockDOM();
        // Add another <p> element to test '~'
        Tag pTag = Tag.valueOf("p");
        Element pAfterMore = new Element(pTag, "").appendText("Even more text");
        root.getElementById("main").appendChild(pAfterMore);

        Elements result = Selector.select("p ~ p", root);
        assertEquals(2, result.size()); // p (More text) and p (Even more text) are general siblings to p.content
    }

    @Test
    public void testMultiSelectorOr() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("p, div#footer", root);
        assertEquals(3, result.size()); // p.content, p, div#footer
    }

    @Test
    public void testPseudoSelectorLessThan() throws Exception {
        Element root = createMockDOM();
        // Need a structure with multiple siblings
        Tag ulTag = Tag.valueOf("ul");
        Tag liTag = Tag.valueOf("li");
        Element list = new Element(ulTag, "");
        list.appendChild(new Element(liTag, "")).appendText("item 0");
        list.appendChild(new Element(liTag, "")).appendText("item 1");
        list.appendChild(new Element(liTag, "")).appendText("item 2");
        root.appendChild(list);

        Elements result = Selector.select("li:lt(2)", root);
        assertEquals(2, result.size()); // item 0, item 1
    }

    @Test
    public void testPseudoSelectorGreaterThan() throws Exception {
        Element root = createMockDOM();
        // Need a structure with multiple siblings
        Tag ulTag = Tag.valueOf("ul");
        Tag liTag = Tag.valueOf("li");
        Element list = new Element(ulTag, "");
        list.appendChild(new Element(liTag, "")).appendText("item 0");
        list.appendChild(new Element(liTag, "")).appendText("item 1");
        list.appendChild(new Element(liTag, "")).appendText("item 2");
        root.appendChild(list);

        Elements result = Selector.select("li:gt(0)", root);
        assertEquals(2, result.size()); // item 1, item 2
    }

    @Test
    public void testPseudoSelectorEquals() throws Exception {
        Element root = createMockDOM();
        // Need a structure with multiple siblings
        Tag ulTag = Tag.valueOf("ul");
        Tag liTag = Tag.valueOf("li");
        Element list = new Element(ulTag, "");
        list.appendChild(new Element(liTag, "")).appendText("item 0");
        list.appendChild(new Element(liTag, "")).appendText("item 1");
        list.appendChild(new Element(liTag, "")).appendText("item 2");
        root.appendChild(list);

        Elements result = Selector.select("li:eq(1)", root);
        assertEquals(1, result.size()); // item 1
    }

    @Test
    public void testPseudoSelectorHas() throws Exception {
        Element root = createMockDOM();
        // Add a nested element to test :has
        Tag spanTag = Tag.valueOf("span");
        root.getElementById("main").appendChild(new Element(spanTag, "").appendText("nested"));

        Elements result = Selector.select("div:has(span)", root);
        assertEquals(1, result.size()); // div#main
    }

    @Test
    public void testPseudoSelectorNot() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("p:not(.content)", root);
        assertEquals(1, result.size()); // The <p> without class="content"
    }

    @Test
    public void testPseudoSelectorContains() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("p:contains(more)", root);
        assertEquals(1, result.size()); // The <p> with "More text"
    }

    @Test
    public void testPseudoSelectorContainsOwn() throws Exception {
        Element root = createMockDOM();
        // Add a nested element to ensure :containsOwn behaves differently from :contains
        Tag pTag = Tag.valueOf("p");
        Tag spanTag = Tag.valueOf("span");
        Element parentP = new Element(pTag, "").appendText("Own Text ");
        parentP.appendChild(new Element(spanTag, "").appendText("nested text"));
        root.getElementById("main").appendChild(parentP);

        Elements result = Selector.select("p:containsOwn(Own Text)", root);
        assertEquals(1, result.size()); // The new <p> with "Own Text "
    }

    @Test
    public void testPseudoSelectorMatches() throws Exception {
        Element root = createMockDOM();
        Tag divTag = Tag.valueOf("div");
        root.getElementById("main").appendChild(new Element(divTag, "").appendText("12345"));
        root.getElementById("main").appendChild(new Element(divTag, "").appendText("abc"));

        Elements result = Selector.select("div:matches(\\d+)", root); // Matches digits
        assertEquals(1, result.size()); // The div with "12345"
    }

    @Test
    public void testPseudoSelectorMatchesOwn() throws Exception {
        Element root = createMockDOM();
        Tag divTag = Tag.valueOf("div");
        root.getElementById("main").appendChild(new Element(divTag, "").appendText("12345"));
        root.getElementById("main").appendChild(new Element(divTag, "").appendText("abc"));

        Elements result = Selector.select("div:matchesOwn(\\d+)", root); // Matches digits
        assertEquals(1, result.size()); // The div with "12345"
    }

    @Test
    public void testCombinedSelectors() throws Exception {
        Element root = createMockDOM();
        Elements result = Selector.select("div#main p.content", root);
        assertEquals(1, result.size()); // p.content within div#main
    }

    @Test
    public void testAttributeSelectorStartsWithComplexValue() throws Exception {
        Element root = createMockDOM();
        root.attr("href", "http://example.com/path");
        Elements result = Selector.select("body[href^=http://]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorEndsWithComplexValue() throws Exception {
        Element root = createMockDOM();
        root.attr("href", "http://example.com/path.html");
        Elements result = Selector.select("body[href$=.html]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorContainingComplexValue() throws Exception {
        Element root = createMockDOM();
        root.attr("href", "http://example.com/search?q=test");
        Elements result = Selector.select("body[href*=search]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testNamespaceSelector() throws Exception {
        // The reference code `tagName.replace("|", ":")` suggests it's for parsing purposes.
        // We'll assume it's testing tag name matching where '|' is used in the selector.
        Tag tagNsTag = Tag.valueOf("ns|tag"); // Use Tag.valueOf directly
        Element root = new Element(Tag.valueOf("body"), "").appendChild(new Element(tagNsTag, ""));
        Elements result = Selector.select("ns|tag", root);
        assertEquals(1, result.size());
        // The actual tagName returned by Element might be "ns|tag" or just "tag" depending on Jsoup's internal handling.
        // Based on the `replace("|", ":")` logic, it expects to find "ns:tag" in the DOM, but selects with "ns|tag".
        // For this test, let's assume the Element's tagName() reflects what was set.
        assertEquals("ns|tag", result.first().tagName());
    }

    @Test
    public void testAttributeSelectorNamespaceEquals() throws Exception {
        // This tests attribute selection where the attribute key includes a namespace separator.
        Element root = createMockDOM();
        root.attr("ns|attr", "value"); // Set attribute with namespace-like key
        Elements result = Selector.select("[ns|attr=value]", root);
        assertEquals(1, result.size());
        assertEquals("body", result.first().tagName());
    }

    @Test
    public void testComplexCombinedSelector() throws Exception {
        Element root = createMockDOM();
        // Add more elements to test complex combinations
        Tag divTag = Tag.valueOf("div");
        Tag aTag = Tag.valueOf("a");
        Element divHeader = new Element(divTag, "").addClass("header");
        divHeader.appendChild(new Element(aTag, "").attr("href", "#"));
        root.appendChild(divHeader);

        Elements result = Selector.select("div.header > a[href]", root);
        assertEquals(1, result.size());
        assertEquals("a", result.first().tagName());
    }

    @Test
    public void testPseudoSelectorNotWithMultipleMatches() throws Exception {
        Element root = createMockDOM();
        Tag divTag = Tag.valueOf("div");
        root.getElementById("main").appendChild(new Element(divTag, "").addClass("excluded"));
        root.getElementById("main").appendChild(new Element(divTag, "").addClass("another"));

        Elements result = Selector.select("div:not(.excluded)", root);
        // The query "div:not(.excluded)" should find all divs, then filter out those with class "excluded".
        // Initially, divs found are: div#main, div#footer.
        // div#main has children, but the :not(.excluded) applies to the div itself.
        // div#footer does not have class "excluded".
        // The added divs are children of div#main, so they are not directly matched by `div` at the root level.
        // The test implies selecting `div` elements and then filtering out those with `.excluded`.
        // Initial `div` selection yields `div#main` and `div#footer`.
        // Neither has the class `excluded`. So both should remain.
        assertEquals(2, result.size()); // div#main, div#footer
    }
}
