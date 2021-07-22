package com.io.part03_addStream.chap02_buffer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestStream {
	public void fileSave() {
		
		//try with resource 
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("sample3.txt"));)
		{	
			bw.write("안녕하세요\n");
			bw.write("반갑습니다\n");
			bw.write("안녕히가세요\n");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	public void fileOpen() {
		
		try(BufferedReader br = new BufferedReader(new FileReader("sample3.txt"));) {
			String temp = "";
			while( (temp = br.readLine()) !=null ){
				System.out.println(temp);
				System.out.println();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		
		
	}
	
	
	
	
	
	
}
