package trusis.config.game.define;

import java.util.List;

import trusis.config.personaggi.define.Personaggio;

public class StandardGame  
{
  static public List<Personaggio> getStdPersonaggi(int n)
  {      
      return  StandardGamePersonaggi.StandardGamePersonaggi().subList(0, n);
  }
  
}
