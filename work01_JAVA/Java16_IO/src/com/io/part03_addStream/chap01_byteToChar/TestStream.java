package com.io.part03_addStream.chap01_byteToChar;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestStream {
	
	
	
	public void input() {
		//System.in => inputStream 객체
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
				// new 보조 스트림(new 보조스트림(new 기반 스트림(외부자원) );
		
		System.out.println("문자열 입력: ");
		try {
			String value = br.readLine();
			
			System.out.println("value: "+ value);
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
		
	}
	
	
	
	
	
	
	
	public void output() {
		
		BufferedWriter bw =
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		try {
			bw.write("java oracle jdbc");
			
			bw.flush();
			//버퍼에 잔류해 있는 내용을 밀어내기 위해 사용
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
	
	
}
