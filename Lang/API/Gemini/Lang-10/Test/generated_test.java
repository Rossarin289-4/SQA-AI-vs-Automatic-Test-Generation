/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.lang3.time;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import org.junit.Test;

public class FastDateParserWhitespaceTest {

    @Test
    public void testParserWithLiteralWhitespaceSeparator() throws ParseException {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        
        // Pattern with literal text containing spaces
        FastDateParser parser = new FastDateParser("yyyy 'day of' MM", tz, locale);
        
        // Correct source string matching the literal spacing
        Date date = parser.parse("2020 day of 05");
        assertNotNull(date);
    }

    @Test
    public void testParserWithMultipleSpacesInPattern() {
        TimeZone tz = TimeZone.getTimeZone("UTC");
        Locale locale = Locale.US;
        
        // Pattern with multiple spaces between fields
        FastDateParser parser = new FastDateParser("yyyy    MM    dd", tz, locale);
        
        // In the buggy version, multiple spaces are converted to '\\s*+', 
        // whereas the fixed version treats literal spaces without collapsing them into \\s*+.
        // Parsing with a single space where four were expected should fail on fixed but might match on buggy.
        Date date = parser.parse("2020 01 01", new java.text.ParsePosition(0));
        assertNull("Fixed parser should require the exact literal spaces in the pattern", date);
    }
}
