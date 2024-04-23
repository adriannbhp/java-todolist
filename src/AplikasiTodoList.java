public class AplikasiTodoList {

    public static String[] model = new String[10];
    public static void main(String[] args) {
        testShowTodoList();
    }

    /**
     * Menampilkan todo list
     */
    public static void showTodoList(){
        // Karena membutuhkan index dari array sehingga harus menggunakan fori bukan foreach
        for (var i = 0; i < model.length; i++) {
            var todo = model[i];
            var no = i + 1; // Kenapa i + 1 karena karena iterasi looping dimulai dari 0, sehingga harus ditambah 1

            if(todo != null) {
                System.out.println(no + ". " + todo);
            }
        }
    }

    public static void testShowTodoList(){
        model[0] = "Belajar Java Dasar";
        model[1] = "Studi Kasus Java : Aplikasi Todo List";
        showTodoList();
    }

    /**
     * Menambah todo ke list
     */
    public static void addTodoList(){

    }

    /**
     * Menghapus todo dari list
     */
    public static void removeTodoList() {

    }

    /**
     *  Menampilkan view todo list
     */
    public static void viewShowTodoList() {

    }

    /**
     * Menampilkan view add todo list
     */
    public static void viewAddTodoList() {

    }

    /**
     * Menampilkan view remove todo list
     */
    public static void viewRemoveTodoList() {

    }
}
