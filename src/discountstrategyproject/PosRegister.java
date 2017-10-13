/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.util.Arrays;

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
    private TransactionOutput receipt, videoDisplay;
    private Database database;
    private LineTotal allItemsOnTransaction;

    //create a transactionID and generate Tranaction Output
    public final void startSale() {
        setCurrentTransactionID();
        allItemsOnTransaction = new LineTotal();
        receipt = new TransactionOuputToReceipt();
        videoDisplay = new TransactionOuputToDisplay();

    }

    ;
    
    public final void addItemToSale(String productIdFromProductInBag, int qtyOfProductInBag) {

        if (database.findProduct(productIdFromProductInBag) == null) {
            throw new IllegalArgumentException("Product Not In Database");
        }

        allItemsOnTransaction.setLineTotal(database.findProduct(productIdFromProductInBag), qtyOfProductInBag);

    }

    ;
    public final void endSale() {
                receipt.outputEntireTransaction(allItemsOnTransaction);
    }

    ;

    public Integer getCurrentTransactionID() {
        return currentTransactionID;
    }

    //set to private becuase this shouldn't be modified by anyone - TransactionID is autogenerating
    private final void setCurrentTransactionID() {
        setLastTransactionID();
        this.currentTransactionID = (getLastTransactionID() + 1);
        this.lastTransactionID = getCurrentTransactionID();

    }

    public final Integer getLastTransactionID() {
        return lastTransactionID;
    }

    //set to private becuase this shouldn't be modified by anyone - LastTransactionID is autogenerating
    private final void setLastTransactionID() {
        if (lastTransactionID == null) {
            lastTransactionID = 0;

        }

    }

    public PosRegister(Database database) {
        this.database = database;

    }
}
