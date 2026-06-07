import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;

public class MainServer {

    public static void main(String[] args) {

        try {

            HttpServer server = HttpServer.create(
                new InetSocketAddress(9090), 0);

            server.createContext("/", new MainHandler());

            server.setExecutor(null);
            server.start();

            System.out.println("Server Running...");
            System.out.println("http://localhost:9090");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}