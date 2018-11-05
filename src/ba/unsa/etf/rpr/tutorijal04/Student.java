package ba.unsa.etf.rpr.tutorijal04;

import java.util.Set;

public class Student {
    private String ime, prezime;
    private Semestar semestar;
    private Predmet[] trenutniPredmeti;
    private boolean poPlanu = false;
    private int brojTrenutnihECTSKredita = 0;

    public Student(String ime, String prezime, Semestar semestar) {}

    public Set<Predmet> dajSpisakPredmeteZaOvajSemestar() {
        return null;
    }

    public void dodajPredmet(Predmet predmet) {}

    public void brisiPredmet(Predmet predmet) {}

    public void idiNaSljedeciSemestar() {}

    public void promjeniSemestar(Semestar semestar) {}

    public boolean ispoPlanu() {
        return false;
    }

    public int getbrojTrenutnihECTSKredita() {
        return 0;
    }

    @Override
    public String toString() {
        return "";
    }
}
