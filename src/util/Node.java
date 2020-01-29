/*
 * Name: Connor Widder
 * Class: Object Oriented Programming CS3354
 * Assignment: Homework 1 - Binary tree and Prime numbers
 */

/**
 * Class that defines the object Node. 
 * @param right and left: point to the two possible child nodes of the node.
 * left and right will be null when a node is created, because a child for the
 * node has not yet been created.
 * @param key: defines the value at that node.
 */
package util;

class Node {
	Node right;
	Node left;
	int key;
	Node(int key) {
		this.key = key;
		right = null;
		left = null;
	}
}
