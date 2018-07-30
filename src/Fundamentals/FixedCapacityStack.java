package Fundamentals;

import edu.princeton.cs.algs4.*;

public class FixedCapacityStack<E> {

  private E[] data;
  private int size;

  public FixedCapacityStack(int capacity) {
    data = (E[])new Object[capacity];
    size = 0;
  }

  public void push(E s) {
    data[size++] = s;
  }

  public E pop() {
    return data[--size];
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public int size() {
    return size;
  }

  public static void main(String[] args) {
    FixedCapacityStack<String> s = new FixedCapacityStack<String>(100);
    while (!StdIn.isEmpty()) {
      String item = StdIn.readString();
      if (!item.equals("-"))
        s.push(item);
      else if (!s.isEmpty())
        StdOut.print(s.pop() + " ");
    }
    StdOut.println("(" + s.size() + " left on stack");
  }

}
