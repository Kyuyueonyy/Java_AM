package thread;

import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer{
    public static void main(String[] args) throws Exception {
        // Socket이2개필요
// 클라이언트연결승인용: ServerSocket
        // 데이터전송용: Socket
        // 예외처리: 외부의자원을연결하는경우(db, file, net, CPU)
        ServerSocket server = new ServerSocket(9100);
        System.out.println("TCP 서버소켓시작됨.");
        System.out.println("클라이언트의연결을기다리는중...");
        int count = 0;
        while (true) {
            Socket socket= server.accept(); // 클라이언트연결수락
            count++;
            System.out.println("연결된클라이언트수: " + count);
            System.out.println("클라이언트와연결성공.");
        }
    }
}


