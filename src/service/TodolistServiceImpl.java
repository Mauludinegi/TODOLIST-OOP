/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;
import repository.TodolistRepository;
import entity.Todolist;
/**
 *
 * @author GIE
 */
public class TodolistServiceImpl implements TodolistService {
    
    private TodolistRepository todolistRepository;

    public TodolistServiceImpl(TodolistRepository todolistRepository) {
        this.todolistRepository = todolistRepository;
    }
    
    
    
    @Override
    public void showTodolist() {
        Todolist[] model = todolistRepository.getAll();
        System.out.println("TODOLIST");
        for(var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1;
            
            if(todolist != null) {
                System.out.println(no + ". " + todolist.getTodo());
            }
        }
    }

    @Override
    public void addTodolist(String todo) {
        Todolist todolist = new Todolist(todo);
        todolistRepository.add(todolist);
        System.out.println("Sukses menambah TODO : " + todo);
    }

    @Override
    public void removeTodolist(Integer number) {
        boolean success = todolistRepository.remove(number);
        if(success) {
            System.out.println("Sukses Menghapus Todo : " + number);
        } else {
            System.out.println("Gagal Menghapus Todo : " + number);
        }
    }
    
}
