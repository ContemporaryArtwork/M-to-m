package mM;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class one {
    public static void main (String[] args) {

        String workDir = System.getProperty("user.dir");
        String file = "KLSadd.tex";
        File myFile = new File(workDir + "\\" + file);
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
            System.out.println("please put KLSadd.tex in app directory!");
        }

    }
}