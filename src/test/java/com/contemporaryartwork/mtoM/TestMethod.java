package com.contemporaryartwork.mtoM;
import org.junit.Test;
import org.junit.Assert.*;
import java.io.IOException;
public class TestMethod{
 
   
     
   
        @Test
        public void testSomething() throws IOException {
         boolean IsComplete = false;
           String[] Input = {"src/test/resources/KLSadd.tex"};
            MConvertStream.main(Input);

            assertTrue (IsComplete);
            //add asser
            


        }
    }



