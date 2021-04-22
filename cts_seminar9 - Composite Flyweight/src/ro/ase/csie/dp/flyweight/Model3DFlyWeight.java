package ro.ase.csie.dp.flyweight;

import java.util.ArrayList;

public class Model3DFlyWeight implements Model3DInterface{

	String name;
	ArrayList<Integer> points = new ArrayList<>();
	
	@Override
	public void display(ScreenData screenDetails) {
		System.out.println(String.format("Displaying %s at %d,%d,%d"
				+ "\t with color %s",name, screenDetails.x,screenDetails.y,
				screenDetails.z, screenDetails.textureColor));
	}

	public Model3DFlyWeight(String name) {
		super();
		this.name = name;
	}
	
	

}
