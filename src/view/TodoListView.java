package view;

import service.TodoListService;
import util.InputUtil;

// Mendeklarasikan class TodoListView
public class TodoListView {

    // Mendeklarasikan atribut untuk menyimpan service TodoListService
    private TodoListService todoListService;

    // Constructor untuk menginisialisasi service TodoListService
    public TodoListView(TodoListService todoListService) {
        this.todoListService = todoListService;
    }

    // Method menampilkan daftar tugas dan mengelola interaksi pengguna
    public void showTodoList(){
        while(true) {
            todoListService.showTodoList(); // Menampilkan daftar tugas menggunakan service TodoListService

            System.out.println("MENU: ");
            System.out.println("1. Tambah");
            System.out.println("2. Hapus");
            System.out.println("x. Keluar");

            // Meminta input dari pengguna untuk memilih menu
            var input = InputUtil.input("Pilih");

            // Memproses pilihan pengguna
            if(input.equals("1")){
                addTodoList(); // Memanggil method untuk menambahkan tugas baru
            } else if (input.equals("2")) {
                removeTodoList(); // Memanggil method untuk menghapus tugas
            } else if (input.equals("x")) {
                break; // Mengakhiri program jika pengguna memilih untuk keluar
            } else {
                System.out.println("Pilihan tidak dimengerti"); // Menampilkan pesan jika pilihan tidak valid
            }
        }
    }

    // Method untuk menambahkan tugas baru
    public void addTodoList(){
        System.out.println("MENAMBAH TODOLIST");

        // Meminta input dari pengguna untuk tugas baru
        var todo = InputUtil.input("Todo (x Jika Batal) ");

        // Memproses input pengguna
        if (todo.equals("x")){
            // batal
        } else {
            todoListService.addTodoList(todo); // Menambahkan tugas baru menggunakan service TodoListService
        }
    }

    // Method untuk menghapus tugas
    public void removeTodoList(){
        System.out.println("MENGHAPUS TODOLIST");

        // Menambahkan tugas baru menggunakan layanan TodoListService
        var number = InputUtil.input("Todo (x Jika Batal) ");

        // Memproses input pengguna
        if(number.equals("x")){
            // batal
        } else {
            todoListService.removeTodoList(Integer.valueOf(number)); // Menghapus tugas menggunakan layanan TodoListService
        }
    }


}
