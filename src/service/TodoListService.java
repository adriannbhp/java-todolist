package service;

public interface TodoListService {

    // Method untuk menampilkan seluruh daftar tugas
    void showTodoList();

    // Method untuk menambahkan tugas baru ke daftar
    void addTodoList(String todo);

    // Method untuk menghapus tugas dari daftar berdasarkan nomor
    void removeTodoList(Integer number);
}
