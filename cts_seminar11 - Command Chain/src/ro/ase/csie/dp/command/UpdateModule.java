package ro.ase.csie.dp.command;

public class UpdateModule implements GameModuleInterface{

	@Override
	public void doTheTask(String details) {
		System.out.println("Updating to version "+ details);
	}

}
