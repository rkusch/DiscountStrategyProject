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
public class QtyPercentOffDiscount implements Discount {
    private double percentOffDiscount;
    private double quantityNeededToGetDiscount;

    @Override
    public final double getDiscountAmount(double qty, Product product) {
        double totalDollarAmtOff = 0;
        if (qty >= getQuantityNeededToGetDiscount() ) {
            totalDollarAmtOff = (qty * product.getProductUnitPrice()) - (qty * getPercentOffDiscount());
        }
        return totalDollarAmtOff;
    }

    public final double getPercentOffDiscount() {
        return percentOffDiscount;
    }

    public final void setPercentOffDiscount(double percentOffDiscount) {
        if (percentOffDiscount <= 0) {
            throw new IllegalArgumentException("Invalid Percent Off Discount");
        }
        this.percentOffDiscount = percentOffDiscount;
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

    public QtyPercentOffDiscount(double percentOffDiscount, double quantityNeededToGetDiscount) {
        setPercentOffDiscount(percentOffDiscount);
        setQuantityNeededToGetDiscount(quantityNeededToGetDiscount);
    }
    
}
