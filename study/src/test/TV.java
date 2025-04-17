package test;

public class TV {
    //속성 - 색, 가격, 크기, 볼륨, 채널, on/off 상태
    //항목(field) - 채널, 볼륨,
    //멤버변수, 인스턴스 변수
    int ch;
    int vol;
    boolean onOff;
    //기능(동작) - 채널 변경, 유튜브 시청, 게임
    //멤버메서드
    public void changeChannel() {
        System.out.println("채널 바꾸다.");
    }

    public void watchYoutube() {
        System.out.println("유튜브 보다.");
    }
}
