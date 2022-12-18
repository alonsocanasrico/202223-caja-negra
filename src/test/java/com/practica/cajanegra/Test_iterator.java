package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Test_iterator {

    private BinaryTree<String> arbol;

    @Test
    public void caso1() {
        arbol = new BinaryTree<>("6");
        List<String> resultList = new ArrayList<>();
        resultList.add("6");

        assertTrue(iteratorComparation(resultList.iterator(), arbol.iterator()));
    }

    @Test
    public void caso2() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        arbol.insert("10", arbol.getRoot().getLeftChild(), false);

        List<String> resultList = new ArrayList<>();
        resultList.add("6");
        resultList.add("7");
        resultList.add("9");
        resultList.add("10");
        resultList.add("8");

        assertTrue(iteratorComparation(resultList.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso3() {
        arbol = null;
        arbol.iterator();
    }

    public static boolean iteratorComparation(Iterator<String> it1, Iterator<String> it2) {
        boolean sameIterator = true;

        while (sameIterator && it1.hasNext())
            if (!it2.hasNext() || !it2.next().equals(it1.next()) || (it2.hasNext() && !it1.hasNext())) sameIterator = false;

        return sameIterator;
    }
}
