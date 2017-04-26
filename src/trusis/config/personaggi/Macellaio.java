package trusis.config.personaggi;

import java.util.ArrayList;
import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.personaggi.define.stdPersonaggio;
import trusis.config.poteri.define.Potere;

public class Macellaio extends stdPersonaggio
{
    private String nome="Macellaio";
    private String fazione="Cattivi";
    private boolean vivo=true;
    private boolean killable=true;
    private List<Personaggio> conoscenti = new ArrayList<Personaggio>();
    
    public Macellaio(List<Potere> listPoteri)
    {
        setter(listPoteri);
    }
    public Macellaio()
    {
        List<Potere> poteriMacellaio = new ArrayList<Potere>();
        setter(poteriMacellaio);
    }
    private void setter(List<Potere> poteri)
    {
        setNome(nome);
        setFazione(fazione);
        setVivo(vivo);
        setKillable(killable);
        setPoteri(poteri);
        setConoscenti(conoscenti);
    }
}
