/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.herencia.withIterface;

/**
 *
 * @author erlang
 */
public class C1 extends B1{
    
    public static void main(String[] args) {
        B1 b1 = new B1();
        C1  c1 = new C1();
        
        b1 = c1;
        
        System.out.println(b1.getClass());
        System.out.println(c1.getClass());
    }
}
