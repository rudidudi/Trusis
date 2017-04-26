package trusis.config.poteri;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import trusis.config.personaggi.define.Personaggio;
import trusis.config.poteri.define.StdPotere;

public class Spazzata extends StdPotere
{
    private Map<Personaggio,String> results = new HashMap<Personaggio,String>();
    private String nome="Spazzata";

    public Spazzata()
    {
        setNome(nome);
    }
    
    @Override
    public Map<Personaggio, String> esegui(List<Personaggio> personaggio)
    {
        Map<Personaggio,String> result = new HashMap<Personaggio,String>();
        personaggio.forEach((p)->{
            if(p.getNome().equals("Trusis")){
                result.put(p, "Trusis");
            }
            else if(p.getNome().equals("Naufrago")){
                result.put(p, "Naufrago");
            }
            else{
                result.put(p, "Non Trusis");
            }
        });
        results.putAll(result);
        return result;
    }
    
    public Map<Personaggio, String> getResults()
    {
        return results;
    }

    public void setResults(Map<Personaggio, String> results)
    {
        this.results = results;
    }
}
