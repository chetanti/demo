package com.chet.pattern.adapterpattern;

public class AdapterPatternDemo {

	public static void main(String[] args) {
		
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("VLC", "abc.vlc");
		audioPlayer.play("MP3", "pqr.mp3");
		audioPlayer.play("MP4", "chet.mp4");
		audioPlayer.play("AVI", "new.avi");
	}

}
