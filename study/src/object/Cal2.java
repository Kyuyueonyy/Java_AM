package object;

public class Cal2 {
    int price; //인스턴스 변수
    //클래스를 사용하여 만든 객체 = 인스턴스
    //new를 이용해서 인스턴스 만든 후에 접근 가능한 변수
    final static double PI = 3.14;
    //final 변수명; --> 상수!
    //final 메서드명(), final class 클래스명;
    // ⇒ 상속과 관련된 개념
    //final == 변경불가

    static String company = "KB";

    static void sum(int x, int y) {
        //static method(정적 메서드)
        System.out.println(x+y);
        //static 메서드 안에서는 필드 중에서
        //static 변수만 사용 가능
        System.out.println(x+y+PI);

        /*System.out.println(price);
        * -> 이렇게 쓰면 오류!?
        * price는 static 변수이므로 new를 사용해야함 ?? */

    }
}
