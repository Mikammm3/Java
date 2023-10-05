import java.io.IOException;
import java.net.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class UdpEchoServer {
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动!");
        while (true) {
            // 1. 读取请求
            DatagramPacket requestPacket = new DatagramPacket(new byte[6666], 6666);
            socket.receive(requestPacket);
            // 2. 根据请求，计算响应
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength());
            String response = process(request);
            // 3. 将请求写回到客户端中
            DatagramPacket responsePacket = new DatagramPacket(request.getBytes(), response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(responsePacket);
        }
    }

    public String process(String request) {
        return request;
    }

    public static void main(String[] args) throws IOException {
        UdpEchoServer server = new UdpEchoServer(8888);
        server.start();
    }
}

class UdpEchoClient {
    private DatagramSocket socket = null;
    private String serverIP = "";
    private int serverPort = 0;

    public UdpEchoClient(String ip, int port) throws SocketException {
        socket = new DatagramSocket();
        serverIP = ip;
        serverPort = port;
    }

    public void start() throws IOException {
        System.out.println("客户端上线!");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("-> ");
            // 1. 从控制台中读取请求
            String request = scanner.next();
            // 2. 发送请求
            DatagramPacket requestPacket = new DatagramPacket(request.getBytes(), request.getBytes().length,
                    InetAddress.getByName(serverIP), serverPort);
            socket.send(requestPacket);
            // 3. 读取响应
            DatagramPacket responsePacket = new DatagramPacket(new byte[6666], 6666);
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

//public class UdpDictServer extends UdpEchoServer {
//    private Map<String, String> map = new HashMap<>();
//
//    public UdpDictServer(int port) throws SocketException {
//        super(port);
//        map.put("cat", "小猫");
//        map.put("dog", "小狗");
//        map.put("duck", "小鸭子");
//    }
//
//    @Override
//    public String process(String request) {
//        return map.getOrDefault(request, "该词在词典中不存在!");
//    }
//
//    public static void main(String[] args) throws IOException {
//        UdpDictServer server = new UdpDictServer(8888);
//        server.start();
//    }
//}
