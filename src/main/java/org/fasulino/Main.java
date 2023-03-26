package org.fasulino;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringList sl = new StringList();

        System.out.println(sl);

        sl.add("ok");

        System.out.println(sl);

        StringList sl2 = new StringList();

        System.out.println(sl2);

        sl2.add("ok");

        System.out.println(sl2);

        System.out.println(sl.equals(sl2));;


    }
}
