package Fundamentals;

import edu.princeton.cs.algs4.*;

public class Counter {
  private int count;
  private final String name;

  public Counter(String id) {
    name = id;
    count = 0;
  }

  public void increment() {
    count++;
  }

  public int tally() {
    return count;
  }

  public String toString() {
    return count + " " + name;
  }

  public static void main(String[] args) {
    Counter heads = new Counter("heads");
    Counter tails = new Counter("tails");
    heads.increment();
    heads.increment();
    tails.increment();
    StdOut.println(heads + " " + tails);
    StdOut.println(heads.tally() + " " + tails.tally());
  }
}
