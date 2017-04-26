package trusis.config.experience;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class ExpDefiner extends ExpSettings {

    //MAP that defines how much exp is needed for level up
    public static Map<Integer, Integer> xpMap;
    static{
        Map<Integer, Integer> aMap = new LinkedHashMap<Integer,Integer>();
        exponentMap.forEach((k,v)->{
            Integer exp = (int) ExpUtils.round((ExpSettings.XP_FACTOR*(Math.pow(k,v))),0);
            aMap.put(k, exp);
        });     
        xpMap = Collections.unmodifiableMap(aMap);
    }
    
    //MAP that defines how many games a player have to do to level up
    public static Map<Integer, Double> levelUpGamesMap;
    static{
        Map<Integer, Double> aMap = new LinkedHashMap<Integer,Double>();
        ExpSettings.factorLvlMap.forEach((k,v)->{ 
            double asd= 0D;
            asd =ExpUtils.logOfBase(k,v);
            aMap.put(k, asd );
            
        });
        aMap.replace(1, 1D);
        aMap.replace(2, 1.1D);
        levelUpGamesMap = Collections.unmodifiableMap(aMap);
        //override first and second argument.

    }
    
    //MAP that defines how much exp you get for a game
    public static Map<Integer,Integer> xpForGame;   
    static{  
        Map<Integer, Integer> aMap = new LinkedHashMap<Integer,Integer>();
        for(int counter = LEVEL_MIN; counter <= LEVEL_MAX;counter++){
            int xpForGame = (int) (xpMap.get(counter)/levelUpGamesMap.get(counter));
            aMap.put(counter, xpForGame);
        } 
        xpForGame = Collections.unmodifiableMap(aMap);
    }  
}