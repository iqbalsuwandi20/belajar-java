public class ManagerApp {
    public static void main(String[] args) {
        // Cara mengakses inheritance
        Manager manager = new Manager();
        manager.name = "Iqbal";
        manager.sayHello("Gilang");

        VicePresident vicePresident = new VicePresident();
        vicePresident.name = "Steven";
        vicePresident.sayHello("Garul");
    }
}
