package test.service;

import entity.Todolist;
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;

public class TodoListServiceTest {

    // Method utama untuk menjalankan pengujian
    public static void main(String[] args) {
        testRemoveTodoList(); // Memanggil method untuk menguji penghapusan tugas
    }

    // Method untuk menguji menampilkan daftar tugas
    public static void testShowTodoList(){
        TodoListRepositoryImpl todoListRepository = new TodoListRepositoryImpl();
        todoListRepository.data[0] = new Todolist("Belajar Java Dasar"); // Menambahkan tugas ke repository
        todoListRepository.data[1] = new Todolist("Belajar Java OOP"); // Menambahkan tugas ke repository
        todoListRepository.data[2] = new Todolist("Belajar Java Standard Classes"); // Menambahkan tugas ke repository

        TodoListService todoListService = new TodoListServiceImpl(todoListRepository); // Membuat object service

    todoListService.showTodoList(); // Menampilkan daftar tugas setelah penambahan
    }

    // Method untuk menguji penambahan tugas baru ke daftar
    public static void testAddTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl(); // Membuat Object Repository
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository); // Membuat object service

        todoListService.addTodoList("Belajar Java Dasar"); // Menambahkan tugas baru ke daftar
        todoListService.addTodoList("Belajar Java OOP"); // Menambahkan tugas baru ke daftar
        todoListService.addTodoList("Belajar Java Standard Classes"); // Menambahkan tugas baru ke daftar

        todoListService.showTodoList();
    }

    // Method untuk menguji penghapusan tugas dari daftar
    public static void testRemoveTodoList(){
        TodoListRepository todoListRepository = new TodoListRepositoryImpl(); // Membuat object repository
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository); // Membuat object layanan

        todoListService.addTodoList("Belajar Java Dasar"); // Menambahkan tugas baru ke daftar
        todoListService.addTodoList("Belajar Java OOP"); // Menambahkan tugas baru ke daftar
        todoListService.addTodoList("Belajar Java Standard Classes"); // Menambahkan tugas baru ke daftar

        todoListService.showTodoList(); // Menampilkan daftar tugas sebelum penghapusan
        todoListService.removeTodoList(5); // Menghapus tugas dengan nomor 5
        todoListService.removeTodoList(2); // Menghapus tugas dengan nomor 2
        todoListService.showTodoList(); // Menampilkan daftar tugas setelah penghapusan
        todoListService.removeTodoList(3); // Menghapus tugas dengan nomor 3
        todoListService.showTodoList(); // Menampilkan daftar tugas setelah penghapusan
        todoListService.removeTodoList(2); // Menghapus tugas dengan nomor 2
        todoListService.showTodoList(); // Menampilkan daftar tugas setelah penghapusan
        todoListService.removeTodoList(1); // Menghapus tugas dengan nomor 1
        todoListService.showTodoList(); // Menampilkan daftar tugas setelah penghapusan

    }
}
