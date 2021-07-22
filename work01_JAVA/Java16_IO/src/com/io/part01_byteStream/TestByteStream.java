package com.io.part01_byteStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestByteStream {
	
	public void fileOpen() {
		//파일로부터 byte단위로 데이터를 읽어 올 수 있는 스트림
		FileInputStream fin = null;
		
		try {                          //외부자원 작성
			fin = new FileInputStream("sample.txt");

			
			
			
			/*			//File 객체를 만들어 파일의 크기 가져오기
	
			int fileSize = (int)new File("sample.txt").length();
			
			//파일을 읽어 저장할 byte 배열 선언
			byte[] bar = new byte[fileSize];
			
			fin.read(bar);
			
			for(int i =0; i<bar.length; i++) {
				System.out.print((char)bar[i] + " ");
			}
*/
			
			//val변수에 담아서 while문처리를한다.
			int val =0;
			while((val=fin.read()) != -1) {
				System.out.print((char)val+ " ");
			}
			
			
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	
		
	}
	
	public void fileSave() {
		FileOutputStream  fout = null;
		
		try {
			fout = new FileOutputStream("sample.txt");
		
			fout.write(97);
		
			byte[] bar = {98, 99, 100, 101, 102};
			fout.write(bar);
			
			fout.write(10);
			fout.write(bar,1,3);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				System.out.println("출력완료!");
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	
	
	
	
	
	
	
	}
	
	public void fileSave2() {
		//try with resource
		//try(객체생성){}catch(){}
		//close구문을 없앨 수 있다
		
		
		
		try(FileOutputStream fout = new FileOutputStream("sample.txt");) {
			
		
			fout.write(97);
		
			byte[] bar = {98, 99, 100, 101, 102};
			fout.write(bar);
			
			fout.write(10);
			fout.write(bar,1,3);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	
	
	
	
	
	
	
	}
	
	
	
	
	
}
