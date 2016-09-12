import java.util.Scanner;//Import Scanner class to read a file in the computer
import java.io.File;//Import File class to read a file in the computer
import java.io.FileNotFoundException;//Import FileNotFoundException class if case file is not found in the computer

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo5 {
	public static void main(String[] args) throws FileNotFoundException{

		//Display each word in INPUT_TEXT
		Scanner INPUT_TEXT = new Scanner(new File("/Users/zhitaoyin/Dropbox/CIS3260/Code/Instructor/Lecture3/DemoData.txt"));
		//Create a Scanner Class and File Class to read a file from your computer.
		
        
        while(INPUT_TEXT.hasNext()){
        	
        	String TempString=INPUT_TEXT.next();//Read each word
        	
        	INPUT_TEXT.useDelimiter(" ");//Divide DemoData.txt into several pieces by a space
        	
            //Display each word by using Regular Expression
        	String pattern = "[a-zA-Z]+";//Create a String class to store Regular Expression to identify a word
        	Pattern r = Pattern.compile(pattern);//Create a Pattern class to compile Regular Expression 
        	Matcher m = r.matcher(TempString);//Match each piece with Regular Expression
        	
        	if (m.find( )) {//If a word is matched, print the word.
        		System.out.println(m.group(0));
        	}
        	
        	

        }
        INPUT_TEXT.close();//Close your Scanner.
        
        
        
	}

}

