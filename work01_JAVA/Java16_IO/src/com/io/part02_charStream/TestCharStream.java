package com.io.part02_charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestCharStream {
	
	public void fileSave() {
		FileWriter fw = null;
		
		
		
		
		try {
			fw = new FileWriter("sample2.txt");
			
			fw.write("가나다라 마바사");
			fw.write('A');
			fw.write(' ');
		
			char[] car = {'a','p','p','l','e'};
			fw.write(car);
			
			
			
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
		
		
	}
	
	public void fileOpen() {
		
		FileReader fr = null;
		
		
		try {
			fr = new FileReader("sample2.txt");
			
//			for(int i=0; i<20; i++) {
//				System.out.println(fr.read());
//			}
			
			int value = 0;
			while((value=fr.read()) != -1) {
				System.out.print((char)value);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
