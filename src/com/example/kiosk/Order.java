package com.example.kiosk;

import java.util.ArrayList;

/**
 * 주문 및 장바구니에 관한 클래스로
 * 추가, 삭제, 장바구니 목록, 가격의 합 등을 처리하는 메서드가 있다.
 */
public class Order {
    public Order() {
    }

    private ArrayList<MenuItem> order = new ArrayList<>();
    private double total = 0;

    public void showOrder() {
        System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인       " + "2. 취소");
    }

    public void menuOrder() {
        System.out.println("[ Order MENU ]");
        System.out.println("4. Order      | 장바구니를 확인 후 주문합니다.");
        System.out.println("5. Cancle     | 진행중인 주문을 취소합니다.");
    }

    //장바구니에 담긴 목록과 가격의 합을 보여준다.
    public void listOrder() {
        int num = 1;
        System.out.println("[ Order LIST ]");
        for (MenuItem item : order) {
            System.out.printf("%d. %-15s | W %-5.1f | %s\n", num, item.getType(), item.getPrice(), item.getExplain());
            num++;
        }

        System.out.println("[ ToTal ]");
        double total = 0;
        for (MenuItem item2 : order) {
            total += item2.getPrice();

        }
        System.out.printf("W %.1f\n", total);
        System.out.println("1. 주문       2. 메뉴판");
        this.total = total;

    }

    //저장된 목록을 삭제를 담당하는 메서드다.
    public void listRemove() {
        int num = 1;
        System.out.println("[ Order LIST ]");
        for (MenuItem item : order) {
            System.out.printf("%d. %-15s | W %-5.1f | %s\n", num, item.getType(), item.getPrice(), item.getExplain());
            num++;
        }
        System.out.println("삭제할 제품의 번호를 입력하세요.");
        System.out.println("취소는 \'0\'을 입력해주세요.");
    }

    //장바구에 담는 메서드이다.
    public void addOrder(MenuItem menuItem) {

        order.add(menuItem);
        System.out.println(menuItem.getType() + "(이)가 장바구니에 추가되었습니다.");
    }

    public void clearOrder() {
        this.order.clear();
    }

    public int getOrder() {
        this.order.size();
        return order.size();
    }

    public void setOrder(int i) {
        order.remove(i);
    }

    public double getTotal() {
        return total;
    }

}
