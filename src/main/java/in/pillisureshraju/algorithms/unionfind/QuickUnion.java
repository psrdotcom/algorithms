package in.pillisureshraju.algorithms.unionfind;

import java.util.Arrays;

/**
 * @author Suresh Raju Pilli
 *
 */
public class QuickUnion {
  private int[] id;

  /**
   * Constructor with size of the array
   * 
   * @param N the input size of the array
   */
  public QuickUnion(int N) {
    id = new int[N];

    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  /**
   * Find the root of the element
   * 
   * @param i the element
   * @return the root node
   */
  private int root(int i) {
    while (i != id[i]) {
      i = id[i];
    }
    return i;
  }

  /**
   * Checks whether the node p and q are connected or not
   * 
   * @param p the node p
   * @param q the node q
   * @return true if they are connected already
   */
  public boolean isConnected(int p, int q) {
    return (root(p) == root(q));
  }

  /**
   * Perform union of the graphs
   * 
   * @param p the edge1 of the graph
   * @param q the edge1 of the graph
   */
  public void union(int p, int q) {
    // Find the root of p and q
    int i = root(p);
    int j = root(q);

    // Make j as i parent
    id[i] = j;
  }

  /**
   * Perform the quick-union action
   * 
   * @param edges the two dimensional input of array
   */
  public void perform(int edges[][]) {
    System.out.println("Initial graph:\n" + this.toString());
    for (int[] i : edges) {
      int p = i[0];
      int q = i[1];
      if (!(this.isConnected(p, q))) {
        System.out.println("\nCreate edge for " + p + " and " + q);
        this.union(p, q);
        System.out.println(this.toString());
      }
    }

    System.out.println("\nFinal graph with connected nodes:\n" + this.toString());
  }

  /**
   * Converts the array to string using Arrays utility
   * 
   * @return the array as string with comma delimeted
   */
  public String toString() {
    return Arrays.toString(id);
  }
}