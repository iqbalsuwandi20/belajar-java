public class ManagerApp {
    public static void main(String[] args) {
        // Cara mengakses inheritance
        // Cara mengakses constructor
        Manager manager = new Manager("Iqbal");
        manager.sayHello("Gilang");

        VicePresident vicePresident = new VicePresident("Steven");
        vicePresident.sayHello("Garul");

        // Cara mengetahui object class
        System.out.println(manager);
        System.out.println(manager.toString());
        System.out.println(vicePresident);
        System.out.println(vicePresident.toString());
    }
}
