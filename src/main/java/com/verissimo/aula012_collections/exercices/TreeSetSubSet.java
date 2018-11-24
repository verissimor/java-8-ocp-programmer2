package com.verissimo.aula012_collections.exercices;

import java.util.TreeSet;

public class TreeSetSubSet {

    public static void main(String[] args) {

        TreeSet<Integer> s = new TreeSet<Integer>();
        TreeSet<Integer> subs = new TreeSet<Integer>();

        for (int i = 324; i <= 328; i++) {
            s.add(i);
        }

        subs = (TreeSet) s.subSet(326, true, 328, true);
        subs.add(329);
        System.out.println(s + " " + subs);
        //Exception in thread "main" java.lang.IllegalArgumentException: key out of range

    }
}
