package entity;

public class Todolist {

    // Mendeklarasikan atribut private bernama 'todo' yang bertipe String
    private String todo;

    // Constructor default Todolist yang tidak menerima argument
    public Todolist() {
    }

    // Constructor Todolist dengan parameter 'todo' untuk menginisialisasi nilai atribut
    public Todolist(String todo) {
        this.todo = todo; // Mengatur nilai atribut 'todo' sesuai dengan parameter yang diterima
    }

    // Method getter untuk mendapatkan nilai atribut 'todo'
    public String getTodo() {
        return todo; // Mengembalikan nilai atribut 'todo'
    }

    // Method setter untuk mengatur nilai atribut 'todo'
    public void setTodo(String todo) {
        this.todo = todo; // Mengatur nilai atribut 'todo' sesuai dengan nilai yang diterima
    }
}
