package trusis.config.personaggi.define;

import java.util.ArrayList;
import java.util.List;

import trusis.config.game.Account;
import trusis.config.poteri.define.Potere;

public class stdPersonaggio extends Personaggio
{  
    private String nome="";
    private String fazione="";
    private boolean vivo=true;
    private boolean killable=true;
    private List<Potere> poteri = new ArrayList<Potere>();
    private List<Personaggio> conoscenti = new ArrayList<Personaggio>();
    private Account account= new Account();
    @Override
    public void setPoteri(List<Potere> listPoteri)
    {
        this.poteri.addAll(listPoteri);
    }
    
    public List<Potere> getPoteri()
    {
        return poteri;
    }
    
    @Override
    public String getNome()
    {
        return nome;
    }
    
    @Override
    public void setNome(String nome)
    {
        this.nome = nome;
    }

    @Override
    public String getFazione()
    {
        return fazione;
    }

    @Override
    public void setFazione(String fazione)
    {
       this.fazione=fazione;
    }
    
    public boolean isVivo()
    {
        return vivo;
    }

    public void setVivo(boolean vivo)
    {
        this.vivo = vivo;
    }
    
    public boolean isKillable()
    {
        return killable;
    }
    
    public void setKillable(boolean killable)
    {
        this.killable = killable;
    }

    @Override
    public List<Personaggio> getConoscenti()
    {
        return conoscenti;
    }

    @Override
    public void setConoscenti(List<Personaggio> personaggio)
    {
        this.conoscenti=personaggio;
        
    }

    public Account getAccount()
    {
        return account;
    }

    public void setAccount(Account account)
    {
        this.account = account;
    }

}
