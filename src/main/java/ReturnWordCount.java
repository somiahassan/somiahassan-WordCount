
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
      // Trim the input string to remove leading and trailing spaces
        // Split the string based on one or more spaces
        // Filter out empty segments to handle cases like multiple spaces between words
        String[] words = in.trim().split("\\s+");
        
        // Return the number of words
        return words.length;
    }
}
