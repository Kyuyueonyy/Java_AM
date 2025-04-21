package inherit;

public class SmartPhoneUse {
    public static void main(String[] args) {
        SmartPhone myPhone = new SmartPhone("회색", "갤럭시");
        //myPhone : 주소, 참조형변수, 필드들 3개가 저장된 힙영역의 주소
        System.out.println(myPhone.color);
        //myPhone에 들어있는 주소가 가르키는 color라는 변수 프린트
        //new 클래스명()를 필드를 객체마다 각각 저장할 공간 필요
        //필드들이 다 무더기로 생성됨(필드 3개가 다 복사되어 생성)
        //원본영역(메서드 영역, static영역)
        //스택영역(호출되는 메서드 변수들 만들어쓰라고 주는 영역)
        //힙영역(필드들 생성, 배열 리스트 생성)

        System.out.println(myPhone.model); //Phone
        System.out.println(myPhone.wifi); //SmartPhone

        myPhone.bell(); //Phone
        myPhone.setWifi(true); //SmartPhone
        myPhone.internet(); //SmartPhone
    }
}
