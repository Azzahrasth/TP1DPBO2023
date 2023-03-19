import java.util.ArrayList;

//deklarasi kelas asisten praktikum
public class AsistenPraktikum extends Mahasiswa {
  // atribut private
  private String tahun; // atribut tahun menjadi asisten
  private ArrayList<MataKuliah> listMatkulPraktikum; // atribut list matkul praktikum yang di asisteni/ajari

  // konstruktor
  AsistenPraktikum() {
    // inisiasi dengan string kosong
    tahun = "";
    listMatkulPraktikum = new ArrayList<MataKuliah>();
  }

  // konstruktor
  AsistenPraktikum(String nik, String nama, String jenisKelamin, String asalUniv, String emailEdu, String nim,
      String prodi, String fakultas, String laptop, String tahun) {
    super(nik, nama, jenisKelamin, asalUniv, emailEdu, nim, prodi,
        fakultas, "Asisten Praktikum", laptop);
    // inisiasi dengan nilai inputan
    this.tahun = tahun;
    this.listMatkulPraktikum = new ArrayList<MataKuliah>();
  }

  // getter & setter
  public String getTahun() {
    return tahun;
  }

  public void setTahun(String tahun) {
    this.tahun = tahun;
  }

  public ArrayList<MataKuliah> getListMatkulPraktikum() {
    return this.listMatkulPraktikum;
  }

  public void setListMatkulPraktikum(ArrayList<MataKuliah> MatkulPraktikum) {
    this.listMatkulPraktikum = MatkulPraktikum;
  }

  // menambahkan mata kuliah praktikum kedalam list matkul prkitkum yang di
  // asisteni/ajari
  public void addListMatkulPraktikum(MataKuliah MatkulPraktikum) {
    this.listMatkulPraktikum.add(MatkulPraktikum);
  }

  // memberikan nilai pada suatu matkul yang diasisteni
  public void memberiNilai(MataKuliah matkul) {
    // set atribut status_nilai_asisten menjadi true, artinya sudah dinilai asisten
    matkul.setStatusNilaiAsisten(true);
    System.out.println("Asisten berhasil menginputkan nilai pada mata kuliah " + matkul.getNamaMatkul());
  }

  // mengajarkan mahasiswa yang di asisteni
  public void mengajar() {
    System.out.println(
        "Demi masa depan teman-teman mahasiswa yang lebih cerah, " + getNama()
            + " mengajarkan mereka dengan penuh kasih sayang");
  }

  // memberi tugas suatu matkul prak ke mahahsiswa yang diasisteni
  public void memberiTugas(MataKuliah matkul) {
    System.out
        .println(getNama()
            + " ingin memberi Tugas Praktikum  " + matkul.getNamaMatkul()
            + " kepada teman-teman mahasiswa yang dia sayangi dan cintai");
  }
}
