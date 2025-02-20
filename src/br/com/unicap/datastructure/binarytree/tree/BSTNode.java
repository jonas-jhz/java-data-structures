package br.com.unicap.datastructure.binarytree.tree;

public abstract class BSTNode<T>{

    protected T info;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode(int data) {
        this.info = data;
        this.left = null;
        this.left = null;
    }

    public BSTNode<T> getRight() {
        return right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }

    public BSTNode<T> getLeft() {
        return left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public int getInfo() {
        return info;
    }

    public void setInfo(T info) {
        this.info = info;
    }

    public abstract int peso();

















}
