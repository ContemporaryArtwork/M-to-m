package com.contemporaryartwork.mtoM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;



public class MConvertStream {
    static String ReplacementString = UUID.randomUUID().toString();
    public static void main(String[] args) throws IOException, FileNotFoundException{
    	FileInputStream inputStream = null;
    	Scanner ScanFile = null;
        String InputFile = args[0];
        File InputChangedtoFile = new File(InputFile);
        try{

        	inputStream = new FileInputStream(InputChangedtoFile);
        	ScanFile = new Scanner(inputStream, "UTF-8");
        	while (ScanFile.hasNextLine()){
        		String OutputString = sc.nextLine();
        		String ModifiedOutputString = OutputString;
        		
        		ModifiedOutputString = output2.replace("M", ReplacementString);
                ModifiedOutputString = output2.replace("m", "M");
                ModifiedOutputString = output2.replace(ReplacementString, "m");
                System.out.println("" + output2);

        	}
        	 if (ScanFile.ioException() != null) {
        	        throw ScanFile.ioException();
        	    }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (sc != null) {
                ScanFile.close();
            }
        }
        	
        
        

    }
}
