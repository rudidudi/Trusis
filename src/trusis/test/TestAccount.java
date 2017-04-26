package trusis.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import trusis.config.game.Account;

public class TestAccount
{
    public List<Account> getAccounts(int n){
        List<Account> accounts = new ArrayList<Account>();
        
        for(int i=1;i<n+1;i++){
            Account a = new Account("A"+i,1);
            accounts.add(a);
        }
        assertTrue((accounts.size()==n)?true:false);

        return accounts;
    }
}
