package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.binarytree.*;

class Prueba_Test_1 {

	private BinaryTree<String> arbol;
	
	@BeforeEach
	void init() {
		arbol = new BinaryTree<String>("1");
    	Node<String> L = arbol.insert("2", arbol.getRoot(), true);
    	Node<String> R = arbol.insert("3", arbol.getRoot(), false);
    	Node<String> L_L = arbol.insert("4", L, true);
    	Node<String> L_R = arbol.insert("5", R, false);
	}
	
	@Test
	void pruebachorra() {
//		assertTrue(true);
		assertEquals(arbol.depth(), 2);
	}

}


