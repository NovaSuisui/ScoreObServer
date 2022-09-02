/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreobserver;

/**
 *
 * @author SK
 */
public class ScoreResult {
    public void update(ScoreSource S){
        System.out.println("user = "+S.getScore());
    }
}
