package com.contemporaryartwork.mtoM;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

import java.io.IOException;
public class TestMethod{
 
   
     
   
        @Test
        public void testSomething() throws IOException {
         boolean IsComplete = false;
           String[] Input = {"src/test/resources/KLSadd.tex"};
            MConvertStream.main(Input);
            assertTrue(IsComplete);
           
            


        }
    }



