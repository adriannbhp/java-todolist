package test.view;

import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
import service.TodoListService;
import service.TodoListServiceImpl;
import view.TodoListView;

public class TodoListViewTest {

    // Method utama untuk menjalankan pengujian
    public static void main(String[] args) {
//        testShowTodoList();
//        testAddTodoList();
        testRemoveTodoList(); // Memanggil method untuk menguji penghapusan tugas

    }

    // Method untuk menguji menampilkan daftar tugas
    public static void testShowTodoList(){
        // Membuat object repository, service, dan view
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        // Menambahkan beberapa tugas
        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        // Menampilkan daftar tugas menggunakan tampilan
        todoListView.showTodoList();
    }

    // Method untuk menguji menambahkan tugas baru ke daftar menggunakan tampilan
    public static void testAddTodoList(){
        // Membuat object repository, service, dan view
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        // Menampilkan tampilan penambahan tugas
        todoListView.addTodoList();

        // Menampilkan daftar tugas setelah penambahan menggunakan view
        todoListService.showTodoList();

        // Menampilkan tampilan penambahan tugas
        todoListView.addTodoList();

        // Menampilkan daftar tugas setelah penambahan menggunakan view
        todoListService.showTodoList();
    }
    // Method untuk menguji menghapus tugas dari daftar menggunakan view
    public static void testRemoveTodoList(){
        // Membuat object repository, service, dan view
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        // Menambahkan beberapa tugas
        todoListService.addTodoList("Belajar Java Dasar");
        todoListService.addTodoList("Belajar Java OOP");
        todoListService.addTodoList("Belajar Java Standard Classes");

        // Menampilkan daftar tugas sebelum penghapusan menggunakan show
        todoListService.showTodoList();

        // Menampilkan tampilan penghapusan tugas
        todoListView.removeTodoList();

        // Menampilkan daftar tugas setelah penghapusan menggunakan show
        todoListService.showTodoList();
    }
}
