package trusis.config.game;

public class Account
{
    private int livello;
    private String nome;
    
    public Account()
    {
        // TODO Auto-generated constructor stub
    }
    
    public Account(String nome, int livello)
    {
        this.nome=nome;
        this.livello=livello;
    }

    public int getLivello()
    {
        return livello;
    }

    public void setLivello(int livello)
    {
        this.livello = livello;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }  
}
