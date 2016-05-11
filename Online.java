/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package online;


public class Online {

    /**
     * @param args the command line arguments
     */
    static void display(Player[]pl)
    {

        System.out.println("Player Name : "+pl[0].getName());
        System.out.println("Team Name : "+pl[0].getTeam());
        System.out.println("Batting Average : "+pl[0].getBatAvg());
        System.out.println();
        System.out.println("Player Name : "+pl[1].getName());
        System.out.println("Team Name : "+pl[1].getTeam());
        System.out.println("Number of Goals : "+pl[1].getGoals());
        System.out.println();
        System.out.println("Player Name : "+pl[2].getName());
        System.out.println("Team Name : "+pl[2].getTeam());
        System.out.println("Batting Average : "+pl[2].getBatAvg());
        System.out.println("Bowling Average : "+pl[2].getBowlAvg());
        System.out.println();
        System.out.println("Player Name : "+pl[3].getName());
        System.out.println("Team Name : "+pl[3].getTeam());
        System.out.println("Number of Goals : "+pl[3].getGoals());

    }
    public static void main(String[] args) {
        Player pl[]=new Player[4];
        pl[0]=new Cricketer("Australia", 45.08, "Smith");
        pl[1]=new Footballer("Barcelona", 40, "Neymar");
        pl[2]=new Bowler(25.3, "England", 40.05, "Root");
        pl[3]=new Footballer("Barcelona",50,"Messi");
        display(pl);
    }
    
}
/*
Player Name: Smith
Team Name: Australia
Batting Average: 45.08

Player Name: Neymar
Team Name: Barcelona
Number of Goals: 40

Player Name: Root
Team Name: England
Batting Average: 40.05
Bowling Average: 25.3
*/
