package com.example.kiosk;

import java.util.Scanner;

/**
 * Menu 클래스와 Order 클래스의 메서드를 불러와 원하는 형태로 출력하는 클래스
 * 메인 메뉴에서 버거, 음료, 티저트를 선택하고
 * 각각의 카테고리에서 음식을 선택할 수 있다.
 * 장바구니에 아무것도 담겨 있지 않을 경우 Order Menu가 뜨지 않는다.
 * 메뉴를 선택한 후 장바구니에 담으면 Order Menu가 보이고
 * 주문 및 추가한 메뉴를 삭제할 수 있다.
 */

public class Kiosk {
    Scanner sc = new Scanner(System.in);
    Menu menu = new Menu();
    Order order = new Order();
    private MenuItem menuItem;
    private int select;

    public Kiosk() {
    }

    //처음 시작 메뉴
    public void start() {
        //장바구니가 비었을 경우 Order Menu의 번호를 입력시 예외처리를 한다.
        try {
            while (true) {
                menu.clearMainMenu();
                System.out.println("[ MAIN MENU ]");
                menu.startMenu();

                //장바구니가 비었을 경우 Order Menu가 보이지 않는다.
                if (order.getOrder() != 0) {
                    order.menuOrder();
                }
                System.out.println("0. 종료      | 종료");
                select = sc.nextInt();

                //입력 값에 맞는 선택창으로 이동한다.
                if (select == 1) {
                    this.selectBurgers();
                    break;
                } else if (select == 2) {
                    this.selectDrinks();
                    break;
                } else if (select == 3) {
                    this.selectDesserts();
                    break;
                } else if (select == 4) {
                    if (order.getOrder() == 0) {
                        throw new RuntimeException("장바구니가 비었습니다.");
                    }
                    this.selectOrder();
                    break;
                } else if (select == 5) {
                    if (order.getOrder() == 0) {
                        throw new RuntimeException("장바구니가 비었습니다.");
                    }
                    this.removeOrder();
                    break;

                } else if (select == 0) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                } else {
                    System.out.println("메뉴를 선택해주세요.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            this.start();
        }
    }

    //버거 메뉴
    public void selectBurgers() {
        while (true) {
            menu.clearMenuItem();
            System.out.println("[ SHAKESHACK MENU ]");
            menu.Burgers();
            System.out.println("0. 뒤로가기");
            select = sc.nextInt();

            if (select == 0) {
                this.start();
                break;
            } else if (select <= menu.getMenuItem()) {
                menuItem = menu.selectBurger(select - 1);
                this.addOrder();
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }

        }
    }

    //음료 메뉴
    public void selectDrinks() {
        while (true) {
            menu.clearMenuDrinks();
            System.out.println("[ DRINK MENU ]");
            menu.Drinks();
            System.out.println("0. 뒤로가기");
            select = sc.nextInt();

            if (select == 0) {
                this.start();
                break;
            } else if (select <= menu.getMenuDrink()) {
                menuItem = menu.selectDrink(select - 1);
                this.addOrder();
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }

        }
    }

    //간식 메뉴
    public void selectDesserts() {
        while (true) {
            menu.clearMenuDesserts();
            System.out.println("[ Dessert MENU ]");
            menu.Desserts();
            System.out.println("0. 뒤로가기");
            select = sc.nextInt();

            if (select == 0) {
                this.start();
                break;
            } else if (select <= menu.getMenuDessert()) {
                menuItem = menu.selectDessert(select - 1);
                this.addOrder();
                break;
            } else {
                System.out.println("다시 입력하세요.");
            }

        }
    }

    //장바구니에 추가 메뉴
    public void addOrder() {
        order.showOrder();
        select = sc.nextInt();
        if (select == 1) {
            order.addOrder(menuItem);
            this.start();
        } else if (select == 2) {
            this.start();
        } else {
            System.out.println("다시 입력하세요.");
            this.addOrder();
        }

    }

    //장바구니 확인 및 주문
    public void selectOrder() {
        while (true) {
            order.listOrder();
            select = sc.nextInt();
            if (select == 1) {
                System.out.printf("주문이 완료되었습니다. 금액은 W %.1f 입니다.\n", order.getTotal());
                order.clearOrder();
                this.start();
                break;
            } else if (select == 2) {
                this.start();
                break;
            } else {
                System.out.println("다시 입력하세요.");
                this.selectOrder();
                break;
            }

        }
    }

    //장바구니에 담겨 있는 메뉴 삭제
    public void removeOrder() {
        order.listRemove();
        select = sc.nextInt();
        if (select == 0) {
            this.start();
        } else if (select <= order.getOrder()) {
            order.setOrder(select - 1);
            System.out.println("삭제되었습니다.");
            this.start();
        } else {
            System.out.println("다시 입력해주세요");
            this.removeOrder();
        }
    }

}




