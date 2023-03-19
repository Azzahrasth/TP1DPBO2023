import java.util.ArrayList;

// deklarasi kelas bem
public class BEM {
  // atribut private
  private String namaHimpunan;// atribut NamaHimpunan
  private String namaKabinet;// atribut NamaKabinet
  private String tahun;// atribut tahun kepengurusan
  private ArrayList<AnggotaBEM> listAnggotaBEM;// list anggota bem
  private ArrayList<ProkerBEM> listProker;// list proker bem

  // konstruktor
  BEM() {
    // inisiasi dengan string kosong
    this.namaHimpunan = "";
    this.namaKabinet = "";
    this.tahun = "";
    this.listAnggotaBEM = new ArrayList<AnggotaBEM>();
    this.listProker = new ArrayList<ProkerBEM>();
  }

  // konstruktor
  BEM(String namaHimpunan, String namaKabinet, String tahun) {
    // inisiasi dengan value inputan
    this.namaHimpunan = namaHimpunan;
    this.namaKabinet = namaKabinet;
    this.tahun = tahun;
    this.listAnggotaBEM = new ArrayList<AnggotaBEM>();
    this.listProker = new ArrayList<ProkerBEM>();
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

  public ArrayList<AnggotaBEM> getListAnggotaBEM() {
    return this.listAnggotaBEM;
  }

  public void setListAnggotaBEM(ArrayList<AnggotaBEM> listAnggotaBEM) {
    this.listAnggotaBEM = listAnggotaBEM;
  }

  public ArrayList<ProkerBEM> getListProker() {
    return this.listProker;
  }

  public void setListProker(ArrayList<ProkerBEM> listProker) {
    this.listProker = listProker;
  }

  // menambahkan aggota bem ke list angota
  public void addAnggotaBEM(AnggotaBEM anggotaBEM) {
    this.listAnggotaBEM.add(anggotaBEM);
  }

  // menambahkan proker bem ke list proker
  public void addProker(ProkerBEM Proker) {
    this.listProker.add(Proker);
  }
}
