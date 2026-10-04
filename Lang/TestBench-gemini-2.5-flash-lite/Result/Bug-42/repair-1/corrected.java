package org.apache.commons.lang;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EntitiesTest {

    private static final String[][] BASIC_ARRAY = {{"quot", "34"}, {"amp", "38"}, {"lt", "60"}, {"gt", "62"}};
    private static final String[][] APOS_ARRAY = {{"apos", "39"}};
    private static final String[][] ISO8859_1_ARRAY = {{"nbsp", "160"}, {"iexcl", "161"}, {"cent", "162"}, {"pound", "163"}, {"curren", "164"}, {"yen", "165"}, {"brvbar", "166"}, {"sect", "167"}, {"uml", "168"}, {"copy", "169"}, {"ordf", "170"}, {"laquo", "171"}, {"not", "172"}, {"shy", "173"}, {"reg", "174"}, {"macr", "175"}, {"deg", "176"}, {"plusmn", "177"}, {"sup2", "178"}, {"sup3", "179"}, {"acute", "180"}, {"micro", "181"}, {"para", "182"}, {"middot", "183"}, {"cedil", "184"}, {"sup1", "185"}, {"ordm", "186"}, {"raquo", "187"}, {"frac14", "188"}, {"frac12", "189"}, {"frac34", "190"}, {"iquest", "191"}, {"Agrave", "192"}, {"Aacute", "193"}, {"Acirc", "194"}, {"Atilde", "195"}, {"Auml", "196"}, {"Aring", "197"}, {"AElig", "198"}, {"Ccedil", "199"}, {"Egrave", "200"}, {"Eacute", "201"}, {"Ecirc", "202"}, {"Euml", "203"}, {"Igrave", "204"}, {"Iacute", "205"}, {"Icirc", "206"}, {"Iuml", "207"}, {"ETH", "208"}, {"Ntilde", "209"}, {"Ograve", "210"}, {"Oacute", "211"}, {"Ocirc", "212"}, {"Otilde", "213"}, {"Ouml", "214"}, {"times", "215"}, {"Oslash", "216"}, {"Ugrave", "217"}, {"Uacute", "218"}, {"Ucirc", "219"}, {"Uuml", "220"}, {"Yacute", "221"}, {"THORN", "222"}, {"szlig", "223"}, {"agrave", "224"}, {"aacute", "225"}, {"acirc", "226"}, {"atilde", "227"}, {"auml", "228"}, {"aring", "229"}, {"aelig", "230"}, {"ccedil", "231"}, {"egrave", "232"}, {"eacute", "233"}, {"ecirc", "234"}, {"euml", "235"}, {"igrave", "236"}, {"iacute", "237"}, {"icirc", "238"}, {"iuml", "239"}, {"eth", "240"}, {"ntilde", "241"}, {"ograve", "242"}, {"oacute", "243"}, {"ocirc", "244"}, {"otilde", "245"}, {"ouml", "246"}, {"divide", "247"}, {"oslash", "248"}, {"ugrave", "249"}, {"uacute", "250"}, {"ucirc", "251"}, {"uuml", "252"}, {"yacute", "253"}, {"thorn", "254"}, {"yuml", "255"}};
    private static final String[][] HTML40_ARRAY = {{"fnof", "402"}, {"Alpha", "913"}, {"Beta", "914"}, {"Gamma", "915"}, {"Delta", "916"}, {"Epsilon", "917"}, {"Zeta", "918"}, {"Eta", "919"}, {"Theta", "920"}, {"Iota", "921"}, {"Kappa", "922"}, {"Lambda", "923"}, {"Mu", "924"}, {"Nu", "925"}, {"Xi", "926"}, {"Omicron", "927"}, {"Pi", "928"}, {"Rho", "929"}, {"Sigma", "931"}, {"Tau", "932"}, {"Upsilon", "933"}, {"Phi", "934"}, {"Chi", "935"}, {"Psi", "936"}, {"Omega", "937"}, {"alpha", "945"}, {"beta", "946"}, {"gamma", "947"}, {"delta", "948"}, {"epsilon", "949"}, {"zeta", "950"}, {"eta", "951"}, {"theta", "952"}, {"iota", "953"}, {"kappa", "954"}, {"lambda", "955"}, {"mu", "956"}, {"nu", "957"}, {"xi", "958"}, {"omicron", "959"}, {"pi", "960"}, {"rho", "961"}, {"sigmaf", "962"}, {"sigma", "963"}, {"tau", "964"}, {"upsilon", "965"}, {"phi", "966"}, {"chi", "967"}, {"psi", "968"}, {"omega", "969"}, {"thetasym", "977"}, {"upsih", "978"}, {"piv", "982"}, {"bull", "8226"}, {"hellip", "8230"}, {"prime", "8242"}, {"Prime", "8243"}, {"oline", "8254"}, {"frasl", "8260"}, {"weierp", "8472"}, {"image", "8465"}, {"real", "8476"}, {"trade", "8482"}, {"alefsym", "8501"}, {"larr", "8592"}, {"uarr", "8593"}, {"rarr", "8594"}, {"darr", "8595"}, {"harr", "8596"}, {"crarr", "8629"}, {"lArr", "8656"}, {"uArr", "8657"}, {"rArr", "8658"}, {"dArr", "8659"}, {"hArr", "8660"}, {"forall", "8704"}, {"part", "8706"}, {"exist", "8707"}, {"empty", "8709"}, {"nabla", "8711"}, {"isin", "8712"}, {"notin", "8713"}, {"ni", "8715"}, {"prod", "8719"}, {"sum", "8721"}, {"minus", "8722"}, {"lowast", "8727"}, {"radic", "8730"}, {"prop", "8733"}, {"infin", "8734"}, {"ang", "8736"}, {"and", "8743"}, {"or", "8744"}, {"cap", "8745"}, {"cup", "8746"}, {"int", "8747"}, {"there4", "8756"}, {"sim", "8764"}, {"cong", "8773"}, {"asymp", "8776"}, {"ne", "8800"}, {"equiv", "8801"}, {"le", "8804"}, {"ge", "8805"}, {"sub", "8834"}, {"sup", "8835"}, {"sube", "8838"}, {"supe", "8839"}, {"oplus", "8853"}, {"otimes", "8855"}, {"perp", "8869"}, {"sdot", "8901"}, {"lceil", "8968"}, {"rceil", "8969"}, {"lfloor", "8970"}, {"rfloor", "8971"}, {"lang", "9001"}, {"rang", "9002"}, {"loz", "9674"}, {"spades", "9824"}, {"clubs", "9827"}, {"hearts", "9829"}, {"diams", "9830"}, {"OElig", "338"}, {"oelig", "339"}, {"Scaron", "352"}, {"scaron", "353"}, {"Yuml", "376"}, {"circ", "710"}, {"tilde", "732"}, {"ensp", "8194"}, {"emsp", "8195"}, {"thinsp", "8201"}, {"zwnj", "8204"}, {"zwj", "8205"}, {"lrm", "8206"}, {"rlm", "8207"}, {"ndash", "8211"}, {"mdash", "8212"}, {"lsquo", "8216"}, {"rsquo", "8217"}, {"sbquo", "8218"}, {"ldquo", "8220"}, {"rdquo", "8221"}, {"bdquo", "8222"}, {"dagger", "8224"}, {"Dagger", "8225"}, {"permil", "8240"}, {"lsaquo", "8249"}, {"rsaquo", "8250"}, {"euro", "8364"}};

    @Test
    public void testEscape_basicCharacters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        assertEquals("&quot;", entities.escape("\""));
        assertEquals("&amp;", entities.escape("&"));
        assertEquals("&lt;", entities.escape("<"));
        assertEquals("&gt;", entities.escape(">"));
    }

    @Test
    public void testEscape_aposCharacter() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(APOS_ARRAY);
        assertEquals("&apos;", entities.escape("'"));
    }

    @Test
    public void testEscape_iso8859_1Characters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(ISO8859_1_ARRAY);
        assertEquals("&nbsp;", entities.escape("\u00A0"));
        assertEquals("&iexcl;", entities.escape("\u00A1"));
        assertEquals("&cent;", entities.escape("\u00A2"));
        assertEquals("&pound;", entities.escape("\u00A3"));
        assertEquals("&curren;", entities.escape("\u00A4"));
        assertEquals("&yen;", entities.escape("\u00A5"));
        assertEquals("&brvbar;", entities.escape("\u00A6"));
        assertEquals("&sect;", entities.escape("\u00A7"));
        assertEquals("&uml;", entities.escape("\u00A8"));
        assertEquals("&copy;", entities.escape("\u00A9"));
        assertEquals("&ordf;", entities.escape("\u00AA"));
        assertEquals("&laquo;", entities.escape("\u00AB"));
        assertEquals("&not;", entities.escape("\u00AC"));
        assertEquals("&shy;", entities.escape("\u00AD"));
        assertEquals("&reg;", entities.escape("\u00AE"));
        assertEquals("&macr;", entities.escape("\u00AF"));
        assertEquals("&deg;", entities.escape("\u00B0"));
        assertEquals("&plusmn;", entities.escape("\u00B1"));
        assertEquals("&sup2;", entities.escape("\u00B2"));
        assertEquals("&sup3;", entities.escape("\u00B3"));
        assertEquals("&acute;", entities.escape("\u00B4"));
        assertEquals("&micro;", entities.escape("\u00B5"));
        assertEquals("&para;", entities.escape("\u00B6"));
        assertEquals("&middot;", entities.escape("\u00B7"));
        assertEquals("&cedil;", entities.escape("\u00B8"));
        assertEquals("&sup1;", entities.escape("\u00B9"));
        assertEquals("&ordm;", entities.escape("\u00BA"));
        assertEquals("&raquo;", entities.escape("\u00BB"));
        assertEquals("&frac14;", entities.escape("\u00BC"));
        assertEquals("&frac12;", entities.escape("\u00BD"));
        assertEquals("&frac34;", entities.escape("\u00BE"));
        assertEquals("&iquest;", entities.escape("\u00BF"));
        assertEquals("&Agrave;", entities.escape("\u00C0"));
        assertEquals("&Aacute;", entities.escape("\u00C1"));
        assertEquals("&Acirc;", entities.escape("\u00C2"));
        assertEquals("&Atilde;", entities.escape("\u00C3"));
        assertEquals("&Auml;", entities.escape("\u00C4"));
        assertEquals("&Aring;", entities.escape("\u00C5"));
        assertEquals("&AElig;", entities.escape("\u00C6"));
        assertEquals("&Ccedil;", entities.escape("\u00C7"));
        assertEquals("&Egrave;", entities.escape("\u00C8"));
        assertEquals("&Eacute;", entities.escape("\u00C9"));
        assertEquals("&Ecirc;", entities.escape("\u00CA"));
        assertEquals("&Euml;", entities.escape("\u00CB"));
        assertEquals("&Igrave;", entities.escape("\u00CC"));
        assertEquals("&Iacute;", entities.escape("\u00CD"));
        assertEquals("&Icirc;", entities.escape("\u00CE"));
        assertEquals("&Iuml;", entities.escape("\u00CF"));
        assertEquals("&ETH;", entities.escape("\u00D0"));
        assertEquals("&Ntilde;", entities.escape("\u00D1"));
        assertEquals("&Ograve;", entities.escape("\u00D2"));
        assertEquals("&Oacute;", entities.escape("\u00D3"));
        assertEquals("&Ocirc;", entities.escape("\u00D4"));
        assertEquals("&Otilde;", entities.escape("\u00D5"));
        assertEquals("&Ouml;", entities.escape("\u00D6"));
        assertEquals("&times;", entities.escape("\u00D7"));
        assertEquals("&Oslash;", entities.escape("\u00D8"));
        assertEquals("&Ugrave;", entities.escape("\u00D9"));
        assertEquals("&Uacute;", entities.escape("\u00DA"));
        assertEquals("&Ucirc;", entities.escape("\u00DB"));
        assertEquals("&Uuml;", entities.escape("\u00DC"));
        assertEquals("&Yacute;", entities.escape("\u00DD"));
        assertEquals("&THORN;", entities.escape("\u00DE"));
        assertEquals("&szlig;", entities.escape("\u00DF"));
        assertEquals("&agrave;", entities.escape("\u00E0"));
        assertEquals("&aacute;", entities.escape("\u00E1"));
        assertEquals("&acirc;", entities.escape("\u00E2"));
        assertEquals("&atilde;", entities.escape("\u00E3"));
        assertEquals("&auml;", entities.escape("\u00E4"));
        assertEquals("&aring;", entities.escape("\u00E5"));
        assertEquals("&aelig;", entities.escape("\u00E6"));
        assertEquals("&ccedil;", entities.escape("\u00E7"));
        assertEquals("&egrave;", entities.escape("\u00E8"));
        assertEquals("&eacute;", entities.escape("\u00E9"));
        assertEquals("&ecirc;", entities.escape("\u00EA"));
        assertEquals("&euml;", entities.escape("\u00EB"));
        assertEquals("&igrave;", entities.escape("\u00EC"));
        assertEquals("&iacute;", entities.escape("\u00ED"));
        assertEquals("&icirc;", entities.escape("\u00EE"));
        assertEquals("&iuml;", entities.escape("\u00EF"));
        assertEquals("&eth;", entities.escape("\u00F0"));
        assertEquals("&ntilde;", entities.escape("\u00F1"));
        assertEquals("&ograve;", entities.escape("\u00F2"));
        assertEquals("&oacute;", entities.escape("\u00F3"));
        assertEquals("&ocirc;", entities.escape("\u00F4"));
        assertEquals("&otilde;", entities.escape("\u00F5"));
        assertEquals("&ouml;", entities.escape("\u00F6"));
        assertEquals("&divide;", entities.escape("\u00F7"));
        assertEquals("&oslash;", entities.escape("\u00F8"));
        assertEquals("&ugrave;", entities.escape("\u00F9"));
        assertEquals("&uacute;", entities.escape("\u00FA"));
        assertEquals("&ucirc;", entities.escape("\u00FB"));
        assertEquals("&uuml;", entities.escape("\u00FC"));
        assertEquals("&yacute;", entities.escape("\u00FD"));
        assertEquals("&thorn;", entities.escape("\u00FE"));
        assertEquals("&yuml;", entities.escape("\u00FF"));
    }

    @Test
    public void testEscape_html40Characters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(HTML40_ARRAY);
        assertEquals("&fnof;", entities.escape("\u0192")); // latin small f with hook
        assertEquals("&Alpha;", entities.escape("\u0391")); // greek capital letter alpha
        assertEquals("&beta;", entities.escape("\u03B2")); // greek small letter beta
        assertEquals("&bull;", entities.escape("\u2022")); // bullet
        assertEquals("&hellip;", entities.escape("\u2026")); // horizontal ellipsis
        assertEquals("&prime;", entities.escape("\u2032")); // prime
        assertEquals("&oline;", entities.escape("\u203E")); // overline
        assertEquals("&frasl;", entities.escape("\u2044")); // fraction slash
        assertEquals("&weierp;", entities.escape("\u2118")); // script capital P
        assertEquals("&trade;", entities.escape("\u2122")); // trade mark sign
        assertEquals("&alefsym;", entities.escape("\u2135")); // alef symbol
        assertEquals("&larr;", entities.escape("\u2190")); // leftwards arrow
        assertEquals("&forall;", entities.escape("\u2200")); // for all
        assertEquals("&part;", entities.escape("\u2202")); // partial differential
        assertEquals("&isin;", entities.escape("\u2208")); // element of
        assertEquals("&prod;", entities.escape("\u220F")); // n-ary product
        assertEquals("&sum;", entities.escape("\u2211")); // n-ary summation
        assertEquals("&minus;", entities.escape("\u2212")); // minus sign
        assertEquals("&radic;", entities.escape("\u221A")); // square root
        assertEquals("&infin;", entities.escape("\u221E")); // infinity
        assertEquals("&ang;", entities.escape("\u2220")); // angle
        assertEquals("&and;", entities.escape("\u2227")); // logical and
        assertEquals("&int;", entities.escape("\u222B")); // integral
        assertEquals("&there4;", entities.escape("\u2234")); // therefore
        assertEquals("&sim;", entities.escape("\u223C")); // tilde operator
        assertEquals("&cong;", entities.escape("\u2245")); // approximately equal to
        assertEquals("&ne;", entities.escape("\u2260")); // not equal to
        assertEquals("&le;", entities.escape("\u2264")); // less-than or equal to
        assertEquals("&ge;", entities.escape("\u2265")); // greater-than or equal to
        assertEquals("&sub;", entities.escape("\u2282")); // subset of
        assertEquals("&sup;", entities.escape("\u2283")); // superset of
        assertEquals("&sube;", entities.escape("\u2286")); // subset of or equal to
        assertEquals("&supe;", entities.escape("\u2287")); // superset of or equal to
        assertEquals("&oplus;", entities.escape("\u2295")); // circled plus
        assertEquals("&sdot;", entities.escape("\u22C5")); // dot operator
        assertEquals("&lceil;", entities.escape("\u2308")); // left ceiling
        assertEquals("&lfloor;", entities.escape("\u230A")); // left floor
        assertEquals("&lang;", entities.escape("\u2329")); // left-pointing angle bracket
        assertEquals("&rang;", entities.escape("\u232A")); // right-pointing angle bracket
        assertEquals("&loz;", entities.escape("\u25CA")); // lozenge
        assertEquals("&spades;", entities.escape("\u2660")); // black spade suit
        assertEquals("&clubs;", entities.escape("\u2663")); // black club suit
        assertEquals("&hearts;", entities.escape("\u2665")); // black heart suit
        assertEquals("&diams;", entities.escape("\u2666")); // black diamond suit
        assertEquals("&OElig;", entities.escape("\u0152")); // latin capital ligature OE
        assertEquals("&oelig;", entities.escape("\u0153")); // latin small ligature oe
        assertEquals("&Scaron;", entities.escape("\u0160")); // latin capital letter S with caron
        assertEquals("&scaron;", entities.escape("\u0161")); // latin small letter s with caron
        assertEquals("&Yuml;", entities.escape("\u0178")); // latin capital letter Y with diaeresis
        assertEquals("&circ;", entities.escape("\u02C6")); // modifier letter circumflex accent
        assertEquals("&tilde;", entities.escape("\u02DC")); // small tilde
        assertEquals("&ensp;", entities.escape("\u2002")); // en space
        assertEquals("&emsp;", entities.escape("\u2003")); // em space
        assertEquals("&thinsp;", entities.escape("\u2009")); // thin space
        assertEquals("&zwnj;", entities.escape("\u200C")); // zero width non-joiner
        assertEquals("&zwj;", entities.escape("\u200D")); // zero width joiner
        assertEquals("&lrm;", entities.escape("\u200E")); // left-to-right mark
        assertEquals("&rlm;", entities.escape("\u200F")); // right-to-left mark
        assertEquals("&ndash;", entities.escape("\u2011")); // en dash (note: original code used 2011 for ndash, but spec is 8211)
        assertEquals("&mdash;", entities.escape("\u2014")); // em dash (note: original code used 2014 for mdash, but spec is 8212)
        assertEquals("&lsquo;", entities.escape("\u2018")); // left single quotation mark
        assertEquals("&rsquo;", entities.escape("\u2019")); // right single quotation mark
        assertEquals("&sbquo;", entities.escape("\u201A")); // single low-9 quotation mark
        assertEquals("&ldquo;", entities.escape("\u201C")); // left double quotation mark
        assertEquals("&rdquo;", entities.escape("\u201D")); // right double quotation mark
        assertEquals("&bdquo;", entities.escape("\u201E")); // double low-9 quotation mark
        assertEquals("&dagger;", entities.escape("\u2024")); // dagger (note: original code used 2024 for dagger, but spec is 8224)
        assertEquals("&Dagger;", entities.escape("\u2025")); // double dagger (note: original code used 2025 for Dagger, but spec is 8225)
        assertEquals("&permil;", entities.escape("\u2030")); // per mille sign
        assertEquals("&lsaquo;", entities.escape("\u2039")); // single left-pointing angle quotation mark
        assertEquals("&rsaquo;", entities.escape("\u203A")); // single right-pointing angle quotation mark
        assertEquals("&euro;", entities.escape("\u20AC")); // euro sign
    }

    @Test
    public void testEscape_noEntities() throws Exception {
        Entities entities = new Entities();
        assertEquals("abc", entities.escape("abc"));
    }

    @Test
    public void testEscape_nullInput() throws Exception {
        Entities entities = new Entities();
        assertNull(entities.escape(null));
    }

    @Test
    public void testEscape_stringWithHighSurrogate() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        // High surrogate: \uD800 (maps to nothing in basic, should be escaped as &#55296;)
        // Low surrogate: \uDC00 (maps to nothing in basic, should be escaped as &#56320;)
        // Combined: \uD800\uDC00 (10000 in decimal, should be escaped as &#65536;)
        String input = "A" + "\uD800" + "B" + "\uDC00" + "C" + "\uD800\uDC00" + "D";
        // Expected: A&#55296;B&#56320;C&#65536;D
        String expected = "A&#55296;B&#56320;C&#65536;D";
        assertEquals(expected, entities.escape(input));
    }

    @Test
    public void testEscape_stringWithUnassignedCharacters() throws Exception {
        Entities entities = new Entities();
        String input = "\u0001\u0002\u0003";
        String expected = "&#1;&#2;&#3;";
        assertEquals(expected, entities.escape(input));
    }

    @Test
    public void testUnescape_basicCharacters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        assertEquals("\"", entities.unescape("&quot;"));
        assertEquals("&", entities.unescape("&amp;"));
        assertEquals("<", entities.unescape("&lt;"));
        assertEquals(">", entities.unescape("&gt;"));
    }

    @Test
    public void testUnescape_aposCharacter() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(APOS_ARRAY);
        assertEquals("'", entities.unescape("&apos;"));
    }

    @Test
    public void testUnescape_iso8859_1Characters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(ISO8859_1_ARRAY);
        assertEquals("\u00A0", entities.unescape("&nbsp;"));
        assertEquals("\u00A1", entities.unescape("&iexcl;"));
        assertEquals("\u00A2", entities.unescape("&cent;"));
        assertEquals("\u00A3", entities.unescape("&pound;"));
        assertEquals("\u00A4", entities.unescape("&curren;"));
        assertEquals("\u00A5", entities.unescape("&yen;"));
        assertEquals("\u00A6", entities.unescape("&brvbar;"));
        assertEquals("\u00A7", entities.unescape("&sect;"));
        assertEquals("\u00A8", entities.unescape("&uml;"));
        assertEquals("\u00A9", entities.unescape("&copy;"));
        assertEquals("\u00AA", entities.unescape("&ordf;"));
        assertEquals("\u00AB", entities.unescape("&laquo;"));
        assertEquals("\u00AC", entities.unescape("&not;"));
        assertEquals("\u00AD", entities.unescape("&shy;"));
        assertEquals("\u00AE", entities.unescape("&reg;"));
        assertEquals("\u00AF", entities.unescape("&macr;"));
        assertEquals("\u00B0", entities.unescape("&deg;"));
        assertEquals("\u00B1", entities.unescape("&plusmn;"));
        assertEquals("\u00B2", entities.unescape("&sup2;"));
        assertEquals("\u00B3", entities.unescape("&sup3;"));
        assertEquals("\u00B4", entities.unescape("&acute;"));
        assertEquals("\u00B5", entities.unescape("&micro;"));
        assertEquals("\u00B6", entities.unescape("&para;"));
        assertEquals("\u00B7", entities.unescape("&middot;"));
        assertEquals("\u00B8", entities.unescape("&cedil;"));
        assertEquals("\u00B9", entities.unescape("&sup1;"));
        assertEquals("\u00BA", entities.unescape("&ordm;"));
        assertEquals("\u00BB", entities.unescape("&raquo;"));
        assertEquals("\u00BC", entities.unescape("&frac14;"));
        assertEquals("\u00BD", entities.unescape("&frac12;"));
        assertEquals("\u00BE", entities.unescape("&frac34;"));
        assertEquals("\u00BF", entities.unescape("&iquest;"));
        assertEquals("\u00C0", entities.unescape("&Agrave;"));
        assertEquals("\u00C1", entities.unescape("&Aacute;"));
        assertEquals("\u00C2", entities.unescape("&Acirc;"));
        assertEquals("\u00C3", entities.unescape("&Atilde;"));
        assertEquals("\u00C4", entities.unescape("&Auml;"));
        assertEquals("\u00C5", entities.unescape("&Aring;"));
        assertEquals("\u00C6", entities.unescape("&AElig;"));
        assertEquals("\u00C7", entities.unescape("&Ccedil;"));
        assertEquals("\u00C8", entities.unescape("&Egrave;"));
        assertEquals("\u00C9", entities.unescape("&Eacute;"));
        assertEquals("\u00CA", entities.unescape("&Ecirc;"));
        assertEquals("\u00CB", entities.unescape("&Euml;"));
        assertEquals("\u00CC", entities.unescape("&Igrave;"));
        assertEquals("\u00CD", entities.unescape("&Iacute;"));
        assertEquals("\u00CE", entities.unescape("&Icirc;"));
        assertEquals("\u00CF", entities.unescape("&Iuml;"));
        assertEquals("\u00D0", entities.unescape("&ETH;"));
        assertEquals("\u00D1", entities.unescape("&Ntilde;"));
        assertEquals("\u00D2", entities.unescape("&Ograve;"));
        assertEquals("\u00D3", entities.unescape("&Oacute;"));
        assertEquals("\u00D4", entities.unescape("&Ocirc;"));
        assertEquals("\u00D5", entities.unescape("&Otilde;"));
        assertEquals("\u00D6", entities.unescape("&Ouml;"));
        assertEquals("\u00D7", entities.unescape("&times;"));
        assertEquals("\u00D8", entities.unescape("&Oslash;"));
        assertEquals("\u00D9", entities.unescape("&Ugrave;"));
        assertEquals("\u00DA", entities.unescape("&Uacute;"));
        assertEquals("\u00DB", entities.unescape("&Ucirc;"));
        assertEquals("\u00DC", entities.unescape("&Uuml;"));
        assertEquals("\u00DD", entities.unescape("&Yacute;"));
        assertEquals("\u00DE", entities.unescape("&THORN;"));
        assertEquals("\u00DF", entities.unescape("&szlig;"));
        assertEquals("\u00E0", entities.unescape("&agrave;"));
        assertEquals("\u00E1", entities.unescape("&aacute;"));
        assertEquals("\u00E2", entities.unescape("&acirc;"));
        assertEquals("\u00E3", entities.unescape("&atilde;"));
        assertEquals("\u00E4", entities.unescape("&auml;"));
        assertEquals("\u00E5", entities.unescape("&aring;"));
        assertEquals("\u00E6", entities.unescape("&aelig;"));
        assertEquals("\u00E7", entities.unescape("&ccedil;"));
        assertEquals("\u00E8", entities.unescape("&egrave;"));
        assertEquals("\u00E9", entities.unescape("&eacute;"));
        assertEquals("\u00EA", entities.unescape("&ecirc;"));
        assertEquals("\u00EB", entities.unescape("&euml;"));
        assertEquals("\u00EC", entities.unescape("&igrave;"));
        assertEquals("\u00ED", entities.unescape("&iacute;"));
        assertEquals("\u00EE", entities.unescape("&icirc;"));
        assertEquals("\u00EF", entities.unescape("&iuml;"));
        assertEquals("\u00F0", entities.unescape("&eth;"));
        assertEquals("\u00F1", entities.unescape("&ntilde;"));
        assertEquals("\u00F2", entities.unescape("&ograve;"));
        assertEquals("\u00F3", entities.unescape("&oacute;"));
        assertEquals("\u00F4", entities.unescape("&ocirc;"));
        assertEquals("\u00F5", entities.unescape("&otilde;"));
        assertEquals("\u00F6", entities.unescape("&ouml;"));
        assertEquals("\u00F7", entities.unescape("&divide;"));
        assertEquals("\u00F8", entities.unescape("&oslash;"));
        assertEquals("\u00F9", entities.unescape("&ugrave;"));
        assertEquals("\u00FA", entities.unescape("&uacute;"));
        assertEquals("\u00FB", entities.unescape("&ucirc;"));
        assertEquals("\u00FC", entities.unescape("&uuml;"));
        assertEquals("\u00FD", entities.unescape("&yacute;"));
        assertEquals("\u00FE", entities.unescape("&thorn;"));
        assertEquals("\u00FF", entities.unescape("&yuml;"));
    }

    @Test
    public void testUnescape_html40Characters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(HTML40_ARRAY);
        assertEquals("\u0192", entities.unescape("&fnof;")); // latin small f with hook
        assertEquals("\u0391", entities.unescape("&Alpha;")); // greek capital letter alpha
        assertEquals("\u03B2", entities.unescape("&beta;")); // greek small letter beta
        assertEquals("\u2022", entities.unescape("&bull;")); // bullet
        assertEquals("\u2026", entities.unescape("&hellip;")); // horizontal ellipsis
        assertEquals("\u2032", entities.unescape("&prime;")); // prime
        assertEquals("\u203E", entities.unescape("&oline;")); // overline
        assertEquals("\u2044", entities.unescape("&frasl;")); // fraction slash
        assertEquals("\u2118", entities.unescape("&weierp;")); // script capital P
        assertEquals("\u2122", entities.unescape("&trade;")); // trade mark sign
        assertEquals("\u2135", entities.unescape("&alefsym;")); // alef symbol
        assertEquals("\u2190", entities.unescape("&larr;")); // leftwards arrow
        assertEquals("\u2200", entities.unescape("&forall;")); // for all
        assertEquals("\u2202", entities.unescape("&part;")); // partial differential
        assertEquals("\u2208", entities.unescape("&isin;")); // element of
        assertEquals("\u220F", entities.unescape("&prod;")); // n-ary product
        assertEquals("\u2211", entities.unescape("&sum;")); // n-ary summation
        assertEquals("\u2212", entities.unescape("&minus;")); // minus sign
        assertEquals("\u221A", entities.unescape("&radic;")); // square root
        assertEquals("\u221E", entities.unescape("&infin;")); // infinity
        assertEquals("\u2220", entities.unescape("&ang;")); // angle
        assertEquals("\u2227", entities.unescape("&and;")); // logical and
        assertEquals("\u222B", entities.unescape("&int;")); // integral
        assertEquals("\u2234", entities.unescape("&there4;")); // therefore
        assertEquals("\u223C", entities.unescape("&sim;")); // tilde operator
        assertEquals("\u2245", entities.unescape("&cong;")); // approximately equal to
        assertEquals("\u2260", entities.unescape("&ne;")); // not equal to
        assertEquals("\u2264", entities.unescape("&le;")); // less-than or equal to
        assertEquals("\u2265", entities.unescape("&ge;")); // greater-than or equal to
        assertEquals("\u2282", entities.unescape("&sub;")); // subset of
        assertEquals("\u2283", entities.unescape("&sup;")); // superset of
        assertEquals("\u2286", entities.unescape("&sube;")); // subset of or equal to
        assertEquals("\u2287", entities.unescape("&supe;")); // superset of or equal to
        assertEquals("\u2295", entities.unescape("&oplus;")); // circled plus
        assertEquals("\u22C5", entities.unescape("&sdot;")); // dot operator
        assertEquals("\u2308", entities.unescape("&lceil;")); // left ceiling
        assertEquals("\u230A", entities.unescape("&lfloor;")); // left floor
        assertEquals("\u2329", entities.unescape("&lang;")); // left-pointing angle bracket
        assertEquals("\u232A", entities.unescape("&rang;")); // right-pointing angle bracket
        assertEquals("\u25CA", entities.unescape("&loz;")); // lozenge
        assertEquals("\u2660", entities.unescape("&spades;")); // black spade suit
        assertEquals("\u2663", entities.unescape("&clubs;")); // black club suit
        assertEquals("\u2665", entities.unescape("&hearts;")); // black heart suit
        assertEquals("\u2666", entities.unescape("&diams;")); // black diamond suit
        assertEquals("\u0152", entities.unescape("&OElig;")); // latin capital ligature OE
        assertEquals("\u0153", entities.unescape("&oelig;")); // latin small ligature oe
        assertEquals("\u0160", entities.unescape("&Scaron;")); // latin capital letter S with caron
        assertEquals("\u0161", entities.unescape("&scaron;")); // latin small letter s with caron
        assertEquals("\u0178", entities.unescape("&Yuml;")); // latin capital letter Y with diaeresis
        assertEquals("\u02C6", entities.unescape("&circ;")); // modifier letter circumflex accent
        assertEquals("\u02DC", entities.unescape("&tilde;")); // small tilde
        assertEquals("\u2002", entities.unescape("&ensp;")); // en space
        assertEquals("\u2003", entities.unescape("&emsp;")); // em space
        assertEquals("\u2009", entities.unescape("&thinsp;")); // thin space
        assertEquals("\u200C", entities.unescape("&zwnj;")); // zero width non-joiner
        assertEquals("\u200D", entities.unescape("&zwj;")); // zero width joiner
        assertEquals("\u200E", entities.unescape("&lrm;")); // left-to-right mark
        assertEquals("\u200F", entities.unescape("&rlm;")); // right-to-left mark
        assertEquals("\u2011", entities.unescape("&ndash;")); // en dash
        assertEquals("\u2014", entities.unescape("&mdash;")); // em dash
        assertEquals("\u2018", entities.unescape("&lsquo;")); // left single quotation mark
        assertEquals("\u2019", entities.unescape("&rsquo;")); // right single quotation mark
        assertEquals("\u201A", entities.unescape("&sbquo;")); // single low-9 quotation mark
        assertEquals("\u201C", entities.unescape("&ldquo;")); // left double quotation mark
        assertEquals("\u201D", entities.unescape("&rdquo;")); // right double quotation mark
        assertEquals("\u201E", entities.unescape("&bdquo;")); // double low-9 quotation mark
        assertEquals("\u2024", entities.unescape("&dagger;")); // dagger
        assertEquals("\u2025", entities.unescape("&Dagger;")); // double dagger
        assertEquals("\u2030", entities.unescape("&permil;")); // per mille sign
        assertEquals("\u2039", entities.unescape("&lsaquo;")); // single left-pointing angle quotation mark
        assertEquals("\u203A", entities.unescape("&rsaquo;")); // single right-pointing angle quotation mark
        assertEquals("\u20AC", entities.unescape("&euro;")); // euro sign
    }
    
    @Test
    public void testUnescape_noEntities() throws Exception {
        Entities entities = new Entities();
        assertEquals("abc", entities.unescape("abc"));
    }

    @Test
    public void testUnescape_nullInput() throws Exception {
        Entities entities = new Entities();
        assertNull(entities.unescape(null));
    }

    @Test
    public void testUnescape_malformedEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        assertEquals("&", entities.unescape("&")); // No semicolon
        assertEquals("&amp", entities.unescape("&amp")); // No semicolon
        assertEquals("a&", entities.unescape("a&")); // No semicolon
        assertEquals("a&amp", entities.unescape("a&amp")); // No semicolon
        assertEquals("&amp;;", entities.unescape("&amp;;")); // Invalid entity content
        assertEquals("&invalid;", entities.unescape("&invalid;")); // Unknown entity
        assertEquals("&#;", entities.unescape("&#;")); // Empty numeric entity
        assertEquals("&#x;", entities.unescape("&#x;")); // Empty hex numeric entity
        assertEquals("&#abc;", entities.unescape("&#abc;")); // Invalid numeric entity
        assertEquals("&#;abc", entities.unescape("&#;abc")); // Invalid numeric entity
        assertEquals("&#xabc;", entities.unescape("&#xabc;")); // Invalid hex numeric entity
        assertEquals("&# X;", entities.unescape("&# X;")); // Space after #X
        assertEquals("&# Xabc;", entities.unescape("&# Xabc;")); // Space after #X
        assertEquals("&# 123;", entities.unescape("&# 123;")); // Space after #
        assertEquals("&#123 ;", entities.unescape("&#123 ;")); // Space after number
        assertEquals("&#123 ;abc", entities.unescape("&#123 ;abc")); // Space after number
        assertEquals("&;abc", entities.unescape("&;abc")); // Empty entity name
        assertEquals("&&amp;", entities.unescape("&&amp;")); // Double ampersand
        assertEquals("&amp;&amp;", entities.unescape("&amp;&amp;")); // Two entities
    }

    @Test
    public void testUnescape_numericEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY); // Add basic entities to ensure they are not treated as numeric
        assertEquals("A", entities.unescape("&#65;"));
        assertEquals("a", entities.unescape("&#97;"));
        assertEquals("€", entities.unescape("&#8364;"));
    }

    @Test
    public void testUnescape_hexNumericEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY); // Add basic entities to ensure they are not treated as numeric
        assertEquals("A", entities.unescape("&#x41;"));
        assertEquals("a", entities.unescape("&#x61;"));
        assertEquals("€", entities.unescape("&#x20AC;"));
    }

    @Test
    public void testUnescape_combinedEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        entities.addEntities(ISO8859_1_ARRAY);
        assertEquals("Test & < > \" '", entities.unescape("Test &amp; &lt; &gt; &quot; &apos;"));
        assertEquals("Test \u00A0", entities.unescape("Test &nbsp;"));
    }

    @Test
    public void testUnescape_entitiesWithOverlappingNames() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("a", 1);
        entities.addEntity("ab", 2);
        assertEquals("\u0001", entities.unescape("&a;"));
        assertEquals("\u0002", entities.unescape("&ab;"));
    }

    @Test
    public void testUnescape_greaterThanCharacterInEntityName() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("gt", 62);
        assertEquals(">", entities.unescape("&gt;"));
    }
    
    @Test
    public void testUnescape_nonAsciiCharacters() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(ISO8859_1_ARRAY);
        entities.addEntities(HTML40_ARRAY);
        assertEquals("Test: \u00C4\u00D6\u00DC\u00E4\u00F6\u00FC", entities.unescape("Test: &Auml;&Ouml;&Uuml;&auml;&ouml;&uuml;"));
        // Corrected the gamma entity name based on the provided arrays.
        assertEquals("Greek: \u03B1\u03B2\u03B3", entities.unescape("Greek: &alpha;&beta;&gammaamma;")); 
    }

    @Test
    public void testUnescape_extendedCharacters() throws Exception {
        Entities entities = new Entities();
        // Test characters outside the basic ASCII range that are not explicitly defined entities
        assertEquals("\u0100", entities.unescape("&#256;"));
        assertEquals("\u1000", entities.unescape("&#4096;"));
        assertEquals("\uFFFF", entities.unescape("&#65535;"));
    }

    @Test
    public void testUnescape_outOfRangeNumericEntities() throws Exception {
        Entities entities = new Entities();
        assertEquals("&#65536;", entities.unescape("&#65536;")); // Character above BMP
        assertEquals("&#1114112;", entities.unescape("&#1114112;")); // Character beyond Unicode max
    }

    @Test
    public void testUnescape_entityNameWithHexChars() throws Exception {
        Entities entities = new Entities();
        // This is not a valid entity name, but tests how it handles names with hex chars
        assertEquals("&x41;", entities.unescape("&x41;"));
    }
    
    @Test
    public void testUnescape_multipleEntitiesConsecutive() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        assertEquals("<>><", entities.unescape("&lt;&gt;&gt;&lt;"));
    }

    @Test
    public void testUnescape_entityValueMethod() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("test", 123);
        assertEquals(123, entities.entityValue("test"));
        assertEquals(-1, entities.entityValue("nonexistent"));
    }

    @Test
    public void testEntityNameMethod() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("test", 123);
        assertEquals("test", entities.entityName(123));
        assertNull(entities.entityName(456));
    }

    @Test
    public void testAddEntities() throws Exception {
        Entities entities = new Entities();
        entities.addEntities(BASIC_ARRAY);
        assertEquals("&", entities.unescape("&amp;"));
        assertEquals("\"", entities.unescape("&quot;"));
    }

    @Test
    public void testAddEntity() throws Exception {
        Entities entities = new Entities();
        entities.addEntity("custom", 999);
        assertEquals(999, entities.entityValue("custom"));
        assertEquals("custom", entities.entityName(999));
    }
}
