package generic.application;

import generic.Pair;

/**
 * Membuat Multiple Parameter Type
 */
public class PairApp {
    public static void main(String[] args) {
        
        Pair<String, Integer> pair = new Pair<String,Integer>("Iqbal", 300);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        
    }
}
