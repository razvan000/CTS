package ro.ase.csie.cts.seminar6.prototype;

import java.util.ArrayList;
import java.util.Random;

public class Character3DModel implements Cloneable {

	CaharacterType type;
	String color;

	ArrayList<Integer> graphicPoints = new ArrayList<>();

	private Character3DModel() {

	}

	public Character3DModel(CaharacterType type, String color) {
		this.color = color;
		this.type = type;
		System.out.println("Generating the 3D model...");
		try {
			Thread.sleep(2000);
			Random random = new Random(10);
			for (int i = 0; i < 20; i++) {
				graphicPoints.add(random.nextInt(1000));
			}

			System.out.println("Model loaded");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone(); -> the default version throws CloneNotSupportedException
		Character3DModel copy = new Character3DModel();
		copy.type = this.type;
		copy.color = this.color;
		copy.graphicPoints = (ArrayList<Integer>) this.graphicPoints.clone();
		return copy;
	}

}
