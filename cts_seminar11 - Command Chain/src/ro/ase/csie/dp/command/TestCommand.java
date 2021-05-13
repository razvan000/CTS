package ro.ase.csie.dp.command;

public class TestCommand {
	public static void main(String[] args) {
		TaskManager manager= new TaskManager("Background tasks");
		manager.addAsyncTask(new AsyncTask(new AutosaveModule(5),"Finishing level",0));
		manager.addAsyncTask(new AsyncTask(new UpdateModule(),"Version 5",0));
		
		System.out.println("Game running");
		manager.doNextTask();
		System.out.println("Game running");
		manager.doNextTask();
	}
}
