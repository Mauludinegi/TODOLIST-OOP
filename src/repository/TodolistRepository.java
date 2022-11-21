/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;
import entity.Todolist;
/**
 *
 * @author GIE
 */
public interface TodolistRepository {
    Todolist[] getAll();
    
    void add(Todolist todolist);
    
    boolean remove(Integer number);
}
