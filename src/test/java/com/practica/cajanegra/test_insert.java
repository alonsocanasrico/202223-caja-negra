package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class test_insert {

    private BinaryTree<String> arbol;
    private String content;
    private Node<String> node;
    private boolean atLeft;

    @Test
    public void caso1() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso2() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso3() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso4() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso5() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso6() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso7() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso8() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    public void caso9() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso10() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso11() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso12() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso13() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }
}
