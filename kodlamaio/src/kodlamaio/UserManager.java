package kodlamaio;

public class UserManager {
	
	public void add(User user) {
		System.out.println("Kullan�c� eklendi "+user.getName());
	}
	
	public void delete(User user) {
		System.out.println("Kullan�c� silindi "+user.getName());
	}
	
}
