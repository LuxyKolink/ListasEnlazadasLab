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
public class ListaEstudiante implements IListaEnlazadaTDA{

    private Node primero;
    private Node ultimo;
    public int cantidad;

    @Override
    public Node getPrimero() {
        return primero;
    }

    public void setPrimero(Node primero) {
        this.primero = primero;
    }

    @Override
    public Node getUltimo() {
        return ultimo;
    }

    public void setUltimo(Node ultimo) {
        this.ultimo = ultimo;
    }
    
    @Override
    public void agregar(String nombre, int age){
        
    }
    
    @Override
    public Node find(int index){
        
        return null;
        
    }
    
    @Override
    public void delete(int index){
        
    }
    
    
    @Override
    public void deletePrimero(){
        
    }
    
    @Override
    public void deleteUltimo(){
        
    }
    
    @Override
    public void vaciar(){
        
    }
    
    public void print() {
        
        Node current = getPrimero();

        if (getPrimero() != null) {
            do {
                System.out.println("* Nombre:" + current.getValue().getNombre()+" /edad: "+current.getValue().getEdad());

            } while (current != null);
        } else {
            System.out.println("Empty list!");
        }
    }
}
