import java.util.ArrayList;

// deklrasi kelas anggota dpm
public class AnggotaDPM extends Mahasiswa {

  // atribut private
  private String jabatan;// atribut jabatan di DPM
  private String komisi;// atribut komisi
  private ArrayList<ProkerBEM> listProkerDiawasi;// atribut list proker bem yang diawasi

  // konstruktor
  AnggotaDPM() {
    // inisiasi dengan string kosong
    this.jabatan = "";
    this.komisi = "";
    this.listProkerDiawasi = new ArrayList<ProkerBEM>();
  }

  // konstruktor
  AnggotaDPM(String nik, String nama, String jenisKelamin, String asalUniv, String emailEdu, String nim,
      String prodi, String fakultas, String laptop, String jabatan, String komisi) {
    super(nik, nama, jenisKelamin, asalUniv, emailEdu, nim, prodi, fakultas, "Anggota DPM", laptop);
    // inisiasi atribut dengan nilai inputan
    this.jabatan = jabatan;
    this.komisi = komisi;
    this.listProkerDiawasi = new ArrayList<ProkerBEM>();
  }

  // getter & setter
  public String getJabatan() {
    return this.jabatan;
  }

  public void setJabatan(String jabatan) {
    this.jabatan = jabatan;
  }

  public String getKomisi() {
    return this.komisi;
  }

  public void setKomisi(String komisi) {
    this.komisi = komisi;
  }

  public ArrayList<ProkerBEM> getlistProkerDiawasi() {
    return this.listProkerDiawasi;
  }

  public void setListProkerDiawasi(ArrayList<ProkerBEM> listProkerDiawasi) {
    this.listProkerDiawasi = listProkerDiawasi;
  }

  // menambahkan proker kedalam list proker yang diuawasi
  public void addProkerDiawasi(ProkerBEM proker) {
    this.listProkerDiawasi.add(proker);
  }

  // memberikan evaluasi pada suatu proker bem yang diawasi
  public void memberiEvaluasi(ProkerBEM proker) {
    // jika proker bem tsb belum selesai terlaksana, maka dpm belum bisa memberi
    // evaluasi
    if (proker.getStatus() < 3)
      System.out.println(getNama() + " belum bisa memberi evaluasi sebelum proker " + proker.getNamaProker()
          + " selesai terlaksanakan");
    // jika proker bem tsb selesai terlaksana, maka dpm bisa memberi evaluasi
    else
      System.out.println(
          "Selamat telah menyelesaikan proker " + proker.getNamaProker() + ", "
              + getNama()
              + " sangat mengapresiasi semua usaha anggota BEM (panitia) dalam mempersiapkan dan melaksanakan proker yang sangat luar biasa ini");
  }

}
