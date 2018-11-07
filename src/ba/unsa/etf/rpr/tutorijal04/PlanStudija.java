package ba.unsa.etf.rpr.tutorijal04;

import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class PlanStudija {
    private Map<Integer, Set<Predmet>> planoviStudija;

    public PlanStudija(Map<Integer, Set<Predmet>> planoviStudija) {
        this.planoviStudija = planoviStudija;
    }

    public Map<Integer, Set<Predmet>> getPlanoviStudija() {
        return planoviStudija;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanStudija that = (PlanStudija) o;
        return Objects.equals(planoviStudija, that.planoviStudija);
    }
}
