package in.pillisureshraju.algorithms.unionfind;

import java.util.Arrays;

/**
 * @author Suresh Raju Pilli
 *
 */
public class QuickFind {
  private int[] id;

  /**
   * Constructor with size of the array
   * 
   * @param N the input size of the array
   */
  public QuickFind(int N) {
    id = new int[N];

    for (int i = 0; i < N; i++) {
      id[i] = i;
    }
  }

  /**
   * Checks whether the node p and q are connected or not
   * 
   * @param p the node p
   * @param q the node q
   * @return true if they are connected already
   */
  public boolean isConnected(int p, int q) {
    return (id[p] == id[q]);
  }

  /**
   * Perform union of the graphs
   * 
   * @param p the edge1 of the graph
   * @param q the edge1 of the graph
   */
  public void union(int p, int q) {
    int pid = id[p], qid = id[q];
    for (int i = 0; i < id.length; i++) {
      if (id[i] == pid) {
        System.out.println("Change graph[" + i + "] with value " + qid);
        id[i] = qid;
      }
    }
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