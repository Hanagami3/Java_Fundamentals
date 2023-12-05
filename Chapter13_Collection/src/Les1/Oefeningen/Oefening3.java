package Les1.Oefeningen;

import java.util.ArrayList;
import java.util.Scanner;

public class Oefening3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String input = "";

        ArrayList<String> wordList = new ArrayList<>();

        while(!input.equals("end")) {
            System.out.print("Enter een word please:  ");
            input = scanner.next().toLowerCase();
            wordList.add(input);
        }
        wordList.remove(wordList.size()-1);
        for (String word : wordList)
            System.out.println(word);
    }

}
