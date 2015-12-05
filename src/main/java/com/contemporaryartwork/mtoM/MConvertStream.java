package com.contemporaryartwork.mtoM;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.UUID;



public class MConvertStream {
    //uses random uuid string to do replacement
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
        		String OutputString = ScanFile.nextLine();
        		String ModifiedOutputString = OutputString;
        		
        		ModifiedOutputString = ModifiedOutputString.replace("M", ReplacementString);
                ModifiedOutputString = ModifiedOutputString.replace("m", "M");
                ModifiedOutputString = ModifiedOutputString.replace(ReplacementString, "m");
                System.out.println("" + ModifiedOutputString);

        	}
        	 if (ScanFile.ioException() != null) {
        	        throw ScanFile.ioException();
        	    }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (ScanFile != null) {
                ScanFile.close();
            }
        }
        	
        
        

    }
}
