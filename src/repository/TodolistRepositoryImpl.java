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
public class TodolistRepositoryImpl implements TodolistRepository {

    public Todolist[] data = new Todolist[10];
    
    public boolean isFull() {
        //untuk mengecek array apakah penuh atau tidak
         var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null) {
                isFull = false;
                break;
            }
        }
        return isFull;
    }
    
    @Override
    public Todolist[] getAll() {
        return data;
    }
    
    public void resizeIfFull() {
        //cek jika penuh, maka akan di ubah ukuran array 2x lipat
        if(isFull()) {
           var temp = data;
           data = new Todolist[data.length*2];
           
           for (int i = 0; i < temp.length; i++) {
               data[i] = temp[i];
           }
       }
    }

    @Override
    public void add(Todolist todolist) {
        resizeIfFull();
       
       //tambahkan ke posisi yang data arraynya null
       for (int i = 0; i < data.length; i++) {
               if(data[i] == null) {
                   data[i] = todolist;
                   break;
               }
           }
    }

    @Override
    public boolean remove(Integer number) {
        if((number - 1) >= data.length) {
            return false;
        } else if (data[number - 1] == null) {
            return false;
        } else {
            for (int i = (number - 1); i < data.length; i++) {
                if(i == (data.length -1)) {
                    data[i] = null;
                } else {
                    data[i] = data[i + 1]; 
                }
            }
            return true;
        }
    }
}
