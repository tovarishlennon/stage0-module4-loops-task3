package school.mjc.stage0.loops.task3;

public class RangeSum {
    public void printSumInclusive(int firstBoarder, int secondBoarder) {
        int acc = 0;
        for (int i = firstBoarder; i <= secondBoarder; i++) {
            acc += i;
        }
        System.out.println(acc);
    }
}
