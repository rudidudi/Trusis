package trusis.config.poteri;

import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.poteri.define.StdPotere;

public class ScambioFazione extends StdPotere
{
    private String nome="ScambioFazione";
    
    public ScambioFazione()
    {
        setNome(nome);
    }
    
    @Override
    public Object esegui(List<Personaggio> personaggio)
    {
        personaggio.forEach((p)->{
            //if(!p.isImmuneNotte())
            p.setFazione(p.getFazione()=="Buoni"?"Cattivi":"Buoni");
        });
        return personaggio;
    }

}
