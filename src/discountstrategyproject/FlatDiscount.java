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
public class FlatDiscount implements Discount {
    
    private double discountTotalOff;

    public final double getDiscountTotalOff() {
        return discountTotalOff;
    }

    public final void setDiscountTotalOff(double discountTotalOff) {
        if (discountTotalOff <= 0) {
            throw new IllegalArgumentException("Invalid Discount Amount");
        }
        this.discountTotalOff = discountTotalOff;
    }

    @Override
    public final double getDiscountAmount(double qty, Product product) {
        return getDiscountTotalOff();
    }

    public FlatDiscount(double discountTotalOff) {
        setDiscountTotalOff(discountTotalOff);

    }
    
    
    
}
