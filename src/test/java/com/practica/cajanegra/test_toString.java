package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class test_toString {
	@Test
	void caso1() {
		BinaryTree<String> arbol = new BinaryTree<String>("1");
		String salidaEsperada = "1 \n";
		assertEquals(arbol.toString(), salidaEsperada);
	}
	
	@Test
	void caso2() {
		BinaryTree<String> arbol = new BinaryTree<String>("4");
    	Node<String> n7 = arbol.insert("7", arbol.getRoot(), true);
    	Node<String> n8 = arbol.insert("8", arbol.getRoot(), false);
    	Node<String> n10 = arbol.insert("10", n7, true);
    	String salidaEsperada = "4 Left: 7 Right: 8 \n7 Left: 10 \n10 \n8 \n";
    	assertEquals(arbol.toString(), salidaEsperada);
	}
}
