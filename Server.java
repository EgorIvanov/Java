import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {

    final int PORT = 3443;
    ArrayList<Client> CList = new ArrayList<>();

    public Server() {
        Socket ClientSocket = null;
        ServerSocket serverSocket = null;

        try {
            ServerSocket serverSockrt = new ServerSocket(PORT);
            System.out.println("Server is launched");
            while(true) {
                ClientSocket = serverSocket.accept();
                Client client = new Client(ClientSocket, this);
                CList.add(client);
                new Thread(client).start();
            }
        } catch (IOException e) {e.printStackTrace(); }
        finally {
            try {
                ClientSocket.close();
                System.out.println("server pizdec");
                serverSocket.close();
            } catch (IOException e) {e.printStackTrace();}
        }
    }

    public void sendMessageToAllClients(String msg) {
        for (Client o : CList) {
            o.sendMsg(msg);
        }
    }

    public void removeClient(Client client) {
        CList.remove(client);
    }


}
