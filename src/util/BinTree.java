/*
 * Name: Connor Widder
 * Class: Object Oriented Programming CS3354
 * Assignment: Homework 1 - Binary tree and Prime numbers
 */
package util;

public class BinTree {
	private Node root;

	public void insertNode(Node node){
		root = insert(root, node);
	}
	
/**
 * 
 * @param tree: existing tree structure of nodes.
 * @param node: new node to be inserted.
 * @return will return the tree structure.
 */
	
	private Node insert(Node tree, Node node)
	// Inserts item into tree.
	// Post:  item is in tree; search property is maintained.
	{
		//Node current = tree;
		
		
		if (tree == null){
			//null - leaf found, place node
			return tree = node;
		}
		
		if (node.key > tree.key){
			//right - move down tree
			tree.right = insert(tree.right, node);
		}
		else if (node.key < tree.key){
			//left - move down tree
			tree.left = insert(tree.left, node);
		}
		else {
			//value exists
			return tree;
		}
	
		
	  return tree;
	} 
	/**
	 * Tree walk calls the inOrder funciton.
	 */
	public void treeWalk() {
		inOrder(root);
	}
	/**
	 * inOrder prints of the elements, nodes, of the tree in order of the their 
	 * @param key from least to greates.
	 * @param tree
	 */
	private void inOrder(Node tree)
	// Post: node keys printed in order.
	{
		if (tree != null) {
			inOrder(tree.left);
			System.out.print(" " + tree.key);
			inOrder(tree.right);
		}


	}
}
