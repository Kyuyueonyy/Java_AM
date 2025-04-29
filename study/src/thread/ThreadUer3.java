package thread;

//하나의 java소스파일에는 여러개의 클래스를 정의 가능하다.
class Thread11 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("어제는 월요일");
            //해당 스레드를 1초간 일시정지
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            //자바 이외의 자원, 네트워크, 파일 연결등은 반드시 예외처리
        } //for
    } //run
} //class
public class ThreadUer3 {
    public static void main(String[] args) {
        Thread thread11 = new Thread11();
        thread11.start();  //실행대기상태로 만들기

        //멀티스레드 3개를 만들어서 동시에 돌리자.
        //1. Runnable 인터페이스의 run()메서드를 재정의한 클래스 생성
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("오늘은 화요일");
                    //해당 스레드를 1초간 일시정지
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //자바 이외의 자원, 네트워크, 파일 연결등은 반드시 예외처리
                } //for
            } //run
        }); //class
        thread2.start(); //실행 대기 상태로 만들기

        //2. Thread상속해서 run() 메서드 재정의한 클래스 생성
        Thread thread3 = new Thread() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("내일은 수요일");
                    //해당 스레드를 1초간 일시정지
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    //자바 이외의 자원, 네트워크, 파일 연결등은 반드시 예외처리
                } //for
            } //run
        }; //익명 클래스
        thread3.start(); //실행대기 상태로 감
    }
}
