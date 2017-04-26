package trusis.config.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import trusis.config.game.define.StandardGame;
import trusis.config.personaggi.define.Personaggio;

public class Partita extends PartitaAbstract
{
    protected List<Personaggio> personaggi = new ArrayList<Personaggio>();
    private List<Fase> fasi = new ArrayList<Fase>();
    protected List<Account> account = new ArrayList<Account>();
    protected Map<Account, Personaggio> player= new HashMap<Account,Personaggio>();
    
    public Partita()
    {
        
    }
    
    public Partita(List<Personaggio> listPersonaggi, List<Account> listAccount){
        personaggi = listPersonaggi;
        account = listAccount;
    }
   
    public Partita(List<Account> listAccount){
        personaggi = StandardGame.getStdPersonaggi(listAccount.size());
    }
    
    @SuppressWarnings("unused")
    private void starter()
    {
        /*
         * Associa Account ad un Ruolo
         */
        associaPlayer();
        
        /*
         * Set conoscenza fra i truis e profanatrice
         */
        conoscenzaTrusis();
    }

    private void associaPlayer()
    {
        //TODO
        long randomizer = System.nanoTime();
        Collections.shuffle(account, new Random(randomizer));
        
        for(int i=0;i<account.size();i++){
            personaggi.get(i).setAccount(account.get(i));
        }
    }

    private void conoscenzaTrusis()
    {
        List<Personaggio> trusis = new ArrayList<Personaggio>();
        //Trova tutti i trusis e profanatrici
        personaggi.forEach((personaggio)->{
            if(personaggio.getNome().equals("Trusis")||personaggio.getNome().equals("Profanatrice")){
                trusis.add(personaggio);
            }
        });
        //Set conoscenza dei trusis
        personaggi.forEach((personaggio)->{
            if(personaggio.getNome().equals("Trusis")){
                personaggio.setConoscenti(trusis);
            }
        }); 
    }

    public void setPersonaggi(List<Personaggio> personaggi)
    {
        this.personaggi = personaggi;
    }
    
    public List<Personaggio> getPersonaggi()
    {
        return personaggi;
    }
    
    public List<Fase> getFasi()
    {
        return fasi;
    }

    public void setFasi(List<Fase> fasi)
    {
        this.fasi = fasi;
    }

}
