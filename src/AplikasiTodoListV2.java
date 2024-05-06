// Mengimpor kelas TodoListRepository dan TodoListRepositoryImpl dari package repository
import repository.TodoListRepository;
import repository.TodoListRepositoryImpl;
// Mengimpor kelas TodoListService dan TodoListServiceImpl dari package service
import service.TodoListService;
import service.TodoListServiceImpl;
// Mengimpor class TodoListView dari package view
import view.TodoListView;

// Mendefinisikan kelas AplikasiTodoListV2
public class AplikasiTodoListV2 {
    public static void main(String[] args) {
        // Membuat object repository, service, dan view
        TodoListRepository todoListRepository = new TodoListRepositoryImpl();
        TodoListService todoListService = new TodoListServiceImpl(todoListRepository);
        TodoListView todoListView = new TodoListView(todoListService);

        // Menampilkan tampilan daftar tugas
        todoListView.showTodoList();
    }
}
