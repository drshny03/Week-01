
//import scanner class
import java.util.Scanner;

//Program to split text into words and return the words with their lengths in a 2D array
class SplitTextIntoWords2D{

    //method to find length using user define method
	public static int findTextLength(String text){
		//variable to store length 
		int length = 0;
		
		//variable to track index
		int index = 0;
		
		//infinite loop to find length
		while(true){
			try{
				//get character at index
				text.charAt(index++);
				//increment length by 1
				length++;
			}catch(StringIndexOutOfBoundsException exception){
				//break the loop
				break;
			}
		}
		return length;
	}
    // method to split the text into words
    public static String[] splitTextIntoWords(String text) {
        // variable to store word and count of word
        String word = "";
        int wordCount = 0; 
		int length = findTextLength(text);

        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                // build the word character
                word += ch;
            } else {
                if (!word.isEmpty()) {
                    // increase word count
                    wordCount++;
                    // clear the word
                    word = "";
                }
            }
        }

        // count the last word if present
        if (!word.isEmpty()) {
            wordCount++;
        }

        // create array to store words
        String[] wordArray = new String[wordCount];
        int index = 0;
        word = "";

        // copy words from word list to word array
        for (int i = 0; i < length; i++) {
            char ch = text.charAt(i);
            if (ch != ' ') {
                // build the word
                word += ch;
            } else {
                if (!word.isEmpty()) {
                    // add the word to the array
                    wordArray[index++] = word;
                    // clear the word
                    word = "";
                }

            }
        }
        if (!word.isEmpty()) {
            wordArray[index] = word;
        }
        // return word array
        return wordArray;
    }

    // method to create a 2D array to store words and their lengths
    public static String[][] getWordsWithLengths(String[] words) {
        // 2D array to store words and length
        String[][] wordsWithLengths = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            wordsWithLengths[i][0] = words[i];
            wordsWithLengths[i][1] = String.valueOf(findTextLength(words[i]));
        }

        return wordsWithLengths;
    }

    // main method
    public static void main(String[] args) {
        // create Scanner object
        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.println("Enter text-");
        String text = input.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(text);

        // Get the 2D array of words and their lengths
        String[][] wordsWithLengths = getWordsWithLengths(words);

        // Display the results
        System.out.println("\tWords\tlength");
        for (String[] wordInfo : wordsWithLengths) {
            // get word
            String word = wordInfo[0];
            // convert length from String to Integer
            int length = Integer.parseInt(wordInfo[1]);
            System.out.println("\t" + word + "\t" + length);
        }

        // Close Scanner
        input.close();
    }
}
