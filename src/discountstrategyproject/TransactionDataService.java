/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.text.DecimalFormat;

/**
 *
 * @author ryan
 */
public class TransactionDataService {

    private LineTotal oneLineTotal;
    private String[][] allItemsInTransaction;
    private Customer customer;
    private Integer transactionID;
    private String storeName;
    private double subtotal;
    private double total;
    private double totalDollarsSaved;

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        if (storeName.isEmpty()) {
            throw new IllegalArgumentException("Please enter a valid store name");
        }
        this.storeName = storeName;
    }

    public final void setOneLineTotal(Product product, int qty) {
        if (product == null) {
            throw new IllegalArgumentException("Please input a valid product object");
        }
        if (qty < 0) {
            throw new IllegalArgumentException("Please input a valid quantity");
        }
        oneLineTotal.setLineTotal(product, qty);
        setAllItemsInTransaction(oneLineTotal);
        setTotal();
        setSubtotal();
        setTotalDollarsSaved();

    }

    public LineTotal getOneLineTotal() {
        return oneLineTotal;
    }

    public Customer getCustomer() {
        return customer;
    }

    public final void setCustomer(Customer customer) {
        if (customer == null) {
            throw new IllegalArgumentException("Please enter a valid customer");
        }
        this.customer = customer;
    }

    public final Integer getTransactionID() {
        return transactionID;
    }

    public final void setTransactionID(Integer transactionID) {
        if (transactionID == null) {
            throw new IllegalArgumentException("Please enter a valid transactionID");
        }
        this.transactionID = transactionID;
    }

    public TransactionDataService(Customer customer, Integer transactionID, String storeName) {
        oneLineTotal = new LineTotal();
        setCustomer(customer);
        setTransactionID(transactionID);
        setStoreName(storeName);
    }
//testing this below

    public String[] getLineHeaderInfo() {
        return oneLineTotal.getLineTotalHeaders();
    }

    public String[][] getAllItemsInTransaction() {
        return allItemsInTransaction;
    }

    public void setAllItemsInTransaction(LineTotal oneLineTotal) {
        // if no items were added to transaction yet, create a two dimensional array
        if (allItemsInTransaction == null) {
            allItemsInTransaction = new String[1][oneLineTotal.getLineTotalHeaders().length];
            for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < oneLineTotal.getLineTotalHeaders().length; numberOfColumnsInLineTotal++) {
                allItemsInTransaction[0][numberOfColumnsInLineTotal] = oneLineTotal.getLineTotal()[numberOfColumnsInLineTotal];
            }
            // else if one or multiple items were added to transaction, copy the current transaction array
            // to a new array, and then add the new item to that new array
        } else {
            String[][] currentItemsInTransaction = allItemsInTransaction;
            allItemsInTransaction = new String[currentItemsInTransaction.length + 1][oneLineTotal.getLineTotalHeaders().length];
            for (int numberOfItemsInCart = 0; numberOfItemsInCart < currentItemsInTransaction.length; numberOfItemsInCart++) {
                for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < oneLineTotal.getLineTotalHeaders().length; numberOfColumnsInLineTotal++) {
                    allItemsInTransaction[numberOfItemsInCart][numberOfColumnsInLineTotal] = currentItemsInTransaction[numberOfItemsInCart][numberOfColumnsInLineTotal];
                }
                //"adds" newly added item into array
                for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < oneLineTotal.getLineTotalHeaders().length; numberOfColumnsInLineTotal++) {
                    allItemsInTransaction[numberOfItemsInCart + 1][numberOfColumnsInLineTotal] = oneLineTotal.getLineTotal()[numberOfColumnsInLineTotal];
                }

            }
        }
//        this.allItemsInTransaction = allItemsInTransaction;

    }

    public final double getSubtotal() {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(subtotal));
    }

    public final void setSubtotal() {
        double subtotal = 0;
        for (int allItems = 0; allItems < allItemsInTransaction.length; allItems++) {
            String strippedNumber = allItemsInTransaction[allItems][1].replaceAll("[^\\d.]+", "");
            subtotal = subtotal + (Double.parseDouble(strippedNumber) * Double.parseDouble(allItemsInTransaction[allItems][3]));
        };
        this.subtotal = subtotal;
    }

    public final double getTotal() {
        return total;
    }

    public final void setTotal() {
        double total = 0;
        for (int allItems = 0; allItems < allItemsInTransaction.length; allItems++) {
            String strippedNumber = allItemsInTransaction[allItems][5].replaceAll("[^\\d.]+", "");
            total = total + Double.parseDouble(strippedNumber);
        };
        this.total = total;
    }

    public double getTotalDollarsSaved() {
        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(totalDollarsSaved));
    }

    public void setTotalDollarsSaved() {
        this.totalDollarsSaved = getSubtotal() - getTotal();
    }

}
