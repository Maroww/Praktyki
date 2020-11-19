public class uczen extends human
{
    int zachowanie;
    int ocena_matma;
    int ocena_polski;
    int ocena_chemia;

    public uczen(String imie, String nazwisko, int wiek, int wzrost, int waga, int zachowanie, int ocena_matma, int ocena_polski, int ocena_chemia) {
        super(imie, nazwisko, wiek, wzrost, waga);
        this.zachowanie = zachowanie;
        this.ocena_matma = ocena_matma;
        this.ocena_polski = ocena_polski;
        this.ocena_chemia = ocena_chemia;
    }

    public int getZachowanie() {
        return zachowanie;
    }

    public void setZachowanie(int zachowanie) {
        this.zachowanie = zachowanie;
    }

    public int getOcena_matma() {
        return ocena_matma;
    }

    public void setOcena_matma(int ocena_matma) {
        this.ocena_matma = ocena_matma;
    }

    public int getOcena_polski() {
        return ocena_polski;
    }

    public void setOcena_polski(int ocena_polski) {
        this.ocena_polski = ocena_polski;
    }

    public int getOcena_chemia() {
        return ocena_chemia;
    }

    public void setOcena_chemia(int ocena_chemia) {
        this.ocena_chemia = ocena_chemia;
    }
}
