package ba.unsa.etf.rpr.tutorijal04;

import java.util.Objects;

public class Predmet {
    private String naziv;
    private int brojECTSKredita;
    private boolean obavezan;

    public Predmet(String naziv, int brojECTSKredita, boolean obavezan) {
        this.naziv = naziv;
        this.brojECTSKredita = brojECTSKredita;
        this.obavezan = obavezan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predmet predmet = (Predmet) o;
        return brojECTSKredita == predmet.brojECTSKredita &&
                obavezan == predmet.obavezan &&
                Objects.equals(naziv, predmet.naziv);
    }
}
