package trusis.config.poteri.define;

import java.util.List;

import trusis.config.personaggi.define.Personaggio;

public class StdPotere extends Potere
{
    private String nome="";
    @Override
    public String getNome()
    {
        return nome;
    }

    @Override
    public void setNome(String nome)
    {
        this.nome=nome;   
    }

    @Override
    public Object esegui(List<Personaggio> per)
    {
        return null;
    }

}
