package main.java.com.dgrc.structy.binarytree;

import java.util.ArrayList;
import java.util.List;

public class DepthFirstValuesRecursive {
    
    public static void main(String[] args) {

        // Test 1
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //      a
        //    /   \
        //   b     c    
        //  / \     \
        // d   e     f
        System.out.println(depthFirstValues(a)); 
        System.out.println("[a, b, d, e, c, f]");
        //    -> ["a", "b", "d", "e", "c", "f"]
        
    }

    public static List<String> depthFirstValues(Node<String> root) {

       if (root == null) {
        return new ArrayList<>();
       }

       List<String> list = new ArrayList<>();
       list.add(root.val);
       list.addAll(depthFirstValues(root.left));
       list.addAll(depthFirstValues(root.right));

       System.out.println("list: " + list);

       return list;

    }
}
