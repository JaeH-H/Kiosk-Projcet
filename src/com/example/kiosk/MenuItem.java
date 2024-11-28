package com.example.kiosk;

/**
 * 메뉴의 매개변수를 지정해주는 클래스이다.
 * 생성자의 매개변수를 통해서 입력 값이 들어오는 형태를 정해준다.
 */
public class MenuItem {

    private String type;
    private double price;
    private String explain;

    public MenuItem(String type, double price, String explain) {
        this.type = type;
        this.price = price;
        this.explain = explain;
    }

    public MenuItem(String type, double price) {
        this.type = type;
        this.price = price;
    }

    @Override
    public String toString() {
        return type + "     | W " + price + "     | " + explain;
    }


    public String Drink() {
        return type + "     | W " + price;
    }


    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getExplain() {
        return explain;
    }

}
