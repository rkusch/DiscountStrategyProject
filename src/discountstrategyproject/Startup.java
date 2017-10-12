/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author rkusch
 */
public class Startup {
    
    public static void main(String[] args) {
         PosRegister register = new PosRegister();
        Database data = new InMemoryDatabase();
        //test
        System.out.println(data.findProduct("A101"));
        System.out.println(data.findProduct("B205"));
        
        
    }
   
    
    
}
