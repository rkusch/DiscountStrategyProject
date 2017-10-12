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

    private Integer currentTransactionID;
    //using this to store the last transaction ID in memory
    private Integer lastTransactionID;
    private Product product;
    private Customer customer;
    private TransactionOutput reciept;
    private TransactionOutput videoDisplay;
    private Database database;

    // is this needed because of the constructor?
    public final void startSale(Database database) {
        
    }

    ;
    
    public final void addItemToSale(String productIdFromProductInBag,double qtyOfProductInBag) {
        database.findProduct(productIdFromProductInBag);
    }

    ;
    public final void endSale() {

    }

    ;

    public Integer getCurrentTransactionID() {
        return currentTransactionID;
    }

    public void setCurrentTransactionID() {
        setLastTransactionID();
        this.currentTransactionID = (getLastTransactionID() + 1);
        this.lastTransactionID = getCurrentTransactionID();

    }

    public Integer getLastTransactionID() {
        return lastTransactionID;
    }

    public void setLastTransactionID() {
        if (lastTransactionID == null) {
            lastTransactionID = 0;

        }

    }

    public PosRegister() {
        Database database = new InMemoryDatabase();
        setLastTransactionID();
        setCurrentTransactionID();
    }
}
