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
public interface IListaEnlazadaTDA {
    
    public void agregar(String nombre, int age);
    public Node find(int index);
    public void delete(int index);
    public Node getPrimero();
    public Node getUltimo();
    public void deletePrimero();
    public void deleteUltimo();
    public void vaciar();
    
    
    
    
    
}
