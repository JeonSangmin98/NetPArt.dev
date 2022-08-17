
public class MovieTest {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.setTitle("Transformer");
		m.setDirector("Michael Bay");
		m.setActors("Shia LaBeouf , Megan Fox");
		
		System.out.println("영화 제목 : " + m.getTitle() + 
				"\n영화 감독 : " + m.getDirector() + 
				"\n주연 배우 : " + m.getActors());
	}

}
