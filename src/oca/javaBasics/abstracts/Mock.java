/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.javaBasics.abstracts;

/**
 *
 * @author erlang
 */
public class Mock extends abs{
    private int id;

    public Mock() {
    }

    public Mock(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public void m1() {
        
    }

    @Override
    public void m2() {        
        crontowable = new ICrontowableImpl();
    }     
    
    
    
    
}
