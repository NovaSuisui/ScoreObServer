/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreobserver;

import java.util.Scanner;

/**
 *
 * @author SK
 */
public class ScoreObServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ScoreSource scS = new ScoreSource();
        ScoreResult user1 = new ScoreResult();
        ScoreResult user2 = new ScoreResult();
        scS.register(user1);
        scS.register(user2);
        Scanner in = new Scanner(System.in);
        int i = 1;
        String sc = "";
        System.out.print("Enter Score "+i+" : ");
        sc = in.nextLine(); 
        while(!sc.isEmpty()){    
            scS.setScore(sc);
            i++;
            System.out.print("Enter Score "+i+" : ");
            sc = in.nextLine(); 
        }
    }
    
}
