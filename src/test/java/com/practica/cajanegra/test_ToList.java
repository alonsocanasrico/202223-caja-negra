package com.practica.cajanegra;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

class test_ToList {

	private static BinaryTree<String> arbolEV1, arbolEV2;
	private static Node<String> n7, n8, n10;
	
	@BeforeAll
	static void crearArboles() { // es estático porque sino da error
		arbolEV1 = new BinaryTree<String>("1");
		arbolEV2 = new BinaryTree<String>("4");
    	n7 = arbolEV2.insert("7", arbolEV2.getRoot(), true);
    	n8 = arbolEV2.insert("8", arbolEV2.getRoot(), false);
    	n10 = arbolEV2.insert("10", n7, true);
	}
	
	@Test
	void caso1() {
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("1");
		assertEquals(arbolEV1.toList(),lista);
	}
	
	@Test
	void caso2() {
		ArrayList<String> lista=new ArrayList<String>();
		lista.add("4");
		lista.add("7");
		lista.add("10");
		lista.add("8");
		assertEquals(arbolEV2.toList(),lista);
	}


}
