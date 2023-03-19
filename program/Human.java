// deklarasi kelas human
public class Human {
  // atribut private
  private String nik; // atribut nik
  private String nama; // atribut nama
  private String jenisKelamin; // atribut jenis kelamin

  // konstruktor
  Human() {
    // inisiasi dengan string kosong
    this.nik = "";
    this.nama = "";
    this.jenisKelamin = "";
  }

  // konstruktor
  Human(String nik, String nama, String jenisKelamin) {
    // inisiasi dengan value inputan
    this.nik = nik;
    this.nama = nama;
    this.jenisKelamin = jenisKelamin;
  }

  // getter & setter
  public String getNama() {

    return this.nama;
  }

  public String getNik() {

    return this.nik;
  }

  public String getJenisKelamin() {

    return this.jenisKelamin;
  }

  public void setNama(String nama) {

    this.nama = nama;
  }

  public void setNik(String nik) {

    this.nik = nik;
  }

  public void setJenisKelamin(String jenisKelamin) {

    this.jenisKelamin = jenisKelamin;
  }
}
