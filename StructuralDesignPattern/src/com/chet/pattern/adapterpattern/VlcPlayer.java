package com.chet.pattern.adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVLC(String filename) {
		System.out.println(" Playing VLC file " + filename);

	}

	@Override
	public void playMP4(String filename) {
		// TODO Auto-generated method stub

	}

}
