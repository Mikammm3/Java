import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class TcpDictServer extends TcpEchoServer {
    Map<String, String> dict = new HashMap<>();

    public TcpDictServer(int port) throws IOException {
        super(port);
        dict.put("cat", "小猫");
        dict.put("dog", "小狗");
        dict.put("pig", "小猪");
    }

    @Override
    public String process(String request) {
        return dict.getOrDefault(request, "该词在词典中不存在!");
    }

    public static void main(String[] args) throws IOException {
        TcpDictServer server = new TcpDictServer(9090);
        server.start();
    }
}
