import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    // deklarasi list mahasiswa, dosen dan asisten praktikum
    ArrayList<Mahasiswa> listMahasiswa = new ArrayList<Mahasiswa>();
    ArrayList<Dosen> listDosen = new ArrayList<Dosen>();
    ArrayList<AsistenPraktikum> listAsprak = new ArrayList<AsistenPraktikum>();

    // instansiasi mahasiswa
    Mahasiswa afri = new Mahasiswa("12345", "Afri Anggara", "l", "UPI", "afrianggara@upi.edu", "2100123",
        "Ilmu Komputer", "FPMIPA", "-", "ASUS");

    listMahasiswa.add(afri); // menambahkan ke list mahasiswa

    Mahasiswa anin = new Mahasiswa("13567", "Anindito Kusuma", "p", "UPI", "an_an@upi.edu", "2100456",
        "Ilmu Komputer", "FPMIPA", "-", "LENOVO");

    listMahasiswa.add(anin);

    // instansiasi anggota bem
    AnggotaBEM rapi = new AnggotaBEM("17532", "Rapi Arsalan", "l", "UPI", "rafi_kabem734@upi.edu", "2100789",
        "Ilmu Komputer", "FPMIPA", "ACER", "Ketua BEM", "Non Divisi");
    listMahasiswa.add(rapi);
    AnggotaBEM aini = new AnggotaBEM("14823", "Qurrotu Aini", "p", "UPI", "ayini_cans@upi.edu", "2100321",
        "Ilmu Komputer", "FPMIPA", "ASUS", "Ketua Divisi", "Ekonomi dan Bisnis");
    listMahasiswa.add(aini);

    // instansiasi anggota dpm
    AnggotaDPM algha = new AnggotaDPM("17678", "Algha Naufal", "l", "UPI", "nopal@upi.edu", "2100654",
        "Ilmu Komputer", "FPMIPA", "LENOVO", "Ketua Komisi", "Pengawasan");
    listMahasiswa.add(algha);

    // instansiasi asisten praktikum
    AsistenPraktikum bulan = new AsistenPraktikum("19623", "Cahyana Bulan", "l", "UPI", "cahyana@upi.edu", "2100987",
        "Ilmu Komputer", "FPMIPA", "ACER", "2023");
    listMahasiswa.add(bulan);
    AsistenPraktikum najmi = new AsistenPraktikum("14085", "Najmi Qalbi", "p", "UPI", "najmi@upi.edu", "2100479",
        "Ilmu Komputer", "FPMIPA", "ASUS", "2023");
    listMahasiswa.add(najmi);

    // menambahkan bulan dan najmi ke list asprak
    listAsprak.add(bulan);
    listAsprak.add(najmi);

    // instansiasi dosen
    Dosen rosa = new Dosen("12907", "Rosa Ariana", "p", "UPI", "rosa@upi.edu", "198765",
        "Programing", "ASUS");
    listDosen.add(rosa); // menambahkan bu rosa ke listDosen

    // instansiasi matkul praktikum
    MataKuliah DPBO = new MataKuliah("Desain Pemrograman Berbasis Objek", "Modul DPBO tahun 2023");
    MataKuliah ALPRO2 = new MataKuliah("Algoritma dan Pemrograman 2", "Modul ALPRO 2 tahun 2023");

    // menambahkan matkul prak ke dalam list matkul yang diasisteni pada objek
    // asisten prak
    bulan.addListMatkulPraktikum(DPBO);
    najmi.addListMatkulPraktikum(ALPRO2);

    // menambahkan matkul prak ke dalam list matkul yang diajari pada objek dosen
    rosa.addMatkul(ALPRO2);
    rosa.addMatkul(DPBO);

    // instansiasi BEM
    BEM BEMkemakom = new BEM("BEM KEMAKOM", "Kulanawasena", "2023/2024");
    // instansiasi DPM
    DPM DPMkemakom = new DPM("DPM KEMAKOM", "Adeptus Imperium", "2023/2024");

    // menambahkan angggota BEM ke dalam list anggota pada objek BEM
    BEMkemakom.addAnggotaBEM(rapi);
    BEMkemakom.addAnggotaBEM(aini);

    // menambahkan angggota DPM ke dalam list anggota pada objek DPM
    DPMkemakom.addAnggotaDPM(algha);

    // instansiasi proker BEM
    ProkerBEM KGTS = new ProkerBEM("Kemakom Goes To School (KGTS)",
        "Memperkenalkan Departemen Ilmu Komputer kepada siswa Sekolah Menengah Atas / Kejuruan");

    ProkerBEM TS_Usaha = new ProkerBEM("Talkshow Kewirausahaan",
        "Talkshow seputar kewirausahaan untuk memotivasi mahasiswa untuk  membangun usaha nya sendiri");
    TS_Usaha.setStatus(2); // set status proker Tallshow Kewirausahaan menjadi 2 / tahap pelaksanaan

    // menambahkan proker BEM ke dalam list proker pada objek BEM
    BEMkemakom.addProker(TS_Usaha);
    BEMkemakom.addProker(KGTS);

    // menambahkan proker BEM ke dalam list proker yang diurusi pada objek anggota
    // BEM
    rapi.addProkerDiurusi(TS_Usaha);
    rapi.addProkerDiurusi(KGTS);
    aini.addProkerDiurusi(TS_Usaha);

    // menambahkan proker BEM ke dalam list proker yang diawasi pada objek
    // anggota DPM
    algha.addProkerDiawasi(TS_Usaha);
    algha.addProkerDiawasi(KGTS);

    // print data mahasiswa pada listMahasiswa
    System.out.println("<=== Data Mahasiswa ===>");
    for (int i = 0; i < listMahasiswa.size(); i++) {
      System.out.println();
      System.out.println(i + 1 + ".");
      System.out.println("NIM    : " + listMahasiswa.get(i).getNim());
      System.out.println("Nama   : " + listMahasiswa.get(i).getNama());
      System.out.println("Email  : " + listMahasiswa.get(i).getemailEdu());
      System.out.println("Status : " + listMahasiswa.get(i).getStatus());
    }
    // print aktivitas yang dapat dilakukan mahasiswa
    System.out.println("\n== Aktivitas Mahasiswa ==");
    System.out.println("- Belajar : ");
    afri.belajar();
    System.out.println("\n- Mengerjakan Tugas : ");
    anin.mengerjakanTugas();

    // print data dosen pada listDosen
    System.out.println("\n\n<=== Data Dosen ===>");
    for (int i = 0; i < listDosen.size(); i++) {
      System.out.println();
      System.out.println(i + 1 + ".");
      System.out.println("NIP      : " + listDosen.get(i).getNip());
      System.out.println("Nama     : " + listDosen.get(i).getNama());
      System.out.println("Email    : " + listDosen.get(i).getemailEdu());
      System.out.println("Keahlian : " + listDosen.get(i).getKeahlian());
      System.out.println("List Mata Kuliah yang diajari :");
      ArrayList<MataKuliah> matkulAjar = listDosen.get(i).getListMatkul();
      for (int j = 0; j < matkulAjar.size(); j++) {
        System.out.println("- " + matkulAjar.get(j).getNamaMatkul());

      }
    }

    // print aktivitas yang dapat dilakukan dosen
    System.out.println("\n== Aktivitas Dosen ==");
    System.out.println("- Mengajar : ");
    rosa.mengajar();
    System.out.println("\n- Memberi Tugas : ");
    rosa.memberiTugas(DPBO);
    rosa.memberiTugas(ALPRO2);

    // print data asistenPrakitkum pada listAsprak
    System.out.println("\n\n<=== Data Asisten Praktikum ===>");
    for (int i = 0; i < listAsprak.size(); i++) {
      System.out.println();
      System.out.println(i + 1 + ".");
      System.out.println("Nama          : " + listAsprak.get(i).getNama());
      System.out.println("Tahun Asisten : " + listAsprak.get(i).getTahun());
      System.out.println("List Mata Kuliah Praktikum yang diajari :");
      ArrayList<MataKuliah> matkulAjar = listAsprak.get(i).getListMatkulPraktikum();
      for (int j = 0; j < matkulAjar.size(); j++) {
        System.out.println("- " + matkulAjar.get(j).getNamaMatkul());

      }
    }

    // print aktivitas yang dapat dilakukan asprak
    System.out.println("\n== Aktivitas Asisten Praktikum ==");
    System.out.println("- Mengajar : ");
    bulan.mengajar();
    System.out.println("\n- Memberi Tugas : ");
    najmi.memberiTugas(ALPRO2);

    // print aktivitas dosen dan asprak yang saling berinteraksi
    System.out.println("\n== Interaksi Dosen dengan Asisten Praktikum ==");
    System.out.println(
        "- Dosen Memberi Nilai (kondisi ketika status_nilai_asisten pada matkul praktikum 'false' / belum terisi): ");
    rosa.memberiNilai(ALPRO2);
    System.out.println("\n- Asisten Memberi Nilai : ");
    najmi.memberiNilai(ALPRO2);
    System.out.println(
        "\n- Dosen Memberi Nilai (kondisi ketika status_nilai_asisten pada matkul praktikum 'true' / sudah terisi): ");
    rosa.memberiNilai(ALPRO2);

    // print data organisasi bem, proker-proker dan anggota-anggota nya
    System.out.println("\n\n<=== Data BEM ===>");
    System.out.println("Nama Himpunan : " + BEMkemakom.getNamaHimpunan());
    System.out.println("Nama Kabinet  : " + BEMkemakom.getNamaKabinet());
    System.out.println("Tahun Jabatan : " + BEMkemakom.getTahun());
    System.out.println("\nList Proker BEM:");
    ArrayList<ProkerBEM> proker = BEMkemakom.getListProker();
    for (int i = 0; i < proker.size(); i++) {
      System.out.println();
      System.out.println(i + 1 + ".");
      System.out.println("Nama Proker : " + proker.get(i).getNamaProker());
      System.out.println("Deskripsi   : " + proker.get(i).getDeskripsi());
      System.out.println("Status    : ");
      proker.get(i).printStatus();
    }
    System.out.println("\nList Anggota BEM:");
    ArrayList<AnggotaBEM> anggota_bem = BEMkemakom.getListAnggotaBEM();
    for (int i = 0; i < anggota_bem.size(); i++) {
      System.out.println();
      System.out.println(i + 1 + ".");
      System.out.println("Nama Anggota: " + anggota_bem.get(i).getNama());
      System.out.println("Jabatan     : " + anggota_bem.get(i).getJabatan());
      System.out.println("Divisi      : " + anggota_bem.get(i).getDivisi());

      System.out.println("List Proker yang Di Urusi :");
      ArrayList<ProkerBEM> proker_urus = anggota_bem.get(i).getListProkerDiurusi();
      for (int j = 0; j < proker_urus.size(); j++) {
        System.out.println("- " + proker_urus.get(j).getNamaProker());
      }

    }

    // print data organisasi dpm dan anggota-anggota nya
    System.out.println("\n\n<=== Data DPM ===>");
    System.out.println("Nama Himpunan : " + DPMkemakom.getNamaHimpunan());
    System.out.println("Nama Kabinet  : " + DPMkemakom.getNamaKabinet());
    System.out.println("Tahun Jabatan : " + DPMkemakom.getTahun());

    System.out.println("\nList Anggota DPM:");
    ArrayList<AnggotaDPM> anggota_dpm = DPMkemakom.getListAnggotaDPM();
    for (int i = 0; i < anggota_dpm.size(); i++) {
      System.out.println();
      System.out.println(i + 1 + ".");
      System.out.println("Nama Anggota: " + anggota_dpm.get(i).getNama());
      System.out.println("Jabatan     : " + anggota_dpm.get(i).getJabatan());
      System.out.println("Komisi      : " + anggota_dpm.get(i).getKomisi());

      System.out.println("List Proker yang Di Awasi :");
      ArrayList<ProkerBEM> proker_awasi = anggota_dpm.get(i).getlistProkerDiawasi();
      for (int j = 0; j < proker_awasi.size(); j++) {
        System.out.println("- " + proker_awasi.get(j).getNamaProker());
      }

    }

    // print aktivitas dpm dan bem yang saling berinteraksi
    System.out.println("\n== Interaksi Anggota BEM dengan Angggota DPM ==");
    System.out.print("\nStatus Proker : ");
    TS_Usaha.printStatus();
    System.out.println(
        "- Anggota DPM memberi evaluasi (kondisi ketika status pada proker belum selesai): ");
    algha.memberiEvaluasi(TS_Usaha);
    System.out.println("\n- Anggota BEM menjalankan Proker : ");
    aini.menjalankanProker(TS_Usaha);
    System.out.print("\nStatus Proker : ");
    TS_Usaha.printStatus();
    System.out.println(
        "- Anggota DPM memberi evaluasi (kondisi ketika status pada proker telah selesai): ");
    algha.memberiEvaluasi(TS_Usaha);

  }

}
