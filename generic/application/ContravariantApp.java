package generic.application;

import generic.MyData;

/**
 * Membuat Contravariant
 */
public class ContravariantApp {
    public static void main(String[] args) {

        MyData<Object> objecMyData = new MyData<>("Iqbal");
        objecMyData.setData(1000);

        MyData<? super String> myData = objecMyData;

        process(myData);

        System.out.println(objecMyData.getData());
    }

    public static void process(MyData<? super String> myData) {

        Object valueObject = myData.getData();
        System.out.println("Process parameter " + valueObject);

        myData.setData("Iqbal Suwandi");
    }
}
