
package hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

public class Library {


    public static void main(String args[])
    {

        HashTable table = new HashTable();

        table.add("one", "36");
        table.add("two", "20");
        table.add("three", "16");


        HashTable table2 = new HashTable();

        table2.add("one", "22");
        table2.add("two", "44");
        table2.add("three", "66");


        System.out.println( table.get("one"));


    }





    public static String repeatedWord(String bookText) {


        HashTable seenWordHashTable = new HashTable();

        StringBuilder word = new StringBuilder();

        Pattern pattern = Pattern.compile("\\w");

        for (int i = 0; i < bookText.length(); i++) {
            String currentCharacter = bookText.substring(i, i + 1).toLowerCase();


            if ((currentCharacter.equals(" ") || currentCharacter.equals("'")) && word.length() == 0) {
                continue;
            }

            if (pattern.matcher(currentCharacter).matches()) {
                word.append(currentCharacter);
            } else {

                if ((currentCharacter.equals("'") || (currentCharacter.equals("-"))  && word.length() > 0)) {
                    word.append(currentCharacter);
                } else if (seenWordHashTable.contain(word.toString())) {
                    return word.toString();

                } else if (word.length() == 0) {
                    continue;
                } else {
                    seenWordHashTable.add(word.toString(), 1);
                    word.delete(0, word.length());
                }
            }
        }
        return "no repeated words";
    }





    public static List<String> leftJoin(HashMap h1, HashMap h2){

        List<String> list = new ArrayList<>();
        for(Object k : h1.keySet()){
            if(h1.containsKey(k)){
                list.add(k +  ": " + h1.get(k)+ ", " + h2.get(k));
            } else{
                list.add(k + ": " + h1.get(k) + ", " + null);
            }
        }

        return list;


    }



}
