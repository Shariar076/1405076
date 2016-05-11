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
public class Footballer extends Player
{
    String club;
    int goalCount;

    public Footballer(String club, int goalCount, String Name) {
        super(Name);
        this.club = club;
        this.goalCount = goalCount;
    }
    String getName()
    {
        return super.getName();
    }
    String getTeam()
    {
        return club;
    }
    int getGoals()
    {
        return goalCount;
    }
            
}
