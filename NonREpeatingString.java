import java.util.LinkedHashMap;
import java.util.Map;

public class NonREpeatingString {

    public static String nonRepeatingString(String inputStr) {
        Map<Character, Boolean> charCount = new LinkedHashMap<>();
             StringBuilder result = new StringBuilder();

        // Iterate through the string to count occurrences and store the last index of each character
        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);

            // Update the count of the character
          

            if( !charCount.containsKey(c)){
           

                charCount.put(c, true);
                     result.append(c);
           
            }
           
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String inputString = "aabbcde";
        String ans = nonRepeatingString(inputString);

        if (!ans.isEmpty()) {
            System.out.println("The non-repeating string is: " + ans);
        } else {
            System.out.println("No non-repeating character found in the string.");
        }
    }
}

