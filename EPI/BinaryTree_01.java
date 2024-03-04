package EPI;

public class BinaryTree_01 {
    static class Node{
        int key;
        Node left, right;

        public Node(int item){
            key = item;
            left = right = null;
        }
    }


    static class BinaryTree
    {
        Node root;

        BinaryTree(int key)
        {
            root = new Node(key);

        }


        BinaryTree()
        {
            root = null;
        }


       
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.root = new Node(12);


        /* following is the tree after above statement
 
              1
            /   \
          null  null     */
 
          tree.root.left = new Node(2);
          tree.root.right = new Node(3);


        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */
 
 
        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */

        // public static Node treeTraversal(Node node)
        // {
        //     if (node.root != null)
        //     {
        //     System.out.print("Preorder "+node.root.key);
        //     treeTraversal(node.left);
        //     }
        // }
        
    }

    
    }


  
}
