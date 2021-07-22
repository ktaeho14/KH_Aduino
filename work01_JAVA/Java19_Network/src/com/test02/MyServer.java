package com.test02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MyServer {
	public static void main(String[] args) throws IOException {
	//서버생성
		DatagramSocket ds = new DatagramSocket(9999);
		//9999라는 포트번호
		
		// 받을 방 생성
		byte[] buff = new byte[1024];
		
		
		// 패킷을 받음
		DatagramPacket recieveP = new DatagramPacket(buff,buff.length); 
		ds.receive(recieveP);
		System.out.println( new String(recieveP.getData()) );
		//종료
		ds.close();
		ds.disconnect();
	
	
	}
	
	
	
}
