package tw.com.fcb.game;

public class Game {
	
	private String code;
	private String name;
	private String rent;	//Y表示已出租 N表示未出租
	private int rentCount;	//出租次數
	
	public String toString()
	{
		return "code=" + code + ",name=" + name + ",rent=" + rent + ",rentCount=" + rentCount;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRent() {
		return rent;
	}
	public void setRent(String rent) {
		this.rent = rent;
	}
	public int getRentCount() {
		return rentCount;
	}
	public void setRentCount(int rentCount) {
		this.rentCount = rentCount;
	}
	
	
}
