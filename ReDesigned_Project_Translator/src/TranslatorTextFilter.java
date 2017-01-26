import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.FileInputStream;
public class TranslatorTextFilter  {

	private JPanel contentPane;

	
	public static void main(String[] args) throws FileNotFoundException {
	
	FileInputStream file = new FileInputStream("bulgarianWords.txt"); //referense to text files
	Scanner fileinput = new Scanner (file);
	int count = 0;
	while (((Iterator<String>) file).hasNext()){
		System.out.println(((Iterator<String>) file).next()+ "\t");
	}
	
	
	FileInputStream file2 = new FileInputStream("englishWords.txt"); //reference to text file englishWords.txt
	
	/*	FileInputStream file = new FileInputStream("bulgarian.txt");
	Scanner fileinput = new Scanner (file);
	int count = 0;
	while (((Iterator<String>) file).hasNext()){
		System.out.println(((Iterator<String>) file).next()+ "\t");
	}
	
	
	
/*	Scanner fileInput = new Scanner(fin);

	// Create ArrayList
	ArrayList<String> words = new ArrayList<String>();
	ArrayList<Integer> count = new ArrayList<Integer>();

	// read trough file and find the words
	while (fileInput.hasNext()) {
		// get the next word
		String nextWord = fileInput.next();

		// Determine if the word is in the arrayList
		if (words.contains(nextWord)) {
			int index = words.indexOf(nextWord);
			count.set(index, count.get(index) + 1);
		} else {
			words.add(nextWord);
			count.add(1);
		}
	}

	
	fileInput.close();
	fin.close();
	//print results 
	for(int i=0; i<words.size(); i++) {
		System.out.println(words.get(i) + " occured " + count.get(i) + " time(s)" );
	}
	*/
	
	}
}
