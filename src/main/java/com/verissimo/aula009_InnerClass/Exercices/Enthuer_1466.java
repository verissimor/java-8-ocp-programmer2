package com.verissimo.aula009_InnerClass.Exercices;

class A {
    char c;
    A(char c) { this.c = c; }
}

class B extends A {
    char c = 'a';

    B() {
        super('b');
    }

    class C extends A {
        char c = 'c';
        C() {
            super('d');
            System.out.println(B.this.c);
            System.out.println(C.this.c);
            System.out.println(super.c);
        }
    }
}

public class Enthuer_1466 {
    public static void main(String args[]) {
        B.C obj = new B().new C();
    }
}
