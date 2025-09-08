package com.example.todolist;

import java.util.ArrayList;
import java.util.List;
import com.example.todolist.model.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@jhoedo", "Curtir", false, 1));
      add(new Todo(9996L, "@jhoedo", "Comentar", false, 1));
      add(new Todo(9997L, "@jhoedo", "Compartilhar", false, 1));
      add(new Todo(9998L, "@jhoedo", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@jhoedo", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}