package interfaces;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable {
    private List<String> tasks = new ArrayList<>();

    public List<String> getTasks() {
        return tasks;
    }

    public void run() {
        while (nextStep()){
            nextStep();
        }
    }

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }

    private boolean nextStep() {
        tasks.remove(tasks.size() - 1);
        return tasks.size() > 0;
    }
}
