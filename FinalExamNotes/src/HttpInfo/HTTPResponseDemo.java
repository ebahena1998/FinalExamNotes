package HttpInfo;

import java.io.IOException;
import java.net.Socket;

public class HTTPResponseDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.usman.cloud", 80);
    }
}
