package _2infrastracturepattern._6composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by lm on 16-6-15.
 * 使用场景：将多个对象组合在一起进行操作，常用于表示树形结构中，例如二叉树，数等。
 */
public class TreeNode {

    private String name;
    private TreeNode parent;
    private Vector<TreeNode> children = new Vector<TreeNode>();

    public TreeNode(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void add(TreeNode child) {
        children.add(child);
    }

    public void remove(TreeNode child) {
        children.remove(child);
    }

    public Enumeration<TreeNode> getChildren() {
        return children.elements();
    }
}
