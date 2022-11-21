
import repository.TodolistRepository;
import repository.TodolistRepositoryImpl;
import service.TodolistService;
import service.TodolistServiceImpl;
import view.TodolistView;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GIE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //logic data ada di repository
        TodolistRepository todolistRepository = new TodolistRepositoryImpl();
        
        //logic business ada di service
        TodolistService todolistService = new TodolistServiceImpl(todolistRepository);
        
        //logic view ada di View
        TodolistView todolistView = new TodolistView(todolistService);
        
        todolistView.showTodolist();
        
    }
    
}
