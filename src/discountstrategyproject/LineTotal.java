/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.text.NumberFormat;

/**
 *
 * @author rkusch
 */
public class LineTotal {

    private String[] lineTotal;
    private String[] lineTotalHeaders;
    private Product product;

    public final String[] getLineTotal() {
        return lineTotal;
    }

    public final String[] getLineTotalHeaders() {
        return lineTotalHeaders;
    }

    //sets column names
    public final void setLineTotalHeaders() {

        lineTotalHeaders = new String[]{
            "Product Name",
            "Price",
            "Discount",
            "Qty",
            "Sale Price",
            "Total Price"

        };
    }

    ;

    //
    public final void setLineTotal(Product product, int qty, Database database) {
        //is it nessecary to validate that the product exists in the database at every level?
        if (database.findProduct(product.getProductID()) == null) {
            throw new IllegalArgumentException("Please input a valid product");
        }
        if (qty <= 0) {
            throw new IllegalArgumentException("Please input a valid quantity");
        }
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        lineTotal = new String[getLineTotalHeaders().length];
        lineTotal[0] = product.getProductName();
        lineTotal[1] = formatter.format(product.getProductUnitPrice());
        lineTotal[2] = formatter.format(product.getDiscount().getDiscountAmount(qty, product));
        lineTotal[3] = Integer.toString(qty);
        lineTotal[4] = formatter.format(product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product));
        lineTotal[5] = formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty);

    };
  
    public LineTotal() {
        setLineTotalHeaders();
    }

}
