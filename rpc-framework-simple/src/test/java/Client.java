import org.junit.jupiter.api.Test;
import org.oyq.remoting.dto.RpcRequest;
import org.oyq.remoting.dto.RpcResponse;
import org.oyq.remoting.transport.RpcRequestTransport;
import org.oyq.remoting.transport.socket.SocketRpcClient;

public class Client {

    @Test
    public void main(){
        RpcRequestTransport client = new SocketRpcClient();
        RpcRequest request = new RpcRequest();
        request.setInterfaceName("Hello");
        RpcResponse response = (RpcResponse) client.sendRpcRequest(request);
        String result = (String) response.getData();
        System.out.println(result);
    }
}
