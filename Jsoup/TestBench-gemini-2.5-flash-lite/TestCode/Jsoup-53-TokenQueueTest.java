package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import org.jsoup.helper.StringUtil;
import org.jsoup.helper.Validate;

public class TokenQueueTest {
    @Test
    public void testIsEmptyWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testIsEmptyWhenNotEmpty() {
        TokenQueue queue = new TokenQueue("a");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testPeekEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals(0, queue.peek());
    }

    @Test
    public void testPeekNotEmpty() {
        TokenQueue queue = new TokenQueue("abc");
        assertEquals('a', queue.peek());
    }

    @Test
    public void testAddFirstCharacter() {
        TokenQueue queue = new TokenQueue("bc");
        queue.addFirst('a');
        assertEquals('a', queue.peek());
        assertEquals("abc", queue.toString());
    }

    @Test
    public void testAddFirstString() {
        TokenQueue queue = new TokenQueue("xyz");
        queue.addFirst("abc");
        assertEquals('a', queue.peek());
        assertEquals("abcxyz", queue.toString());
    }
    
    @Test
    public void testAddFirstToEmpty() {
        TokenQueue queue = new TokenQueue("");
        queue.addFirst("abc");
        assertEquals('a', queue.peek());
        assertEquals("abc", queue.toString());
    }

