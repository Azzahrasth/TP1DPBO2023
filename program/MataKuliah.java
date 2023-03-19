// deklarasi kelas matakuliah
// matkul disini adalah matkul yang ada praktikum nya (ada asisten praktikum)
public class MataKuliah {
  // atribut private
  private String namaMatkul; // atribut nama matkul
  private String modul; // atrbut modul
  private boolean statusNilaiAsisten; // atribut status nilai asisten, trus : asisten telah memberi nilai, false:
                                      // asisten belum memberi nilai
  private boolean statusNilaiDosen; // atribut status nilai dosen, trus : dosen telah memberi nilai, false: dosen
                                    // belum memberi nilai

  // konstruktor
  MataKuliah() {
    // inisiasi dengan string kosong
    this.namaMatkul = "";
    this.modul = "";
    this.statusNilaiAsisten = false;
    this.statusNilaiDosen = false;
  }

  // konstruktor
  MataKuliah(String namaMatkul, String modul) {
    // inisiasi dengan value inputan
    this.namaMatkul = namaMatkul;
    this.modul = modul;
    this.statusNilaiAsisten = false;
    this.statusNilaiDosen = false;
  }

  // getter & setter
  public String getNamaMatkul() {
    return namaMatkul;
  }

  public void setNamaMatkul(String namaMatkul) {
    this.namaMatkul = namaMatkul;
  }

  public String getModul() {
    return modul;
  }

  public void setModul(String modul) {
    this.modul = modul;
  }

  public boolean getStatusNilaiAsisten() {
    return statusNilaiAsisten;
  }

  public void setStatusNilaiAsisten(boolean statusNilaiAsisten) {
    this.statusNilaiAsisten = statusNilaiAsisten;
  }

  public boolean getStatusNilaiDosen() {
    return statusNilaiDosen;
  }

  public void setStatusNilaiDosen(boolean statusNilaiDosen) {
    this.statusNilaiDosen = statusNilaiDosen;
  }
}
