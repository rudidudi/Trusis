package trusis.config.game;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import trusis.config.personaggi.define.Personaggio;

public class Fase extends Partita
{
    private String tipoFase="";//Notte/Giorno
    private Map<Personaggio, List<Personaggio>> voti= new HashMap<Personaggio, List<Personaggio>>();
    private Map<Personaggio, List<Personaggio>> poteri= new HashMap<Personaggio, List<Personaggio>>();
    
    public Fase(String tipoFase,List<Personaggio> personaggi,Map<Personaggio, List<Personaggio>> voti, Map<Personaggio, List<Personaggio>> poteri)
    {
        setTipoFase(tipoFase);
        setPersonaggi(personaggi);
        setVoti(voti);
        setPoteri(poteri);
    }

    public void esegui(){
        
        if(tipoFase.equals("GIORNO")){
            doPoteri(personaggi,poteri);
            doGiorno(personaggi,voti);
        };
        if(tipoFase.equals("NOTTE")){
            doPoteri(personaggi,poteri);
            doNotte(personaggi,voti);
        };
    }
    private void doPoteri(List<Personaggio> personaggi, Map<Personaggio, List<Personaggio>> poteri)
    {
        if(poteri!=null)
        poteri.forEach((k,v)->{
          k.getPoteri().forEach((potere)->{
                  potere.esegui(poteri.get(k));
          });  
        });
    }
    private void doGiorno(List<Personaggio> personaggi, Map<Personaggio, List<Personaggio>> voti)
    {
        // TODO Auto-generated method stub
        
    }
    private void doNotte(List<Personaggio> personaggi, Map<Personaggio, List<Personaggio>> voti)
    {
        // TODO Auto-generated method stub
        
    }
    
    public String getTipoFase()
    {
        return tipoFase;
    }
    public void setTipoFase(String tipoFase)
    {
        this.tipoFase = tipoFase;
    }
    public List<Personaggio> getPersonaggi()
    {
        return personaggi;
    }
    public void setPersonaggi(List<Personaggio> personaggi)
    {
        this.personaggi = personaggi;
    }
    public Map<Personaggio, List<Personaggio>> getVoti()
    {
        return voti;
    }
    public void setVoti(Map<Personaggio, List<Personaggio>> voti)
    {
        this.voti = voti;
    }
    public Map<Personaggio, List<Personaggio>> getPoteri()
    {
        return poteri;
    }
    public void setPoteri(Map<Personaggio, List<Personaggio>> poteri)
    {
        this.poteri = poteri;
    }

}
