/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author david
 */
public class Nodo {
    int dato;
    int nombre;
    Nodo hijoDerecho, hijoIzquierdo;
    public Nodo(int d, int name){
        this.dato = d;
        this.nombre = name;
        this.hijoIzquierdo = null;
        this.hijoDerecho = null;
    }
    
}
