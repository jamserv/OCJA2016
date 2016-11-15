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
public class IntegerOperation {
    public static void main(String[] args) {
        int expr1 = 3 + 5 * 9 - 7;
        
        int expr2 = 3 + (5 * 9) - 7;
        int expr3 = 3 + 5 * (9 - 7);
        int expr4 = (3 + 5) * 9 - 7;
        
        System.out.println(expr1);
    }
}
