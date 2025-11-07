#Pertanyaan Percobaan 1#
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
>Jawab: Program error pada baris yang berisi nilai 5.0 dan 7.5, karena tipe data int tidak bisa menyimpan angka desimal seperti 5.0 dan 7.5, jika ingin program tetap berjalan maka perlu menggunakan tipe data double
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus pada saat deklarasi array.
>Jawab:
commit ke 3
3. Apa keluaran dari program? Jelaskan maksud dari statement tersebut!
>Jawab:
statement tersebut adalah perulangan menggunakan for yang berfungsi untuk menampilkan isi array satu per satu. 
int i = 0; berarti variabel i mulai dari 0
i < 4; berarti perulangan dilakukan selama i kurang dari 4 (karena array memiliki 4 elemen: indeks 0–3)
i++ artinya setiap selesai satu putaran, nilai i bertambah 1
System.out.println(bil[i]); digunakan untuk mencetak elemen array berdasarkan indeks i
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
>Jawab:
program error saat dijalankan: ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4, karena saat diubah menjadi i <= 4 maka program mencoba mengakses bil[4] padahal indeks terakhirnya adalah bil[3]

#Pertanyaan Percobaan 2#
1. Ubah statement pada langkah nomor 5 dan jalankan program. Apakah terjadi perubahan? Mengapa demikian?
>Jawab:
tidak terjadi perubahan pada output program karena nilaiAkhir.length adalah panjang array, yaitu 10. 
Jadi i < nilaiAkhir.length sama artinya dengan i < 
2. Apa yang dimaksud dengan kondisi: i < nilaiAkhir.length ?
>Jawab:
kondisi tersebut digunakan dalam perulangan for untuk menentukan kapan perulangan berhenti, selama nilai i masih lebih kecil dari panjang array nilaiAkhir maka perulangan akan terus dijalankan. jika nilaiAkhir.length bernilai 10 berarti perulangan akan berjalan selama i kurang dari 10 (0-9)
3. Ubah statement pada langkah nomor 6 menjadi seperti berikut ini, sehingga program hanya menampilkan nilai Mahasiswa yang lulus saja (yaitu mahasiswa yang memiliki nilai > 70). Jalankan program dan jelaskan alur program!
>Jawab:
pada perulangan pertama pengguna diminta memasukkan nilai akhir untuk setiap mahasiswa -> hasil input disimpan ke array nilaiAkhir[i] -> perulangan kedua digunakan untuk memeriksa setiap nilai array -> jika nilai mahasiswa lebih dari 70 maka program mencetak pesan lulus untuk mahasiswa tersebut -> jika nilai mahasiswa 70 atau kurang maka program tidak mencetak apapun -> Nilai yang dicetak hanya nilai yang lebih besar dari 70
4. Modifikasi program agar menampilkan status kelulusan semua mahasiswa berdasarkan
nilai, yaitu dengan menampilkan status mana mahasiswa yang lulus dan tidak lulus
>Jawab:
commit ke 11 percobaan 2: modifikasi

#Pertanyaan Percobaan 4#
1. Jelaskan maksud dari statement break; pada baris ke-10 kode program percobaan 4 di atas
>Jawab:
statement break digunakan untuk menghentikan loop agar program tidak melanjutkan pencarian ke elemen berikutnya jika sudah ditemukan key == arrNilai[i] bernilai true

