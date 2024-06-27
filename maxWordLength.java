public class maxWordLength {

    public static String findMaxWord(String inputStr) {
        if (inputStr == null || inputStr.isEmpty()) {
            return null; // Handle empty or null input
        }

        String[] words = inputStr.split("\\s+"); // Split the string into words using whitespace as a delimiter

        if (words.length == 0) {
            return null; // Handle the case where there are no words
        }

        String maxWord =words[0]; // Assume the first word has the maximum length

        for (String word : words) {
            // Compare the length of the current word with the length of the maximum word
            if (word.length() > maxWord.length()) {
                maxWord = word; // Update maxWord if a longer word is found
            }
        }

        return  maxWord;
    }

    public static void main(String[] args) {
        String inputString = "This is a sample string with different words of various lengths";
        String maxWord = findMaxWord(inputString);

        if (maxWord != null) {
            System.out.println("The word with the maximum length is: " + maxWord);
        } else {
            System.out.println("No words found in the input string.");
        }
    }
}

