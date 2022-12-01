package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Test_size {
	@Test
	void caso1() {
		BinaryTree<String> arbol = new BinaryTree<String>("1");
		assertEquals(arbol.size(), 1);
	}
	
	@Test
	void caso2() {
		BinaryTree<String> arbol = new BinaryTree<String>("1");
		Node<String> n2 = arbol.insert("2", arbol.getRoot(), true);
    	Node<String> n3 = arbol.insert("3", arbol.getRoot(), false);
    	Node<String> n4 = arbol.insert("4", n2, true);
    	Node<String> n5 = arbol.insert("5", n2, false);
    	Node<String> n6 = arbol.insert("6", n3, false);
    	Node<String> n7 = arbol.insert("7", n4, true);
    	Node<String> n8 = arbol.insert("8", n4, false);
    	Node<String> n9 = arbol.insert("9", n6, true);
    	Node<String> n10 = arbol.insert("10", n7, true);
		assertEquals(arbol.size(), 10);
	}

}
