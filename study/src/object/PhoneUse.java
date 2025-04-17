package object;

public class PhoneUse {
    public static void main(String[] args) {
        Phone phone = new Phone(); //폰이 메모리에 준비됨
        //Phone의 실제 대상(object) --> phone
        //멤버변수가 힙영역에 복사됨.
        //Color, price 변수 생김
        //phone에 Color, price가 저장된 주소가 들어있음.
        // --> 참조형 변수


        // 객체 생성 후 . 으로 값 넣기
        phone.color = "red";
        phone.price = 10;

        System.out.println(phone); //주소 프린트예정
        System.out.println(phone.color);
        System.out.println(phone.price);

        phone.text(); //객체 생성 후 phone의 메서드 호출하면 동작하게 할 수 있음
        //자바에서는 부품을 만들고 난 다음에 메서드를 호출함.
        //메서드만 독립적으로 실행하는 것은 없음.


        //객체 생성과 동시에 값을 넣어도 된다.
        Phone phone1 = new Phone("silver", 20);
        System.out.println(phone1.color);
        System.out.println(phone1.price);
    }
}
