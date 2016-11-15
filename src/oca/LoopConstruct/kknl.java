/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oca.LoopConstruct;

/**
 *
 * @author erlang
 */
public class kknl {

    static String[] days = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0, j = 10; sum > 20; ++i, --j) {
            System.out.println("i::"+i+"\tj::"+j);
        }
    }
}
