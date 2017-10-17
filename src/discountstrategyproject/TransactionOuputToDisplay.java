/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.lang.reflect.Array;

/**
 *
 * @author rkusch
 */
//this class is the same as the TransactionOutputToDisplay seen as both output are actually going to the console
public class TransactionOuputToDisplay implements TransactionOutput {

    private final String TABSPACING = "%-22s";
    private TransactionDataService transactionData;

    //this is set to private because only this class should call this method
    private final void outputFromOneDArrayBasedOnNumberOfHeaders() {
        for (int numberOfHeaders = 0; numberOfHeaders < transactionData.getLineHeaderInfo().length; numberOfHeaders++) {
            System.out.printf(TABSPACING, transactionData.getLineHeaderInfo()[numberOfHeaders]);
        }
        System.out.print("\n");
    }
    //this is set to private because only this class should call this method
    private final void outputFromTwoDArrayBasedOnNumberOfHeaders() {
        for (int numberOfItemsInCart = 0; numberOfItemsInCart < transactionData.getAllItemsInTransaction().length; numberOfItemsInCart++) {
            for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < transactionData.getLineHeaderInfo().length; numberOfColumnsInLineTotal++) {
                System.out.printf(TABSPACING, transactionData.getAllItemsInTransaction()[numberOfItemsInCart][numberOfColumnsInLineTotal]);
            }
            System.out.print("\n");
        };
    }

    @Override
    public final void outputEntireTransaction() {
        System.out.println("Welcome to " + transactionData.getStoreName());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        outputFromOneDArrayBasedOnNumberOfHeaders();
        System.out.print("\n");
        outputFromTwoDArrayBasedOnNumberOfHeaders();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf(TABSPACING, "Sub-total:");
        System.out.print("$" + transactionData.getSubtotal());
        System.out.print("\n");
        System.out.printf(TABSPACING, "Total:");
        System.out.print("$" + transactionData.getTotal());
        System.out.print("\n");
        System.out.println();
        System.out.println();
        System.out.println("Thank you for shopping at " + transactionData.getStoreName() + ", " + transactionData.getCustomer().getCustomerFullName() + "!");
        System.out.println("You saved $" + transactionData.getTotalDollarsSaved() + "!");
        System.out.println();
        System.out.println();
        System.out.println("######################## Transaction ID: " + transactionData.getTransactionID() + " #########################################");
        System.out.println();
        System.out.println();

    }

    public final TransactionDataService getTransactionData() {
        return transactionData;
    }

    public final void setTransactionData(TransactionDataService transactionData) {
        if (transactionData == null) {
            throw new IllegalArgumentException("Please enter a valid transactionData object");
        }
        this.transactionData = transactionData;
    }

    public TransactionOuputToDisplay(TransactionDataService transactionData) {
        setTransactionData(transactionData);
    }

}
