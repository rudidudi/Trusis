package trusis.config.poteri;

import java.util.ArrayList;
import java.util.List;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.poteri.define.StdPotere;

public class VisioneDelVero extends StdPotere
{
    private List<Personaggio> results = new ArrayList<Personaggio>();
    public List<Personaggio> getResults()
    {
        return results;
    }

    public void setResults(List<Personaggio> results)
    {
        this.results = results;
    }

    private String nome="VisioneDelVero";

    public VisioneDelVero()
    {
        setNome(nome);
    }
    
    @Override
    public List<Personaggio> esegui(List<Personaggio> personaggio)
    {
        List<Personaggio> result = new ArrayList<Personaggio>();
        personaggio.forEach((p)->{
            result.add(p);
        });
        results.addAll(result);
        return result;
    }
}
