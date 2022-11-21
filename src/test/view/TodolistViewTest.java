/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test.view;
import view.TodolistView;
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
/**
 *
 * @author GIE
 */
public class TodolistViewTest {
    public static void main(String[] args) {
        testViewRemoveTodolist();
    }
    
    public static void testViewShowTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);
        
        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");
        
        todolistView.showTodolist();
    }
    
    public static void testViewAddTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);
        
        
        todolistView.addTodolist();
        todolistService.showTodolist();

    }
    
    public static void testViewRemoveTodolist() {
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        TodolistView todolistView = new TodolistView(todolistService);
        
        todolistService.addTodolist("Belajar Java Dasar");
        todolistService.addTodolist("Belajar Java OOP");
        todolistService.addTodolist("Belajar Java Standard Classes");
        
        todolistService.showTodolist();
        
        todolistView.removeTodolist();
       
        todolistService.showTodolist();
    }
}
