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
public class LineTotal {

    private Object[][] lineTotal;

    public final Object[][] getLineTotal() {
        return lineTotal;
    }

    public final void setLineTotal(Product product, double qty) {
        if (lineTotal == null) {
            lineTotal = new Object[1][3];
            lineTotal[0][0] = product.getProductName();
            lineTotal[0][1] = Double.toString(product.getProductUnitPrice());
            lineTotal[0][2] = Double.toString(qty);
            lineTotal[1][0] = product.getProductName();
            lineTotal[1][1] = Double.toString(product.getProductUnitPrice());
            lineTotal[1][2] = Double.toString(qty);
            } 
//        else {
//            //if lineTotal contains items
//            Object[][] oldLineTotal = lineTotal;
//            
//            lineTotal = new Object[2][oldLineTotal.length];
//            
//            for (int ie = 0; ie < oldLineTotal.length; ++ie) {
//                lineTotal[ie][0] = product.getProductName();
//                lineTotal[ie][1] = Double.toString(product.getProductUnitPrice());
//                lineTotal[ie][2] = Double.toString(qty);
//}
////            lineTotal = new String[][]{
////                
////            }
//        }
        }
            
            

    

    public LineTotal() {
    }

}
