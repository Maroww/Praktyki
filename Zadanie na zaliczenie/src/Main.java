public class Main
{
    public static void main (String[] args) {
        System.out.println("Tworzenie klas i objektów w javie");
        uczen uczen1 = new uczen("Paweł","Wiszniewski",18,175, 60,5,2,2,6);
        System.out.println("Dane ucznia");
        System.out.println("Imię "+uczen1.getImie());
        System.out.println("Nazwisko "+uczen1.getNazwisko());
        System.out.println("Wiek "+uczen1.getWiek());
        System.out.println("Wzrost "+uczen1.getWzrost());
        System.out.println("Waga "+uczen1.getWaga());
        System.out.println("Zachowanie "+uczen1.getZachowanie());
        System.out.println("Ocena z matematyki "+uczen1.getOcena_matma());
        System.out.println("Ocena z polskiego "+uczen1.getOcena_polski());
        System.out.println("Ocena z Chemii "+uczen1.getOcena_chemia()+"\n");



        Mechanik mechanik1 = new Mechanik("Leszek","Kinder",45,180,80,5500,12,100, "Wyższa szkoła plakatów z gołymi babami, imienia Janusza Kabzińskiego");
                System.out.println("Dane mechanika");
                System.out.println("Imię "+mechanik1.getImie());
                System.out.println("Nazwisko "+mechanik1.getNazwisko());
                System.out.println("Wiek "+mechanik1.getWiek());
                System.out.println("Wzrost "+mechanik1.getWzrost());
                System.out.println("Waga "+mechanik1.getWaga());
                System.out.println("Zarobek "+mechanik1.getZarobek());
                System.out.println("Lata doświadczenia "+mechanik1.getLata_doświadczenia());
                System.out.println("Ilość plakatów gołych bab na ścianie "+mechanik1.getIlość_plakatów_gołych_bab_na_ścianie());
                System.out.println("Skończona szkoła "+mechanik1.getSkończona_szkoła());

    }
}

