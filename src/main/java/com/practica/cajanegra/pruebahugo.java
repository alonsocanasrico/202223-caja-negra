package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class pruebahugo {
	public static void main(String[] args) {
		BinaryTree<String> arbolEV2= new BinaryTree<String>("1");
		Node<String> n2 = arbolEV2.insert("2", arbolEV2.getRoot(), true);
		Node<String> n3 = arbolEV2.insert("3", arbolEV2.getRoot(), false);
		Node<String> n4 = arbolEV2.insert("4", n2, true);
		Node<String> n5 = arbolEV2.insert("5", n2, false);
		Node<String> n6 = arbolEV2.insert("6", n3, false);
		Node<String> n7 = arbolEV2.insert("7", n4, true);
		Node<String> n8 = arbolEV2.insert("8", n4, false);
		Node<String> n9 = arbolEV2.insert("9", n6, true);
		Node<String> n10 = arbolEV2.insert("10", n7, true);
		BinaryTree<String> arbolEV3= new BinaryTree<String>("11");
		Node<String> n12 = arbolEV2.insert("12", arbolEV3.getRoot(), true);
		System.out.println(arbolEV2.depth(arbolEV3.getRoot()));
	}
	
}
