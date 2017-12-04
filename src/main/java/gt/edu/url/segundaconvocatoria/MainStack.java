/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gt.edu.url.segundaconvocatoria;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Ana Godínez
 */
public class MainStack {
    
    public static void main(Strings [] args, int redSize, int blueSize ){
        
        Stack <Integer> ADT = new Stack<Integer>();
        
        DoubleStack blue,red;
        
        blue = new BlueStack();
        
        red = new RedStack();
        
           
         for(int i = 0; i<redSize;i++){
             ADT.push(redSize);
         }
         

         while(!ADT.isEmpty()){
             System.out.println(ADT.pop());
         }
         
         //for blueSize
         
         for(int i = 0; i<blueSize;i++){
             ADT.push(blueSize);
         }
         

         while(!ADT.isEmpty()){
             System.out.println(ADT.pop());
         }
         
         
       
         
      
       // for(int i=0; i<n;i++){
         //   pila.push(entrada.nextInt());
            
           // while(!pila.isEmpty()){
             //   System.out.println((int)pila.pop());
            }
            
        }
        
        
        

    

