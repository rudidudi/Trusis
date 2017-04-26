package trusis.config.poteri;

import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.poteri.define.StdPotere;

public class UccisioneNotturna extends StdPotere
{
    private String nome="UccisioneNotturna";
    
    public UccisioneNotturna()
    {
        setNome(nome);
    }

    @Override
    public List<Personaggio> esegui(List<Personaggio> personaggio)
    {
        personaggio.forEach((p)->{
            if(p.isKillable())
            p.setVivo(false);
        });
        return personaggio;
    }
}