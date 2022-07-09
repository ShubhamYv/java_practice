public class BInary_Tree_Height {
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

    static class BinaryTree {
        static int ind=-1;
        public static Node buildTree(int nodes[]) {
            ind++;
            if (nodes[ind]== -1) {
                return null;
            }
            Node newNode= new Node(nodes[ind]);
            newNode.left= buildTree(nodes);
            newNode.right= buildTree(nodes);
            return newNode;
        }
    }

    public static int heightOfBT(Node root) {
        if (root== null) {
            return 0;
        }
        int leftHeight= heightOfBT(root.left);
        int rightHeight= heightOfBT(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }


    public static void main(String args[])  {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree tree= new BinaryTree();
        Node root=  tree.buildTree(nodes);
        System.out.println("Height of BT: "+heightOfBT(root));
    }

}
