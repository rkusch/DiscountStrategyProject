/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author ryan
 */
public class TransactionDataService {

    private LineTotal oneLineTotal;
    private String[][] allItemsInTransaction;
    private Customer customer;
    private Integer transactionID;


    public final void setOneLineTotal(Product product, int qty) {
        if (product == null) {
            throw new IllegalArgumentException("Please input a valid product object");
        }
         if (qty<0) {
            throw new IllegalArgumentException("Please input a valid quantity");
        }
        oneLineTotal.setLineTotal(product, qty);
        setAllItemsInTransaction(oneLineTotal);

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

    public TransactionDataService(Customer customer, Integer transactionID) {
        oneLineTotal = new LineTotal();
        setCustomer(customer);
        setTransactionID(transactionID);
    }
//testing this below
     public String[] getLineHeaderInfo() {
         return oneLineTotal.getLineTotalHeaders();
     }

    public String[][] getAllItemsInTransaction() {
        return allItemsInTransaction;
    }

    public void setAllItemsInTransaction(LineTotal oneLineTotal) {
             if (allItemsInTransaction == null) {
            allItemsInTransaction = new String[1][oneLineTotal.getLineTotalHeaders().length];
        for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < oneLineTotal.getLineTotalHeaders().length; numberOfColumnsInLineTotal++) {
            allItemsInTransaction[0][numberOfColumnsInLineTotal] = oneLineTotal.getLineTotal()[numberOfColumnsInLineTotal];
        }
        } else {
            String[][] currentItemsInTransaction = allItemsInTransaction;
        allItemsInTransaction = new String[currentItemsInTransaction.length+1][oneLineTotal.getLineTotalHeaders().length];
        for (int numberOfItemsInCart = 0; numberOfItemsInCart < currentItemsInTransaction.length; numberOfItemsInCart++ ) {
           for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < oneLineTotal.getLineTotalHeaders().length; numberOfColumnsInLineTotal++) {
            allItemsInTransaction[numberOfItemsInCart][numberOfColumnsInLineTotal] = currentItemsInTransaction[numberOfItemsInCart][numberOfColumnsInLineTotal];
        } 
           //"adds" newly added item into array
           for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < oneLineTotal.getLineTotalHeaders().length; numberOfColumnsInLineTotal++) {
            allItemsInTransaction[numberOfItemsInCart+1][numberOfColumnsInLineTotal] = oneLineTotal.getLineTotal()[numberOfColumnsInLineTotal];
        } 
        }
        
            
        }
        this.allItemsInTransaction = allItemsInTransaction;
    }
     
}
