package trusis.config.poteri.define;

import java.util.List;

import trusis.config.personaggi.define.Personaggio;

public interface PotereInterf
{
    public String getNome();
    public void setNome(String nome);
    public Object esegui(List<Personaggio> per);
}
