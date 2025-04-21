package day1;

public class StringAnalyzer {
    /** Returns a count of how many times smallStr occurs in largeStr, as
     * described in part (a)
     *
     * Precondition: largeStr is not null; smallStr is not null.
     *          The length of smallStr is less than the length of largeStr.
     */
    public static int countRepeat(String largeStr, String smallStr) {
        int count = 0;
        int smallLen = smallStr.length();
        for (int i = 0; i <= largeStr.length() - smallLen; i++) {
            String current = largeStr.substring(i, i + smallLen);
            if (current.equals(smallStr)) {
                count++;
                i += smallLen - 1;
            }
        }
        return count;
    }
}
