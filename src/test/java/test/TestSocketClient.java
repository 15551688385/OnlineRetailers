package test;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class TestSocketClient {
public static void main(String[] args) throws Exception{
	ServerSocket server=new ServerSocket(8080);
	System.out.println("服务已经启动");
	Socket socket=server.accept();
	new Thread(new ClientTest(socket));
}
public static class ClientTest implements Runnable{
	private Socket client;
	public ClientTest(Socket client){
		this.client=client;
	}
	@Override
	public void run(){
		// TODO Auto-generated method stub
		try{
		BufferedReader br=new BufferedReader(new InputStreamReader(client.getInputStream())); 
		String btstr=br.readLine();
		System.out.println(btstr);
		}catch(Exception e){
			
		}
	}
}
}
