package ch01.sec09; //;(세미콜론)생략 불가
// src아래 하위 폴더를 지정, 무조건 맨 윗줄에 !!

import org.w3c.dom.ls.LSOutput;

// 클래스 이름은 파일명과 똑같아야 한다, 대문자로 시작!
public class Hello {
    public static void main(String[] args) {
        //main 함수인데, 함수가 여러개일 때 무조건 main함수에서부터 시작!
        System.out.println("hi!! kb study"); //세미콜론 무조건! 생략 불가능!
        // System : 컴퓨터
        // . : 접근연산자
        // out : 출력장치, 모니터, output의 약자
        // println("문자열") :  ln : line 프린트하고 라인을 넣어라(엔터)
    }
}
