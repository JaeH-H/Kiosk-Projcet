## Kiosk-Project
java를 사용하여 클래스 간의 연계를 통해 Kiosk를 구현하였습니다.

## 요구 사항
1. MenuItem을 관리하는 Menu 클래스
2. 메뉴 관리 및 사용자의 입력을 처리하는 등 순서 제어를 하는 Kiosk 클래스
3. 선택한 메뉴를 장바구니에 추가 및 조회, 삭제 하는 클래스

## 구현 기능
1. 메뉴 출력
  * 메뉴를 선택할 수 있고 장바구니에 넣을 수 있습니다.
2. 장바구니
  * 선택한 메뉴를 조회하고 메뉴들의 가격의 합을 볼 수 있습니다.
3. 예외 처리를 통해 장바구니가 아무것도 없을 때에는 메뉴에 출력되지 않습니다.
   
## 클래스 설명

**MenuItem**
메뉴의 매개변수를 지정해주는 클래스이며 생성자의 매겨변수를 통해서 들어오는 입력 값의 형태를 정해줍니다.


**Menu**
메뉴의 목록의 값을 지정하고 저장 및 출력을 관리하는 합니다.


**Order**
장바구니에 관한 클래스로 추가, 삭제, 장바구니 목록, 가격의 합 등을 처리합니다.

**Kiosk**
Menu 클래스와 Order 클래스의 매서드를 불러와 원하는 형태로 출력합니다.
메인 메뉴에서 버거, 음료, 디저트를 선택하고 각각의 카테고리에서 음식을 선택할 수 있습니다.
장바구니에 아무것도 담겨 있지 않을 경우 Order 메뉴가 출력되지 않습니다.