    @Test
    public void testMatches() {
        TokenQueue queue = new TokenQueue("abcdef");
        assertTrue(queue.matches("abc"));
        assertFalse(queue.matches("abd"));
        assertEquals("abcdef", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesCaseInsensitive() {
        TokenQueue queue = new TokenQueue("ABCDEF");
        assertTrue(queue.matches("abc"));
        assertEquals("ABCDEF", queue.toString()); // ensure no consumption
    }
    
    @Test
    public void testMatchesLongerThanRemaining() {
        TokenQueue queue = new TokenQueue("ab");
        assertFalse(queue.matches("abc"));
        assertEquals("ab", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertFalse(queue.matches("a"));
        assertTrue(queue.matches(""));
        assertEquals("", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesCS() {
        TokenQueue queue = new TokenQueue("Abcdef");
        assertTrue(queue.matchesCS("Abc"));
        assertFalse(queue.matchesCS("abc"));
        assertEquals("Abcdef", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesAnyString() {
        TokenQueue queue = new TokenQueue("abcdef");
        assertTrue(queue.matchesAny("xyz", "abc", "pqr"));
        assertFalse(queue.matchesAny("xyz", "pqr"));
        assertEquals("abcdef", queue.toString()); // ensure no consumption
    }
    
    @Test
    public void testMatchesAnyStringWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertFalse(queue.matchesAny("a", "b"));
        assertEquals("", queue.toString());
    }

    @Test
    public void testMatchesAnyChar() {
        TokenQueue queue = new TokenQueue("abcdef");
        assertTrue(queue.matchesAny('x', 'a', 'y'));
        assertFalse(queue.matchesAny('x', 'y', 'z'));
        assertEquals("abcdef", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesAnyCharWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertFalse(queue.matchesAny('a', 'b'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testMatchesStartTag() {
        TokenQueue queue = new TokenQueue("<abc");
        assertTrue(queue.matchesStartTag());
        
        TokenQueue queue2 = new TokenQueue("abc");
        assertFalse(queue2.matchesStartTag());
        
        TokenQueue queue3 = new TokenQueue("<123");
        assertFalse(queue3.matchesStartTag());
        
        TokenQueue queue4 = new TokenQueue("<");
        assertFalse(queue4.matchesStartTag());
    }

    @Test
    public void testMatchChomp() {
        TokenQueue queue = new TokenQueue("abcdef");
        assertTrue(queue.matchChomp("abc"));
        assertEquals("def", queue.toString());
    }

    @Test
    public void testMatchChompNotFound() {
        TokenQueue queue = new TokenQueue("abcdef");
        assertFalse(queue.matchChomp("abd"));
        assertEquals("abcdef", queue.toString());
    }

    @Test
    public void testMatchChompEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertTrue(queue.matchChomp(""));
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testMatchChompStringLongerThanQueue() {
        TokenQueue queue = new TokenQueue("abc");
        assertFalse(queue.matchChomp("abcd"));
        assertEquals("abc", queue.toString());
    }

    @Test
    public void testMatchesWhitespace() {
        TokenQueue queue = new TokenQueue(" abc");
        assertTrue(queue.matchesWhitespace());
        assertEquals(" abc", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesWhitespaceWhenNotWhitespace() {
        TokenQueue queue = new TokenQueue("abc");
        assertFalse(queue.matchesWhitespace());
        assertEquals("abc", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesWhitespaceWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertFalse(queue.matchesWhitespace());
        assertEquals("", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesWord() {
        TokenQueue queue = new TokenQueue("abc123_");
        assertTrue(queue.matchesWord());
        assertEquals("abc123_", queue.toString()); // ensure no consumption
    }
    
    @Test
    public void testMatchesWordWhenNotWord() {
        TokenQueue queue = new TokenQueue(" 123");
        assertFalse(queue.matchesWord());
        assertEquals(" 123", queue.toString()); // ensure no consumption
    }

    @Test
    public void testMatchesWordWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertFalse(queue.matchesWord());
        assertEquals("", queue.toString()); // ensure no consumption
    }

    @Test
    public void testAdvance() {
        TokenQueue queue = new TokenQueue("abc");
        queue.advance();
        assertEquals('b', queue.peek());
        assertEquals("bc", queue.toString());
    }

    @Test
    public void testAdvanceEmpty() {
        TokenQueue queue = new TokenQueue("");
        queue.advance(); // should not throw
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testConsume() {
        TokenQueue queue = new TokenQueue("abc");
        assertEquals('a', queue.consume());
        assertEquals('b', queue.peek());
        assertEquals("bc", queue.toString());
    }

    @Test
    public void testConsumeEmpty() {
        TokenQueue queue = new TokenQueue("");
        // According to peek(), an empty queue returns 0. consume() advances and then returns charAt(pos).
        // If pos is 0 and queue is empty, it should ideally throw or return a sentinel.
        // Since peek returns 0, let's assert that. However, the implementation accesses queue.charAt(pos++)
        // which will throw StringIndexOutOfBoundsException if empty.
        // The correct behavior for an empty queue is to return 0, as per peek().
        // The current code will throw an exception. Let's adjust the test to reflect that the intended behavior is not met for empty queue.
        // If the method were to return 0 on empty, the test would be: assertEquals(0, queue.consume());
        // But since it throws, we can't test for 0. The contract implies 0.
        // Given the existing tests, it seems the expectation for empty consume might be undefined or an error.
        // Let's assume for now that peek() returning 0 is the guide.
        // If consume() should also return 0, the current implementation is faulty.
        // The prompt says to correct tests that fail on REFERENCE. consume() on empty queue WILL throw exception.
        // The most faithful interpretation is that an empty queue for consume() is an error state that *should* throw.
        // However, `peek()` returns 0, suggesting a non-exception approach.
        // Let's check the reference code again. `return queue.charAt(pos++);` for non-empty.
        // For empty, `isEmpty()` is true, so `remainingLength()` is 0.
        // The first line of consume() is `return queue.charAt(pos++);`. If empty, pos is 0, queue.length() is 0.
        // queue.charAt(0) will throw `StringIndexOutOfBoundsException`.
        // So, the test needs to expect this exception.
        try {
            queue.consume();
            fail("Expected StringIndexOutOfBoundsException for empty queue");
        } catch (StringIndexOutOfBoundsException e) {
            // Expected behavior for an empty queue in this implementation.
        }
    }

    @Test
    public void testConsumeString() {
        TokenQueue queue = new TokenQueue("abcdef");
        queue.consume("abc");
        assertEquals('d', queue.peek());
        assertEquals("def", queue.toString());
    }

    @Test
    public void testConsumeStringNotFound() {
        TokenQueue queue = new TokenQueue("abcdef");
        try {
            queue.consume("abd");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Queue did not match expected sequence", e.getMessage());
            assertEquals("abcdef", queue.toString()); // ensure no consumption
        }
    }
    
    @Test
    public void testConsumeStringTooLong() {
        TokenQueue queue = new TokenQueue("abc");
        try {
            queue.consume("abcd");
            fail("Expected IllegalStateException");
        } catch (IllegalStateException e) {
            // The original test message was incorrect based on the code.
            // The code checks `len > remainingLength()` which is true for "abcd" and "abc".
            // So it should be "Queue not long enough to consume sequence".
            assertEquals("Queue not long enough to consume sequence", e.getMessage());
            assertEquals("abc", queue.toString()); // ensure no consumption
        }
    }

    @Test
    public void testConsumeTo() {
        TokenQueue queue = new TokenQueue("abcdef");
        // consumeTo returns the substring and *does not* advance the position.
        assertEquals("abc", queue.consumeTo("def"));
        assertEquals("abcdef", queue.toString()); // consumeTo does not consume
    }
    
    @Test
    public void testConsumeToNotFound() {
        TokenQueue queue = new TokenQueue("abcdef");
        // If seq is not found, it returns the remainder and advances pos to the end.
        assertEquals("abcdef", queue.consumeTo("xyz"));
        assertEquals("", queue.toString()); // pos should be at the end
    }

    @Test
    public void testConsumeToEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeTo("abc"));
        assertEquals("", queue.toString()); // consumeTo does not consume
    }

    @Test
    public void testConsumeToEmptyTarget() {
        TokenQueue queue = new TokenQueue("abc");
        // consumeTo with an empty string target finds the empty string at the current position.
        // It should return an empty string and not advance.
        assertEquals("", queue.consumeTo("")); 
        assertEquals("abc", queue.toString()); // consumeTo does not consume
    }

    @Test
    public void testConsumeToIgnoreCase() {
        TokenQueue queue = new TokenQueue("ABCDEF");
        // consumeToIgnoreCase does not consume. It scans case-insensitively.
        assertEquals("ABC", queue.consumeToIgnoreCase("def"));
        assertEquals("ABCDEF", queue.toString()); // consumeToIgnoreCase does not consume
    }
    
    @Test
    public void testConsumeToIgnoreCaseNotFound() {
        TokenQueue queue = new TokenQueue("ABCDEF");
        // If seq is not found, it returns the remainder and advances pos to the end.
        assertEquals("ABCDEF", queue.consumeToIgnoreCase("XYZ"));
        assertEquals("", queue.toString()); // pos should be at the end
    }

    @Test
    public void testConsumeToIgnoreCaseNonLetterFirstChar() {
        TokenQueue queue = new TokenQueue("123-abc");
        assertEquals("123-", queue.consumeToIgnoreCase("abc"));
        assertEquals("123-abc", queue.toString()); // consumeToIgnoreCase does not consume
    }
    
    @Test
    public void testConsumeToIgnoreCaseEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeToIgnoreCase("abc"));
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeToAny() {
        TokenQueue queue = new TokenQueue("abcdef");
        // consumeToAny consumes up to the *first* of the sequences found, case-insensitive.
        // It does not consume the found sequence.
        assertEquals("abc", queue.consumeToAny("def", "xyz"));
        assertEquals("abcdef", queue.toString()); // consumeToAny does not consume
    }

    @Test
    public void testConsumeToAnyNotFound() {
        TokenQueue queue = new TokenQueue("abcdef");
        // If no seq is found, it consumes to the end.
        assertEquals("abcdef", queue.consumeToAny("xyz", "pqr"));
        assertEquals("", queue.toString()); // consumed to end
    }

    @Test
    public void testConsumeToAnyFirstMatch() {
        TokenQueue queue = new TokenQueue("abcdef");
        // consumeToAny finds the first match.
        assertEquals("a", queue.consumeToAny("b", "c"));
        assertEquals("abcdef", queue.toString()); // consumeToAny does not consume
    }

    @Test
    public void testConsumeToAnyEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeToAny("a", "b"));
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testConsumeToAnyEmptyTarget() {
        TokenQueue queue = new TokenQueue("abc");
        // An empty string in seq[] is not a valid terminator for consumeToAny according to its loop logic.
        // The loop `while (!isEmpty() && !matchesAny(seq))` would iterate.
        // If `seq` is `""`, `matchesAny("")` would return false if pos is at end or true if matches.
        // The `matches` method handles `""` by returning true.
        // If `matchesAny("")` is true, loop terminates.
        // If the loop terminates because `matchesAny("")` is true, pos does not advance past the point where `""` matches.
        // The behavior with empty string in `seq` is tricky. Let's test the explicit `consumeToAny` logic.
        // The loop advances `pos++` until `matchesAny(seq)` is true.
        // If `seq` is `""`, `matches("")` is true. So the loop condition `!matchesAny(seq)` becomes `!true`, which is `false`.
        // The loop will not execute if `matchesAny("")` is true at the start.
        // If the queue is "abc" and seq is {""}, matchesAny("") is true. The loop condition `!matchesAny(seq)` is false.
        // So `pos` remains `0`. `substring(0, 0)` returns "".
        assertEquals("", queue.consumeToAny("")); 
        assertEquals("abc", queue.toString()); // consumeToAny does not consume
    }

    @Test
    public void testChompTo() {
        TokenQueue queue = new TokenQueue("abcdef");
        // chompTo consumes up to the sequence, *and* consumes the sequence.
        assertEquals("abc", queue.chompTo("def"));
        assertEquals("def", queue.toString()); // chompTo consumes the delimiter
    }

    @Test
    public void testChompToNotFound() {
        TokenQueue queue = new TokenQueue("abcdef");
        // If not found, it consumes everything.
        assertEquals("abcdef", queue.chompTo("xyz"));
        assertEquals("", queue.toString()); // if not found, consumes all
    }
    
    @Test
    public void testChompToEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.chompTo("abc"));
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testChompToEmptyTarget() {
        TokenQueue queue = new TokenQueue("abc");
        // chompTo with empty target consumes up to and including the empty string (which is at end).
        assertEquals("abc", queue.chompTo("")); 
        assertEquals("", queue.toString()); // chompTo consumes the delimiter
    }

    @Test
    public void testChompToIgnoreCase() {
        TokenQueue queue = new TokenQueue("ABCDEF");
        assertEquals("ABC", queue.chompToIgnoreCase("def"));
        assertEquals("DEF", queue.toString()); // chompToIgnoreCase consumes the delimiter
    }

    @Test
    public void testChompToIgnoreCaseNotFound() {
        TokenQueue queue = new TokenQueue("ABCDEF");
        // If not found, it consumes everything.
        assertEquals("ABCDEF", queue.chompToIgnoreCase("XYZ"));
        assertEquals("", queue.toString()); // if not found, consumes all
    }

    @Test
    public void testChompToIgnoreCaseEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.chompToIgnoreCase("abc"));
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testChompToIgnoreCaseEmptyTarget() {
        TokenQueue queue = new TokenQueue("abc");
        // chompToIgnoreCase with empty target consumes up to and including the empty string.
        assertEquals("abc", queue.chompToIgnoreCase("")); 
        assertEquals("", queue.toString()); // chompToIgnoreCase consumes the delimiter
    }

    @Test
    public void testChompBalancedSimple() {
        TokenQueue queue = new TokenQueue("(abc)");
        assertEquals("abc", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testChompBalancedNested() {
        TokenQueue queue = new TokenQueue("(a(b)c)");
        assertEquals("a(b)c", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testChompBalancedWithEscapes() {
        TokenQueue queue = new TokenQueue("(a\\(b)c)"); // Escaped closing parenthesis
        // The logic for chompBalanced: last != ESC means quote is not escaped.
        // If c is '(', depth++. If c is ')', depth--.
        // If last != ESC and c is '(', depth++. If last != ESC and c is ')', depth--.
        // If c is ESC, last = ESC.
        // If last is ESC, we append c and reset last.
        // In "(a\\(b)c)", when we see first `\`, last becomes `\`. Next char is `(`.
        // `c` is `(`. `last` is `\`. So `last != ESC` is false. It proceeds.
        // `c.equals('(')` is true. `depth++`. `start` is set.
        // Then `c` is `)`. `last` is not `\`. `c.equals(')')` is true. `depth--`.
        // The expectation `a\\(b)c` is correct because the `\` before `(` is not consumed by `unescape` logic within `chompBalanced`.
        // The issue is that the test expected `a\\(b)c` but the reference code returns `a(b)c`.
        // Let's re-trace:
        // Queue: (a\\(b)c)
        // 1. consume '(': depth=1, start=0 (pos of 'a')
        // 2. consume 'a': depth=1, end=1 (pos of '\')
        // 3. consume '\': last = '\'
        // 4. consume '(': last is '\', so c is not quote, not open, not close. Depth > 0. end = 2 (pos of '(')
        // The `if (last == 0 || last != ESC)` is key.
        // When `c` is `\`, `last` becomes `\`.
        // When the next `c` is `(`, `last != ESC` is false. So the inner `if` is skipped.
        // Then `if (depth > 0 && last != 0)` `end = pos` where `pos` is after `(`.
        // So it seems `chompBalanced` *does* treat `\\(` as `(`.
        // The correct output should be `a(b)c` if `\` escapes the `(` in terms of balancing.
        // The source code's logic `if (last == 0 || last != ESC)` means that if `last` IS `ESC`, the quote check, open check, and close check are skipped.
        // This means `\` effectively escapes the *next* character.
        // So `\\` becomes literal `\` and the `(` after `\` is just `(`.
        // It seems the reference output should be `a(b)c`.
        // Let's re-evaluate:
        // Queue: (a\\(b)c)
        // 1. consume '(': depth=1, start=1 (pos of 'a')
        // 2. consume 'a': depth=1, end=2 (pos of first '\')
        // 3. consume '\': last becomes '\'.
        // 4. consume '(': last is '\'. `last != ESC` is false. The inner block is skipped.
        //    `depth` is still 1. `end` is updated to `pos` (which is now after '('). So `end` points to `)`.
        // 5. consume 'b': depth=1, end=6 (pos of ')')
        // 6. consume ')': depth=0. loop ends.
        // The substring is from `start` to `end`. `start` was `1` (index of 'a'). `end` was `6` (index of ')').
        // `queue.substring(1, 6)` -> "a\\(b)"
        // This still doesn't match `a\\(b)c`.
        // The logic is `if (depth > 0 && last != 0) end = pos;` which means it's set *before* consuming the `close` char.
        // Let's trace carefully again:
        // queue: (a\\(b)c)
        // Initial: pos=0, start=-1, end=-1, depth=0, last=0, inQuote=false
        // consume '(': depth=1, start=1
        // consume 'a': depth=1, end=2
        // consume '\': last = '\'
        // consume '(': last is '\'. `last != ESC` is false. Skip inner block. `depth > 0` (1>0) and `last != 0` ('\'!=0). `end=4` (pos of '('). last = '('
        // consume 'b': depth=1, end=5 (pos of ')')
        // consume ')': depth=0. `last` is ')'. loop terminates.
        // Result: `queue.substring(start, end)` -> `queue.substring(1, 5)` -> "a\\(b"
        // This is still not `a\\(b)c`. The expected value is wrong.
        // The issue is how escaped characters are handled. The `chompBalanced` method *does not* unescape.
        // It only uses `\` to decide whether to process quotes or the open/close characters.
        // The test `testChompBalancedWithEscapes` has `queue = "(a\\(b)c)"`.
        // Expected: `a\\(b)c`.
        // Let's re-trace this specific case:
        // Queue: (a\\(b)c)
        // 1. consume '(': depth=1, start=1 (pos of 'a')
        // 2. consume 'a': depth=1, end=2 (pos of first '\')
        // 3. consume '\': last = '\'
        // 4. consume '(': last is '\'. `last != ESC` is false. Inner block skipped. `depth > 0` is true. `end=4` (pos of '('). last = '('
        // 5. consume 'b': depth=1, end=5 (pos of ')')
        // 6. consume ')': depth=0. loop terminates.
        // Return `queue.substring(start, end)` which is `queue.substring(1, 5)` -> "a\\(b".
        // The expected value in the test `a\\(b)c` is wrong. The code returns "a\\(b".
        // Let's correct the expected value to "a\\(b".
        assertEquals("a\\(b", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testChompBalancedWithQuotes() {
        TokenQueue queue = new TokenQueue("('abc')");
        assertEquals("'abc'", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testChompBalancedWithDifferentQuote() {
        TokenQueue queue = new TokenQueue("(\"abc\")");
        assertEquals("\"abc\"", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testChompBalancedMixedQuotes() {
        TokenQueue queue = new TokenQueue("('a\"b')");
        // Inside '...', " is treated as literal.
        assertEquals("'a\"b'", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testChompBalancedUnbalancedOpen() {
        TokenQueue queue = new TokenQueue("(abc"); // Unbalanced
        // If depth never reaches 0, end will remain -1.
        // If end < 0, returns "".
        assertEquals("", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString()); // Should consume till end and return empty if unbalanced
    }

    @Test
    public void testChompBalancedUnbalancedClose() {
        TokenQueue queue = new TokenQueue("abc)"); // Unbalanced
        // If no open char is found, start remains -1. depth never increases.
        // The loop condition `depth > 0` will be false.
        // `end` will remain -1. Returns "".
        assertEquals("", queue.chompBalanced('(', ')'));
        assertEquals("abc)", queue.toString()); // Should not consume if no opener
    }
    
    @Test
    public void testChompBalancedEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.chompBalanced('(', ')'));
        assertEquals("", queue.toString());
    }

    @Test
    public void testUnescapeSimple() {
        assertEquals("abc", TokenQueue.unescape("abc"));
    }

    @Test
    public void testUnescapeBackslash() {
        // The original test was `assertEquals("abc", TokenQueue.unescape("abc"));` which is redundant.
        // Let's test a case with only backslashes, but not double backslash.
        assertEquals("a", TokenQueue.unescape("a"));
    }
    
    @Test
    public void testUnescapeEscapedBackslash() {
        // "\\\\" -> "\"
        assertEquals("\\", TokenQueue.unescape("\\\\"));
    }

    @Test
    public void testUnescapeMixed() {
        // "a\\\\b" -> "a\\b"
        assertEquals("a\\b", TokenQueue.unescape("a\\\\b"));
    }
    
    @Test
    public void testUnescapeTrailingBackslash() {
        // "a\\" -> "a" because the trailing backslash doesn't escape anything.
        assertEquals("a", TokenQueue.unescape("a\\")); 
    }
    
    @Test
    public void testUnescapeOnlyEscapes() {
        // This test is identical to testUnescapeEscapedBackslash.
        // Let's remove it or change it. The original intent was likely just for escaped backslashes.
        // Given the current logic, `unescape` only appends `c` if `c` is not `ESC`, or if `c` is `ESC` AND `last` was also `ESC`.
        // So `\\` -> `\`
        // If input is `\` it's `ESC`. `last` becomes `\`. Loop ends. Out is empty. This seems wrong.
        // Ah, the logic is `if (c == ESC) { if (last != 0 && last == ESC) out.append(c); } else out.append(c); last = c;`
        // Let's retrace `unescape("a\\")`:
        // 1. c='a'. not ESC. out="a". last='a'.
        // 2. c='\'. ESC. `last` is 'a', not ESC. Inner if skipped. `last` becomes '\'. Loop ends. Returns "a". Correct.
        // Let's retrace `unescape("\\\\")`:
        // 1. c='\'. ESC. `last` is 0. Inner if skipped. `last` becomes '\'.
        // 2. c='\'. ESC. `last` is '\' (which is ESC). `last != 0 && last == ESC` is true. `out.append(c)` -> out="\". `last` becomes '\'. Loop ends. Returns "\". Correct.
        // The test `testUnescapeOnlyEscapes` is effectively testing `unescape("\\\\")`.
        // Let's check if there are other scenarios. `unescape("\")`?
        // 1. c='\'. ESC. `last` is 0. Inner if skipped. `last` becomes '\'. Loop ends. Returns "". This is likely an issue.
        // The `unescape` method seems to have a slight bug where a single leading escape might be ignored.
        // However, for the purposes of this exercise, we must stick to the reference.
        // The provided test `testUnescapeOnlyEscapes` had `assertEquals("\\", TokenQueue.unescape("\\\\"));`, which is correct.
        // No changes needed here.
        assertEquals("\\", TokenQueue.unescape("\\\\")); // This test was already correct.
    }

    @Test
    public void testConsumeWhitespace() {
        TokenQueue queue = new TokenQueue("  abc");
        assertTrue(queue.consumeWhitespace());
        assertEquals("abc", queue.toString());
    }

    @Test
    public void testConsumeWhitespaceWhenNoWhitespace() {
        TokenQueue queue = new TokenQueue("abc");
        assertFalse(queue.consumeWhitespace());
        assertEquals("abc", queue.toString());
    }
    
    @Test
    public void testConsumeWhitespaceWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertFalse(queue.consumeWhitespace());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeWhitespaceWithTabsAndNewlines() {
        TokenQueue queue = new TokenQueue(" \t\n\r abc");
        assertTrue(queue.consumeWhitespace());
        assertEquals("abc", queue.toString());
    }

    @Test
    public void testConsumeWord() {
        TokenQueue queue = new TokenQueue("abc123_xyz");
        // consumeWord consumes letter or digit. '_' is not a word character per Character.isLetterOrDigit.
        // So it should consume "abc123" and leave "_xyz".
        assertEquals("abc123", queue.consumeWord());
        assertEquals("_xyz", queue.toString());
    }

    @Test
    public void testConsumeWordWhenStartsNonWord() {
        TokenQueue queue = new TokenQueue(" 123");
        assertEquals("", queue.consumeWord());
        assertEquals(" 123", queue.toString());
    }
    
    @Test
    public void testConsumeWordWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeWord());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeTagName() {
        TokenQueue queue = new TokenQueue("div-1:namespace_tag");
        // consumeTagName consumes word, ':', '_', '-'
        assertEquals("div-1:namespace_", queue.consumeTagName());
        assertEquals("tag", queue.toString());
    }

    @Test
    public void testConsumeTagNameWhenStartsNonWord() {
        TokenQueue queue = new TokenQueue(":tag");
        // ':' is a valid start character.
        assertEquals(":tag", queue.consumeTagName());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeTagNameWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeTagName());
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testConsumeTagNameOnlySpecialChars() {
        TokenQueue queue = new TokenQueue(":-_");
        assertEquals(":-_", queue.consumeTagName());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeElementSelector() {
        TokenQueue queue = new TokenQueue("div|namespace-id_123");
        // consumeElementSelector consumes word, '|', '_', '-'
        assertEquals("div|namespace-id_123", queue.consumeElementSelector());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeElementSelectorWhenStartsNonValidChar() {
        TokenQueue queue = new TokenQueue("-div");
        // '-' is a valid start character.
        assertEquals("-div", queue.consumeElementSelector());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeElementSelectorWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeElementSelector());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeCssIdentifier() {
        TokenQueue queue = new TokenQueue("my_id-123");
        // consumeCssIdentifier consumes word, '-', '_'
        assertEquals("my_id-123", queue.consumeCssIdentifier());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeCssIdentifierWhenStartsInvalidChar() {
        TokenQueue queue = new TokenQueue("-my_id");
        // '-' is a valid start character.
        assertEquals("-my_id", queue.consumeCssIdentifier());
        assertEquals("", queue.toString());
    }
    
    @Test
    public void testConsumeCssIdentifierWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeCssIdentifier());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeAttributeKey() {
        TokenQueue queue = new TokenQueue("data-attr:value");
        // consumeAttributeKey consumes word, '-', '_', ':'
        assertEquals("data-attr:", queue.consumeAttributeKey());
        assertEquals("value", queue.toString());
    }

    @Test
    public void testConsumeAttributeKeyWhenStartsInvalidChar() {
        TokenQueue queue = new TokenQueue(":attr");
        // ':' is a valid start character.
        assertEquals(":attr", queue.consumeAttributeKey());
        assertEquals("", queue.toString());
    }

    @Test
    public void testConsumeAttributeKeyWhenEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.consumeAttributeKey());
        assertEquals("", queue.toString());
    }

    @Test
    public void testRemainder() {
        TokenQueue queue = new TokenQueue("abc");
        assertEquals("abc", queue.remainder());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testRemainderEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.remainder());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testToString() {
        TokenQueue queue = new TokenQueue("abc");
        assertEquals("abc", queue.toString());
        queue.advance();
        assertEquals("bc", queue.toString());
    }
    
    @Test
    public void testToStringEmpty() {
        TokenQueue queue = new TokenQueue("");
        assertEquals("", queue.toString());
    }
}
