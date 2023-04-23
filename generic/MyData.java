package generic;

/**
 * Membuat Generic Class
 */
public class MyData <T> {

    /**
     * Parameter Generic
     * E = Element
     * K = Key 
     * N = Number 
     * T = Type 
     * V = Value  
     */
    private T data;

    public MyData(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }   
}
