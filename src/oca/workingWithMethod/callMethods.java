/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.workingWithMethod;

/**
 *
 * @author erlang
 */
public class callMethods {

    private void caiman() {
        t1(5,5);
    }    

    private callMethods(int i) {
    }
    
    

    void t1(int i, int... j) {
        System.out.println("::a1");
    }

    void t1(int... i) {
        System.out.println("::a2");
    }

    void t1(int i, int j) {
        System.out.println("::a3");
    }
    public static void main(String[] args) {
        new callMethods(5).caiman();
    }
}
