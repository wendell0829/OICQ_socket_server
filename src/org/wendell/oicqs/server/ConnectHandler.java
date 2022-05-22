package org.wendell.oicqs.server;

import java.net.Socket;

public class ConnectHandler extends Thread{
private Socket socket;
	
	public ConnectHandler(Socket socket) {
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
