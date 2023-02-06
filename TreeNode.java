package Tree;

import java.util.ArrayList;

public class TreeNode {
    public int data;
    public ArrayList<TreeNode> child;

    public TreeNode(int data) {
        this.data = data;
        child = new ArrayList<>();
    }
}
