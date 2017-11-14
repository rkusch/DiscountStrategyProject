/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rkusch
 */
public class LineTotal {

    private List<String> lineTotal = new ArrayList<>();
    private List<String> lineTotalHeaders = new ArrayList<>();
    private Product product;

    public final List<String> getLineTotal() {
        return lineTotal;
    }

    public final List<String>  getLineTotalHeaders() {
        return lineTotalHeaders;
    }

    //sets column names
    public final void setLineTotalHeaders() {

        lineTotalHeaders.add("Product Name");
        lineTotalHeaders.add("Price");
        lineTotalHeaders.add("Discount");
        lineTotalHeaders.add("Qty");
        lineTotalHeaders.add("Sale Price");
        lineTotalHeaders.add("Total Price");
       
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
        lineTotal.add(product.getProductName());
        lineTotal.add(formatter.format(product.getProductUnitPrice()));
        lineTotal.add(formatter.format(product.getDiscount().getDiscountAmount(qty, product)));
        lineTotal.add(Integer.toString(qty));
        lineTotal.add(formatter.format(product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)));
        lineTotal.add(formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty));

    };
  
    public LineTotal() {
        setLineTotalHeaders();
    }

}
