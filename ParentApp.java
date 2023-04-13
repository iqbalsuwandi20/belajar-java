public class ParentApp {
    public static void main(String[] args) {
        // Cara mengakses variable hidding
        Child child = new Child();
        child.name = "Iqbal";
        child.doIt();
        System.out.println(child.name);

        Parent parent = (Parent) child;
        parent.doIt();
        System.out.println(parent.name);
    }
}