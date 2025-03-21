package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoService {
	
	private static List<Todo> todos = new ArrayList<>();;
	
	static {
		todos.add(new Todo(1, "surajjindam", "Learn AWS", LocalDate.now().plusYears(1),false));
		todos.add(new Todo(1, "surajjindam", "Learn Devops", LocalDate.now().plusYears(2),false));
		todos.add(new Todo(1, "surajjindam", "Learn Full Stack Development", LocalDate.now().plusYears(3),false));

	}
	
	public List<Todo> findTodoByUsername(String username){
		return todos;
	}

}
