package tw.com.fcb.game;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GameServiceImpl implements GameService {
	
	Map<String, Game> myGames = new HashMap<String, Game>();
	
	public GameServiceImpl()
	{
		Game Game1 = new Game();
		Game1.setCode("A001");
		Game1.setName("瑪利歐派對超級巨星");
		Game1.setRent("Y");
		Game1.setRentCount(888);
		
		Game Game2 = new Game();
		Game2.setCode("A002");
		Game2.setName("天竺鼠車車");
		Game2.setRent("N");
		Game2.setRentCount(223);
		
		Game Game3 = new Game();
		Game3.setCode("A003");
		Game3.setName("粉紅小英雄");
		Game3.setRent("N");
		Game3.setRentCount(88);
		
		Game Game4 = new Game();
		Game4.setCode("B001");
		Game4.setName("刺客教條");
		Game4.setRent("Y");
		Game4.setRentCount(563);
		
		Game Game5 = new Game();
		Game5.setCode("B002");
		Game5.setName("傳奇賽亞人");
		Game5.setRent("N");
		Game5.setRentCount(456);
		
		Game Game6 = new Game();
		Game6.setCode("B003");
		Game6.setName("火影忍者");
		Game6.setRent("N");
		Game6.setRentCount(753);
		
		Game Game7 = new Game();
		Game7.setCode("C001");
		Game7.setName("瑪利歐賽車");
		Game7.setRent("Y");
		Game7.setRentCount(1234);
		
		Game Game8 = new Game();
		Game8.setCode("C002");
		Game8.setName("極速俱樂部");
		Game8.setRent("N");
		Game8.setRentCount(453);
		
		Game Game9 = new Game();
		Game9.setCode("C003");
		Game9.setName("急速摩托GT");
		Game9.setRent("N");
		Game9.setRentCount(55);
		
		myGames.put(Game1.getCode(), Game1);
		myGames.put(Game2.getCode(), Game2);
		myGames.put(Game3.getCode(), Game3);
		myGames.put(Game4.getCode(), Game4);
		myGames.put(Game5.getCode(), Game5);
		myGames.put(Game6.getCode(), Game6);
		myGames.put(Game7.getCode(), Game7);
		myGames.put(Game8.getCode(), Game8);
		myGames.put(Game9.getCode(), Game9);
	}
	
	public Game getByCode(String code) {		
		return myGames.get(code);
	}

	public List<Game> getByName(String name) {
		// TODO Auto-generated method stub
		List<Game> result = new ArrayList<Game>();
		
		for (String key: myGames.keySet())
		{			
			Game thisGame = myGames.get(key);
			
			if (thisGame.getName().equals(name))
			{
				result.add(thisGame);
			}
			else
			{
				System.out.println("no add ");
			}
		}
		
		return result;
	}

}
