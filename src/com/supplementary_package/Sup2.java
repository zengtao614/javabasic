package com.supplementary_package;

import java.util.Arrays;

public class Sup2 {
    /**
     * 补充类2：二叉树的实现
     */
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(new Student("艾伦",1.78));
        bt.add(new Student("阿尔明",1.70));
        bt.add(new Student("贝尔罗特",1.88));
        bt.add(new Student("利威尔",1.65));
        bt.add(new Student("克丽丝塔",1.60));
        Object[] objects = bt.toArray();
        System.out.println(Arrays.toString(objects));
    }
}

class BinaryTree{
    private class Node{
        private Comparable data;
        private Node left;
        private Node right;
        public Node(Comparable data){
            this.data = data;
        }
        public void addNode(Node newNode){
            if (this.data.compareTo(newNode.data)<0){
                if (this.left == null){
                    this.left = newNode;
                }else {
                    this.left.addNode(newNode);
                }
            }else {
                if (this.right == null){
                    this.right = newNode;
                }else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArray(){
            if (this.left!=null){
                this.left.toArray();
            }
            BinaryTree.this.objArr[BinaryTree.this.foot++] = this.data;
            if (this.right!=null){
                this.right.toArray();
            }

        }


    }
    private Node root;
    private int count;
    public void add(Object newData){
        Node newNode = new Node((Comparable)newData);
        if (this.root == null){
            this.root = newNode;
        }else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    private int foot;
    private Object objArr[];
    public Object[] toArray(){
        if (this.root==null){
            return null;
        }
        this.foot = 0;
        this.objArr = new Object[this.count];
        this.root.toArray();
        return objArr;
    }




}


