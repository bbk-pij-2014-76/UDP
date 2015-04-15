/**
 * @(#)ServerImpl.java
 *
 *
 * @author 
 * @version 1.00 2015/4/15
 */

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerImpl implements Server {
 

	private final int LISTENER_PORT = 5050;
	
	public static void main(String[] args) {
	ServerImpl server = new ServerImpl();
	server.launch();
	}
	public void launch() 
	{
        ServerSocket listenerSocket = null;
        Socket connecter = null;       
        boolean listener = true;
         try {
			listenerSocket = new ServerSocket(LISTENER_PORT);
			System.out.println("Waiting for connecter on port " + LISTENER_PORT);
			connecter = listenerSocket.accept();
			System.out.println("The connection was successful.");
		} catch (IOException e) {
             e.printStackTrace();
        } finally {
            close(connecter); 
        }
	} 
		 public void listenerTCP() {
    }

    public void listenerUDP() {
    }
	public String generateID()
	{
		return null;
	}
	 private void close(Socket connecter) {
        try {
            connecter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}