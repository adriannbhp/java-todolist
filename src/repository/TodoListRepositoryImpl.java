package repository;

import entity.Todolist;

public class TodoListRepositoryImpl implements TodoListRepository {

    // Mendeklarasikan array data yang akan menyimpan object Todolist
    public Todolist[] data = new Todolist[10];

    // Mengimplementasikan method dari interface TodoListRepository untuk mendapatkan semua elemen Todolist dari repository
    @Override
    public Todolist[] getAll() {
        return data; // Mengembalikan array data
    }

    // Method untuk memeriksa apakah array data sudah penuh
    public boolean isFull(){
        var isFull = true;
        for (int i = 0; i < data.length; i++) {
            if(data[i] == null){
                // model masih ada yang kosong
                isFull = false;
                break;
            }
        }
        return isFull;
    }

    // Method untuk mengubah ukuran array data jika sudah penuh
    public void resizeIfFull() {
        // jika penuh, kita resize ukuran array 2x lipat
        if (isFull()) {
            var temp = data;
            data = new Todolist[data.length * 2];

            for (int i = 0; i < temp.length; i++) {
                data[i] = temp[i];
            }
        }
    }

    // Mengimplementasikan method dari interface TodoListService untuk menambahkan sebuah elemen Todolist ke repository
    @Override
    public void add(Todolist todolist) {

        resizeIfFull(); // Memeriksa dan mengubah ukuran array jika penuh
        // Tambahkan ke posisi yang data array nya NULL
            for (var i = 0; i < data.length; i++) {
                if(data[i] == null){
                    data[i] = todolist; // Menambahkan Todolist ke array pada posisi yang data array nya NULL
                    break;
            }
        }
    }

    // Mengimplementasikan method dari interface TodoListRepository untuk menghapus sebuah elemen Todolist
    // dari repository berdasarkan nomor tertentu
    @Override
    public boolean remove(Integer number) {
        if((number - 1) >= data.length){
            return false; // Mengembalikan false jika nomor yang dihapus di luar index array
        } else if (data[number - 1] == null) {
            return false; // Mengembalikan false jika elemen yang ingin dihapus sudah kosong
        } else {
            for (int i = (number -1); i < data.length; i++) {
                if(i == (data.length -1)) {
                    data[i] = null; // Menghapus elemen terakhir dengan mengatur nilainya menjadi null
                } else {
                    data[i] = data[i +1]; // Menggantikan elemen yang dihapus dengan elemen berikutnya
                }
            }
            return true; // Mengembalikan true jika penghapusan berhasil
        }
    }
}
