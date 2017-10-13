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
public class LineTotal {

    private String[][] lineTotal;
    private static final int NUMBER_OF_COLUMNS_PER_LINE = 3;

    public final String[][] getLineTotal() {
        return lineTotal;
    }

    public final void setLineTotal(Product product, double qty) {
        if (lineTotal == null) {
            lineTotal = new String[1][NUMBER_OF_COLUMNS_PER_LINE];
            lineTotal[0][0] = product.getProductName();
            lineTotal[0][1] = Double.toString(product.getProductUnitPrice());
            lineTotal[0][2] = Double.toString(qty);
            } 
        else {
            //if lineTotal contains items
            String[][] oldLineTotal = lineTotal;
            
            lineTotal = new String[oldLineTotal.length+1][NUMBER_OF_COLUMNS_PER_LINE];
            
            for (int ia = 0; ia < oldLineTotal.length; ia++) {
                lineTotal[ia][0] = oldLineTotal[ia][0];
                lineTotal[ia][1] = oldLineTotal[ia][1];
                lineTotal[ia][2] = oldLineTotal[ia][2];
            }
            
            
            for (int ie = oldLineTotal.length; ie < oldLineTotal.length+1; ie++) {
                lineTotal[ie][0] = product.getProductName();
                lineTotal[ie][1] = Double.toString(product.getProductUnitPrice());
                lineTotal[ie][2] = Double.toString(qty);
}

        
        }
            
           

}
}
