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
public class Product {
    private String productID;
    private String productName;
    private String productDescription;
    private double productUnitPrice;
    private Discount discount;


    public final String getProductID() {
        return productID;
    }

    public final void setProductID(String productID) {
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) {
        this.productName = productName;
    }

    public final String getProductDescription() {
        return productDescription;
    }

    public final void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public final double getProductUnitPrice() {
        return productUnitPrice;
    }

    public final void setProductUnitPrice(double productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        this.discount = discount;
    }

    public Product(String productID, String productName, double productUnitPrice, Discount discount) {
        setProductID(productID);
        setProductName(productName);
        setProductUnitPrice(productUnitPrice);
        setDiscount(discount);
    }
    
    
    
    
   
}
