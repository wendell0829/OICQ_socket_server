package org.wendell.oicqs.run;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;

public class RunServer {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = new ServerSocket(8000);
		System.out.println(serverSocket.getLocalPort());
		System.out.println(serverSocket.getLocalSocketAddress());
		System.out.println(serverSocket.getInetAddress());
		System.out.println(serverSocket.getSoTimeout());
//		serverSocket.bind();
		while(true) {
			System.out.println("服务器开始运行");
			Socket cSocket = serverSocket.accept();
			Handler handler = new Handler(cSocket);
			handler.start();
		}
	}
}


class Handler extends Thread{
	private Socket socket;
	
	public Handler(Socket socket) {
		this.socket = socket;
	}
	
	@Override
	public void run() {
		System.out.println("我连进来了"+socket.getLocalPort());
		while(true) {
			int n = 1;
			if(n==1) {
				n=2;
			}else {
				n=1;
			}
		}
	}
	
}