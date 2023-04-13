// Kata kunci super untuk mengambil method
public class ShapeApp {
    public static void main(String[] args) {
        // Cara mengakses kata kunci super
        Shape shape = new Shape();
        System.out.println(shape.getCorner());

        Retangle retangle = new Retangle();
        System.out.println(retangle.getCorner());
        System.out.println(retangle.getParentCorner());
    }
}
