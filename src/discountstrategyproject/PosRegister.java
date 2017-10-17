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
    private final String STORENAME = "Kohl's";
    private Product product;
    private TransactionOutput receipt, videoDisplay;
    private Database database;
    private TransactionDataService itemsInCurrentTransaction;

    //create a transactionID and generate Tranaction Output
    public final void startSale(String customerID) {
        setCurrentTransactionID();
        //customerID is validated in the TranactionDataService constructor
        itemsInCurrentTransaction = new TransactionDataService(this, customerID);
        receipt = new TransactionOuputToReceipt(itemsInCurrentTransaction);
        videoDisplay = new TransactionOuputToDisplay(itemsInCurrentTransaction);
    };
    
    public final void addItemToSale(String productIDFromProductInBag, int qtyOfProductInBag) {
        Product currentProductInBag = database.findProduct(productIDFromProductInBag);
        if (qtyOfProductInBag <= 0) {
            throw new IllegalArgumentException("Please Enter a Valid Quantity");
        }
        if (currentProductInBag == null) {
            throw new IllegalArgumentException("Product Not In Database");
        } else {
            itemsInCurrentTransaction.setOneLineTotal(currentProductInBag, qtyOfProductInBag, database);
        }

    }

    ;
    public final void endSale() {
        receipt.outputEntireTransaction();
    };

    public final Integer getCurrentTransactionID() {
        return currentTransactionID;
    };

    //set to private becuase this shouldn't be modified by anyone - TransactionID is autogenerating
    private final void setCurrentTransactionID() {
        if (lastTransactionID == null) {
            currentTransactionID = 0;
        } else {
        this.currentTransactionID = (getLastTransactionID() + 1);
        this.lastTransactionID = getCurrentTransactionID();
        }

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

    public final Database getDatabase() {
        return database;
    }

    public final void setDatabase(Database database) {
        if (database == null) {
            throw new IllegalArgumentException("Please enter a valid database");
        }
        this.database = database;
    }

    public PosRegister(Database database) {
        setDatabase(database);
        setLastTransactionID();

    }

    public final String getSTORENAME() {
        return STORENAME;
    }

}
