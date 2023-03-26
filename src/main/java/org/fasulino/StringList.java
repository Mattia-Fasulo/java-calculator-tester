package org.fasulino;

import java.util.Arrays;

public class StringList {

     private static final int DEFAULT_SIZE = 5;
     private String[] list;
     private int lenght;

    public StringList() {
        list = new String[DEFAULT_SIZE];
        lenght = 0;
    }


    public StringList(String[] list, int lenght) {
        this.list = list;
        this.lenght = lenght;
    }

    public void add(String s){
        if(lenght == list.length){
            String[] temp = new String[lenght + DEFAULT_SIZE];
            System.arraycopy(list,0,temp,0,lenght);
            list = temp;
        }
        list[lenght++] = s;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StringList that = (StringList) o;

        if (lenght != that.lenght) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(list, that.list);
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(list);
        result = 31 * result + lenght;
        return result;
    }

    @Override
    public String toString() {
        return "StringList: {" + Arrays.toString(list) + '}';
    }



}
