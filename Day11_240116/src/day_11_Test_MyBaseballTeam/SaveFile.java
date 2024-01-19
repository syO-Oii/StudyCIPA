package day_11_Test_MyBaseballTeam;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SaveFile{
	private String saveFileName = "C:/Temp/playerList.db";
	MyFunction myFunction = new MyFunction();
	
	public SaveFile(ArrayList<PlayerInfo> playerList) throws IOException {
		FileOutputStream fos = new FileOutputStream(saveFileName);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(playerList);
		oos.flush();
		oos.close();	
	}
}