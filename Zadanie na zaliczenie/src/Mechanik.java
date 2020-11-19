public class Mechanik extends human
{
    int zarobek;
    int lata_doświadczenia;
    int ilość_plakatów_gołych_bab_na_ścianie;
    String skończona_szkoła;

    public Mechanik(String imie, String nazwisko, int wiek, int wzrost, int waga, int zarobek, int lata_doświadczenia, int ilość_plakatów_gołych_bab_na_ścianie, String skończona_szkoła) {
        super(imie, nazwisko, wiek, wzrost, waga);
        this.zarobek = zarobek;
        this.lata_doświadczenia = lata_doświadczenia;
        this.ilość_plakatów_gołych_bab_na_ścianie = ilość_plakatów_gołych_bab_na_ścianie;
        this.skończona_szkoła = skończona_szkoła;
    }

    public int getZarobek() {
        return zarobek;
    }

    public void setZarobek(int zarobek) {
        this.zarobek = zarobek;
    }

    public int getLata_doświadczenia() {
        return lata_doświadczenia;
    }

    public void setLata_doświadczenia(int lata_doświadczenia) {
        this.lata_doświadczenia = lata_doświadczenia;
    }

    public int getIlość_plakatów_gołych_bab_na_ścianie() {
        return ilość_plakatów_gołych_bab_na_ścianie;
    }

    public void setIlość_plakatów_gołych_bab_na_ścianie(int ilość_plakatów_gołych_bab_na_ścianie) {
        this.ilość_plakatów_gołych_bab_na_ścianie = ilość_plakatów_gołych_bab_na_ścianie;
    }

    public String getSkończona_szkoła() {
        return skończona_szkoła;
    }

    public void setSkończona_szkoła(String skończona_szkoła) {
        this.skończona_szkoła = skończona_szkoła;
    }
}
