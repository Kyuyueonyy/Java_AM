package object;

import java.util.Arrays;

public class StaticTest {
    public static void main(String[] args) {
        //main()도 static 메서드임
        //jvm이 바로 호출할 수 있어야하므로.
        //main은 결과값을 jvm에 return하지는 않음.
        System.out.println(Cal2.PI);
        System.out.println(Cal2.company);

        Cal2.sum(10, 20);

        //실무에서 유용하게 사용할 수 있는 static변수와 메서드
        System.out.println(Math.PI);//final static
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(10, 20));
        System.out.println(Math.random()); //랜덤한 값
        // 0.0~0.99999 사이의 숫자 중 랜덤값
        // Random r = new Random(); //정수 랜덤값 - 이걸 더 많이 사용!
        System.out.println(Integer.parseInt("100"));
        System.out.println(String.valueOf(100));


        //실무에서 배열과 관련된 static메서드가 많음.
        int[] scores = {10, 30, 20};
        System.out.println(Arrays.toString(scores));
        Arrays.sort(scores); //오름차순으로 정렬, {10, 20, 30}
        /*
        * 함수를 쓸 때 원본을 파괴하는 함수 -> 파괴함수(ex.sort(), binarySearch())
        * 함수를 쓸 때 원본을 파괴하지 않는 함수 -> 비파괴함수(ex.toString(), 대부분의 모든 함수*/
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.binarySearch(scores, 30));
        //정렬 후 이므로 30은 인덱스 2에 있음.
        //binarySearch
        // - 양쪽으로 나눠서 search!
        // - 전체 배열안에 있는 것 중 검색시 속도가 매우 빠름.
        // - 없으면 음수가 나옴

//        3.14
//        KB
//        더한 결과는 30
//        3.141592653589793
//        20
//        10
//        0.9723205665678085
//        100
//        100
//        [10, 30, 20]
//        [10, 20, 30]
//        2


    }
}