package trusis.config.personaggi.define;

import java.util.List;

import trusis.config.game.Account;
import trusis.config.poteri.define.Potere;

public interface PersonaggioInterf
{
    public String getNome();
    public void setNome(String nome);
    //
    public void setPoteri(List<Potere> listPoteri);
    public List<Potere> getPoteri();
    //
    public String getFazione();
    public void setFazione(String fazione);
    //
    public boolean isVivo();
    public void setVivo(boolean vivo);
    //
    public boolean isKillable();
    public void setKillable(boolean killable);
    //
    public List<Personaggio> getConoscenti();
    public void setConoscenti(List<Personaggio> personaggio);
    //
    public Account getAccount();
    public void setAccount(Account account);
}
