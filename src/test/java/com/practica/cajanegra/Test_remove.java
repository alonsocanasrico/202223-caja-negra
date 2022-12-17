package com.practica.cajanegra;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Test_remove {

	

	private static BinaryTree<String> arbolEV1, arbolEV2;
	private static Node<String> n2, n3, n4, n5, n6, n7, n8, n9, n10, n0, n1;
	
	
	@BeforeAll
	static void crearArboles() { // es estático porque sino da error
		n0=new Node<String>("0");
		arbolEV1 = new BinaryTree<String>("0");
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
	
	@AfterEach
	void recrearArboles() { // es estático porque sino da error
		n0=new Node<String>("0");
		arbolEV1 = new BinaryTree<String>("0");
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
		arbolEV1.remove(n0);
		assertTrue(arbolEV1.equals(null));
	}
	
	@Test
	void caso2() {
		assertThrows(Exception.class, () -> arbolEV1.remove(null));
	}
	
	@Test
	void caso3() {
		assertThrows(Exception.class, () -> arbolEV1.remove(new Node<String>("11")));
	}
	
	@Test
	void caso4() {
		assertThrows(Exception.class, () -> arbolEV1.remove(n5));
	}
	
	@Test
	void caso5() {
		BinaryTree<String> arbolEV3 = new BinaryTree<String>("1");
		n2 = arbolEV3.insert("2", arbolEV3.getRoot(), true);
    	n3 = arbolEV3.insert("3", arbolEV3.getRoot(), false);
    	n4 = arbolEV3.insert("4", n2, true);
    	n5 = arbolEV3.insert("5", n2, false);
    	n6 = arbolEV3.insert("6", n3, false);
    	n7 = arbolEV3.insert("7", n4, true);
    	n9 = arbolEV3.insert("9", n6, true);
    	n10 = arbolEV3.insert("10", n7, true);
		arbolEV2.remove(n8);
		assertTrue(arbolEV2.equals(arbolEV3));
	}
	
	@Test
	void caso6() {
		BinaryTree<String> arbolEV4 = new BinaryTree<String>("1");
		n2 = arbolEV4.insert("2", arbolEV4.getRoot(), true);
    	n3 = arbolEV4.insert("3", arbolEV4.getRoot(), false);
    	n4 = arbolEV4.insert("4", n2, true);
    	n5 = arbolEV4.insert("5", n2, false);
    	n7 = arbolEV4.insert("7", n4, true);
    	n8 = arbolEV4.insert("8", n4, false);
    	n10 = arbolEV4.insert("10", n7, true);
		arbolEV2.remove(n6);
		assertTrue(arbolEV2.equals(arbolEV4));
	}


	@Test
	void caso7() {
		arbolEV2.remove(arbolEV2.getRoot());
		assertTrue(arbolEV2.equals(null));
	}
	
	@Test
	void caso8() {
		assertThrows(Exception.class, () -> arbolEV2.remove(null));
	}
	
	@Test
	void caso9() {
		assertThrows(Exception.class, () -> arbolEV2.remove(new Node<String>("11")));
	}
	
	@Test
	void caso10() {
		assertThrows(Exception.class, () -> arbolEV2.remove(arbolEV1.getRoot()));
	}
}
