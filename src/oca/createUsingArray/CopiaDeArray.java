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
public class CopiaDeArray {
    public static void main(String[] args) {
        
        System.out.println(5>>1);
        
        int[] arr1 = {1,2,3,4,5,6};
        
        System.arraycopy(arr1, 3, arr1, 2, 2);
        
        for (int element : arr1) {
            System.out.print(element);
        }
        System.out.println();
    }
}
