package trusis.config.game.define;

import java.util.ArrayList;
import java.util.List;

import trusis.config.personaggi.Spazzino;
import trusis.config.personaggi.Trusis;
import trusis.config.personaggi.Umano;
import trusis.config.personaggi.define.Personaggio;

public class StandardGamePersonaggi
{
    
    public static List<Personaggio> StandardGamePersonaggi()
    {
        List<Personaggio> personaggiStandard = new ArrayList<Personaggio>();
        Personaggio Umano1 = new Umano();
        Personaggio Umano2 = new Umano();
        Personaggio Umano3 = new Umano();
        Personaggio Umano4 = new Umano();
        Personaggio Umano5 = new Umano();
        Personaggio Trusis1= new Trusis();
        Personaggio Trusis2= new Trusis();
        Personaggio spazzino1= new Spazzino();

        personaggiStandard.add(Umano1);
        personaggiStandard.add(Umano2);
        personaggiStandard.add(Umano3);
        personaggiStandard.add(Umano4);
        personaggiStandard.add(Umano5);
        personaggiStandard.add(Trusis1);
        personaggiStandard.add(Trusis2);
        personaggiStandard.add(spazzino1);
        return personaggiStandard;
    }
}
