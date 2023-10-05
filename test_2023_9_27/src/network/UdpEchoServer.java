package network;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;


public class UdpEchoServer {
    // 创建一个 DatagramSocket 对象，后续操作网卡的基础
    private DatagramSocket socket = null;

    public UdpEchoServer(int port) throws SocketException {
        // 这么写就是手动指定端口
        socket = new DatagramSocket(port);
        // 这么写就是系统自动分配端口
        // socket = new DatagramSocket();
    }

    public void start() throws IOException {
        // 通过这个方法来启动服务器
        System.out.println("服务器启动!");
        // 一个服务器程序中，经常能看到 while true 这样的代码，
        while (true) {
            // 1. 读取请求并解析
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(requestPacket);
            // 当前完成 receive 之后，数据是以 二进制 的形式存储到 DatagramPacket 中了
            // 要想把这里的数据给显示出来，还需要把这个二进制数据给转成字符串
            String request = new String(requestPacket.getData(), 0, requestPacket.getLength());
            // 2. 根据请求计算响应（一般的服务器都会经历的过程）
            //    由于是回显服务器，请求是啥样，响应就是啥样
            String response = process(request);
            // 3. 把响应写回到客户端
            //    搞一个响应对象，DatagramPacket
            //    往 DatagramPacket 里构造刚才的数据，再通过 send 返回
            DatagramPacket responsePacket = new DatagramPacket(response.getBytes(), response.getBytes().length,
                    requestPacket.getSocketAddress());
            socket.send(responsePacket);
            // 4. 打印一个日志，把这次数据交互的详情给打印出来
            System.out.printf("[%s:%d] req=%s,resp=%s\n", requestPacket.getAddress().toString(),
                    requestPacket.getPort(), request, response);
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
