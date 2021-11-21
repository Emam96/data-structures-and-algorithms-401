
package hash;

import java.util.HashMap;
import java.util.regex.Pattern;

public class Library {


    public static void main(String args[])
    {

        HashTable table = new HashTable();

        table.add(10, 36);

        table.add(100, 20);


        System.out.println(table.get(10));
        System.out.println(table.get(100));



        String exp = "Once upon a time, there was a brave princess who...";
        System.out.println( repeatedWord(exp));


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




}
