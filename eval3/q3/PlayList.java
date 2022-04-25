package com.masai;
import java.util.ArrayList;
public class PlayList extends Song{
	
	
	
	void addSong(Song song) {
		
		ArrayList<String> playlist= new ArrayList<>();
		
	if( playlist.contains(song)) {
		System.out.println("already exist");
	}
	else {
		System.out.println("song added");
	}
		
	
		
	}

}
