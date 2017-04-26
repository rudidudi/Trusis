package trusis.config.personaggi;

import java.util.ArrayList;
import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.personaggi.define.stdPersonaggio;
import trusis.config.poteri.VisioneDelVero;
import trusis.config.poteri.define.Potere;

public class Oracolo extends stdPersonaggio
{
    private String nome="Oracolo";
    private String fazione="Cattivi";
    private boolean vivo=true;
    private boolean killable=true;
    private List<Personaggio> conoscenti = new ArrayList<Personaggio>();
    
    public Oracolo(List<Potere> listPoteri)
    {
        setter(listPoteri);
    }
    public Oracolo()
    {
        VisioneDelVero visioneDelVero = new VisioneDelVero();
        List<Potere> poteriOracolo = new ArrayList<Potere>();
        poteriOracolo.add(visioneDelVero);
        setter(poteriOracolo);
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
