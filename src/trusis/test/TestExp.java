package trusis.test;

import java.io.IOException;

import org.junit.Test;

import trusis.config.experience.ExpDefiner;
import trusis.config.experience.ExpSettings;

public class TestExp
{
    public static final int EXP_PLAYER = 13000;
    public static final int LIVELLO_PLAYER = 50;
    public static final int LIVELLO_GAME = 45;
    public static final int LIVELLO_MEDIO = 10;
    public static final double MOLTIPLICATORE = 1.28;
    
    double tot=0D;
    @Test
    public void main() throws IOException
    {  
        System.out.println("ESPERIENZA ATTUALE GIOCATORE: " + EXP_PLAYER+"/"+ExpDefiner.xpMapTot.get(LIVELLO_PLAYER));
        int expMancante= ExpDefiner.xpMapTot.get(LIVELLO_PLAYER)-EXP_PLAYER;
        System.out.println("Esperenza per livello successivo: " + expMancante);
        System.out.println("Modificatore Livello: " + ExpSettings.getGameModifier(LIVELLO_GAME,LIVELLO_PLAYER));
        System.out.println("EXP per game di livello: " + LIVELLO_GAME + " : " + ExpDefiner.xpForGame.get(LIVELLO_GAME));    
        System.out.println("EXP per game con modificatore: " + LIVELLO_GAME + " : " + ExpDefiner.xpForGame.get(LIVELLO_GAME)*ExpSettings.getGameModifier(LIVELLO_GAME,LIVELLO_PLAYER));    
    }    
}
