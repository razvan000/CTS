package ro.ase.csie.dp.composite;

public class TestComposite {

	public static void main(String[] args) {
		AbstractNode group1 = new Group("First Group");
		group1.addNode(new NPC("Soldier1",100));
		group1.addNode(new NPC("Soldier2",100));
		
		AbstractNode group2 = new Group("Second Group");
		group1.addNode(new NPC("Soldier3",150));
		group1.addNode(new NPC("Tank",300));
		
		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPC("level BOSS",500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		
		levelGroup.getNode(0).move();
	}

}
