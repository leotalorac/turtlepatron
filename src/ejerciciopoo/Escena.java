/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Estudiante
 */
public class Escena {
    private  Turtle tortuga;
   
    public Escena(){
        tortuga =  new Turtle(); 
    }
    
    public void cuadrado(){
       for(int i=0;i<4;i++){
            tortuga.forward(100);
            tortuga.right(90);
       }
    } 
    public void patron(){
        for(int j =0;j<8;j++){
            cuadrado();
            tortuga.right(45);
        }
    }
}
