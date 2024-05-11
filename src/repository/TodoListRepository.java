package repository;

import entity.Todolist;

public interface TodoListRepository {

    // Method untuk mendapatkan semua elemen TodoList dari repository
    Todolist[] getAll();

    // Method untuk menambahkan sebuah element TodoList ke repository
    void add(Todolist todolist);

    // Method untuk menghapus sebuah elemen TodoList dari repository berdasarkan nomor tertentu
    boolean remove(Integer number);
}
