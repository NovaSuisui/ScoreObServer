/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scoreobserver;

import java.util.ArrayList;

/**
 *
 * @author SK
 */
public class ScoreSource {
    private ArrayList<ScoreResult> scRe;
    private String scData;
    public ScoreSource(){
        this.scRe = new ArrayList<ScoreResult>();
    }
    public void setScore(String scData){
        this.scData = scData;
        System.out.println("Score = "+scData);
        notifyAllUser();
    }
    public String getScore(){
        return scData;
    }
    public void register(ScoreResult user){
        scRe.add(user);
    }
    public void notifyAllUser(){
        for(int i=0; i < scRe.size(); i++){
            scRe.get(i).update(this);
        }
    }
    
}
