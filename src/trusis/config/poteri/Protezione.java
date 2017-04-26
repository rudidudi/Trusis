package trusis.config.poteri;

import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.poteri.define.StdPotere;

public class Protezione extends StdPotere
{
    private String nome="Protezione";
    
    public Protezione()
    {
        setNome(nome);
    }
    @Override
    public List<Personaggio> esegui(List<Personaggio> personaggio)
    {
        personaggio.forEach((p)->{
            p.setKillable(false);
        });
        return personaggio;
    }
}
