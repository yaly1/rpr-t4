package ba.unsa.etf.rpr.tutorijal04;

import java.util.Set;

public class Predmet {
    private String naziv;
    private int brojECTSKredita;
    private Semestar semestar;
    private boolean obavezan;
    private Student[] studentiNaPredmetu;

    public Predmet(String naziv, int brojECTSKredita, Semestar semestar, boolean obavezan) {}

    private void dodajStudenta(Student student) {}

    private void brisiStudenta(Student student) {}

    public Set<Student> dajSpisakStudenata() {
        return null;
    }
}
