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
public class Arbol_binario {
    Nodo raiz;
    String strrecorrido;
    public Arbol_binario(){
        raiz=null;
    }
    
    public void agregarNodo (int d, int name){
        Nodo valor = new Nodo(d,name);
        if(raiz==null){
            raiz = valor;
        }
        else{
            Nodo auxiliar = raiz;
            Nodo padre;
            while(true){
                padre=auxiliar;
                if(d<auxiliar.dato){
                    auxiliar = auxiliar.hijoIzquierdo;
                    if(auxiliar == null){
                        padre.hijoIzquierdo=valor;
                        return;
                    }
                }else{
                    auxiliar = auxiliar.hijoDerecho;
                    if(auxiliar == null){
                        padre.hijoDerecho=valor;
                        return;
                    }
                            
                }
            }
        }
    }
    
    public boolean arbolVacio(){
        return raiz == null; 
    }
    
    public void inOrder(Nodo r){
        if(r != null){
            inOrder(r.hijoIzquierdo);
            System.out.println(r.dato);
            inOrder(r.hijoDerecho);
        }
    }
    
    public void preOrder(Nodo r){
        if(r != null){
            System.out.println(r.dato);
            preOrder(r.hijoIzquierdo);
            preOrder(r.hijoDerecho);
        }
    }
    
    public void postOrder(Nodo r){
        if(r != null){
            postOrder(r.hijoIzquierdo);
            postOrder(r.hijoDerecho);
            System.out.println(r.dato);
        }
    }
}
