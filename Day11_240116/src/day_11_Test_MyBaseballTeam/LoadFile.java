package day_11_Test_MyBaseballTeam;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoadFile{
	private String loadFileName = "C:/Temp/playerList.db";
	MyFunction myFunction = new MyFunction();
	ArrayList<PlayerInfo> playerList;
	
	public LoadFile() {
		
	}
	
	public ArrayList<PlayerInfo> loadFile() throws Exception{
		ArrayList<PlayerInfo> loadingList;
		FileInputStream fis = new FileInputStream(loadFileName);
		ObjectInputStream ois = new ObjectInputStream(fis);
		loadingList = (ArrayList<PlayerInfo>)ois.readObject();
		return loadingList;
	}

}
