package hf.dp.iterator;

public class MenuTestDrive {
    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        System.out.println("[All menu]");
        waitress.printMenu();
        System.out.println("[Vegetarian menu]");
        waitress.printVegetarianMenu();
    }
}
