import java.util.ArrayList;

// deklrasi kelas anggota bem
public class AnggotaBEM extends Mahasiswa {

  // atribut private
  private String jabatan;// atribut jabatan di BEM
  private String divisi;// atribut divisi
  private ArrayList<ProkerBEM> listProkerDiurusi;// atribut list proker bem yang diurusi/di panitiai anggota

  // konstruktor
  AnggotaBEM() {
    // inisiasi dengan string kosong
    this.jabatan = "";
    this.divisi = "";
    this.listProkerDiurusi = new ArrayList<ProkerBEM>();
  }

  // konstruktor
  AnggotaBEM(String nik, String nama, String jenisKelamin, String asalUniv, String emailEdu, String nim,
      String prodi, String fakultas, String laptop, String jabatan, String divisi) {
    super(nik, nama, jenisKelamin, asalUniv, emailEdu, nim, prodi,
        fakultas, "Anggota BEM", laptop);
    // inisiasi atribut dengan nilai inputan
    this.jabatan = jabatan;
    this.divisi = divisi;
    this.listProkerDiurusi = new ArrayList<ProkerBEM>();
  }

  // getter & setter
  public String getJabatan() {

    return this.jabatan;
  }

  public void setJabatan(String jabatan) {

    this.jabatan = jabatan;
  }

  public String getDivisi() {

    return this.divisi;
  }

  public void setDivisi(String divisi) {
    this.divisi = divisi;
  }

  public ArrayList<ProkerBEM> getListProkerDiurusi() {
    return this.listProkerDiurusi;
  }

  public void setListProkerDiurusi(ArrayList<ProkerBEM> listProkerDiurusi) {
    this.listProkerDiurusi = listProkerDiurusi;
  }

  // menambahkan proker kedalam list proker yang diurusi
  public void addProkerDiurusi(ProkerBEM Proker) {
    // mengganti value Jenis Kelamin
    this.listProkerDiurusi.add(Proker);
  }

  // menjalankan/melaksanakan 1 tahap pada suatu proker bem
  public void menjalankanProker(ProkerBEM Proker) {
    // update status proker
    Proker.updateStatus();
    System.out.println("Anggota BEM berhasil menjalankan Proker " + Proker.getNamaProker());
  }

}
