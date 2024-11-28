package com.example.kiosk;


import java.util.ArrayList;

/**
 * 메뉴의 목록의 값들을 지정하고 저장 및 출력을 관리하는 클래스이다.
 */
public class Menu {

    private final ArrayList<String> mainMenu = new ArrayList<>();
    private final ArrayList<MenuItem> menuItem = new ArrayList<>();
    private final ArrayList<MenuItem> menuDrink = new ArrayList<>();
    private final ArrayList<MenuItem> menuDessert = new ArrayList<>();

    public Menu() {
    }

    public int getMenuItem() {
        menuItem.size();
        return menuItem.size();
    }

    public int getMenuDrink() {
        menuDrink.size();
        return menuDrink.size();
    }

    public int getMenuDessert() {
        menuDessert.size();
        return menuDessert.size();
    }

    public void clearMainMenu() {
        this.mainMenu.clear();
    }

    public void clearMenuItem() {
        this.menuItem.clear();
    }

    public void clearMenuDrinks() {
        this.menuDrink.clear();
    }

    public void clearMenuDesserts() {
        this.menuDessert.clear();
    }

    public void startMenu() {
        mainMenu.add("Burgers");
        mainMenu.add("Drinks");
        mainMenu.add("Desserts");

        for (int i = 0; i < mainMenu.size(); i++) {
            System.out.println(i + 1 + ". " + mainMenu.get(i));
        }
    }

    public void Burgers() {
        int num = 1;
        menuItem.add(new MenuItem("ShackBurger", 6.9, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("SmokeShack", 8.9, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("Cheeseburger", 6.9, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"));
        menuItem.add(new MenuItem("Hamburger", 5.4, "비프패티를 기반으로 야채가 들어간 기본버거"));

        for (MenuItem menuItem : menuItem) {
            System.out.printf("%d. %-15s | W %-5.1f | %s\n", num, menuItem.getType(), menuItem.getPrice(), menuItem.getExplain());
            num++;

        }
    }

    public void Drinks() {
        int num = 1;
        menuDrink.add(new MenuItem("coke", 2.1));
        menuDrink.add(new MenuItem("coffee", 2.5));
        menuDrink.add(new MenuItem("cider", 2.1));
        menuDrink.add(new MenuItem("ade", 2.7));

        for (MenuItem menuItem : menuDrink) {
            System.out.printf("%d. %-15s | W %.1f\n", num, menuItem.getType(), menuItem.getPrice());
            num++;
        }
    }

    public void Desserts() {
        int num = 1;
        menuDessert.add(new MenuItem("chocolate ice cream", 2.1));
        menuDessert.add(new MenuItem("vanilla ice cream", 1.8));
        menuDessert.add(new MenuItem("Oreo Ice Cream", 2.3));

        for (MenuItem menuItem : menuDessert) {
            System.out.printf("%d. %-15s | W %.1f\n", num, menuItem.getType(), menuItem.getPrice());
            num++;
        }
    }

    public MenuItem selectBurger(int i) {
        System.out.println("선택한 메뉴 : " + menuItem.get(i));
        System.out.println();
        return menuItem.get(i);
    }

    public MenuItem selectDrink(int i) {
        System.out.println("선택한 메뉴 : " + menuDrink.get(i).Drink());
        System.out.println();
        return menuDrink.get(i);
    }

    public MenuItem selectDessert(int i) {
        System.out.println("선택한 메뉴 : " + menuDessert.get(i).Drink());
        System.out.println();
        return menuDessert.get(i);
    }

}
