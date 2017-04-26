package trusis.config.personaggi;

import java.util.ArrayList;
import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.personaggi.define.stdPersonaggio;
import trusis.config.poteri.Spazzata;
import trusis.config.poteri.define.Potere;

public class Spazzino extends stdPersonaggio
{
    private String nome="Spazzino";
    private String fazione="Buoni";
    private boolean vivo=true;
    private boolean killable=true;
    private List<Personaggio> conoscenti = new ArrayList<Personaggio>();
    
    public Spazzino(List<Potere> listPoteri)
    {
        setter(listPoteri);
    }
    public Spazzino()
    {
        Spazzata spazzata = new Spazzata();
        List<Potere> poteriSpazzino = new ArrayList<Potere>();
        poteriSpazzino.add(spazzata);
        setter(poteriSpazzino);
        setConoscenti(conoscenti);
    }
    private void setter(List<Potere> poteri)
    {
        setNome(nome);
        setFazione(fazione);
        setVivo(vivo);
        setKillable(killable);
        setPoteri(poteri);
    }
}
