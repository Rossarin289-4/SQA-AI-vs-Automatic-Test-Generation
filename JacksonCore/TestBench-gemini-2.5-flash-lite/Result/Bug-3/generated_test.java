package com.fasterxml.jackson.core.json;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.*;
import java.util.Arrays;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.base.ParserBase;
import com.fasterxml.jackson.core.io.CharTypes;
import com.fasterxml.jackson.core.io.IOContext;
import com.fasterxml.jackson.core.sym.*;
import com.fasterxml.jackson.core.util.*;

public class UTF8StreamJsonParserTest {

    // Helper to create a parser from a String

    // Helper to create a parser from a String and specify features




    




    

















    
    



    









    

    

    

    


    

    




    


    
    

    

    
    
    


    // Tests for methods not previously covered


    


    @Test
    public void testGrowArrayBy() throws Exception {
        int[] initialArray = {1, 2, 3};
        int[] grownArray = UTF8StreamJsonParser.growArrayBy(initialArray, 5);
        assertEquals(initialArray.length + 5, grownArray.length);
        assertEquals(1, grownArray[0]);
        assertEquals(2, grownArray[1]);
        assertEquals(3, grownArray[2]);

        int[] grownNullArray = UTF8StreamJsonParser.growArrayBy(null, 2);
        assertEquals(2, grownNullArray.length);
    }
}




