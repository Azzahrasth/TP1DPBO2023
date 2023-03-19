// deklarasi kelas mahasiswa
public class Mahasiswa extends SivitasAkademik {
  private String nim;// atribut NIM
  private String prodi;// atribut prodi
  private String fakultas;// atribut fakultas
  private String status;// atribut status (anggota BEM/ anggota DPM/ Asisten Praktikum)
  private String laptop;// atribut laptop

  // konstruktor
  Mahasiswa() {
    // inisiasi dengan string kosong
    this.nim = "";
    this.prodi = "";
    this.fakultas = "";
    this.status = "-";
    this.laptop = "";
  }

  // konstruktor
  Mahasiswa(String nik, String nama, String jenisKelamin, String asalUniv, String emailEdu, String nim, String prodi,
      String fakultas, String status, String laptop) {
    // inisiasi dengan value inputan
    super(nik, nama, jenisKelamin, asalUniv, emailEdu);
    this.nim = nim;
    this.prodi = prodi;
    this.fakultas = fakultas;
    this.status = status;
    this.laptop = laptop;
  }

  // getter & setter
  public String getNim() {
    return this.nim;
  }

  public void setNim(String nim) {
    this.nim = nim;
  }

  public String getProdi() {
    return this.prodi;
  }

  public void setProdi(String prodi) {
    this.prodi = prodi;
  }

  public String getFakultas() {
    return this.fakultas;
  }

  public void setFakultas(String fakultas) {
    this.fakultas = fakultas;
  }

  public String getStatus() {
    return this.status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getLaptop() {
    return this.laptop;
  }

  public void setLaptop(String laptop) {
    this.laptop = laptop;
  }

  // mahasiswa belajar
  public void belajar() {
    System.out.println("Aku harus belajar demi masa depan yang lebih cerah");
  }

  // mahasiswa deadliner mengerjakan tugas
  public void mengerjakanTugas() {
    System.out.println("Deadline tugas bentar lagi nih, kerjain tugas ah");
  }
}
