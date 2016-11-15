/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.herencia;

/**
 *
 * @author erlang
 */
public class A implements Iware, Isow{

    @Override
    public void cai() {
        System.out.println("local::");
    }
    
    
    public static void main(String[] args) {
        A a = new A();
//        System.out.println(a.VALUE);
//        System.out.println(Iware.VALUE);
//        System.out.println(VALUE);
        
        a.cai();
    }
}
