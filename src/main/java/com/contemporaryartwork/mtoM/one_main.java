package com.contemporaryartwork.mtoM;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one_main {
    public void go(){
        main("KLSadd.tex");
    }
    public static void main(String input){
        String file = input;
        File myFile = new File("/home/travis/build/ContemporaryArtwork/M-to-m/src/main/resources/" + file);
                
        try{
            String output = new Scanner(myFile).useDelimiter("\\Z").next();
            String output1 = output;
            output1 = output1.replace("M", "{&-}");
            output1 = output1.replace("m", "M");
            output1 = output1.replace("{&-}", "m");
            System.out.println(output1);
            if (output.equals(output1)){
                System.out.println("\nnothing was done");
            }
        } catch (FileNotFoundException e){
            System.out.println("please put " + input + " in app directory!");
        }

    }
}
