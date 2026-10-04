package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class WhitelistTest {

    @Test
    public void testSimpleTextTags() throws Exception {
        Whitelist wl = Whitelist.simpleText();
        assertTrue(wl.isSafeTag("b"));
        assertTrue(wl.isSafeTag("em"));
        assertTrue(wl.isSafeTag("i"));
        assertTrue(wl.isSafeTag("strong"));
        assertTrue(wl.isSafeTag("u"));
        assertFalse(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("a"));
    }


    @Test
    public void testBasicTags() throws Exception {
        Whitelist wl = Whitelist.basic();
        assertTrue(wl.isSafeTag("a"));
        assertTrue(wl.isSafeTag("b"));
        assertTrue(wl.isSafeTag("strong"));
        assertTrue(wl.isSafeTag("u"));
        assertTrue(wl.isSafeTag("blockquote"));
        assertTrue(wl.isSafeTag("q"));
        assertFalse(wl.isSafeTag("img"));
        assertFalse(wl.isSafeTag("div"));
    }



    @Test
    public void testBasicEnforcedAttributes() throws Exception {
        Whitelist wl = Whitelist.basic();
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));
        assertEquals(1, enforced.size());
    }

    @Test
    public void testBasicWithImagesTags() throws Exception {
        Whitelist wl = Whitelist.basicWithImages();
        assertTrue(wl.isSafeTag("img"));
        assertTrue(wl.isSafeTag("a"));
        assertFalse(wl.isSafeTag("div"));
    }



    @Test
    public void testRelaxedTags() throws Exception {
        Whitelist wl = Whitelist.relaxed();
        assertTrue(wl.isSafeTag("table"));
        assertTrue(wl.isSafeTag("td"));
        assertTrue(wl.isSafeTag("th"));
        assertTrue(wl.isSafeTag("tr"));
        assertTrue(wl.isSafeTag("thead"));
        assertTrue(wl.isSafeTag("tbody"));
        assertTrue(wl.isSafeTag("tfoot"));
        assertTrue(wl.isSafeTag("caption"));
        assertTrue(wl.isSafeTag("colgroup"));
        assertTrue(wl.isSafeTag("col"));
        assertTrue(wl.isSafeTag("div"));
        assertTrue(wl.isSafeTag("h1"));
        assertTrue(wl.isSafeTag("h6"));
        assertTrue(wl.isSafeTag("img"));
        assertTrue(wl.isSafeTag("a"));
    }


    @Test
    public void testAddTags() throws Exception {
        Whitelist wl = Whitelist.none().addTags("p", "div");
        assertTrue(wl.isSafeTag("p"));
        assertTrue(wl.isSafeTag("div"));
        assertFalse(wl.isSafeTag("a"));
    }



    @Test
    public void testAddEnforcedAttribute() throws Exception {
        Whitelist wl = Whitelist.basic().addEnforcedAttribute("a", "target", "_blank");
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));
        assertEquals("_blank", enforced.get("target"));
        assertEquals(2, enforced.size());
    }

    @Test
    public void testAddEnforcedAttributeOverridesExisting() throws Exception {
        Whitelist wl = Whitelist.basic().addEnforcedAttribute("a", "rel", "noopener");
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("noopener", enforced.get("rel"));
        assertEquals(1, enforced.size());
    }







    @Test
    public void testIsSafeTag() throws Exception {
        Whitelist wl = Whitelist.basic();
        assertTrue(wl.isSafeTag("a"));
        assertFalse(wl.isSafeTag("script"));
    }

    @Test
    public void testTagCaseInsensitive() throws Exception {
        Whitelist wl = Whitelist.basic();
        assertTrue(wl.isSafeTag("A")); // Ensure case insensitivity for tag names
        assertTrue(wl.isSafeTag("B"));
    }




    @Test
    public void testAddEnforcedAttributeForTagNotPreviouslyConfigured() throws Exception {
        Whitelist wl = Whitelist.none().addEnforcedAttribute("div", "id", "main");
        Attributes enforced = wl.getEnforcedAttributes("div");
        assertEquals("main", enforced.get("id"));
        assertEquals(1, enforced.size());
    }



    @Test
    public void testAddTagToNone() throws Exception {
        Whitelist wl = Whitelist.none().addTags("p");
        assertTrue(wl.isSafeTag("p"));
        assertFalse(wl.isSafeTag("a"));
    }



    @Test
    public void testEnforcedAttributeAddedWhenAttributeNotPresent() throws Exception {
        Whitelist wl = Whitelist.none().addTags("a").addEnforcedAttribute("a", "rel", "nofollow");
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("nofollow", enforced.get("rel"));
        assertEquals(1, enforced.size());
    }

    @Test
    public void testEnforcedAttributeReplacedWhenAttributePresent() throws Exception {
        Whitelist wl = Whitelist.basic().addEnforcedAttribute("a", "rel", "noopener"); // basic enforces nofollow
        Attributes enforced = wl.getEnforcedAttributes("a");
        assertEquals("noopener", enforced.get("rel")); // Should be overridden
        assertEquals(1, enforced.size());
    }



    @Test
    public void testAddTagAlreadyExists() throws Exception {
        Whitelist wl = Whitelist.basic().addTags("a", "p"); // 'a' and 'p' are already in basic
        assertTrue(wl.isSafeTag("a"));
        assertTrue(wl.isSafeTag("p"));
    }


}



