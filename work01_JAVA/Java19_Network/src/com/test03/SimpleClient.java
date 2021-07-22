package com.test03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class SimpleClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket clientSocket = null;
		
		PrintWriter out = null;
		
		BufferedReader in = null;
		//보낼메세지를 콘솔창으로 입력받을 것이다.
		BufferedReader stdIn = null;
		
		System.out.println("====Client====");
		System.out.println("server에 접속 합니다.");
		
		//내 컴퓨터로 소켓접속
		//clientSocket = new Socket("localhost", 8888);
		clientSocket = new Socket("127.0.0.1", 8888);
		
		
		out = new PrintWriter(clientSocket.getOutputStream(),true);
		
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		stdIn = new BufferedReader(new InputStreamReader(System.in));
		
		String inputLine = null;
		
		while( (inputLine = stdIn.readLine())!=null ) {
			out.println(inputLine);
			System.out.println("server로부터 다시 받은 메시지: " + in.readLine());
		}
		
		stdIn.close();
		in.close();
		out.close();
		clientSocket.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
