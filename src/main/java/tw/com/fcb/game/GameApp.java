package tw.com.fcb.game;

public class GameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GameServiceImpl gameService = new GameServiceImpl();
		
	    System.out.println("code = " + gameService.getByCode("A001"));
	}

}
