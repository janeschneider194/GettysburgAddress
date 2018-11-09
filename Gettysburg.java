import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Gettysburg 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		Scanner file = new Scanner(new File("GettysburgAddress.txt"));
		ArrayList<String> text = new ArrayList<String>();
		String word;
		
/**
 * creating arraylist
 */
		while(file.hasNext())
		{
			word = file.next();
			text.add(word);
			
			if(word.equals("."))
				text.remove(word);
			
			if(word.equals("-"))
				text.remove(word);
		}

/**
 * biggest word		
 */
		String biggestWord = "";
		
		for(String words: text)
		{
			if(words.length() > biggestWord.length())
				biggestWord = words;
		}
/**
 * average length		
 */
		double sum = 0;
		int totalLength = 0;
		
		for(String words: text)
		{
			int length = words.length();
			totalLength += length;
			sum ++;
		}
		double average = totalLength / sum;
/**
 * print
 */
		System.out.println("biggest word: " + biggestWord);
		System.out.println("average length: " + average);
	
	
	}
		
		
// chapters 5,6,7 for test TUESDAY
//document on website with practice problems for reading code
		
		
}
	
	

