package com.io.part03_addStream.chap03_data;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestStream {

	//데이터 자료형 별로 처리하는 기능을 추가한 보조스트림
	public void fileSave() {
		
		try(DataOutputStream dout = new DataOutputStream(new FileOutputStream("score.txt"));) {
			
			//파일에 자료형별로 기록
			dout.writeUTF("김수호");
			dout.writeInt(95);
			dout.writeChar('A');
			//
			dout.writeUTF("홍길동");
			dout.writeInt(77);
			dout.writeChar('C');
			dout.writeUTF("이순신");
			dout.writeInt(87);
			dout.writeChar('B');
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
			
		
		
		
		
	}
	
	
	public void fileOpen() {
		try(DataInputStream din = new DataInputStream(new FileInputStream("score.txt"));) {
			
			while(true) {
				System.out.println(din.readUTF() + "," +din.readInt() +"," + din.readChar());
				
			}
			
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	catch(EOFException e) {
			System.out.println("파일 읽기 완료");
		}
		catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	
	
	
}
