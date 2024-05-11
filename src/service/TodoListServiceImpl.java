package service;

import entity.Todolist;
import repository.TodoListRepository;
public class TodoListServiceImpl implements TodoListService {

    // Mendeklarasikan atribut untuk menyimpan repository Todolist
    private TodoListRepository todoListRepository;

    // Constructor untuk menginisialisasi repository Todolist
    public TodoListServiceImpl(TodoListRepository todoListRepository) {
        this.todoListRepository = todoListRepository;
    }

    // Mengimplementasikan method untuk menampilkan seluruh daftar tugas
    @Override
    public void showTodoList() {
        Todolist[] model = todoListRepository.getAll();

        System.out.println("TODOLIST");
        for (var i = 0; i < model.length; i++) {
            var todolist = model[i];
            var no = i + 1; // Kenapa i + 1 karena karena iterasi looping dimulai dari 0, sehingga harus ditambah 1

            if(todolist != null) {
                System.out.println(no + ". " + todolist.getTodo()); // Menampilkan nomor dari isi tugas
            }
        }
    }

    // Mengimplementasikan method untuk menambahkan tugas baru ke daftar
    @Override
    public void addTodoList(String todo) {
        Todolist todolist = new Todolist(todo); // Membuat object Todolist
        todoListRepository.add(todolist); // Menambahkan Todolist ke repository
        System.out.println("SUKSES MENAMBAH TODO : " + todo); // Menamilkan message sukses
    }

    // Mengimplementasikan method untuk menghapus tugas dari daftar berdasarkan nomor
    @Override
    public void removeTodoList(Integer number) {
        boolean success = todoListRepository.remove(number); // Menghapus tugas dari repository
        if (success) {
            System.out.println("SUKSES MENGHAPUS TODO : " + number); // Menampilkan message sukses jika penghapusan berhasil
        }else {
            System.out.println("GAGAL MENGHAPUS TODO : " + number); // Menampilkan pesan gagal jika penghapusan gagal
        }
    }
}
