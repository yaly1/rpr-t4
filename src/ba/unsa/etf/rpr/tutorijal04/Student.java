package ba.unsa.etf.rpr.tutorijal04;

public class Student {
    private String ime, prezime;
    private int brojSemestra = 1;
    private Predmet[] trenutniPredmeti;
    private boolean jeliPoPlanu = false;

    public Student(String ime, String prezime, int brojSemestra) {}

    public void dodajPredmet(Predmet predmet) {}

    public void brisiPredmet(Predmet predmet) {}

    public void idiNaSljedeciSemestar() {}

    @Override
    public String toString() {
        return "";
    }
}
