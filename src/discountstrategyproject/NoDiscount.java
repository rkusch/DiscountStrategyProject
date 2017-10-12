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
    public final double setDiscountID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final double getDiscountID() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final double getDiscountAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public final double getDiscountAmt() {
        return discountAmt;
    }

    public final void setDiscountAmt(double discountAmt) {
        this.discountAmt = discountAmt;
    }

    
    public NoDiscount() {
        setDiscountAmt(0);
    }
    
    
    
}
