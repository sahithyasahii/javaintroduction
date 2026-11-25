package com.javaintroduction;

class A {
    A obj;

    public static void main(String[] args) {

        A a1 = new A();
        A a2 = new A();

        a1.obj = a2;
        a2.obj = a1;

        a1 = null;
        a2 = null;

        System.out.println("Objects are eligible for GC");
    }
}
