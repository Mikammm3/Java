import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;


public class TcpEchoClient {
    private Socket socket = null;

    public TcpEchoClient(String serverIp, int serverPort) throws IOException {
        socket = new Socket(serverIp, serverPort);
    }

    public void start() {
        System.out.println("客户端上线!");
        Scanner scanner = new Scanner(System.in);
        try (InputStream inputStream = socket.getInputStream();
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter printWriter = new PrintWriter(outputStream);
             Scanner scannerNetWork = new Scanner(inputStream)) {
            while (true) {
                System.out.print("-> ");
                // 1.从控制台输入请求
                String request = scanner.next();
                // 2.发送请求
                printWriter.println(request);
                printWriter.flush();
                // 3.接收响应
                String response = scannerNetWork.next();
                // 4.打印响应
                System.out.println(response);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws IOException {
        TcpEchoClient client = new TcpEchoClient("127.0.0.1", 9090);
        client.start();
    }
}
