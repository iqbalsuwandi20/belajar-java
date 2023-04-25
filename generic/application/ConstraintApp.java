package generic.application;

/**
 * Membuat Bounded Type Parameter
 */
public class ConstraintApp {
    public static void main(String[] args) {

        NumberData<Integer> integNumberData = new NumberData<Integer>(100);
        NumberData<Long> longNumberData = new NumberData<Long>(100L);
        
        // NumberData<String> stringNumberData = new NumberData<String>("iqbal"); ERROR
        
    }

    public static class NumberData<T extends Number> {

        private T data;

        public NumberData(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

    }
}
