package ba.unsa.etf.rpr.tutorijal04;

public class Student {
    private String ime, prezime;
    private int brojIndeksa;

    public Student(String ime, String prezime, int brojIndeksa) {
        this.ime = ime;
        this.prezime = prezime;
        this.brojIndeksa = brojIndeksa;
    }

    @Override
    public String toString() {
        return prezime +
                " "  + ime +
                " (" + brojIndeksa + ')';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return brojIndeksa == student.brojIndeksa;
    }
}
