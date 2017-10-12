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
public interface Database {
    
    public abstract Customer findCustomer(String customerID);
    public abstract Product findProduct(String productID);
}
