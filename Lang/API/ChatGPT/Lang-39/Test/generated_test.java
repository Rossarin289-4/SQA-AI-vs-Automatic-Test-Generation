package org.apache.commons.lang3;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringUtilsLang39Test {

    @Test
    public void testNullReplacementAfterValidReplacement() {
        String text = "red BLUE";

        String[] searchList = {
            "red",
            "BLUE"
        };

        String[] replacementList = {
            "green",
            null
        };

        String actual = StringUtils.replaceEach(
                text, searchList, replacementList);

        assertEquals("green BLUE", actual);
    }

    @Test
    public void testNullReplacementBeforeLaterValidMatch() {
        String text = "START xx";

        String[] searchList = {
            "xx",
            "START"
        };

        String[] replacementList = {
            null,
            "BEGIN"
        };

        String actual = StringUtils.replaceEach(
                text, searchList, replacementList);

        assertEquals("BEGIN xx", actual);
    }

    @Test
    public void testNullReplacementBetweenTwoValidReplacements() {
        String text = "one TWO three";

        String[] searchList = {
            "one",
            "TWO",
            "three"
        };

        String[] replacementList = {
            "1",
            null,
            "3"
        };

        String actual = StringUtils.replaceEach(
                text, searchList, replacementList);

        assertEquals("1 TWO 3", actual);
    }

    @Test
    public void testNullReplacementWithMatchBeforeAndAfterValidReplacement() {
        String text = "BAD good BAD";

        String[] searchList = {
            "BAD",
            "good"
        };

        String[] replacementList = {
            null,
            "better"
        };

        String actual = StringUtils.replaceEach(
                text, searchList, replacementList);

        assertEquals("BAD better BAD", actual);
    }

    @Test
    public void testOnlyNullReplacementsAreIgnored() {
        String text = "keep these words";

        String[] searchList = {
            "keep",
            "words"
        };

        String[] replacementList = {
            null,
            null
        };

        String actual = StringUtils.replaceEach(
                text, searchList, replacementList);

        assertEquals("keep these words", actual);
    }
}
