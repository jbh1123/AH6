import java.util.ArrayList;
import java.util.List;

class Node<T> {
  T val;
  Node<T> next;

  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}

class Solution {
  public static List<String> linkedListValues(Node<String> head) {
    var ptr = head;
    var result = new ArrayList<String>();
    if ( head == null ) return result;

    while ( ptr.next != null ) {
      result.add(ptr.val);
      ptr = ptr.next;
    }
    result.add(ptr.val);

    return result;
  }

  public static void main(String[] args) {
    System.out.println("First test:");

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");
    a.next = b;
    b.next = c;
    c.next = d;
    // a -> b -> c -> d

    // -> [ "a", "b", "c", "d" ]
    for ( var value: Solution.linkedListValues(a)) {
      System.out.print(value + " ");
    }



    System.out.println("\nAnother test: ");

    Node<String> e = new Node<>("e");
    Node<String> z = new Node<>("z");
    Node<String> q = new Node<>("q");
    Node<String> x = new Node<>("x");
    Node<String> h = new Node<>("h");
    e.next = z;
    z.next = q;
    q.next = x;
    x.next = h;
    // e -> z -> q -> x -> h

    // -> [ "e", "z", "q", "x", "h" ]
    for ( var value: Solution.linkedListValues(e)) {
      System.out.print(value + " ");
    }
  }
}
