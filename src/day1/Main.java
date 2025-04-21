package day1;

public class Main {
    public static void main(String[] args) {
        System.out.println(StringPatterns.letterAndPattern("Q", "QUICK"));
        System.out.println(StringPatterns.letterAndPattern("C", "QUICK"));
        System.out.println(StringPatterns.letterAndPattern("Z", "QUICK"));

        System.out.println("\n");

        System.out.println(Operator.compute("orangepear", "$$"));
        System.out.println(Operator.compute("orangepear", "##"));
        System.out.println(Operator.compute("orangepear", "^^"));
        System.out.println(Operator.compute("blah", "$$"));
        System.out.println(Operator.compute("blah", "##"));
        System.out.println(Operator.compute("blah", "^^"));

        System.out.println("\n");

        System.out.println(StringAnalyzer.countRepeat("BAAB", "AA"));
        System.out.println(StringAnalyzer.countRepeat("AAAAA", "AA"));
        System.out.println(StringAnalyzer.countRepeat("AABABABAA", "ABA"));
        System.out.println(StringAnalyzer.countRepeat("ABBAABB", "ABA"));
        System.out.println("---------");
        System.out.println(StringAnalyzer.countRepeat("BABABABA", "BA"));
        System.out.println(StringAnalyzer.countRepeat("AAAAAA", "AA"));
        System.out.println(StringAnalyzer.countRepeat("BABABABA", "ABA"));
        System.out.println(StringAnalyzer.countRepeat("AAAA", "A"));

        System.out.println("\n");

        System.out.println(Identifier.generateID("treebook"));
        System.out.println(Identifier.generateID("doordesklion"));
        System.out.println(Identifier.generateID("doordeskbook"));
        System.out.println(Identifier.generateID("today"));
        System.out.println(Identifier.generateID("doordeskbooks"));
    }
}
