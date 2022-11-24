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
		Node<String> n2 = arbol.insert("2", arbol.getRoot(), true);
    	Node<String> n3 = arbol.insert("3", arbol.getRoot(), false);
    	Node<String> n4 = arbol.insert("4", n2, true);
    	Node<String> n5 = arbol.insert("5", n2, false);
    	Node<String> n6 = arbol.insert("6", n3, false);
    	Node<String> n7 = arbol.insert("7", n4, true);
    	Node<String> n8 = arbol.insert("8", n4, false);
    	Node<String> n9 = arbol.insert("9", n6, true);
    	Node<String> n10 = arbol.insert("10", n7, true);
		assertEquals(arbol.getRoot().getContent(), "1");
	}
}
