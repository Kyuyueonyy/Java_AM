package test; // ; 생략 불가능, package맨위에 작성

//int x = 100; 여기에 쓰지 않는다!
//모든 변수는 class 안으로 들어가야함, 전역변수 없음
//자바에서는 모든것이 다 class 안으로 들어가야한다!
public class VariableTest { //자바파일명과 class명이 반드시 같아야함.
    public static void main(String[] args) {
        // main이라고 치면 틀이 자동 완성됨
        // 이 부품은 독립적으로 실행할 수 있는 부품이 됨.
        // 함수인데, 만약에 함수가 여러개인 경우 무조건 main()을 호출!
        // 타입 변수명; -> 변수가 생성됨. 선언!
        // 자바는 변수에 들어갈 타입이 선언할 때 결정됨(정적타이핑)

        // 기본형 4가지 : 정수, 실수, 문자1, 논리
        // 정수: byte(1), short(2byte), int(4byte), long(8byte)
        // 변수는 소문자로 시작!
        // 자바는 반드시 변수 만들 때 처음값(초기값) 을 넣어주는 습관을 들이자.
        byte age = 127;
        short year = 2025;
        int hit = 210000000;
        long money = 2200000000000L; // long은 꼭 L로 표시해주기

        // 실수: float(소수점 7자리, 4byte), double(소수점 15자리, 8byte)
        float w = 50.5F; // float 을 F로 표시해주기
        double h = 170.000000555;

        // 문자1 : char
        char gender = '여'; //문자 1개일 땐 홀따옴표!

        // 논리형 : boolean
        boolean food = true; //true, false 두가지만 쓸 수 있음

        // +연산자가 하나라도 문자열이면 결과는 문자열(string)
        System.out.println("내 나이는 " + age + "세야.");
        System.out.println("내 몸무게 " + w + "kg이야.");
        System.out.println("내 성별은 " + gender + "이야.");
        System.out.println("나는 오늘 아침을 먹었을까? " + food);

        String name = "김규연"; // string은 무조건 쌍따옴표
        String plan = """
                나는
                훌륭한
                자바 개발자가
                되리라!
                """; //여러 줄을 작성하려면 따옴표 세개!
        
        System.out.print("출력하고 엔터치지마!");
        System.out.println("내 이름은 "+ name);
        System.out.println("내 계획은 "+ plan); //한줄 복사 : Ctrl+D
        System.out.printf("내 이름은 %s 이야!", name);
        System.out.printf("내 몸무게는 %.2f, 내 키는 %10.3f", w, h);
    }
}