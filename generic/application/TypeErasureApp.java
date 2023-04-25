package generic.application;

import generic.MyData;

/**
 * Membuat Type Erasure
 */
public class TypeErasureApp {
    public static void main(String[] args) {
        
        MyData myData = new MyData("Iqbal Suwandi");

        /**
         * Problem Type Erasure
         */
        MyData<Integer> integerMyData = (MyData<Integer>) myData;
        Integer integer = integerMyData.getData();
    }
}
