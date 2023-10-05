package network;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class TcpEchoClient {
    private Socket socket = null;

    public TcpEchoClient(String serverIp, int serverPort) throws IOException {
        // 需要在创建 socket 的同时，和服务器 "建立连接" ，此时就得告诉 socket 服务器在哪里
        // 具体建立连接的细节，不需要咱们代码手动干预，是内核自动负责的
        // 当我们 new 这个对象的时候，操作系统内核，就开始进行 三次握手 具体细节，完成建立连接的过程了
        socket = new Socket(serverIp, serverPort);
    }

    public void start() throws IOException {
        // tcp 的客户端和 udp 的客户端差不多
        // 都是:
        // 1. 从控制台读取用户输入的内容
        // 2. 把字符串作为请求，发送给服务器
        // 3. 从服务器读取响应
        // 4. 把响应显示到界面上
        Scanner scan = new Scanner(System.in);
        try (OutputStream outputStream = socket.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream);
             InputStream inputStream = socket.getInputStream();
             Scanner scannerNetWork = new Scanner(inputStream)) {
            while (true) {
                // 1. 输入请求,将请求转换成字符串
                System.out.print("-> ");
                String request = scan.next();
                // 2. 发送请求
                //    这里使用 println ，是为了让请求后面带上换行
                //    也就是和服务器 scanner.next 呼应
                printWriter.println(request);
                printWriter.flush();
                // 3. 读取响应
                String response = scannerNetWork.next();
                System.out.println(response);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient client = new TcpEchoClient("127.0.0.1", 8888);
        client.start();
    }
}
