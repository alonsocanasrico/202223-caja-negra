package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.binarytree.*;

public class Test_getRoot {

//	private BinaryTree<String> arbol;
	
//	@BeforeEach
//	void init() {
//		arbol = new BinaryTree<String>("127");
//    	Node<String> L = arbol.insert("2", arbol.getRoot(), true);
//    	Node<String> R = arbol.insert("3", arbol.getRoot(), false);
//    	Node<String> L_L = arbol.insert("4", L, true);
//    	Node<String> L_R = arbol.insert("5", R, false);
//	}
	
	@Test
	void caso1() {
		BinaryTree<String> arbol = new BinaryTree<String>("1");
		assertEquals(arbol.getRoot().getContent(), "1");
	}
	
	@Test
	void caso2() {
		BinaryTree<String> arbol = new BinaryTree<String>("1");
		Node<String> L = arbol.insert("2", arbol.getRoot(), true);
    	Node<String> R = arbol.insert("3", arbol.getRoot(), false);
		assertEquals(arbol.getRoot().getContent(), "1");
	}
}
