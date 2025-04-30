package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap();
        //Map 은 key와 value의 쌍(엔트리)으로 넣음
        map.put("김길동", 95);
        System.out.println(map);

        map.put("홍길동", 85);
        System.out.println(map);

        //값을 하나씩 꺼내는 방법
        //방법1 : 키목록을 가지고 값을 꺼내는 방법
        //1-1. 키 목록을 구해야 한다.
        Set<String> keys = map.keySet();
        System.out.println(keys);
        //1-2. 키를 하나씩 꺼내서 값을 구하자.
        for(String key : keys) {
            System.out.println(map.get(key));
        }
        //방법2 : 엔트리 목록을 꺼내는 방법
    }
}
