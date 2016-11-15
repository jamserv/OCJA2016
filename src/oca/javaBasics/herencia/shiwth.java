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
public class shiwth {

    public static void main(String[] args) {
        calculate(2);
    }

    static void calculate(int i) {
        String value;
        switch (i) {
            case 2:
            default:
                value = "def";
        }
        System.out.println("a" + 'b' + value);
        System.out.println('b' + new Integer(2));
    }
}
