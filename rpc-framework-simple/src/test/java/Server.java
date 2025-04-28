import org.junit.jupiter.api.Test;
import org.oyq.remoting.transport.socket.SocketRpcServer;


public class Server {

    @Test
    public void main(){
        SocketRpcServer server = new SocketRpcServer();
        server.start();
    }
}
