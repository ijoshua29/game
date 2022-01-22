package tw.com.fcb.game;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import org.junit.jupiter.api.Test;


class GameServiceTest {
	
	@Test
	void testGetByCode() {
		GameService service = new GameServiceImpl();
		Game game = service.getByCode("A001");
		
		assertEquals("瑪利歐派對超級巨星",game.getName());
	}
	
	void testGetBySigner()
	{
		GameService service = new GameServiceImpl();
		List<Game> games = service.getByName("瑪利歐賽車");
		assertEquals(2,games.size());
	}

}
