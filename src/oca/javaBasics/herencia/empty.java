/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.javaBasics.herencia;

/**
 *
 * @author erlang
 */
public class empty {
    
    static String goIt(String value) {
        if (value == null || value.length() == 0) {
            return "EMPTY";
        } else
            return "NOT EMPTY";
    }    
    
    public static void main(String[] args) {
        System.out.println(goIt(null));
    }
}
