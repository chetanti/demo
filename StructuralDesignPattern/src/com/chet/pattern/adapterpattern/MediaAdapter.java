package com.chet.pattern.adapterpattern;

public class MediaAdapter implements MediaPlayer{

	 AdvancedMediaPlayer player ;
	 
	public MediaAdapter(String type) {
		if(type.equalsIgnoreCase("VLC")){
			this.player = new VlcPlayer();
		}else if(type.equalsIgnoreCase("MP4")) {
			this.player = new MP4Player();
		}
	}
	@Override
	public void play(String audioType, String fileName) {
		if(audioType.equalsIgnoreCase("VLC")) {
			this.player.playVLC(fileName);
		}else
		{
			this.player.playMP4(fileName);
		}
		
	}

}
