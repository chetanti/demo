package com.chet.pattern.adapterpattern;

public class MP4Player implements AdvancedMediaPlayer{

	@Override
	public void playVLC(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void playMP4(String filename) {
		System.out.println(" Playing MP4 file " + filename);
	}

}
