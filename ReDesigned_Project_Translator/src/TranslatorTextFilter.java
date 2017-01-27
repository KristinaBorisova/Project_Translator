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
	
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.*; //quick way to import ArrayLists and Scanner

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.io.FileInputStream;



public static void importToFileEnglishWord(String inputWord) {
		try {
			FileWriter bgFile = new FileWriter("bulgarianWords.txt");
			FileWriter enFile = new FileWriter("englishWords.txt");
			BufferedWriter bw = new BufferedWriter(bgFile);
			PrintWriter out = new PrintWriter(bw);
			{
				out.println(inputWord);
			}
		}

		catch (FileNotFoundException e) {

			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
