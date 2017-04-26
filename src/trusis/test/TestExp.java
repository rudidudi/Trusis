package trusis.test;

import java.io.IOException;

import org.junit.Test;

import trusis.config.experience.ExpDefiner;

public class TestExp
{
    public static final int LIVELLO = 10;
    double tot=0D;
    @Test
    public void main() throws IOException
    {
  
        System.out.println("GAME TO LEVEL UP");
        ExpDefiner.levelUpGamesMap.forEach((k,v)->{
            tot=tot+v;
            System.out.println(k + " : " + v + " = " + tot);
            
        });

        System.out.println("");
        System.out.println("EXP TO LEVEL UP");
        ExpDefiner.xpMap.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });
        
        System.out.println("");
        System.out.println("EXP FOR A  GAME");
        ExpDefiner.xpForGame.forEach((k,v)->{
            System.out.println(k + " : " + v);
        });
        
        System.out.println("TEST SOMETHING");
        
        
    }
    
    
}
