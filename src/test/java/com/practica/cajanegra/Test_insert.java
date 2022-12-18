package com.practica.cajanegra;

import com.binarytree.BinaryTree;
import com.binarytree.Node;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class Test_insert {

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

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso2() {
        arbol = new BinaryTree<>("6");
        content = "15";
        node = new Node<String>("8");
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso3() {
        arbol = new BinaryTree<>("6");
        content = "$";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("$");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso4() {
        arbol = new BinaryTree<>("6");
        content = "$";
        node = new Node<String>("8");
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso5() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "15";
        node = arbol.getRoot().getLeftChild().getLeftChild(); // Nodo 9
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("9");
        resultTree.add("15");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test
    public void caso6() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "15";
        node = arbol.getRoot().getLeftChild();
        atLeft = false;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("9");
        resultTree.add("15");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso7() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "15";
        node = arbol.getRoot().getLeftChild();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("15");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso8() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "15";
        node = new Node<>("10");
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("9");
        resultTree.add("15");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso9() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "$";
        node = arbol.getRoot().getLeftChild().getLeftChild();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("9");
        resultTree.add("$");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso10() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "$";
        node = arbol.getRoot().getLeftChild();
        atLeft = false;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("9");
        resultTree.add("$");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso11() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "$";
        node = arbol.getRoot().getLeftChild();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("$");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso12() {
        arbol = new BinaryTree<>("6");
        arbol.insert("7", arbol.getRoot(), true);
        arbol.insert("8", arbol.getRoot(), false);
        arbol.insert("9", arbol.getRoot().getLeftChild(), true);
        content = "$";
        node = new Node<>("10");
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("7");
        resultTree.add("$");
        resultTree.add("8");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }

    @Test(expected=Exception.class)
    public void caso13() {
        arbol = null;
        content = "15";
        node = arbol.getRoot();
        atLeft = true;

        List<String> resultTree = new ArrayList<>();
        resultTree.add("6");
        resultTree.add("15");

        arbol.insert(content, node, atLeft);

        assertTrue(Test_iterator.iteratorComparation(resultTree.iterator(), arbol.iterator()));
    }
}
