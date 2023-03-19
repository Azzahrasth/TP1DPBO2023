# TP1DPBO2023
# TP1DPBO2023
> Saya Azzahra Siti Hadjar NIM 2100901 mengerjakan soal Latihan 4
dalam mata kuliah Desain dan Pemrograman Berorientasi Objek
untuk keberkahanNya maka saya tidak melakukan kecurangan
seperti yang telah dispesifikasikan. Aamiin. 

## Bahasa Pemrograman yang digunakan
> Java

## Desain Class Diagram
![Class Diagram](https://user-images.githubusercontent.com/100898963/226174993-03d42924-4ff0-46ef-b918-c870fc23e347.jpg)


## Penjelasan Desain
1. Terdapat 11 kelas, yaitu :
  - Human
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
  - Sivitas Akademik
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
  - Mahasiswa
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - belajar : mahasiswa sedang belajar demi masa depan yang cerah
      - mengerjakanTugas : mahasiswa mengerjakan tugas karena deadline tugas nya sebentar lagi
  - Dosen
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - addMatkulAjar : menambahkan matkul yang kedalam listMatkul yang diajari
      - mengajar : dosen sedang mengajar mahasiswa
      - memberiTugas : dosen memberi tugas suatu matkul kepada mahasiswa
      - memberiNilai : dosen memberi nilai pada suatu matkul kepada mahasiswa
  - AsistenDosen
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - addMatkulAjar : menambahkan matkul yang kedalam listMatkul yang diajari
      - mengajar : asisten sedang mengajar mahasiswa
      - memberiTugas : asisten memberi tugas suatu matkul praktikum kepada mahasiswa
      - memberiNilai : asisten memberi nilai pada suatu matkul praktikum kepada mahasiswa
  - AnggotaBEM
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut 
      - addProkerDiurusi : menambahkan proker yang kedalam lisProker yang diurusi
      - menjalankanProker : menjalankan/melaksanakan 1 tahap pada suatu proker bem
  - AnggotaDPM
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - addProkerDiurusi : menambahkan proker yang kedalam lisProker yang diawasi
      - memberiEvaluasi : memberikan evaluasi pada suatu proker bem yang diawasi
  - BEM
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - addAnggotaBEM : menambahkan aggota bem ke list angota
      - addProkerBEM : menambahkan proker bem ke list angota
  - DPM
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - addAnggotaDPM : menambahkan aggota dpm ke list angota
  - MataKuliah
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
  - ProkerBEM
    - Method :
      - get : mengembalikan nilai dari suatu atribut
      - set : memberikan nilai pada suatu atribut
      - printStatus : print status proker
      - updateStatus : update status proker 
      
2. Relasi antar kelas :
  1. Sivitas is a Human. Mahasiswa dan Dosen is a Sivitas Akademik. Karena mahasiswa dan Dosen adalah sisvitas akademik dan berupa human
  2. AnggotaBEM, AnggotaDPM, dan AsistenPraktikum is a Mahasiswa karena ketiga class tersebut pasti seorang Mahasiswa
  3. BEM composite class AnggotaBEM dan ProkerBEM, karena BEM pasti punya list anggota dan list proker
  4. AnggotaBEM composite class ProkerBEM, karena Anggota BEM dapa memiliki list proker yang diurusi atau di panitiai
  5. DPM composite class AnggotaDPM, karena DPM pasti punya Anggota
  6. AnggotaDPM composite class ProkerBEM, karena Anggota DPM dapat memiliki list proker yang di awasi
  7. Asisten composite class MataKuliah, karena Asisten dapat memiliki list Mata Kuliah Praktikum yang di ajari
  8. Dosen composite class MataKuliah, karena Dosen dapat memiliki list Mata Kuliah Praktikum yang di ajari

## Alur Program
  - Program ini memakai hardcode sebagai input nya.
  - instansiasi objek dan memasukan ke dalam list
  - output yang dikeluarkan :
    - data mahasiswa pada list mahasiswa, kemudian aktivitas yang dapat dilakukan mahasiswa
    - data dosen pada list dosen, kemudian aktivitas yang dapat dilakukan dosen
    - data Asisten Praktikum pada list asprak, kemudian aktivitas yang dapat dilakukan asprak
    - aktivitas dosen dan asprak yang saling berinteraksi
    - BEM
      - list proker BEM
      - list anggota BEM
    - DPM
      - list anggota DPM
    - print aktivitas dpm dan bem yang saling berinteraksi
    
## Dokumetasi Program
- List Mahasiswa
<img width="239" alt="1" src="https://user-images.githubusercontent.com/100898963/226175671-5c9b1ea8-ae2c-47b8-a4a8-ce8010a79179.png">


- Dosen dan Asisten Praktikum & Interaksi Dosen dan Asprak
<img width="467" alt="2" src="https://user-images.githubusercontent.com/100898963/226175674-8d8f837d-a144-4232-b405-02e460a40ad6.png">

- BEM
<img width="457" alt="3" src="https://user-images.githubusercontent.com/100898963/226175682-4a70fe62-750f-4c22-96c9-69ab7ee824b7.png">

 
- DPM & Interaksi BEM dan DPM
<img width="806" alt="4" src="https://user-images.githubusercontent.com/100898963/226175686-6c509565-093e-482e-8031-67b4755cfdad.png">

