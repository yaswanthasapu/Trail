package task;

import java.util.*;

public class Task2 {
    public static void main(String args[]) throws Cust_Exception {
        // Given Input String containing duplicate words
        String input = "Alive is Awesome. is also known as RedDevil";
        String[] strArray = input.split(" ");
        // Converting String array to List of String
        List<String> listOfWords = Arrays.asList(strArray);
        HashSet<String> uniqueWords = new HashSet<>(listOfWords);
            for(String word : uniqueWords)
            {
                if(Collections.frequency(listOfWords,word) > 1)
                    System.out.print(" " + word + " ");

            }if(uniqueWords.contains(listOfWords)) {
            throw new Cust_Exception("");
        }

    }
}
