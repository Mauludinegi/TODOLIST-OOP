/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author GIE
 */
public class Todolist {
    private String todo;

    public Todolist(String todo) {
        this.todo = todo;
    }

    public Todolist() {
        this.todo = todo;
    }
    
    public String getTodo() {
        return todo;
    }

    public void setTodo(String todo) {
        this.todo = todo;
    }
    
}
