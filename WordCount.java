//Count number of words in a sentence 
//ICS4U1, Dip Tandel
//Oct 20, 2021

import java.util.Scanner;
public class WordCount {
  public static void main(String[] args) {
    Scanner in = new Scanner (System.in);
    
    System.out.println("Enter a sentence: ");
    String sentence = in.nextLine();
    
    int count = 0;
    for (int i = 0; i < sentence.length()-1; i++) {
      if (sentence.charAt(i) == ' ') {
        count++;
      }
    }

    System.out.println(count+1);
    
  }
}