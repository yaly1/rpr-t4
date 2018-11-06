package ba.unsa.etf.rpr.tutorijal04;

public class Upis {
    private Student student;
    private Predmet predmet;
    private PlanStudija planStudija;

    public Upis(Student student, Predmet predmet, PlanStudija planStudija) {
        this.student = student;
        this.predmet = predmet;
        this.planStudija = planStudija;
    }

    public Student getStudent() {
        return student;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public PlanStudija getPlanStudija() {
        return planStudija;
    }
}
