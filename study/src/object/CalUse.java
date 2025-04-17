package object;

public class CalUse {
    public static void main(String[] args) {
        Cal cal = new Cal();
        //계산기를 만들어서 사용할 수 있음.

        cal.add(100);
        cal.add(100, 200);
        cal.add("내 돈은 ", 300);

        //result 변수에 넣으면 return 필요!
        int result = cal.minus(5000, 4500); //500
        if (result >= 1000) {
            System.out.println("더 쓰자");
        } else {
            System.out.println("그만 쓰자");
        }

        //틀린 경우!
        /*
        int result = cal.add(200);
        add는 void로 선언했기 때문에 변수에 저장할 값이 없음!! */

        /*
        System.out.println(cal.add(300));
        add는 void 이므로 반환값이 없음 -> 출력할 수 없음
        void인 경우에는 프린트할 값이 없음.
        그럼 void를 프린트하려면?
        -> Cal.java에서 add함수 정의할 때 내부에 println을 작성했기 때문에
        cal.add(100)만 해도 계산값이 출력됨*/
    }
}
