class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int v){
        this.val = v;
        this.left = null;
        this.right = null;
    }
}

public class Tree{
    public static TreeNode buildTree(int arr[], int idx) {
    TreeNode node = null; // Create a new node for each call
    if (idx < arr.length) {
        if (arr[idx] != -1) {
            node = new TreeNode(arr[idx]);
            // Recursively build left and right subtrees
            if (2 * idx + 1 < arr.length) {
                node.left = buildTree(arr, 2 * idx + 1);
            }

            if (2 * idx + 2 < arr.length) {
                node.right = buildTree(arr, 2 * idx + 2);
            }
        }
    }
    return node; // Return the created node
}

    public static void inorder(TreeNode root){
        if(root==null){
            return;
        }

        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }

    public static void main(String args[]){
        int tree[] = {11, 22, 3, 54, 15, 23, 21};
        TreeNode root = buildTree(tree, 0);
        inorder(root);
    }
}