package Gra.Swiat.Organizm.Zwierzeta.Gatunki;

import Gra.Swiat.Organizm.Zwierzeta.Zwierze;
import Gra.Swiat.Swiat;

import java.util.Objects;

public class Owca extends Zwierze {

    private String typeName = "Owca";
    private int sila = 4;
    private int inicjatywa = 4;

    public Owca(int[] polozenie, Swiat jakiSwiat) {
        super(polozenie, jakiSwiat);
    }

    @Override
    public String getTypeName() {
        return typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Owca owca = (Owca) o;
        return sila == owca.sila &&
                inicjatywa == owca.inicjatywa;
    }

    @Override
    public int hashCode() {
        return Objects.hash(sila, inicjatywa);
    }

    @Override
    protected void rysowanie() {

    }

}
