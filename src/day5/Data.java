package day5;

public class Data {
    public static final int MAX = 500; // THIS VALUE ADDED TO ENABLE TESTING
    private int[][] grid;

    // CODE ADDED TO ENABLE TESTING; IMPLEMENTATION NOT SHOWN IN ORIGINAL FRQ
    public Data(int[][] g) {
        grid = g;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public int[][] getGrid() {
        return grid;
    }

    // ADDED TO ENABLE TESTING; NOT IN ORIGINAL FRQ
    public void setGrid(int[][] newGrid) {
        grid = newGrid;
    }

    public void repopulate() {
        // TYPE UP YOUR PART A CODE HERE
        // then test with DataTester
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int val = 0;
                while (val % 10 != 0 || val % 100 == 0) {
                    val = (int) (Math.random() * MAX) + 1;
                }
                grid[i][j] = val;
            }
        }
    }

    public int countIncreasingCols() {
        // TYPE UP YOUR PART B CODE HERE
        // then test with DataTester
        int count = 0;
        for (int j = 0; j < grid[0].length; j++) {
            int lastNum = grid[0][j];
            boolean isIncreasing = true;
            for (int i = 1; i < grid.length; i++) {
                if (grid[i][j] < lastNum) isIncreasing = false;
                lastNum = grid[i][j];
            }
            if (isIncreasing) count++;
        }
        return count;
    }
}
