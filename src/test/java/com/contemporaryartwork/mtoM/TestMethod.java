package com.contemporaryartwork.mtoM;
import org.junit.Test;
import java.io.IOException;
public class TestMethod extends MConvertStream{
 
   
     
   
        @Test
        public void testSomething() throws IOException {
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



