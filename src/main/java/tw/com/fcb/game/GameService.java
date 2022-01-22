package tw.com.fcb.game;

import java.util.List;

public interface GameService {
	
	public Game getByCode(String code);	
	
	public List<Game> getByName(String name);

}
