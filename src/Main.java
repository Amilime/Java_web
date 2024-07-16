import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {

       ServerSocket ss= new ServerSocket(9090);
       Socket s = ss.accept();
       InputStream is = s.getInputStream();
       OutputStream os=s.getOutputStream();
       os.write(("HTTP/1.1 200 OK\n" +
               "Content-Length:482\n"+
               "Content-Type:text/xml\n"+
               "\n"+
                "<!DOCTYPE html><html lang=\"en\"><head><meta charset=\"UTF-8\"></meta><meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\"></meta><meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"></meta><title>登录……</title></head><body><div class=\"box\"><div class=\"left\"></div><div class=\"right\"><h4>登 录</h4><form action=\"\"><input class=\"acc\" type=\"text\" placeholder=\"用户名\"><input class=\"login\" type=\"submit\" value=\"login\" onclick=\"alert('进不去的，傻逼❤')\"></form></div></div></body></html>")
               .getBytes());
       os.flush();
       is.close();
       os.close();
       s.close();
       ss.close();
    }
}