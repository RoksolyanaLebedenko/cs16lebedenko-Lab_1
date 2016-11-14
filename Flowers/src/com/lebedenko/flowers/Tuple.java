package com.lebedenko.flowers;

/**
 * Created by Roksolyana Lebedenko on 01.11.2016.
 */
public class Tuple<K extends Comparable<K>, V> implements Comparable<Tuple<K,V>>{
    private K k;
    private V v;
    public Tuple(K k, V v){
        this.k = k;
        this.v = v;
    }

    public String toString() {
        return "(" + k.toString() + "," + v.toString() +")";
    }

    @Override
    public int compareTo(Tuple<K, V> o) {
        return this.k.compareTo(o.k);
    }
}
