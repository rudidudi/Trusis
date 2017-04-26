package trusis.config.personaggi;

import java.util.ArrayList;
import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.personaggi.define.stdPersonaggio;
import trusis.config.poteri.define.Potere;

public class Umano extends stdPersonaggio
{
    private String nome="Umano";
    private String fazione="Buoni";
    private boolean vivo=true;
    private boolean killable=true;
    private List<Personaggio> conoscenti = new ArrayList<Personaggio>();
    
    public Umano(List<Potere> listPoteri)
    {
        setter(listPoteri);
    }
    public Umano()
    {
        List<Potere> poteriUmano = new ArrayList<Potere>();
        setter(poteriUmano);
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
