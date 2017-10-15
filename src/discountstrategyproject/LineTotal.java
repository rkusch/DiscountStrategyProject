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

//    public final void setLineTotal() {
//        NumberFormat formatter = NumberFormat.getCurrencyInstance();
//        //if lineTotal contains no items
////        if (lineTotal == null) {
////            lineTotal = new String[1][5];
////            lineTotal[0][0] = product.getProductName();
////            lineTotal[0][1] = formatter.format(product.getProductUnitPrice());
////            lineTotal[0][2] = formatter.format(product.getDiscount().getDiscountAmount(qty, product));
////            lineTotal[0][3] = Integer.toString(qty);
////            if (qty > 1) {
////                lineTotal[0][4] = formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty) + " (" + qty + " @ " + (formatter.format(product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product))) + ")";
////            } else {
////                lineTotal[0][4] = formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty);
////            }
////
////            //else if lineTotal contains items
////        } else {
////            String[][] oldLineTotal = lineTotal;
////            lineTotal = new String[oldLineTotal.length + 1][5];
////            for (int ia = 0; ia < oldLineTotal.length; ia++) {
////                lineTotal[ia][0] = oldLineTotal[ia][0];
////                lineTotal[ia][1] = oldLineTotal[ia][1];
////                lineTotal[ia][2] = oldLineTotal[ia][2];
////                lineTotal[ia][3] = oldLineTotal[ia][3];
////                lineTotal[ia][4] = oldLineTotal[ia][4];
////            }
////
////            for (int ie = oldLineTotal.length; ie < oldLineTotal.length + 1; ie++) {
////                lineTotal[ie][0] = product.getProductName();
////                lineTotal[ie][1] = formatter.format(product.getProductUnitPrice());
////                lineTotal[ie][2] = formatter.format(product.getDiscount().getDiscountAmount(qty, product));
////                lineTotal[ie][3] = Integer.toString(qty);
////                if (qty > 1) {
////                    lineTotal[ie][4] = formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty) + " (" + qty + " @ " + (formatter.format(product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product))) + ")";
////                } else {
////                    lineTotal[ie][4] = formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty);
////                }
////            }
////
////        }
////          start of test
////-----------------------------------------------//
////moved code below to TransactionDataService
////        if (lineTotal == null) {
////            lineTotal = new String[1][getLineTotalHeader().length];
////        for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < getLineTotalHeader().length; numberOfColumnsInLineTotal++) {
////            lineTotal[0][numberOfColumnsInLineTotal] = lineTotalHeaderMethods[numberOfColumnsInLineTotal];
////        }
////        } else {
////            String[][] oldLineTotal = lineTotal;
////        lineTotal = new String[oldLineTotal.length+1][getLineTotalHeader().length];
////        for (int numberOfItemsInCart = 0; numberOfItemsInCart < oldLineTotal.length; numberOfItemsInCart++ ) {
////           for (int numberOfColumnsInLineTotal = 0; numberOfColumnsInLineTotal < getLineTotalHeader().length; numberOfColumnsInLineTotal++) {
////            lineTotal[numberOfItemsInCart][numberOfColumnsInLineTotal] = lineTotalHeaderMethods[numberOfColumnsInLineTotal];
////        } 
////        }
////        
////            
////        }
//        
//    }

    public String[] getLineTotalHeaders() {
        return lineTotalHeaders;
    }
//sets column names and the corresponding method to obtain that information

    public void setLineTotalHeaders() {

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

    
    public void setLineTotal(Product product, int qty) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        lineTotal = new String[getLineTotalHeaders().length];
        lineTotal[0] = product.getProductName();
        lineTotal[1] = formatter.format(product.getProductUnitPrice());
        lineTotal[2] = formatter.format(product.getDiscount().getDiscountAmount(qty, product));
        lineTotal[3] = Integer.toString(qty);
        lineTotal[4] = formatter.format(product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product));
        lineTotal[5] = formatter.format((product.getProductUnitPrice() - product.getDiscount().getDiscountAmount(qty, product)) * qty);
   
        

    }

    ;
       
    

    public LineTotal() {
        setLineTotalHeaders();
    }

//    public String[] getLineTotalHeaderMethods() {
//        return lineTotalHeaderMethods;
//    }
//
//    public void setLineTotalHeaderMethods(String[] lineTotalHeaderMethods) {
//        this.lineTotalHeaderMethods = lineTotalHeaderMethods;
//    }
    

}
