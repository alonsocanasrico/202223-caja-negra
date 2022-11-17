package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.binarytree.*;

class Test_Constructor {

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
		String content = "123";
		BinaryTree<String> arbol = new BinaryTree<String>(content);
		assertEquals(arbol.getRoot().getContent(), content);
	}
	
	@Test
	void caso2() {
		String content = "abc";
		BinaryTree<String> arbol = new BinaryTree<String>(content);
		assertEquals(arbol.getRoot().getContent(), content);
	}
	
	@Test
	void caso3() {
		String content = "1a2b3c";
		BinaryTree<String> arbol = new BinaryTree<String>(content);
		assertEquals(arbol.getRoot().getContent(), content);
	}

	@Test
	void caso4() {
		String content = "12_ab?";		
		assertThrows(Exception.class, () -> new BinaryTree<String>(content));
	}
}


