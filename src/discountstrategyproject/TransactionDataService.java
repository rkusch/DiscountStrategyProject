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

    private LineTotal allLineTotalsInTransaction;
    private Customer customer;
    private Integer transactionID;

    public final LineTotal getAllLineTotalsInTransaction() {
        return allLineTotalsInTransaction;
    }

    public final void setAllLineTotalsInTransaction(Product product, int qty) {
        if (product == null) {
            throw new IllegalArgumentException("Please input a valid product object");
        }
         if (qty<0) {
            throw new IllegalArgumentException("Please input a valid quantity");
        }
        allLineTotalsInTransaction.setLineTotal(product, qty);

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
        allLineTotalsInTransaction = new LineTotal();
        setCustomer(customer);
        setTransactionID(transactionID);
    }

}
