package hf.dp.iterator;

import hf.dp.iterator.client.Waitress;
import hf.dp.iterator.menu.DinerMenu;
import hf.dp.iterator.menu.PancakeHouseMenu;
import info.MyHWInfo;

public class MenuTestDrive {
    public static void main(String[] args) {
        MyHWInfo.printInfo();

        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        System.out.println("[All menu]");
        waitress.printMenu();
        System.out.println("[Vegetarian menu]");
        waitress.printVegetarianMenu();
    }
}
