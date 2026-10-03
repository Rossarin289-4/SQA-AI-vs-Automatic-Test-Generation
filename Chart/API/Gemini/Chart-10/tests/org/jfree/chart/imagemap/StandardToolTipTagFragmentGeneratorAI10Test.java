package org.jfree.chart.imagemap;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit tests for {@link StandardToolTipTagFragmentGenerator}.
 */
public class StandardToolTipTagFragmentGeneratorAI10Test {

    private StandardToolTipTagFragmentGenerator generator;

    @Before
    public void setUp() {
        this.generator = new StandardToolTipTagFragmentGenerator();
    }

    @Test
    public void testImplementsInterface() {
        Assert.assertTrue(this.generator instanceof ToolTipTagFragmentGenerator);
    }

    @Test
    public void testGenerateToolTipFragment_SimpleText() {
        String result = this.generator.generateToolTipFragment("Series 1");
        Assert.assertEquals(" title=\"Series 1\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_EmptyString() {
        String result = this.generator.generateToolTipFragment("");
        Assert.assertEquals(" title=\"\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_Ampersand() {
        String result = this.generator.generateToolTipFragment("Tom & Jerry");
        Assert.assertEquals(" title=\"Tom &amp; Jerry\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_DoubleQuotes() {
        String result = this.generator.generateToolTipFragment("A \"quoted\" text");
        Assert.assertEquals(" title=\"A &quot;quoted&quot; text\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_LessThanAndGreaterThan() {
        String result = this.generator.generateToolTipFragment("1 < 2 > 0");
        Assert.assertEquals(" title=\"1 &lt; 2 &gt; 0\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_SingleQuote() {
        String result = this.generator.generateToolTipFragment("It's fine");
        Assert.assertEquals(" title=\"It&#39;s fine\" alt=\"\"", result);
    }

    @Test
    public void testGenerateToolTipFragment_CombinedSpecialCharacters() {
        String result = this.generator.generateToolTipFragment("<tag attr=\"val\" & 'x'>");
        Assert.assertEquals(
            " title=\"&lt;tag attr=&quot;val&quot; &amp; &#39;x&#39;&gt;\" alt=\"\"",
            result
        );
    }

    @Test
    public void testGenerateToolTipFragment_WhitespaceCharacters() {
        String input = "Line 1\nLine 2\tEnd";
        String result = this.generator.generateToolTipFragment(input);
        Assert.assertEquals(" title=\"Line 1\nLine 2\tEnd\" alt=\"\"", result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGenerateToolTipFragment_NullInput() {
        this.generator.generateToolTipFragment(null);
    }
}
