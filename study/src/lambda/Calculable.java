package lambda;

@FunctionalInterface //함수형 인터페이스 설정
//추상메서드 하나만 가져야한다.
//표시(@, 엣) : Annotation
public interface Calculable {
    //추상메소드
    //일반적으로 interface에 선언된 함수는 다 public abstract(추상)
    void calculate(int x, int y);
    //void test(); -> 쓰면ㅇ ㅗ류남. 함수형 인터페이스는 추상메서드 한 개만 가짐.
}
