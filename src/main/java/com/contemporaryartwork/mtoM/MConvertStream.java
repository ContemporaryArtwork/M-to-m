package com.contemporaryartwork.mtoM;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Charstream {
    public static void main(String[] args) throws IOException {

        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader(args[0]);
            
            int c;
            while ((c = inputStream.read()) != -1) {
                if (c == 77){
                	c = 109;
                	System.out.print(Character.toChars(c));
                	
                }
                else if (c == 109){
                	c = 77;
                	System.out.print(Character.toChars(c));
                	
                }
                else if (c != 78 || c != 110){
                	System.out.print(Character.toChars(c));
                	
                }
                
            	
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
}
