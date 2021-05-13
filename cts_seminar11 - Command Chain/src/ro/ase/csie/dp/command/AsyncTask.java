package ro.ase.csie.dp.command;

public class AsyncTask implements AsyncTaskInterface{

	GameModuleInterface module;
	String actioDetails;
	int priority;
	
	public AsyncTask(GameModuleInterface module, String actioDetails, int priority) {
		super();
		this.module = module;
		this.actioDetails = actioDetails;
		this.priority = priority;
	}

	@Override
	public void startTask() {
		this.module.doTheTask(actioDetails);
	}

}
