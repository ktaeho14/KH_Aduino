package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleServer {

	public static void main(String[] args) throws IOException {
		//서버생성
		ServerSocket serverSocket = null;
		
		//접속된 클라이언트의 소켓
		Socket serviceSocket = null;
		
		//출력개체
		PrintWriter out = null;
		
		//클라이언트로부터 읽어드린 내용을 버퍼에 담을 객체
		BufferedReader in = null;
		
		
		serverSocket = new ServerSocket(8888);
		System.out.println("======SERVER=======");
		
		
		while(true) {
			System.out.println("client를 기다립니다.");
			
			serviceSocket = serverSocket.accept();
			
			//1. client에게 받은 내용을 라인단위로 읽어서
			in = new BufferedReader(new InputStreamReader(serviceSocket.getInputStream()));
			
			//2. 보내주겠다.
			out = new PrintWriter(serviceSocket.getOutputStream(),true);
			
			
			
			String inputLine = null;
			while( (inputLine=in.readLine()) !=null ) {
				System.out.println("클라이언트가 보낸 메시지: " + inputLine);
			
				out.println("["+inputLine+"] 잘 받았어!");
			}
			
			out.close();
			in.close();
			serviceSocket.close();
			serverSocket.close();
			
			
			
			
			
			
		}
		
		
	}
	
	public void server() {
		int port =3000;
		ServerSocket server;
		
		try {
			server = new ServerSoket(8888);
			while(true) {
				Socket client = server.aceept();
			}
		}
	}

}
