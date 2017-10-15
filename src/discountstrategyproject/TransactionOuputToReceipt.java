/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author rkusch
 */
public class TransactionOuputToReceipt implements TransactionOutput {

    private final String TABSPACING = "%-22s";
    ;
    private TransactionDataService transactionData;

    private final void outputFromOneDArrayBasedOnNumberOfHeaders(String[] string) {
        for (int numberOfHeaders = 0; numberOfHeaders < transactionData.getLineHeaderInfo().length; numberOfHeaders++) {
            System.out.printf(TABSPACING, string[numberOfHeaders]);
        }
        System.out.print("\n");
    }

    private final void outputFromTwoDArrayBasedOnNumberOfHeaders(String[][] string) {
        for (int numberOfItemsInCart = 0; numberOfItemsInCart < transactionData.getAllItemsInTransaction().length; numberOfItemsInCart++) {
            for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < transactionData.getLineHeaderInfo().length; numberOfColumnsInLineTotal++) {
                System.out.printf(TABSPACING, transactionData.getAllItemsInTransaction()[numberOfItemsInCart][numberOfColumnsInLineTotal]);
            }
            System.out.print("\n");
        };
    }

    @Override
    public void outputEntireTransaction(TransactionDataService transactionData) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println("Welcome to " + transactionData.getStoreName());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        outputFromOneDArrayBasedOnNumberOfHeaders(transactionData.getLineHeaderInfo());
        System.out.print("\n");
        outputFromTwoDArrayBasedOnNumberOfHeaders(transactionData.getAllItemsInTransaction());
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        System.out.printf(TABSPACING, "Sub-total:");
        System.out.print("$" + transactionData.getSubtotal());
        System.out.print("\n");
        System.out.printf(TABSPACING, "Total:");
        System.out.print("$" + transactionData.getTotal());
        System.out.print("\n");
        System.out.println();
        System.out.println();
        System.out.println("Thank you for shopping at " + transactionData.getStoreName() + ", " +transactionData.getCustomer().getCustomerFullName() +"!" );
        System.out.println("You saved $" + transactionData.getTotalDollarsSaved() + "!" );

    }

    public TransactionDataService getTransactionData() {
        return transactionData;
    }

    public void setTransactionData(TransactionDataService transactionData) {
        this.transactionData = transactionData;
    }

    public TransactionOuputToReceipt(TransactionDataService transactionData) {
        this.transactionData = transactionData;
    }

}
