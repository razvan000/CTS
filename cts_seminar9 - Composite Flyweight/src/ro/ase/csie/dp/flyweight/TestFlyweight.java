package ro.ase.csie.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ScreenData soldier1= new ScreenData(100, 90, 0, "Red");
		ScreenData soldier2= new ScreenData(100, 150, 0, "Blue");
		
		ScreenData building1= new ScreenData(25, 55, 7, "Yellow");
		ScreenData building2= new ScreenData(10, 10, 2, "Purple");
		
		Model3DInterface soldierModel = ModelsFactory.getModel(ModelType.SOLDIER);
		soldierModel.display(soldier1);
		soldierModel.display(soldier2);
		
		ModelsFactory.getModel(ModelType.BUILDING).display(building1);
		ModelsFactory.getModel(ModelType.BUILDING).display(building2);
	}

}
