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
public class Bowler extends Cricketer
{
    double bowlingAvg;

    public Bowler(double bowlingAvg, String team, double battingAvg, String Name) {
        super(team, battingAvg, Name);
        this.bowlingAvg = bowlingAvg;
    }
    String getName()
    {
        return super.getName();
    }
    String getTeam()
    {
        return super.getTeam();
    }
    double getBatAvg()
    {
        return super.getBatAvg();
    }
    double getBowlAvg()
    {
        return bowlingAvg;
    }
            
}
