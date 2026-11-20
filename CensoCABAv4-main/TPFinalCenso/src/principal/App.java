package principal;
import dao.daoComuna;
import modelo.Comuna;
import modelo.SituacionLaboral;
public class App {

	public static void main(String[] args) {
		daoComuna dao = new daoComuna();
		dao.conectar();
		Comuna w = new Comuna("459377785", "Patroclo Filopensio", SituacionLaboral.OCUPADO, "01-01-2003", "Flores");
	}

}
