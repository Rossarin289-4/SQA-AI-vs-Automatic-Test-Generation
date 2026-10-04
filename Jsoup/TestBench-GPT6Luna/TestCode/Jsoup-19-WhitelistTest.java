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
    public void testNoneDiffersFromSimpleText() throws Exception {
        assertFalse(Whitelist.none().equals(Whitelist.simpleText()));
    }

    @Test
    public void testSimpleTextDiffersFromBasic() throws Exception {
        assertFalse(Whitelist.simpleText().equals(Whitelist.basic()));
    }

    @Test
    public void testBasicWithImagesDiffersFromBasic() throws Exception {
        assertFalse(Whitelist.basicWithImages().equals(Whitelist.basic()));
    }

    @Test
    public void testRelaxedDiffersFromBasic() throws Exception {
        assertFalse(Whitelist.relaxed().equals(Whitelist.basic()));
    }

    @Test
    public void testEmptyWhitelistsEqual() throws Exception {
        assertEquals(new Whitelist(), Whitelist.none());
    }

    @Test
    public void testAddTagsChangesWhitelist() throws Exception {
        Whitelist whitelist = new Whitelist();
        assertSame(whitelist, whitelist.addTags("p"));
        assertFalse(whitelist.equals(new Whitelist()));
    }

    @Test
    public void testTagNamesAreCaseSensitive() throws Exception {
        Whitelist lower = new Whitelist().addTags("p");
        Whitelist upper = new Whitelist().addTags("P");
        assertFalse(lower.equals(upper));
    }

    @Test
    public void testDuplicateTagDoesNotChangeWhitelist() throws Exception {
        Whitelist once = new Whitelist().addTags("p");
        Whitelist twice = new Whitelist().addTags("p", "p");
        assertEquals(once, twice);
    }

    @Test
    public void testAddAttributesChangesWhitelist() throws Exception {
        Whitelist withAttribute = new Whitelist().addAttributes("a", "href");
        assertFalse(withAttribute.equals(new Whitelist()));
    }

    @Test
    public void testAddingAttributesAccumulates() throws Exception {
        Whitelist together = new Whitelist().addAttributes("a", "href", "title");
        Whitelist separately = new Whitelist().addAttributes("a", "href").addAttributes("a", "title");
        assertEquals(together, separately);
    }

    @Test
    public void testAttributesAreTagSpecific() throws Exception {
        Whitelist first = new Whitelist().addAttributes("a", "href");
        Whitelist second = new Whitelist().addAttributes("p", "href");
        assertFalse(first.equals(second));
    }

    @Test
    public void testAddEnforcedAttributeChangesWhitelist() throws Exception {
        Whitelist withEnforced = new Whitelist().addEnforcedAttribute("a", "rel", "nofollow");
        assertFalse(withEnforced.equals(new Whitelist()));
    }

    @Test
    public void testEnforcedAttributeValueMatters() throws Exception {
        Whitelist first = new Whitelist().addEnforcedAttribute("a", "rel", "nofollow");
        Whitelist second = new Whitelist().addEnforcedAttribute("a", "rel", "friend");
        assertFalse(first.equals(second));
    }

    @Test
    public void testRepeatedEnforcedKeyReplacesValue() throws Exception {
        Whitelist replaced = new Whitelist().addEnforcedAttribute("a", "rel", "friend")
                .addEnforcedAttribute("a", "rel", "nofollow");
        Whitelist direct = new Whitelist().addEnforcedAttribute("a", "rel", "nofollow");
        assertEquals(direct, replaced);
    }

    @Test
    public void testPreserveRelativeLinksChangesWhitelist() throws Exception {
        Whitelist preserved = new Whitelist().preserveRelativeLinks(true);
        assertFalse(preserved.equals(new Whitelist()));
    }

    @Test
    public void testPreserveRelativeLinksCanBeReset() throws Exception {
        Whitelist reset = new Whitelist().preserveRelativeLinks(true).preserveRelativeLinks(false);
        assertEquals(new Whitelist(), reset);
    }

    @Test
    public void testAddProtocolsChangesWhitelist() throws Exception {
        Whitelist withProtocol = new Whitelist().addProtocols("a", "href", "https");
        assertFalse(withProtocol.equals(new Whitelist()));
    }

    @Test
    public void testAddingProtocolsAccumulates() throws Exception {
        Whitelist together = new Whitelist().addProtocols("a", "href", "http", "https");
        Whitelist separately = new Whitelist().addProtocols("a", "href", "http")
                .addProtocols("a", "href", "https");
        assertEquals(together, separately);
    }

    @Test
    public void testProtocolsAreTagSpecific() throws Exception {
        Whitelist first = new Whitelist().addProtocols("a", "href", "https");
        Whitelist second = new Whitelist().addProtocols("p", "href", "https");
        assertFalse(first.equals(second));
    }

    @Test
    public void testProtocolsAreAttributeSpecific() throws Exception {
        Whitelist first = new Whitelist().addProtocols("a", "href", "https");
        Whitelist second = new Whitelist().addProtocols("a", "src", "https");
        assertFalse(first.equals(second));
    }

    @Test
    public void testDifferentProtocolValuesDiffer() throws Exception {
        Whitelist first = new Whitelist().addProtocols("a", "href", "http");
        Whitelist second = new Whitelist().addProtocols("a", "href", "https");
        assertFalse(first.equals(second));
    }

    @Test
    public void testDuplicateProtocolDoesNotChangeWhitelist() throws Exception {
        Whitelist once = new Whitelist().addProtocols("a", "href", "https");
        Whitelist twice = new Whitelist().addProtocols("a", "href", "https", "https");
        assertEquals(once, twice);
    }

    @Test
    public void testEqualWhitelistsHaveEqualHashCodes() throws Exception {
        Whitelist first = new Whitelist().addTags("p", "b").addAttributes("a", "href");
        Whitelist second = new Whitelist().addAttributes("a", "href").addTags("b", "p");
        assertEquals(first, second);
        assertEquals(first.hashCode(), second.hashCode());
    }

    @Test
    public void testToStringIsNonNull() throws Exception {
        assertNotNull(new Whitelist().toString());
    }
}
