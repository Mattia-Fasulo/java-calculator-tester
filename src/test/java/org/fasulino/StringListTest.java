package org.fasulino;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StringListTest {

    @Test
    void add() {
        StringList testString = new StringList(new String[]{"ok", null, null, null, null},1);
        StringList myString = new StringList();
        myString.add("ok");


        StringList testString2 = new StringList(new String[]{"ok","ok","ok","ok","ok","ok",null,null,null,null},6);
        StringList myString2 = new StringList();
        myString2.add("ok");
        myString2.add("ok");
        myString2.add("ok");
        myString2.add("ok");
        myString2.add("ok");
        myString2.add("ok");


        assertEquals(testString, myString);
        assertEquals(testString2, myString2);

    }



}