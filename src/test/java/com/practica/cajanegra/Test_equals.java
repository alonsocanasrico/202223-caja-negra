package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Test_equals {

	private static BinaryTree<String> arbolEV1;
	private static Node<String> n2, n3, n4, n5, n6, n7, n8, n9, n10;
	
	
	@BeforeAll
	static void crearArbol() { // es estático porque sino da error
		arbolEV1 = new BinaryTree<String>("1");
		n2 = arbolEV1.insert("2", arbolEV1.getRoot(), true);
    	n3 = arbolEV1.insert("3", arbolEV1.getRoot(), false);
    	n4 = arbolEV1.insert("4", n2, true);
    	n5 = arbolEV1.insert("5", n2, false);
    	n6 = arbolEV1.insert("6", n3, false);
    	n7 = arbolEV1.insert("7", n4, true);
    	n8 = arbolEV1.insert("8", n4, false);
    	n9 = arbolEV1.insert("9", n6, true);
    	n10 = arbolEV1.insert("10", n7, true);
	}
	
	@Test
	void caso1() {
		BinaryTree<String> arbolEV2 = new BinaryTree<String>("1");
		Node<String> n12 = arbolEV2.insert("2", arbolEV2.getRoot(), true);
		Node<String> n13 = arbolEV2.insert("3", arbolEV2.getRoot(), false);
		Node<String> n14 = arbolEV2.insert("4", n12, true);
		Node<String> n15 = arbolEV2.insert("5", n12, false);
		Node<String> n16 = arbolEV2.insert("6", n13, false);
		Node<String> n17 = arbolEV2.insert("7", n14, true);
		Node<String> n18 = arbolEV2.insert("8", n14, false);
		Node<String> n19 = arbolEV2.insert("9", n16, true);
		Node<String> n20 = arbolEV2.insert("10", n17, true);
		assertEquals(arbolEV1.equals(arbolEV2), true);
	}
	
	@Test
	void caso2() {
		BinaryTree<String> arbolEV2 = new BinaryTree<String>("1");
		Node<String> n12 = arbolEV2.insert("2", arbolEV2.getRoot(), true);
		Node<String> n13 = arbolEV2.insert("3", arbolEV2.getRoot(), false);
		Node<String> n14 = arbolEV2.insert("4", n12, true);
		Node<String> n15 = arbolEV2.insert("111", n12, false);
		Node<String> n16 = arbolEV2.insert("6", n13, false);
		Node<String> n17 = arbolEV2.insert("7", n14, true);
		Node<String> n18 = arbolEV2.insert("8", n14, false);
		Node<String> n19 = arbolEV2.insert("9", n16, true);
		Node<String> n20 = arbolEV2.insert("10", n17, true);
		assertEquals(arbolEV1.equals(arbolEV2), false);
	}
	
	@Test
	void caso3() {
		BinaryTree<String> arbolEV2 = new BinaryTree<String>("1");
		Node<String> n12 = arbolEV2.insert("2", arbolEV2.getRoot(), true);
		Node<String> n13 = arbolEV2.insert("4", arbolEV2.getRoot(), false);
		assertEquals(arbolEV1.equals(arbolEV2), false);
	}
	
	@Test
	void caso4() {
		assertEquals(arbolEV1.equals(arbolEV1.getSubTree(n4)), true);
	}
}
