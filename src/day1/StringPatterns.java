package day1;

public class StringPatterns {
    /** Returns the String that results when letter and pattern are
     * compared, as described in part (a)
     *
     * Precondition: letter consists of one uppercase letter.
     *     pattern has at least 2 letters and all letters are uppercase
     *     and unique.
     */
    public static String letterAndPattern(String letter, String pattern) {
        String reversed = "";
        for (int i = pattern.length() - 1; i >= 0; i--) {
            String current = pattern.substring(i, i + 1);
            if (current.equals(letter)) return letter;
            reversed += current;
        }
        return reversed;
    }
}