package trusis.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import trusis.config.game.Fase;
import trusis.config.game.Partita;
import trusis.config.personaggi.Spazzino;
import trusis.config.personaggi.Trusis;
import trusis.config.personaggi.define.Personaggio;


public class TestGame
{
    Spazzino spazz=null;
    Trusis truso = null;
    
    @Test
    public void main(){
     
     TestAccount testAccount = new TestAccount();
        
     Partita game1= new Partita(testAccount.getAccounts(8));
     Map<Personaggio, List<Personaggio>> poteri= new HashMap<Personaggio, List<Personaggio>>();
     Map<Personaggio, List<Personaggio>> voti= new HashMap<Personaggio, List<Personaggio>>();
   
     
     
     game1.getPersonaggi().forEach((p)->{
         if(p.getNome().equals("Spazzino")){
             spazz=(Spazzino) p;
         }    
         if(p.getNome().equals("Trusis")){
             truso = (Trusis) p;
         }    
     });

     List<Personaggio> sondate = new ArrayList<Personaggio>();
     sondate.add(truso);
     poteri.put(spazz, sondate);
     
     Fase fase1= new Fase("GIORNO", game1.getPersonaggi(), voti, poteri);
     //fase1.esegui();
     game1.getFasi().add(fase1);       
     
    }
}
