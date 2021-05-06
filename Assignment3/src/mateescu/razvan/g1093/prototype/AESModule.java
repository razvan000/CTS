package mateescu.razvan.g1093.prototype;

import java.util.ArrayList;
import java.util.Random;


public class AESModule implements Cloneable{
	
	ArrayList<ArrayList<Integer>> galoisFields=new ArrayList<>();
	
	ArrayList<Integer> substitutionTable= new ArrayList<>();

	private String site;
	
	private AESModule() {
		
	}
	
	public AESModule(String site) {
		this.site=site;
		
		System.out.println("Initialising AES module");
		for(int i=0; i<6; i++) {
			Random rand= new Random(100);
			ArrayList<Integer> array=new ArrayList<>();
			for(int j=0;j<10;j++) {
				array.add(rand.nextInt(255));
			}
			galoisFields.add(array);
			substitutionTable.add(rand.nextInt(255));
		}
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone(); -> the default version throws CloneNotSupportedException
		AESModule copy = new AESModule();
		copy.galoisFields=(ArrayList<ArrayList<Integer>>) this.galoisFields.clone();
		copy.substitutionTable = (ArrayList<Integer>) this.substitutionTable.clone();
		return copy;
	}
}
