package com.poly.part01.test05;

public class Lg_tv implements Tv{

	private int vol;
	
	
	public Lg_tv() {
		System.out.println("Lg_tv가 켜졌습니다");
	}

	
	public int getVol() {
		return vol;
	}



	public void setVol(int vol) {
		this.vol = vol;
	}



	@Override
	public int volUp() {
		this.setVol(vol+1);
	
		return this.getVol();
	}

	@Override
	public int volDown() {
		this.setVol(vol-1);
		return this.getVol();
	}
	
	public void CloseTv() {
		System.out.println("Lg_tv가 꺼졌습니다");
	}
	
	
	

}
