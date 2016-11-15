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
public class foo extends bar {

    public int h = 44;
    private final double ANGLE = 8;

    private int foobar(int a) {
        return a;
    }

    private int foobar(int a, int b) {
        return a * b;
    }

    private int foobarcai(int a, int... b) {
        for (int index = 0; index < b.length; index++) {
            System.out.println("::" + b[index] * a);
        }
        return 6;
    }

    public int getH() {
        System.out.println("foo::" + h);
        return h;
    }

    public static void main(String[] args) {
        bar br = new foo();
        foo fu = (foo) br;
        fu.foobarcai(5,1);

//        System.out.println(br.h + "::" + br.getH());
//        foo fu = (foo) br;
//        System.out.println(fu.h+"::"+fu.getH());
    }

}
