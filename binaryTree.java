import java.util.*;
public class binaryTree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data= data;
            this.left= null;
            this.right= null;
        }
    }
    static class BinaryTree{
        static int ind=-1;
        public static Node buildTree(int nodes[]) {
            ind++;
            if(nodes[ind]== -1) {
                return null;
            }
            Node newNode= new Node(nodes[ind]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }

    //PREORDER--> root, left, right
    public static void preOrder(Node root) {
        if(root== null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    //INORDER--> left, root, right
    public static void inOrder(Node root) {
        if(root== null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //POSTORDER--> right, left, root
    public static void postOreder(Node root) {
        if(root== null) {
            return;
        }
        postOreder(root.left);
        postOreder(root.right);
        System.out.print(root.data+" ");
    }

    //LELEL ORDER
    public static void levelOrder(Node root) {
        if (root== null){
            return;
        }
        Queue<Node> q= new LinkedList<>();
        q.add(root);
        q.add(null);
        while (!q.isEmpty()) {
            Node currNode= q.remove();
            if(currNode== null) {
                System.out.println();
                if(q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(currNode.data);
                if (currNode.left!= null){
                    q.add(currNode.left);
                }
                if (currNode.right != null) {
                    q.add(currNode.right);
                }
            }
        }
    }

    public static void main(String args[]) {
        int nodes[]= {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();
        Node root= tree.buildTree(nodes);
        System.out.println("Root Node is: "+ root.data);
        System.out.print("PreOrder is: \n");
        preOrder(root);
        System.out.println();
        System.out.print("InOrder is: \n");
        inOrder(root);
        System.out.println();
        System.out.print("PostOrder is: \n");
        postOreder(root);
        System.out.println();
        System.out.print("Level Order is: \n");
        levelOrder(root);

    }
}
