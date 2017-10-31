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
        if (productID == null || productID.length() == 0) {
            throw new IllegalArgumentException("Please enter a valid Product ID");
        }
        // would check if the product ID already exists in the database
//        if (database.findProduct(productID) != null) {
//            throw new IllegalArgumentException("Please enter an unused ProductID");
//        }
        this.productID = productID;
    }

    public final String getProductName() {
        return productName;
    }

    public final void setProductName(String productName) throws IllegalArgumentException {
        if (productName == null || productName.length() == 0) {
            throw new IllegalArgumentException("Please enter a valid Product Name");
        }
        this.productName = productName;
    }

    public final String getProductDescription() {
        return productDescription;
    }

    public final void setProductDescription(String productDescription) {
        if (productDescription == null || productDescription.length() == 0) {
            throw new IllegalArgumentException("Please enter a valid Product Description");
        }
        this.productDescription = productDescription;
    }

    public final double getProductUnitPrice() {
        return productUnitPrice;
    }

    public final void setProductUnitPrice(double productUnitPrice) {
        if (productUnitPrice <= 0) {
            throw new IllegalArgumentException("Please enter a valid Product Unit Price");
        }
        this.productUnitPrice = productUnitPrice;
    }

    public final Discount getDiscount() {
        return discount;
    }

    public final void setDiscount(Discount discount) {
        if (discount == null) {
            throw new IllegalArgumentException("Please enter a valid Discount object");
        }
        this.discount = discount;
    }

    public Product(String productID, String productName, double productUnitPrice, Discount discount) {
        setProductID(productID);
        setProductName(productName);
        setProductUnitPrice(productUnitPrice);
        setDiscount(discount);
    }

}
