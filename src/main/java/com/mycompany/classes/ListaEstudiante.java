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
    private int cantidad;

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
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    
    @Override
    public void agregar(String nombre, int edad){
        
        Estudiante estudiante = new Estudiante(nombre,edad);
        
        Node node = new Node(estudiante);
       
        
        
       if (this.primero == null) {
            this.primero = node;
        } else {
           
           Node ultimo = getPrimero();
           
           while(ultimo.getSiguiente() != null){
               ultimo = ultimo.getSiguiente();
               
           }
           ultimo.setSiguiente(node);
           
       }
        this.cantidad++;
    }
    
    @Override
    public Node find(int index){
        
        if (primero == null){
            return null;
        } 
        else 
        {
            Node current = getPrimero();
            int contador = 0;
            while (contador < index && current != null){
                current = current.getSiguiente();
                contador++;
            }
            if (contador != index)
            {
                return null;
            }
            else 
            {
                return current;
                }
            }
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
