package generic.application;

import generic.MyData;

/**
 * Membuat Invariant
 */
public class InvariantApp {
    public static void main(String[] args) {
        
        MyData<String> stringMyData = new MyData<>("Iqbal");
        //doIt(stringMyData); // ERROR
        // MyData<Object> objectMyData = stringMyData; // ERROR
        System.out.println(stringMyData);

        MyData<Object> objectMyData = new MyData<>(300);
        // MyData<Integer> integerMyData = objectMyData // ERROR
        // doItInteger(objectMyData); // ERROR
        System.out.println(objectMyData);
    }

    public static void doIt(MyData<Object> objectMyData) {
        // do nothing
    }

    public static void doItInteger(MyData<Integer> integerMyData) {
        // do nothing
    }
}
