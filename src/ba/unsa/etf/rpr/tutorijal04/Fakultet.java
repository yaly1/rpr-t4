package ba.unsa.etf.rpr.tutorijal04;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Fakultet {
    public Fakultet() {
        HashSet<Student> skupStudenata = new HashSet<>();
        Student s1 = new Student("ime1", "prezime1", 1);
        Student s2 = new Student("ime2", "prezime2", 2);
        Student s3 = new Student("ime3", "prezime3", 3);
        skupStudenata.add(s1);
        skupStudenata.add(s2);
        skupStudenata.add(s3);

        HashSet<Predmet> skupPredmeta = new HashSet<>();
        Predmet p1 = new Predmet("pred1", 6, true);
        Predmet p2 = new Predmet("pred2", 7, true);
        Predmet p3 = new Predmet("pred3", 8, true);
        Predmet p4 = new Predmet("pred4", 7, false);
        Predmet p5 = new Predmet("pred5", 6, false);
        Predmet p6 = new Predmet("pred6", 8, false);
        skupPredmeta.add(p1);
        skupPredmeta.add(p2);
        skupPredmeta.add(p3);
        skupPredmeta.add(p4);
        skupPredmeta.add(p5);
        skupPredmeta.add(p6);

        HashSet<Predmet> skupPredmetaZasp1 = new HashSet<>();
        skupPredmetaZasp1.add(p1);
        skupPredmetaZasp1.add(p2);
        skupPredmetaZasp1.add(p4);
        skupPredmetaZasp1.add(p5);

        HashSet<Predmet> skupPredmetaZasp2 = new HashSet<>();
        skupPredmetaZasp2.add(p1);
        skupPredmetaZasp2.add(p3);
        skupPredmetaZasp2.add(p4);
        skupPredmetaZasp2.add(p6);

        HashSet<Predmet> skupPredmetaZasp3 = new HashSet<>();
        skupPredmetaZasp3.add(p2);
        skupPredmetaZasp3.add(p3);
        skupPredmetaZasp3.add(p5);
        skupPredmetaZasp3.add(p6);

        HashMap<Integer, Set<Predmet>> predmetiZaPs1 = new HashMap<>();
        predmetiZaPs1.put(1, skupPredmetaZasp1);

        HashMap<Integer, Set<Predmet>> predmetiZaPs2 = new HashMap<>();
        predmetiZaPs1.put(2, skupPredmetaZasp2);

        HashMap<Integer, Set<Predmet>> predmetiZaPs3 = new HashMap<>();
        predmetiZaPs1.put(3, skupPredmetaZasp3);

        HashSet<PlanStudija> skupPlanoviStudija = new HashSet<>();
        PlanStudija ps1 = new PlanStudija(predmetiZaPs1);
        PlanStudija ps2 = new PlanStudija(predmetiZaPs2);
        PlanStudija ps3 = new PlanStudija(predmetiZaPs3);

        skupPlanoviStudija.add(ps1);
        skupPlanoviStudija.add(ps2);
        skupPlanoviStudija.add(ps3);

        HashSet<Upis> upisani = new HashSet<>();

        upisani.add(new Upis(s1, p1, ps1));
        upisani.add(new Upis(s1, p2, ps1));
        upisani.add(new Upis(s1, p4, ps1));
        upisani.add(new Upis(s1, p5, ps1));

        upisani.add(new Upis(s2, p2, ps3));
        upisani.add(new Upis(s2, p3, ps3));
        upisani.add(new Upis(s2, p5, ps3));
        upisani.add(new Upis(s2, p6, ps3));

        upisani.add(new Upis(s3, p1, ps2));
        upisani.add(new Upis(s3, p3, ps2));
        upisani.add(new Upis(s3, p4, ps2));
        upisani.add(new Upis(s3, p6, ps2));

        HashSet<Predmet> predmetiKojiSlusaS2 = new HashSet<>();
        for(Upis u: upisani) {
            if(u.getStudent() == s2) predmetiKojiSlusaS2.add(u.getPredmet());
        }

        HashSet<Student> studentiUpisaniNaP4 = new HashSet<>();
        for(Upis u: upisani) {
            if(u.getPredmet() == p4) studentiUpisaniNaP4.add(u.getStudent());
        }

        for(Student s: studentiUpisaniNaP4) {
            System.out.println(s);
        }
    }
}
