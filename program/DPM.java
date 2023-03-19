import java.util.ArrayList;

// deklarasi kelas dpm
public class DPM {
  private String namaHimpunan;// atribut NamaHimpunan
  private String namaKabinet;// atribut NamaKabinet
  private String tahun;// atribut tahun kepengurusan
  private ArrayList<AnggotaDPM> listAnggotaDPM;// list anggota dpm

  // konstruktor
  DPM() {
    // inisiasi dengan string kosong
    this.namaHimpunan = "";
    this.namaKabinet = "";
    this.tahun = "";
    this.listAnggotaDPM = new ArrayList<AnggotaDPM>();
  }

  // konstruktor
  DPM(String namaHimpunan, String namaKabinet, String tahun) {
    // inisiasi dengan value inputan
    this.namaHimpunan = namaHimpunan;
    this.namaKabinet = namaKabinet;
    this.tahun = tahun;
    this.listAnggotaDPM = new ArrayList<AnggotaDPM>();
  }

  // getter & setter
  public String getNamaHimpunan() {
    return this.namaHimpunan;
  }

  public void setNamaHimpunan(String namaHimpunan) {
    this.namaHimpunan = namaHimpunan;
  }

  public String getNamaKabinet() {
    return this.namaKabinet;
  }

  public void setNamaKabinet(String namaKabinet) {
    this.namaKabinet = namaKabinet;
  }

  public String getTahun() {
    return this.tahun;
  }

  public void setTahun(String tahun) {
    this.tahun = tahun;
  }

  public ArrayList<AnggotaDPM> getListAnggotaDPM() {
    return this.listAnggotaDPM;
  }

  public void setListAnggotaDPM(ArrayList<AnggotaDPM> listAnggotaDPM) {
    this.listAnggotaDPM = listAnggotaDPM;
  }

  // menambahkan aggota dpm ke list angota
  public void addAnggotaDPM(AnggotaDPM anggotaDPM) {
    this.listAnggotaDPM.add(anggotaDPM);
  }

}
