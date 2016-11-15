/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.google.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 *
 * @author erlang
 */
public class MainGuice {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new DiscountGuiceModule());
        CheckoutService checkoutService = injector.getInstance(CheckoutService.class);
        
        System.out.println(checkoutService.checkout(100.00));
    }
    
}
