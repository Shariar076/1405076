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
public class Cricketer extends Player
{
    String team;
    double battingAvg;

    public Cricketer(String team, double battingAvg, String Name) {
        super(Name);
        this.team = team;
        this.battingAvg = battingAvg;
    }
    String getName()
    {
        return super.getName();
    }
    String getTeam()
    {
        return team;
    }
    double getBatAvg()
    {
        return battingAvg;
    }  
            
}
