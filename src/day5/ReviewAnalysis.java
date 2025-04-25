package day5;

import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public ReviewAnalysis(Review[] reviews) {
        allReviews = reviews;
    }

    public double getAverageRating() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with ReviewTester
        double total = 0;
        for (Review review : allReviews) {
            total += review.getRating();
        }
        return total / allReviews.length;
    }

    public ArrayList<String> collectComments() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with ReviewTester
        ArrayList<String> comments = new ArrayList<>();
        for (int i = 0; i < allReviews.length; i++) {
            Review review = allReviews[i];
            String comment = review.getComment();
            if (comment.indexOf("!") != -1) {
                String lastChar = comment.substring(comment.length() - 1);
                if (!lastChar.equals(".") && !lastChar.equals("!")) comment += ".";
                comments.add(i + "-" + comment);
            }
        }
        return comments;
    }
}