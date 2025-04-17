package object;

public class Phone {
    //멤버변수, 필드
    String color;
    int price;

    //기본 생성자 (아무것도 없는 생성자)
    //만약에 생성자가 하나도 없으면
    //컴파일러가 기본 생성자를 넣어줌
    //new Phone();
    //동일한 이름으로 생성자 메서드를 여러개 만들 수 있음
    //--> 메서드 오버로딩
    //단, 입력값이 다 달라야함
    public Phone() {
        System.out.println("전화기가 만들어짐");
    }

    //객체 생성 시 필드 자동 초기화가 됨
    public Phone(String color, int price) {
        this.color = color;
        this.price = price;
    }

    //필드를 초기화 하려는 목적이면 생성자(constructor) 호출!(
    //멤버메서드
    public void text() {
        System.out.println("문자를 보내다.");
    }

    public void kakao() {
        System.out.println("카톡하다.");
    }
}
