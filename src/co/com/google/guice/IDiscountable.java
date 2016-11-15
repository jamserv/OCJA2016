/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.google.guice;

import com.google.inject.ImplementedBy;

/**
 *
 * @author erlang
 */
@ImplementedBy(IDiscountableHandler.class)
public interface IDiscountable {
    
    public double getPrice();
}
