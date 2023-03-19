import java.util.ArrayList;

// deklarasi kelas dosen
public class Dosen extends SivitasAkademik {
  private String nip;// atribut NIP
  private String laptop;// atribut Laptop
  private String keahlian;// atribut keahlian
  private ArrayList<MataKuliah> listMatkul;// list matkul yang diajari

  // konstruktor
  Dosen() {
    // inisiasi dengan string kosong
    this.nip = "";
    this.laptop = "";
    this.keahlian = "";
    this.listMatkul = new ArrayList<MataKuliah>();
  }

  // konstruktor
  Dosen(String nik, String nama, String jenisKelamin, String asalUniv, String emailEdu, String nip, String keahlian,
      String laptop) {
    // inisiasi dengan value inputan
    super(nik, nama, jenisKelamin, asalUniv, emailEdu);
    this.nip = nip;
    this.keahlian = keahlian;
    this.laptop = laptop;
    this.listMatkul = new ArrayList<MataKuliah>();
  }

  // getter dan setter
  public String getNip() {
    return this.nip;
  }

  public void setNip(String nip) {
    this.nip = nip;
  }

  public String getKeahlian() {
    return this.keahlian;
  }

  public void setKeahlian(String keahlian) {
    this.keahlian = keahlian;
  }

  public String getLaptop() {
    return this.laptop;
  }

  public void setLaptop(String laptop) {
    this.laptop = laptop;
  }

  public ArrayList<MataKuliah> getListMatkul() {
    return this.listMatkul;
  }

  public void setListMatkul(ArrayList<MataKuliah> Matkul) {
    this.listMatkul = Matkul;
  }

  // menambahkan matakul kedalam list matkul yang diajari
  public void addMatkul(MataKuliah Matkul) {
    this.listMatkul.add(Matkul);
  }

  // memberikan nilai pada suatu matkul yang diajari
  public void memberiNilai(MataKuliah matkul) {
    // apabila atribut status_nilai_dasisten bernilai true / sudah dinilai
    if (matkul.getStatusNilaiAsisten() == true) {
      // maka dosen bisa menginputkan nilai
      // set atribut status_nilai_dosen menjadi true, artinya sudah dinilai dosen
      matkul.setStatusNilaiDosen(true);
      System.out.print("Dosen berhasil menginputkan nilai pada mata kuliah " + matkul.getNamaMatkul());
    } else // jika bukan
      // maka dosen belum bisa menginputkan nilai
      System.out
          .println("Asisten belum menilai sehingga Dosen belum bisa menilai Mata kuliah " + matkul.getNamaMatkul());
  }

  // mengajarkan mahasiswa
  public void mengajar() {
    String jenkel = (getJenisKelamin() == "p") ? "Ibu" : "Bapak";

    System.out
        .println("Demi masa depan mahasiswa yang lebih cerah " + jenkel + " " + getNama()
            + " mengajarkan mereka dengan penuh kasih sayang");
  }

  // memberi tugas pada suatu matkul yang diajari
  public void memberiTugas(MataKuliah matkul) {
    String jenkel = (getJenisKelamin() == "p") ? "Ibu" : "Bapak";

    System.out
        .println(jenkel + " " + getNama()
            + " memberi tugas Mata Kuliah " + matkul.getNamaMatkul());
  }
}
