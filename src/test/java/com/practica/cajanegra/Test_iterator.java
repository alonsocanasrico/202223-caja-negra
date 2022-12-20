package com.practica.cajanegra;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.binarytree.BinaryTree;
import com.binarytree.Node;

public class Test_iterator {

    private BinaryTree<String> arbol;

    @Test
    public void caso1() {
        arbol = new BinaryTree<String>("6");
       
        List<String> resultList = new ArrayList<String>();
        
        Iterator<String> it=arbol.iterator();
        
        while(it.hasNext()) {
        	resultList.add(it.next());
        }
        
        assertEquals(arbol.toList(),resultList);
    }

    @Test
    public void caso2() {
    	arbol = new BinaryTree<String>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        arbol.insert("10", arbol.getRoot().getLeftChild(), false);

        List<String> resultList = new ArrayList<String>();
        
        Iterator<String> it=arbol.iterator();
        
        while(it.hasNext()) {
        	resultList.add(it.next());
        }

        assertEquals(arbol.toList(),resultList);
    }

  
}
