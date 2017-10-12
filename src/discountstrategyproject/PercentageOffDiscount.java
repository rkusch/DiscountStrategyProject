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
public class PercentageOffDiscount implements Discount{
    private double percentageOff;

    public final double getPercentageOff() {
        return percentageOff;
    }

    public final void setPercentageOff(double percentageOff) {
        this.percentageOff = percentageOff;
    }
    
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

    public PercentageOffDiscount(double percentageOff) {
        setPercentageOff(percentageOff);
    }

  
    
    
}
