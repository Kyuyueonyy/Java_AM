package collection;

public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //정렬, 비교할 일이 있을 때
    //자동으로 이 함수를 이용함(compareTo())
    //이 클래스의 객체를 생성해서 모았을 때 정렬 기준을 정해줌
    //age 기준으로 정렬할 때 사용한다고 설정한 것
    @Override
    public int compareTo(Person o) {
        if(age<o.age) return -1;
        else if(age == o.age) return 0;
        else return 1;
    }
}

