package HttpInfo;

import java.io.*;
import java.net.Socket;

public class HTTPRequestDemo {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("www.usman.cloud", 80);

        OutputStream out = socket.getOutputStream();

        //Request Http Message
        // Request Keyword      Resource                        Header
        // GET, POST            URI (path/to/File.ext)

        //Optional: HTTP VERSION NUMBER


        // Request Keyword
        // GET or HEAD

        //Method    path/to/file.ext    http/version
        out.write("GET / HTTP/1.0\r\n".getBytes());
        out.write("Host: www.usman.cloud\r\n".getBytes());
        out.write("\r\n".getBytes());

        InputStream in = socket.getInputStream();
        InputStreamReader inr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(inr);

        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        socket.close();


    }
}
