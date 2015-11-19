package com.contemporaryartwork.mtoM;
import org.junit.Test;
public class Test_one{
   static String input;
   
      public static void main(String[] args){
         input = args[0];
         String[] boo = {input};
            one_main.main(boo);
      }
   
        @Test
        public void testSomething() {
           String[] boo = {"KLSadd.tex"};
            one_main.main(boo);


        }
    }



