import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UdpEchoClient {
    private DatagramSocket socket = null;
    private String serverIp = "";
    private int serverPort = 0;

    public UdpEchoClient(String ip, int port) throws SocketException {
        socket = new DatagramSocket();
        serverIp = ip;
        serverPort = port;
    }

    public void start() throws IOException {
        System.out.println("客户端启动!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // 1. 输入请求
            System.out.print("-> ");
            String request = scanner.next();
            // 2. 发送请求
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(), request.getBytes().length,
                    InetAddress.getByName(serverIp), serverPort);
            socket.send(requestPacket);
            // 3. 读取响应
            DatagramPacket responsePacket = new DatagramPacket(new byte[8888], 8888);
            socket.receive(responsePacket);
            String response = new String(responsePacket.getData(), 0, responsePacket.getLength());
            System.out.println(response);
        }
    }

    public static void main(String[] args) throws IOException {
        UdpEchoClient client = new UdpEchoClient("127.0.0.1", 8888);
        client.start();
    }
}
