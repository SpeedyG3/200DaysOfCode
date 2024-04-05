// import java.util.Scanner;

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;

//     TreeNode(int value) {
//         this.val = value;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class BinaryTree {
//     TreeNode root;
//     Scanner sc = new Scanner(System.in);

//     public TreeNode createBT(){
//         int x;
//         x = sc.nextInt();
//         if(x==-1){
//             return null;
//         }else{
//             TreeNode newNode = new TreeNode(x);
//             System.out.println("Enter left child of " + x + ":");
//             newNode.left = createBT();
//             System.out.println("Enter right child of " + x + ":");
//             newNode.right = createBT();
//             return newNode;
//         }
//     }

//     public void preOrder(TreeNode node) {
//         if (node != null) {
//             System.out.print(node.val + " ");
//             preOrder(node.left);
//             preOrder(node.right);
//         }
//     }

//     public static void main(String[] args) {
//         BinaryTree tree = new BinaryTree();
//         System.out.println("Enter the values for the binary tree (-1 to terminate input):");
//         tree.root = tree.createBT();

//         System.out.println("Preorder traversal of the binary tree:");
//         tree.preOrder(tree.root);
//     }
// }

//iterative insertion using queue
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int value) {
        this.val = value;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    public void iterativeInsertion() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values for the binary tree (-1 to terminate input):");
        int val = scanner.nextInt();
        if(val==-1){
            return;
        }else{
            root = new TreeNode(val);
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();

            System.out.println("Enter the left child of " + current.val + " (-1 for null node):");
            int leftVal = scanner.nextInt();
            if (leftVal != -1) {
                current.left = new TreeNode(leftVal);
                queue.offer(current.left);
            }

            System.out.println("Enter the right child of " + current.val + " (-1 for null node):");
            int rightVal = scanner.nextInt();
            if (rightVal != -1) {
                current.right = new TreeNode(rightVal);
                queue.offer(current.right);
            }
        }
    }

    public void preOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.iterativeInsertion();

        System.out.println("Preorder traversal of the binary tree:");
        tree.preOrder(tree.root);
    }
}

hello 