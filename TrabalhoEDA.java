/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabalhoeda;

import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Gui
 */
public class TrabalhoEDA {
    
    
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList array = new ArrayList();
        // TODO code application logic here
        String x = "{Nome: Guilherme}";
        int i;
        
        for(i=0;i<x.length();i++){
            array.add((x.charAt(i)));   
        }
        
        for (int j = 0; j < x.length(); j++) {
            System.out.println(array.get(j));
        }
       
        
        
    }
  
    
    
    
    
    
    
    public boolean verificaçao(){
        
        return false;
        
    }
    
    
    
    
    
    
    
    
    
}
