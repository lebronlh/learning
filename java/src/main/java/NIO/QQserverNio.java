package NIO;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;

public class QQserverNio {
    static byte[] bytes = new byte[1024];
    static List<SocketChannel> list = new ArrayList<>();
    static ByteBuffer byteBuffer = ByteBuffer.allocate(512);

    public static void main(String[] args) {

        try {
            //listen
            ServerSocketChannel serverSocketChannel = ServerSocketChannel.open();
            serverSocketChannel.bind(new InetSocketAddress(8080));
            serverSocketChannel.configureBlocking(false);

            while (true){
                //阻塞
                SocketChannel socketChannel = serverSocketChannel.accept();
                if(socketChannel==null){
                    Thread.sleep(500);
                    System.out.println("no conn");
                    for (SocketChannel client : list) {
                        client.read(byteBuffer);
                        byteBuffer.flip();

                    }
                }else{

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
