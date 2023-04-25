package generic.application;

import generic.MyData;

/**
 * Membuat Wildcard
 */
public class WildcardApp {
    public static void main(String[] args) {

        print(new MyData<Integer>(900));
        print(new MyData<String>("Iqbal Suwandi"));
        print(new MyData<MultipleConstraintApp.Manager>(new MultipleConstraintApp.Manager()));
    }

    public static void print(MyData<?> myData) {
        System.out.println(myData.getData());
    }
}
