package com.contemporaryartwork.mtoM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MConvertStream {
    
    public static void main(String[] args) throws IOException, FileNotFoundException{
    	FileInputStream inputStream = null;
    	Scanner sc = null;
        String input = args[0];
        String file = input;
        File myFile = new File(file);

       
                
        try{

        	inputStream = new FileInputStream(myFile);
        	sc = new Scanner(inputStream, "UTF-8");
        	while (sc.hasNextLine()){
        		String line = sc.nextLine();
        		String output2 = line;
        		output2 = output2.replace("M", "{&-}");
                output2 = output2.replace("m", "M");
                output2 = output2.replace("{&-}", "m");
                System.out.println("" + output2);

        	}
        	 if (sc.ioException() != null) {
        	        throw sc.ioException();
        	    }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                sc.close();
            }
        }
        	
        
        

    }
}
