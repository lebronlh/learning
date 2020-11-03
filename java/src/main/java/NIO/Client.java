package NIO;

import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("127.0.0.1",8080);
            socket.getOutputStream().write("111".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
