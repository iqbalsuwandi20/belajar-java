public class ManagerApp {
    public static void main(String[] args) {
        // Cara mengakses inheritance
        // Cara mengakses constructor
        Manager manager = new Manager("Iqbal");
        manager.sayHello("Gilang");

        VicePresident vicePresident = new VicePresident("Steven");
        vicePresident.sayHello("Garul");
    }
}
