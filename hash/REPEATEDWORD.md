# repeatedWords
# Finding Repeated Words in a String

* Write a function that accepts a lengthy string parameter.
* Without utilizing any of the built-in library methods available, return the first word to occur more than once in that provided string.
* Stretch goal: Modify your function to return a count of each of the words in the provided string
* Stretch goal: Modify your function to return a list of the words most frequently used in the provided string

## Whiteboard Process

![word](https://i.imgur.com/l49ZsjC.jpeg)

## Approach & Efficiency


I am utilizing the hashtable I created to hold words in the String. As I iterate through the String words will be added to the hashtable if they are not there already. If a word is found already in the hashtable it is returned as the first repeated word. If the iteration finishes the method will return null.

Space: O(n) -> worst case scenario for when there are no repeated words
Time: O(n) -> worst case scenario for when there are no repeated words

## Solution

[code](hash/lib/src/main/java/hash/Library.java)<br>
[test](hash/lib/src/test/java/hash/LibraryTest.java)

````

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