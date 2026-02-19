Nama: Falih Faiq Fahlurrahman

NIM: 123140129

Program Studi: Teknik Informatika

Mata Kuliah: Pengembangan Aplikasi Mobile

-----------------------------------------------------------------------------------------------------------------------------

Cara Menjalankan Aplikasi

1. Persiapan Lingkungan
Pastikan Android Studio (Versi Ladybug 2024.2.1 atau terbaru) sudah terinstal.

Gunakan JDK 17 atau versi terbaru yang kompatibel dengan proyek Android.

2. Impor Proyek
Buka Android Studio.

Pilih File > Open dan arahkan ke folder proyek NewsFeedSimulator ini.

Tunggu hingga proses Gradle Sync selesai. Pastikan koneksi internet stabil untuk mengunduh library Coroutines dan Flow.

3. Menjalankan Simulasi
Hubungkan perangkat Android fisik atau jalankan Emulator.

Klik tombol Run (ikon segitiga hijau ▶) pada toolbar atas.

Aplikasi akan terinstal, namun karena ini adalah simulasi logic, tampilan layar HP mungkin akan kosong (Putih).

4. Memeriksa Output (PENTING)
Seluruh aktivitas simulasi data (Flow, Filter, Transform, dan StateFlow) dapat dilihat melalui Logcat:

Buka tab Logcat di bagian bawah jendela Android Studio.

Pada kolom pencarian/filter Logcat, ketik kata kunci: PRAKTIKUM.

Anda akan melihat aliran data sebagai berikut:

Berita baru muncul setiap 2 detik.

Hanya berita dengan kategori tertentu yang lolos Filter.

Status StateFlow yang menampilkan jumlah berita yang sudah dibaca.

Detail berita yang diambil secara asinkron menggunakan Async/Await.

-----------------------------------------------------------------------------------------------------------------------------

Ringkasan Fitur yang Berjalan

Flow Builder: Menghasilkan data stream secara real-time.

Operators: Implementasi .filter() dan .map() untuk transformasi data.

State Management: StateFlow untuk menjaga konsistensi jumlah data yang dibaca.

Concurrency: Penggunaan Dispatchers.IO untuk operasi asinkron yang efisien.
