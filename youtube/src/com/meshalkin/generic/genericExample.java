package com.meshalkin.generic;

public class genericExample<T, V> {
    public String string = "";

    public String getString() {
        return string;
    }
    public void addToString(T t, V v){
        if (this.string.isEmpty()){
            this.string = this.string + t.toString() + v.toString();
        } else {
            this.string = this.string + "\n" + t.toString() + v.toString();
        }
    }
}
