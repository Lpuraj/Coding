package Tree;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class TreeUse {
    public static TreeNode input(Scanner obj) {
        System.out.println("Enter root data ");
        int data = obj.nextInt();
        TreeNode root = new TreeNode(data);
        System.out.println("Enter number of child of " + " data ");
        int n = obj.nextInt();
        for (int i = 0; i < n; i++) {
            TreeNode children = input(obj);
            root.child.add(children);
        }
        return root;
    }

    public static int numofnode(TreeNode root) {
        int count = 0;
        if (root == null) {
            return 0;
        }
        for (int i = 0; i < root.child.size(); i++) {
            count += numofnode(root.child.get(i));
        }
        return 1 + count;
    }

    public static TreeNode inputL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter root data");
        int data = sc.nextInt();
        TreeNode root = new TreeNode(data);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode ref = q.remove();
            int temp = ref.data;
            System.out.println("Enter number of children of " + temp);
            int num = sc.nextInt();
            for (int i = 0; i < num; i++) {
                System.out.println("Enter child data");
                int cdata = sc.nextInt();
                TreeNode childi = new TreeNode(cdata);
                ref.child.add(childi);
                q.add(childi);
            }
        }
        return root;
    }

    public static void print(TreeNode root) {
        System.out.print(root.data + " : ");
        for (int i = 0; i < root.child.size(); i++) {
            System.out.print(root.child.get(i).data + " , ");
        }
        System.out.println();
        for (int i = 0; i < root.child.size(); i++) {
            print(root.child.get(i));
        }
    }

    public static int largest(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = root.data;
        for (int i = 0; i < root.child.size(); i++) {
            int temp = largest(root.child.get(i));
            if (temp > l) {
                l = temp;
            }

        }
        return l;
    }

    public static void printl(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode ref = q.remove();
            int temp = ref.data;
            String str = temp + " : ";
            for (int i = 0; i < ref.child.size(); i++) {
                int cdata = ref.child.get(i).data;// warn
                str += cdata + " , ";
                q.add(ref.child.get(i));
            }
            System.out.println(str);
        }
    }

    public static int height(TreeNode root) {
        int h = 0;
        if (root == null) {
            return h;
        }
        // int count=0;
        for (int i = 0; i < root.child.size(); i++) {
            int temp = height(root.child.get(i));
            if (h < temp)
                h = temp;
        }
        return 1 + h;
    }

    public static void depth(TreeNode root, int i) {
        if (i < 0)
            return;
        if (i == 0) {
            System.out.print(root.data + "  , ");
            return;
        }
        for (int j = 0; j < root.child.size(); j++) {
            depth(root.child.get(j), i - 1);
        }

    }

    public static int leaf(TreeNode root) {
        if (root == null)
            return 0;
        if (root.child.isEmpty()) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < root.child.size(); i++) {
            count += leaf(root.child.get(i));
        }
        return count;
    }

    public static void post(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        for (int i = 0; i < root.child.size(); i++) {
            post(root.child.get(i));
        }
        // System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        TreeNode root = inputL();
        // depth(root, 1);
        // System.out.println(leaf(root));
        post(root);
    }
}
