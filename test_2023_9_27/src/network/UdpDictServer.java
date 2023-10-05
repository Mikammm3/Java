package network;

import java.io.IOException;
import java.net.SocketException;
import java.util.HashMap;
import java.util.Map;

public class UdpDictServer extends UdpEchoServer {

    private Map<String, String> dict = new HashMap<>();

    public UdpDictServer(int port) throws SocketException {
        super(port);

        // 此处可以往这个表里插入几千几万个这样的英文单词
        dict.put("cat", "小猫");
        dict.put("dog", "小狗");
        dict.put("pig", "小猪");
    }

    // 重写 process 方法，在重写的方法中完成翻译的过程
    // 翻译本质上就是 "查表 "
    @Override
    public String process(String request) {
        return dict.getOrDefault(request, "该词在词典中不存在！");
    }

    public static void main(String[] args) throws IOException {
        UdpDictServer server = new UdpDictServer(8888);
        server.start();
    }
}
