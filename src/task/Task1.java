package task;

import javax.xml.transform.stream.StreamSource;
import java.util.*;

public class Task1 {
    public static void main(String args[]) throws Cust_Exception {

        // Given String containing duplicate words
        String input = "life is beautiful life is!....";

        String[] strArray = input.split(" ");

        List<String> repeatedWords = new ArrayList<>();

        HashSet<String> uniqueWords = new HashSet<>();
        for(String str : strArray)
        {
            if (!uniqueWords.add(str))
                repeatedWords.add(str);
        }if(uniqueWords!=repeatedWords){
            System.out.println(repeatedWords);
        } else if (uniqueWords==repeatedWords) {

            throw new Cust_Exception("no");
        }


    }
}
