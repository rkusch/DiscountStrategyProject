/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

import java.lang.reflect.Array;

/**
 *
 * @author rkusch
 */
public class LineTotal{
    private String[] lineTotal;

    public String[] getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Product product, double qty) {
        lineTotal = new String[]{
        product.getProductName(), Double.toString(product.getProductUnitPrice())
    };
    }
    

    public LineTotal() {
    }
    
}
