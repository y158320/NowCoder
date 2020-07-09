package leetcode1;

/**
 * Oh, no! You have accidentally removed all spaces, punctuation, and capitalization in a lengthy document. A sentence like "I reset the computer. It still didn't boot!" became "iresetthecomputeritstilldidntboot''. You'll deal with the punctuation and capi­talization later; right now you need to re-insert the spaces. Most of the words are in a dictionary but a few are not. Given a dictionary (a list of strings) and the document (a string), design an algorithm to unconcatenate the document in a way that minimizes the number of unrecognized characters. Return the number of unrecognized characters.
 *
 * Note: This problem is slightly different from the original one in the book.
 *
 *  
 *
 * Example:
 *
 * Input:
 * dictionary = ["looked","just","like","her","brother"]
 * sentence = "jesslookedjustliketimherbrother"
 * Output:  7
 * Explanation:  After unconcatenating, we got "jess looked just like tim her brother", which containing 7 unrecognized characters.
 * Note:
 *
 * 0 <= len(sentence) <= 1000
 * The total number of characters in dictionary is less than or equal to 150000.
 * There are only lowercase letters in dictionary and sentence.
 *
 */
public class mianshi17_13 {

    public int respace(String[] dictionary, String sentence) {
        if(sentence==null||sentence.length()==0)
        {
            return 0;
        }
        int n=sentence.length();
        if(dictionary==null||dictionary.length==0)
        {
            return n;
        }
        int[] dp=new int[n+1];
        for (int i=0;i<n+1;i++)
        {
            dp[i]=dp[i-1]+1;
            for(String word:dictionary){
                int wlen=word.length();
                if(i-wlen>=0&&sentence.substring(i-wlen,i).equals(word)){
                    dp[i]=Math.min(dp[i-wlen],dp[i]);
                }
            }
        }
        return dp[n];
    }

}
