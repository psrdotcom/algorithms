package in.pillisureshraju.algorithms;

import in.pillisureshraju.algorithms.unionfind.QuickFind;
import in.pillisureshraju.algorithms.unionfind.QuickUnion;
import in.pillisureshraju.algorithms.unionfind.WeightedQuickUnion;

/**
 * App class
 */
public final class App {
    private App() {
    }

    /**
     * Main method
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        int N = 10;
        int edges[][] = { { 4, 3 }, { 3, 8 }, { 6, 5 }, { 9, 4 }, { 2, 1 }, { 8, 9 }, { 5, 0 }, { 7, 2 }, { 6, 1 } };

        QuickFind qf = new QuickFind(N);
        qf.perform(edges);

        QuickUnion qu = new QuickUnion(N);
        qu.perform(edges);

        WeightedQuickUnion wqu = new WeightedQuickUnion(N);
        wqu.perform(edges);
    }
}
