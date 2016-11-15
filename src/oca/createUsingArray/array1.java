/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.createUsingArray;

/**
 *
 * @author erlang
 */
public class array1 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int i = 0;
        int[] ia = {10, 20};        
//        ia[1]++;
        ia[0] = i = 30;
        System.out.println(ia[0] + " " + ia[1] + " " + i);
        
        String[] val = new String[ ]{"d","2"};
        System.out.println(val[1]);
    }
}
