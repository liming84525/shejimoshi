package _2infrastracturepattern._6composite;

/**
 * Created by lm on 16-6-15.
 */
public class Tree {

    TreeNode root = null;

    public Tree(String name) {
        this.root = new TreeNode(name);
    }

    public static void main(String[] args) {
        Tree t = new Tree("A");
        TreeNode n1 = new TreeNode("B");
        TreeNode n2 = new TreeNode("C");

        t.root.add(n1);
        t.root.add(n2);
        System.out.println("this is tree");
    }


}
