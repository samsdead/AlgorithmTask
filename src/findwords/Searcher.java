package findwords;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Your implementation of the coursework.
 * This is the only source file you should modify, and the only one you
 * should submit.  The signatures of these methods should not be modified.
 */
public class Searcher {

    /**
     * Compare the front part of two character arrays for equality.
     * @param s the first character array
     * @param t the second character array
     * @param n number of characters to compare
     * @return true if s and t are equal up to the first n characters
     */
    public boolean equal(String s, String t, int n) {
        // replace the following line with your implementation

        if (s.length() < n || t.length()< n ) {
            return true;
        }

        for (int i = 0; i<n; i++){
                if (s.charAt(i) != t.charAt(i)) {
                    return false;
                }
        }
            return true;
    }


    /**
     * Compare the front part of two character arrays.
     * @param s the first character array
     * @param t the second character array
     * @param n number of characters to compare
     * @return true if s is less than t in the first n characters
     */
    public boolean lessThan(String s, String t, int n) {
        // replace the following line with your implementation
        if (n > s.length()) {
            if (equal(s, t, s.length())) {
                return true;
            }
            return false;
        }
            for (int i = 0; i < n; i++) {
                if (i == n - 1) {
                    if (s.charAt(i) == t.charAt(i)) {
                        return false;
                    }
                }
                if (s.charAt(i) > t.charAt(i)) {
                    return false;
                }

            }
            return true;
        }


    /**
     * Find the first position of a prefix in a dictionary.
     * @param d an ordered dictionary of words
     * @param w a prefix to search for
     * @param n number of characters to compare
     * @return the least index such that all earlier entries in the dictionary
     * are smaller than e when comparing the first n characters.
     */
    public int findPrefix(Dictionary d, String w, int n) {
        // replace the following line with your implementation
        int lo = 0;
        int hi = d.size()-1;
        int mid;
        while (lo<hi){
            mid = (lo+hi) /2;
            if (this.lessThan(d.getWord(mid), w,n)){
            lo= mid+1;
            }else {
                hi = mid-1;
            }


        }
        return lo;
    }

    /**
     * Search a dictionary for words matching a clue.
     * @param d an ordered dictionary of words
     * @param clue a word to search for, with . standing for any character
     * @return a list of all the words in the dictionary that match the clue
     */
    public ArrayList<String> findMatches(Dictionary d, String clue) {
        ArrayList<String> matches = new ArrayList<>();
        // fill in your implementation here to add to matches here
        return matches;
    }
    
}
