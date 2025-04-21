package inherit;

public class SmartPhone extends Phone {
    //필드 선언 - 총 3개(color, model, wifi?)
    public boolean wifi;
    //클래스 바로 아래 선언된 필드는 자동초기화
    //false 자동초기화 !


    //color, model을 객체 생성시 초기화 하고싶은 경우 생성자를 넣음
    //생성자 선언
    public SmartPhone(String model, String color) {
        //Phone(); 기본생성자 호출은 자동으로 super()를 넣어줌
        //super(); 컴파일단계에서 무조건 첫줄에 넣어줌

        //파라미터가 있는 생성자는 super()를 명시적으로 적어줘야함!!!

        this.model = model; //눈에는 안보이지만 color, model 접근 가능해서 값 초기화
        this.color = color;
    }
    //메소드 선언 - 총 4개(phone에서 상속받은 2개, 새로 설정한 메소드 2개)
    public void setWifi(boolean wifi) {
        this.wifi = wifi;
        System.out.println("와이파이 상태를 변경했습니다.");
    }
    public void internet() {
        System.out.println("인터넷에 연결합니다.");
    }
}

