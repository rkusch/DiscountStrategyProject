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
public class Customer {

    private String customerID;
    //would have liked to break this down into first and last name
    private String customerFullName;

    public final String getCustomerID() {
        return customerID;
    }

    public final void setCustomerID(String customerID) {
        if (customerID == null || customerID.length() == 0) {
            throw new IllegalArgumentException("Please enter a valid customer ID");
        }
        this.customerID = customerID;
    }

    public final String getCustomerFullName() {
        return customerFullName;
    }

    public final void setCustomerFullName(String customerFullName) {
        if (customerFullName == null || customerFullName.length() == 0) {
            throw new IllegalArgumentException("Please enter a valid customer name");
        }
        this.customerFullName = customerFullName;
    }

    public Customer(String customerID, String customerFullName) {
        setCustomerID(customerID);
        setCustomerFullName(customerFullName);
    }

}
