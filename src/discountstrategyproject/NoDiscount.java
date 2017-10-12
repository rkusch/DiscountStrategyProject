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
public class NoDiscount implements Discount {
    private double discountAmt;

    @Override
    public final double getDiscountAmount(double qty, Product product) {
        return getDiscountAmt();
    }

    public final double getDiscountAmt() {
        return discountAmt;
    }

    public final void setDiscountAmt(double discountAmt) {
        this.discountAmt = 0;
    }

    
    public NoDiscount() {
        setDiscountAmt(0);
    }
    
    
    
}
