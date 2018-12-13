package in.pillisureshraju.algorithms;

import in.pillisureshraju.algorithms.unionfind.QuickFind;

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
        System.out.println("Initial graph:\n" + qf.toString());
        for (int[] i : edges) {
            int p = i[0];
            int q = i[1];
            if (!(qf.isConnected(p, q))) {
                System.out.println("\nCreate edge for " + p + " and " + q);
                qf.union(p, q);
                System.out.println(qf.toString());
            }
        }

        System.out.println("\nFinal graph with connected nodes:\n" + qf.toString());
    }
}
