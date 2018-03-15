package com.chet.pattern.adapterpattern;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdapter;
	@Override
	public void play(String audioType, String fileName) {
		
		if(audioType.equalsIgnoreCase("MP3")) {
			System.out.println(" Playing MP3 File " + fileName);
		}else if(audioType.equalsIgnoreCase("VLC") || audioType.equalsIgnoreCase("MP4")) {
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
			
		}else {
			System.out.println(" Media Type Not SUpported");
		}
	}

}
