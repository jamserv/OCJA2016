/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.google.guice;

import com.google.inject.AbstractModule;

/**
 *
 * @author erlang
 */
public class DiscountGuiceModule extends AbstractModule{

    @Override
    protected void configure() {
        bind(IDiscountable.class).to(IDiscountableHandler.class);
    }
    
}
