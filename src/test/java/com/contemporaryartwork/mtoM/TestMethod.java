package com.contemporaryartwork.mtoM;
import org.junit.Test;
import java.io.IOException;
public class TestMethod{
 
   
     
   
        @Test
        public void testSomething() throws IOException {
         boolean IsComplete = false;
           String[] Input = {"src/test/resources/KLSadd.tex"};
            MConvertStream.main(Input);
            if (IsComplete = true){
             System.out.println("Test Completed Successfully");
            }
            else {
             System.out.println("Test Failed");
            }


        }
    }



