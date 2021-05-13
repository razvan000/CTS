package ro.ase.csie.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {

	List<AsyncTaskInterface> taskst = new ArrayList<>();
	String name;
	public TaskManager( String name) {
		super();
		this.taskst = new ArrayList<>();
		this.name = name;
	}
	
	public void addAsyncTask(AsyncTaskInterface task) {
		this.taskst.add(task);
	}
	
	public void doNextTask() {
		if(taskst.size() > 0) {
			AsyncTaskInterface task = taskst.get(0);
			task.startTask();
			taskst.remove(0);
		}
	}
}
