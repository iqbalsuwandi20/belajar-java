package generic.application;

import generic.MyData;

/**
 * Memnbuat Covariant
 */
public class CovariantApp {
    public static void main(String[] args) {
        
        MyData<String> stringMyData = new MyData<>("Iqbal");
        process(stringMyData);
    }

    public static void process(MyData<? extends Object> myData) {

        System.out.println(myData.getData());

        // myData.setData("iqbal"); ERROR
    }
}
