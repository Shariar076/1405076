/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package online;

/**
 *
 * @author user
 */
public class Player 
{
    String Name;

    public Player(String Name) {
        this.Name = Name;
    }
    String getName()
    {
        return Name;
    }
    
    String getClub(){
        return null;
    }
    int getGoals()
    {
        return 0;   
    }
    String getTeam()
    {
        return null;
    }
    double getBatAvg()
    {
        return 0;
    }
    
    double getBowlAvg()
    {
        return 0;
    }
    
}
