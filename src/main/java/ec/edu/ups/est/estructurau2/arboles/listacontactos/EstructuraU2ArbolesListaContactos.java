/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package ec.edu.ups.est.estructurau2.arboles.listacontactos;

import ec.edu.ups.est.estructurau2.arboles.listacontactos.controller.ArbolContactos;
import ec.edu.ups.est.estructurau2.arboles.listacontactos.models.Contacto;

/**
 *
 * @author pablo
 */
public class EstructuraU2ArbolesListaContactos {

    public static void main(String[] args) {
        ArbolContactos arbol = new ArbolContactos();

        Contacto contacto1 = new Contacto("Juan", "123456789");
        Contacto contacto2 = new Contacto("Maria", "987654321");
        Contacto contacto3 = new Contacto("Pedro", "456789123");
        Contacto contacto4 = new Contacto("Pablo", "56789123");

        arbol.insertar(contacto1);
        arbol.insertar(contacto2);
        arbol.insertar(contacto3);
        arbol.insertar(contacto4);
        arbol.insertar(new Contacto("Julian", "5789123"));
        arbol.insertar(new Contacto("Jhon", "567823"));
        arbol.insertar(new Contacto("Jhonn", "5789123"));

        System.out.println("Árbol binario de búsqueda creado exitosamente.");

        arbol.inorderRecursivo(arbol.getRoot());
        System.out.println("\n");
        arbol.printTreeNode(arbol.getRoot(), "", true);
        System.out.println("\n");
        System.out.println(arbol.estaBalanceado());

        arbol.eliminarContacto("Pedroo");
        arbol.printTreeNode(arbol.getRoot(), "", true);
        System.out.println("\n");

    }
}
