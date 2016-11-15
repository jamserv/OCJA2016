/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.google.guice;

import com.google.inject.Inject;

/**
 *
 * @author erlang
 */
public class CheckoutService {    
    private final IDiscountable discountable;

    @Inject
    public CheckoutService(IDiscountable discountable) {
        this.discountable = discountable;
    }
    
    public double checkout(double shoppingCarTotal) {
        double totalAfterDiscount = shoppingCarTotal - (shoppingCarTotal * discountable.getPrice());
        return totalAfterDiscount;
    }    
    
}
