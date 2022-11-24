package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class test_depth_node {

	private static BinaryTree<String> arbolEV1, arbolEV2;
	private static Node<String> n2, n3, n4, n5, n6, n7, n8, n9, n10;
	
	
	@BeforeAll
	static void crearArboles() {
		arbolEV1 = new BinaryTree<String>("1");
		arbolEV2 = new BinaryTree<String>("1");
		n2 = arbolEV2.insert("2", arbolEV2.getRoot(), true);
    	n3 = arbolEV2.insert("3", arbolEV2.getRoot(), false);
    	n4 = arbolEV2.insert("4", n2, true);
    	n5 = arbolEV2.insert("5", n2, false);
    	n6 = arbolEV2.insert("6", n3, false);
    	n7 = arbolEV2.insert("7", n4, true);
    	n8 = arbolEV2.insert("8", n4, false);
    	n9 = arbolEV2.insert("9", n6, true);
    	n10 = arbolEV2.insert("10", n7, true);
	}
	
	@Test
	void caso1() {
		assertEquals(arbolEV1.depth(arbolEV1.getRoot()), 0);
	}
	
	@Test
	void caso2() {
		assertThrows(Exception.class, () -> arbolEV1.depth(null));
	}
	
	@Test
	void caso3() {
		assertThrows(Exception.class, () -> arbolEV1.depth(new Node<String>("11")));
	}
}
