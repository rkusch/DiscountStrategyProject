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
public class QtyFlatDiscount implements Discount {

    private double discountTotalOff;
    private double quantityNeededToGetDiscount;
    

    @Override
    public final double getDiscountAmount(double qty, Product product) {
        double totalDollarAmtOff = 0;
        if (qty >= getQuantityNeededToGetDiscount()) {
          totalDollarAmtOff = getDiscountTotalOff();  
        }
        return totalDollarAmtOff;
    }

    public final double getDiscountTotalOff() {
        return discountTotalOff;
    }

    public final void setDiscountTotalOff(double discountTotalOff) {
        if (discountTotalOff <= 0) {
            throw new IllegalArgumentException("Invalid Discount Total Off");
        }
        this.discountTotalOff = discountTotalOff;
    }

    public final double getQuantityNeededToGetDiscount() {
        return quantityNeededToGetDiscount;
    }

    public final void setQuantityNeededToGetDiscount(double quantityNeededToGetDiscount) {
         if (quantityNeededToGetDiscount <= 0) {
            throw new IllegalArgumentException("Invalid Discount Quantity");
        }
        this.quantityNeededToGetDiscount = quantityNeededToGetDiscount;
    }
    

    public QtyFlatDiscount(double discountTotalOff) {
        setDiscountTotalOff(discountTotalOff);
    }

}
