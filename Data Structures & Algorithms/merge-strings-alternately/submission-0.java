class Solution {
    public String mergeAlternately(String word1, String word2) {
        String word = "";

        if (word1.length() > word2.length()) 
        {
            int i;
            for (i = 0; i < word2.length(); i++) 
            {
                word = word + word1.charAt(i) + word2.charAt(i);
            }
            word = word + word1.substring(i);
        }
        if (word1.length() < word2.length()) 
        {
            int i;
            for (i = 0; i < word1.length(); i++) 
            {
                word = word + word1.charAt(i) + word2.charAt(i);
            }
            word = word + word2.substring(i);
        }
        if (word1.length() == word2.length()) 
        {
            for (int i = 0; i < word1.length(); i++) 
            {
                word = word + word1.charAt(i) + word2.charAt(i);
            }
        }
        return word;
    }
}