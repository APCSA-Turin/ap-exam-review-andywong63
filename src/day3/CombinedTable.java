package day3;

public class CombinedTable {
    private SingleTable table1;
    private SingleTable table2;

    public CombinedTable(SingleTable table1, SingleTable table2) {
        this.table1 = table1;
        this.table2 = table2;
    }

    public boolean canSeat(int seats) {
        int tableSeats = table1.getNumSeats() + table2.getNumSeats() - 2;
        return seats <= tableSeats;
    }

    public double getDesirability() {
        double desirability = (table1.getViewQuality() + table2.getViewQuality()) / 2;
        if (table1.getHeight() != table2.getHeight()) {
            desirability -= 10;
        }
        return desirability;
    }
}