package Fundamentals;

import edu.princeton.cs.algs4.*;

public class Accumulator {

  private double total;
  private int N;

  public double mean() {
    return total / N;
  }

  public void addDataValue(double val) {
    N++;
    total += val;
  }

  public String toString() {
    return "Mean (" + N + " values): " + String.format("%7.5f", mean());
  }

  public static void main(String[] args) {
    int T = Integer.parseInt(args[0]);
    Accumulator a = new Accumulator();
    for (int t = 0; t < T; t++)
      a.addDataValue(StdRandom.uniform());
    StdOut.println(a);
  }
}
