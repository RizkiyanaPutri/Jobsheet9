#Pertanyaan Percobaan 1#
1. Jika isi masing-masing elemen array bil diubah dengan angka 5.0, 12867, 7.5, 2000000. Apa yang terjadi? Mengapa bisa demikian?
Jawab: Program error pada baris yang berisi nilai 5.0 dan 7.5, karena tipe data int tidak bisa menyimpan angka desimal seperti 5.0 dan 7.5, jika ingin program tetap berjalan maka perlu menggunakan tipe data double
2. Modifikasi kode program di atas dengan melakukan inisialisasi elemen array sekaligus
Jawab:
commit ke 3
pada saat deklarasi array.
3. Apa keluaran dari program? Jelaskan maksud dari statement tersebut!
Jawab:
statement tersebut adalah perulangan menggunakan for yang berfungsi untuk menampilkan isi array satu per satu. 
int i = 0; berarti variabel i mulai dari 0
i < 4; berarti perulangan dilakukan selama i kurang dari 4 (karena array memiliki 4 elemen: indeks 0–3)
i++ artinya setiap selesai satu putaran, nilai i bertambah 1
System.out.println(bil[i]); digunakan untuk mencetak elemen array berdasarkan indeks i
4. Jika kondisi pada statement for-loop di atas diubah menjadi: i <= 4, apa keluaran dari program? Mengapa demikian?
Jawab:
program error saat dijalankan: ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4, karena saat diubah menjadi i <= 4 maka program mencoba mengakses bil[4] padahal indeks terakhirnya adalah bil[3]

#Pertanyaan Percobaan 2#
1. Ubah statement pada langkah nomor 5 dan jalankan program. Apakah terjadi perubahan? Mengapa demikian?
Jawab:
tidak terjadi perubahan pada output program karena nilaiAkhir.length adalah panjang array, yaitu 10. 
Jadi i < nilaiAkhir.length sama artinya dengan i < 10