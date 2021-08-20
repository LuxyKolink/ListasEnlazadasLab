/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.classes;

/**
 *
 * @author santi
 */
public class Node {

    private Estudiante value;
    private Node siguiente;
    public Node(Estudiante value){
        this.value=value;
    }

    public Estudiante getValue() {
        return value;
    }

    public void setValue(Estudiante value) {
        this.value = value;
    }

    public Node getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Node siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
