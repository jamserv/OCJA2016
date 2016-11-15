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
public class D extends C{
    public static void main(String[] args) {
        B b = new C();
        A a = b;
        if (a instanceof A) {
            System.out.println("1");
        }
        if (a instanceof B) {
            System.out.println("2");
        }
        if (a instanceof C) {
            System.out.println("3");
        }
        if (a instanceof D) {
            System.out.println("4");
        }
    }
}
