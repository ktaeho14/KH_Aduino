package com.test01;

public class DeArrayTest {
	
	
	public void testInit() {
		//2차원 배열
		//선언
		int[][] iarr1;
		int iarr2[][];
		
		//할당
		//heap영역에 2차원 배열을 할당(정변배열)
		iarr1 = new int[3][5];
		
		
		//
		iarr2 = new int[3][];
		
		iarr2[0] = new int[5];
		iarr2[1] = new int[5];
		iarr2[2] = new int[5];
		
		
		//배열의 값 출력
		for(int i=0; i<iarr2.length; i++) {
			for(int j=0; j<iarr2[i].length; j++) {
				System.out.print(iarr2[i][j] + " ");
			}
			System.out.println();
		}
	
		//선언 및 할당
		int[][] iarr = new int[3][5];
		//인덱스에 접근하여
//		iarr[0][0] = 1;
//		iarr[0][1] = 2;
		
		//이중 for문을 이용하여 값 기록
		
		int val= 1;
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j] = val++;
			}
		}
		
		
		
		prnArray(iarr);
		
		
	
	
	}
	
	//이차원 배열을 전달받아 출력하는 메소드
		public void prnArray(int[][] iarr) {
			for(int i = 0; i<iarr.length; i++) {
				for(int j =0; j<iarr[i].length; j++) {
					System.out.print("\t"+ iarr[i][j]);
				}
				System.out.println();
			}
			
			
			
			
			
		}
	
		public void testInit2() {
			//가변배열
			int[][] iarr = new int[3][];
			
			
			iarr[0] = new int[5];
			iarr[1] = new int[10];
			iarr[2] = new int[3];
			
			//prnArray(iarr);
			
			//값 저장
			int val = 0;
			for(int i = 0; i<iarr.length; i++) {
				for(int j = 0; j<iarr[i].length; j++) {
					iarr[i][j] = ++val;
				}
			}
			
			prnArray(iarr);
			
		}
		
		public void testInit3() {
			//할당과 초기화를 동시에
			//int[][] iarr = {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
			int[][] iarr = { {1,2,3}, {4,5,6,7,8} ,{9}};
			
			
			prnArray(iarr);
			
		}
	
	
	
}
