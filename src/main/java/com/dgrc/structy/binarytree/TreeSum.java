package main.java.com.dgrc.structy.binarytree;

public class TreeSum {

    public static void main(String[] args) {

        // Test 1
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(4);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        //       3
        //    /    \
        //   11     4
        //  / \      \
        // 4   -2     1
        System.out.println(treeSum(a)); // -> 21
        
    }

    // Depth first recursive 
    public static int treeSum(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        return root.val + treeSum(root.left) + treeSum(root.right);
    }

    // Depth first iterative
    // public static int treeSum(Node<Integer> root) {
        
    //     if (root == null) {
    //         return 0;    
    //     }
        
    //     Stack<Node<Integer>> stack = new Stack<>();
    //     int sum = 0;
    //     stack.add(root);

    //     while (!stack.isEmpty()) {
    //         Node<Integer> node = stack.pop();
    //         sum += node.val;
    //         if (node.right != null) {
    //             stack.add(node.right);
    //         }
    //         if (node.left != null) {
    //             stack.add(node.left);
    //         }
    //     }

    //     return sum;
    // }

    // Breath first
    // public static int treeSum(Node<Integer> root) {

    //     if (root == null) {
    //         return 0;
    //     }
        
    //     int sum = 0;
    //     Queue<Node<Integer>> queue = new ArrayDeque<>();
    //     queue.add(root);

    //     while (!queue.isEmpty()) {
    //         Node<Integer> node = queue.remove();
    //         sum += node.val;
    //         if (node.left != null) {
    //             queue.add(node.left);
    //         }
    //         if (node.right != null) {
    //             queue.add(node.right);
    //         }
    //     }

    //     return sum;
    // }
    
}
