package stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] strArray = {"홍길동", "신용권", "김미나"};

        //1. 배열에 있는 내용을 하나씩 꺼내와서 ,로 연결한 후 프린트
        //stream을 사용해보자

        //stream 사용 순서
        // 1. 스트림으로 만들기 2. 중간처리(filter, map) 3. 집계처리(sum, avg ...)
        Stream<String> strStream = Arrays.stream(strArray);

        /*배열을 stream으로 만들 때 Arrays.stream(배열이름) 함수를 사용*/

        //strStream.forEach(하나씩 꺼내서 처리할 내용을 람다식으로 쓰면됨);
        strStream.forEach(item -> System.out.print(item + " , "));

        int[] intArray = {1, 2, 3, 4, 5};
        //2. 배열에 있는 내용을 하나씩 꺼내와서 ,로 연결한 후 프린트
        //stream을 사용해보자
        //스트림을 만들어라 -> 중간처리 -> 집계처리 순서로!
        IntStream intStream = Arrays.stream(intArray);
        intStream.forEach(item ->System.out.print(item + " , "));

        /*배열은 int, long, double 이 아니면 Stream<String> 이렇게 사용하고
        * int, long, double 이면 IntStream을 사용*/
    }
}
