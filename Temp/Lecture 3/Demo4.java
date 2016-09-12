import java.util.Scanner;//Import Scanner class to read a file in the computer
import java.io.File;//Import File class to read a file in the computer
import java.io.FileNotFoundException;//Import FileNotFoundException class if case file is not found in the computer

public class Demo4 {
	public static void main(String[] args) throws FileNotFoundException{

		//Display each word are there in INPUT_TEXT
		Scanner INPUT_TEXT = new Scanner(new File("/Users/zhitaoyin/DemoData.txt"));//Create a Scanner Class and File Class to read a file from your computer.
        
		INPUT_TEXT.useDelimiter(" "); //Divide DemoData.txt into several pieces by a space (The code could be useful to finish Assignment 2.)
		//Display each word or number in the DemoData.txt
        while(INPUT_TEXT.hasNext()){
        	
        	String TempString=INPUT_TEXT.next();//Read each piece
            
            System.out.println(TempString);//Display each piece
        }
        INPUT_TEXT.close();//Close your Scanner.
        
	}

}


