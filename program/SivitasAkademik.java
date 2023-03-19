// deklarasi kelas sivitas akademik
public class SivitasAkademik extends Human {
  private String asalUniv; // atribut asal univ
  private String emailEdu; // atribut email edu

  SivitasAkademik() {
    // inisiasi dengan string kosong
    this.asalUniv = "";
    this.emailEdu = "";
  }

  SivitasAkademik(String nik, String nama, String jenisKelamin, String asalUniv, String emailEdu) {
    // inisiasi dengan value inputan
    super(nik, nama, jenisKelamin);
    this.emailEdu = emailEdu;
    this.asalUniv = asalUniv;
  }
  // getter & setter

  public String getemailEdu() {

    return this.emailEdu;
  }

  public String getasalUniv() {

    return this.asalUniv;
  }

  public void setemailEdu(String emailEdu) {

    this.emailEdu = emailEdu;
  }

  public void setasalUniv(String asalUniv) {

    this.asalUniv = asalUniv;
  }

}
