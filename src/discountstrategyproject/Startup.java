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
        PosRegister register = new PosRegister(new InMemoryDatabase());
        register.startSale();
//        register.addItemToSale("A101", 1);
        register.addItemToSale("A101", 1);
        register.addItemToSale("B205", 2);
        register.addItemToSale("A101", 1);
        register.endSale();
        
                            //test
        //System.out.println(data.findProduct("A101"));
        //System.out.println(data.findProduct("B205"));
        //
        
        
        
    }
   
    
    
}
