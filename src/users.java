/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author MRX ASUS
 */
public class users {
    ArrayList<user> allusers = new ArrayList<>();
    
    boolean addUser(user newuser)
    {
        this.allusers.add(newuser);
        return true;
    }
    boolean removeUser(user toremove)
    {
        this.allusers.remove(toremove);
        return true;
    }
    boolean authenticateUser(String username, String password)
    {
        for(int i=0; i<allusers.size(); i++)
        {
            if(this.allusers.get(i).getUsername().equals(username) &&
                    this.allusers.get(i).getPassword().equals(password))
            {
                return true;
            }
        }
        return false;
    }
    user getUserbyUsername(String username)
    {
        for(int i=0; i<allusers.size(); i++)
        {
            if(this.allusers.get(i).getUsername().equals(username))
            {
                return this.allusers.get(i);
            }
            
        }
        return null;
        
    }
}
