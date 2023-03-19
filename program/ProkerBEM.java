// deklarasi kelas proker BEM 
public class ProkerBEM {
  private String namaProker;// atribut nama proker
  private String deskripsi;// atribut deskripsi proker
  private int status;// atribut Status pelaksanaan proker
  // 1 = tahap perancangan proker
  // 2 = tahap pelaksanaan proker
  // 3 = proker telah selasai dilaksanakan

  // konstruktor
  ProkerBEM() {
    // inisiasi dengan string kosong
    this.namaProker = "";
    this.deskripsi = "";
    this.status = 1;
  }

  // konstruktor
  ProkerBEM(String namaProker, String deskripsi) {
    // inisiasi dengan value inputan
    this.namaProker = namaProker;
    this.deskripsi = deskripsi;
    this.status = 1;
  }

  // getter & setter
  public String getNamaProker() {
    return this.namaProker;
  }

  public void setNamaProker(String namaProker) {
    this.namaProker = namaProker;
  }

  public String getDeskripsi() {
    return this.deskripsi;
  }

  public void setDeskripsi(String deskripsi) {
    this.deskripsi = deskripsi;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    // mengganti value status
    this.status = status;
  }

  // print status proker
  public void printStatus() {
    if (status == 1)
      System.out.println("Proker " + getNamaProker() + " dalam tahap perencanaan\n");
    else if (status == 2)
      System.out.println("Proker " + getNamaProker() + " dalam tahap pelaksanaan\n");
    else
      System.out.println("Proker " + getNamaProker() + " telah selesai\n");
  }

  // updata sttatus proker
  public void updateStatus() {
    // bila proker telah selesai maka tampilkan peringatan proker telah selesai
    if (status == 3)
      System.out.println("Proker telah selesai");
    else // bila proker belu selesai terlaksana
      status++; // maka value pada atribut status ditambah 1

  }
}
