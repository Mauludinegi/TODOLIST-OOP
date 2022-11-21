/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

/**
 *
 * @author GIE
 */
public interface TodolistService {
    void showTodolist();
    
    void addTodolist(String todo);
    
    void removeTodolist(Integer number);
}
