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
public class PosRegister {
    private double currentTransactionID;
    //using this to store the last transaction ID in memory
    private double lastTransactionID;
    private Product product;
    private Customer customer;
    private TransactionOutput reciept;
    private TransactionOutput videoDisplay;
    
    public final void startSale(){
        
    };
    public final void addItemToSale(){
        
    };
    public final void endSale(){
        
    };

    public double getCurrentTransactionID() {
        return currentTransactionID;
    }

    public void setCurrentTransactionID() {
        if (lastTransactionID == null)
    }
    
    
}
