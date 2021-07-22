package com.io.part03_addStream.chap04_object.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.io.part03_addStream.chap04_object.dto.Member;

public class TestStream {

	public void filesave() {
		Member[] mar = {
				new Member("user01","pass01","홍길동","hong88@kh.org",19,'남'),
				new Member("user02","pass02","김유신","kimyou@kh.org",22,'남'),
				new Member("user03","pass03","유관순","sooon0301@kh.org",25,'여')
		};
		
		try (ObjectOutputStream objOut = new ObjectOutputStream(new FileOutputStream("member.txt"));){
			
			for(int i =0; i<mar.length; i++) {
				objOut.writeObject(mar[i]);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} 
		
			catch (IOException e) {
			
			e.printStackTrace();
		} 
	}
	
	
	
	public void fileOpen() {
		Member[] mar = new Member[3];
		
		try(ObjectInputStream objIn = new ObjectInputStream(new FileInputStream("member.txt"));) {
		
			for(int i=0; i<mar.length; i++) {
				mar[i] = (Member)objIn.readObject();
			}
			
			for(Member m : mar) {
				System.out.println(m);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}
	
	
	
}
