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
public class PercentageOffDiscount implements Discount {

    private double percentageOff;

    public final double getPercentageOff() {
        return percentageOff;
    }

    public final void setPercentageOff(double percentageOff) {
        if (percentageOff <= 0) {
            throw new IllegalArgumentException("Invalid Percent Off");
        }
        this.percentageOff = percentageOff;
    }

    @Override
    public final double getDiscountAmount(double qty, Product product) {
        return (product.getProductUnitPrice() * getPercentageOff());
    }

    public PercentageOffDiscount(double percentageOff) {
        setPercentageOff(percentageOff);
    }

}
