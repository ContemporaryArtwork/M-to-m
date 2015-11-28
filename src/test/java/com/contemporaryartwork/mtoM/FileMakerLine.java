package com.contemporaryartwork.mtoM;




import java.io.*;
import javax.swing.JOptionPane;
public class FileMakerLine {
	public static String q;
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer;
		String in = JOptionPane.showInputDialog(null,"input filesize in MB");
		String name = JOptionPane.showInputDialog(null, "input name");
		int load = 0;
		
		int count = Integer.parseInt(in) * 200000;
		writer  = new PrintWriter(name, "UTF-8");
		int co = 0;
		
		JOptionPane.showMessageDialog (null, "Loading...process will be finished momentarily", "", JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i<count; i++){
			if (co == 90){
				writer.println(" ");
				co = 0;
			}
			for(int k = 0; k<5; k++){
				int c = ran(2);
				if (c==0){
					writer.print(Character.toChars(ran(26)+65));
					co++;
				}
				else{
					writer.print(Character.toChars(ran(26)+97));
					co++;
				}
				
				
				
	
			}
			load++;			
			System.out.println(count);

			System.out.println("->"+load);
			
			
		}
		
		
		JOptionPane.showMessageDialog (null, "Done!", "", JOptionPane.INFORMATION_MESSAGE);
		writer.close();
		System.exit(0);
	}
	public static int ran(int a){
		return (int) (Math.random() * a);
	}
	
}

