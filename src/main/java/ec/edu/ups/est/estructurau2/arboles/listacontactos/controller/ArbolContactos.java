/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.est.estructurau2.arboles.listacontactos.controller;

import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Node;
import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Contacto;

/**
 *
 * @author pablo
 */
public class ArbolContactos {

    private Node raiz;

    public ArbolContactos() {
        this.raiz = null;
    }

    public void insertar(Contacto nuevoContacto) {
        if (raiz == null) {
            raiz = new Node(nuevoContacto);
        } else {
            insertarRecursivo(raiz, nuevoContacto);
        }
    }

    private void insertarRecursivo(Node nodo, Contacto nuevoContacto) {
        
     
        
        if (nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) < 0) {
            if (nodo.getLeft() == null) {
                nodo.setLeft(new Node(nuevoContacto));
            } else {
                insertarRecursivo(nodo.getLeft(), nuevoContacto);
            }
        } else if (nuevoContacto.getNombre().compareTo(nodo.getContacto().getNombre()) > 0) {
            if (nodo.getRight()== null) {
                nodo.setRight(new Node(nuevoContacto));
            } else {
                insertarRecursivo(nodo.getRight(), nuevoContacto);
            }
        } else {
            // El nombre del contacto ya existe, se puede manejar el caso según tus necesidades
            // Por ejemplo, puedes actualizar los datos del contacto existente
        }
    }

    
    public void inorderRecursivo(Node node){
        if(node != null){
            inorderRecursivo(node.getLeft());
            System.out.print(node.getContacto()+ " - ");
            inorderRecursivo(node.getRight());
            
        }
    }
    
    public void  rderRecursivo(Node node){
        if(node != null){
            System.out.print(node.getContacto()+ " - ");
            inorderRecursivo(node.getLeft());
            
            inorderRecursivo(node.getRight());
            
        }
    }
    
    public void poserRecursivo(Node node){
        if(node != null){
            inorderRecursivo(node.getLeft());
            
            inorderRecursivo(node.getRight());
            System.out.print(node.getContacto()+ " - ");
            
        }
    }
    
    public void printTreeNode(Node root, String prefix, boolean isLeft) {
        if (root != null) {
            System.out.println(prefix + (isLeft ? "├── " : "└── ") + root.getContacto());
            printTreeNode(root.getLeft(), prefix + (isLeft ? "│   " : "    "), true);
            printTreeNode(root.getRight(), prefix + (isLeft ? "│   " : "    "), false);
        }

    }
    
    public Node getRoot(){
        return raiz;
    }
    
    
    public boolean estaBalanceado() {
        return verificarBalance(raiz);
    }

    private boolean verificarBalance(Node nodo) {
        if (nodo == null) {
            return true; // Árbol vacío, se considera balanceado
        }

        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRight());

        int diferenciaAlturas = Math.abs(alturaIzquierda - alturaDerecha);

        // Verificar si las alturas difieren en más de 1 unidad
        if (diferenciaAlturas > 1) {
            return false; // No está balanceado
        }

        // Verificar recursivamente los subárboles izquierdo y derecho
        return verificarBalance(nodo.getLeft()) && verificarBalance(nodo.getRight());
    }

    private int obtenerAltura(Node nodo) {
        if (nodo == null) {
            return 0; // Altura de un árbol vacío es 0
        }

        int alturaIzquierda = obtenerAltura(nodo.getLeft());
        int alturaDerecha = obtenerAltura(nodo.getRight());

        // La altura del nodo es el máximo entre la altura de sus subárboles más 1
        return Math.max(alturaIzquierda, alturaDerecha) + 1;
    }
    
}