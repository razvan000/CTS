package ro.ase.csie.cts.seminar6.prototype;

public class TestPrototype {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Character3DModel mickey = new Character3DModel(CaharacterType.SIDNEY, "red");
		/* not good
		Character3DModel mickey1 = new Character3DModel(CaharacterType.SIDNEY, "red");
		Character3DModel mickey2 = new Character3DModel(CaharacterType.SIDNEY, "red");
		Character3DModel mickey3 = new Character3DModel(CaharacterType.SIDNEY, "red");
		*/
		
		Character3DModel mickey2=(Character3DModel)mickey.clone();
		Character3DModel mickey3=(Character3DModel)mickey.clone();
	}

}
