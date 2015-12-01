package com.contemporaryartwork.mtoM;




import java.io.*;
import javax.swing.JOptionPane;
public class FileMakeLine {
	public static String q;
	public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException{
		PrintWriter writer;
		String in = JOptionPane.showInputDialog(null,"input approx filesize in MB");
		String name = JOptionPane.showInputDialog(null, "input name");
		int load = 0;
		
		int count = Integer.parseInt(in) * 200000;
		writer  = new PrintWriter(name, "UTF-8");
		int co = 0, check =0, check2 = 0, check3 = 0;
		
		JOptionPane.showMessageDialog (null, "Loading...process will be finished momentarily", "", JOptionPane.INFORMATION_MESSAGE);

		for (int i = 0; i<count; i++){
			if (co == 90){
				writer.println(" ");
				co = 0;
				check2++;
				int compare = 3 + ran(5);
				if (check2 <= 8){
					check2 = 0;
				}
				if (check2 == compare){
					check2 = 0;
					writer.println(" ");
					writer.println(" ");
				}
			}
			
			for(int k = 0; k<5; k++){
				int c = ran(2);//chance of letter being upper or lower case
				int d = ran(3) + 5;//
				int e = ran(5) + 6;//
				int SpaceCheck = ran(7);
				if (c==0){
					writer.print(Character.toChars(ran(26)+65));
					co++;
					check++;
				}
				else{
					writer.print(Character.toChars(ran(26)+97));
					co++;
					check++;
				}
				if (SpaceCheck == check | check > d){
					check3++;
					
					if (check3 >= e){
						check3 =0;
						writer.print(".");
					}
					
					writer.print(" ");
					check = 0;
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

