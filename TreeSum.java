public class TreeSum {
    //recursive method to sum all values in a binary tree
    public static int sumAll(TreeNode root){
        //base case:
        if(root == null) {return 0;}

        //recursive case
        return root.value + sumAll(root.left) + sumAll(root.right);
    }
    public static void main(String[] args) {
        //Build the tree manually:
        /*
                5
               /  \
               3   7
              / \
             1   4

             expected sum = 5 + 3 + 7 + 1 + 4 = 20
         */
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(7);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);

        int total = sumAll(root);
        System.out.println("Total sum of tree values: " + total); //output: 20 
    }

}
