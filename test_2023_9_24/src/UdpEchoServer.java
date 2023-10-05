import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UdpEchoServer {
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        while (true) {
            // 1. 读请求
            DatagramPacket requestPacket = new DatagramPacket(new byte[8888], 8888);
            socket.receive(requestPacket);
            // 2. 根据请求计算响应
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength());
            String response = process(request);
            // 3. 将响应写回客户端
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(responsePacket);
        }
    }

    private String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(8888);
        server.start();
    }
}
