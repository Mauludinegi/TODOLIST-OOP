/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import service.TodolistService;
import util.InputUtil;

/**
 *
 * @author GIE
 */
public class TodolistView {
    
    private TodolistService todolistService;

    public TodolistView(TodolistService todolistService) {
        this.todolistService = todolistService;
    }
    
    
    public void showTodolist() {
        while(true) {
            todolistService.showTodolist();
            
            System.out.println("Menu : ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");
            
            var input = InputUtil.input("Pilih");
            
            if(input.equals("1")) {
                addTodolist();
            } else if(input.equals("2")) {
                removeTodolist();
            } else if(input.equals("x")) {
                break;
            } else {
                System.out.println("Pilihan tidak dimengerti");
            }
        }
    }
    
    public void addTodolist() {
        System.out.println("Menambah Todolist");
        
        var todo = InputUtil.input("Todo (x Jika Bata)");
        
        if(todo.equals("x")) {
            
        } else {
            todolistService.addTodolist(todo);
        }
    }
    
    public void removeTodolist() {
        System.out.println("Menghapus Todolist");
        
        var number = InputUtil.input("Nomor yang dihapus (x Jika Batal)");
        
        if(number.equals("x")) {
            //batal
        } else {
            todolistService.removeTodolist(Integer.valueOf(number));
        }
    }
}
