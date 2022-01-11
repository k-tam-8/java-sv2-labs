package collectionsqueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos = new ArrayList<>();

    public Deque<ToDo> getTodosInUrgencyOrder() {
        Deque<ToDo> toDoDeque = new LinkedList<>();
        for (ToDo td : todos) {
            if (td.isUrgent()) {
                toDoDeque.push(td);
            } else {
                toDoDeque.add(td);
            }
        }
        return toDoDeque;
    }

    public void addToList(ToDo td) {
        todos.add(td);
    }

    public List<ToDo> getTodos() {
        return todos;
    }

    public static void main(String[] args) {
        ToDoList tdl = new ToDoList();
        tdl.addToList(new ToDo("AAA",false));
        tdl.addToList(new ToDo("BBB",true));
        tdl.addToList(new ToDo("CCC",false));
        tdl.addToList(new ToDo("DDD",true));
        tdl.addToList(new ToDo("EEE",true));
        System.out.println(tdl.getTodosInUrgencyOrder());
        System.out.println(tdl.getTodosInUrgencyOrder().pop());
    }

}
