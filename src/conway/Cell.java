/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conway;

/**
 *
 * @author janosfalke
 */
public class Cell {
    boolean exists;
    
    public Cell(boolean exists){
        this.exists = exists;
    }
    
    public void isCell(boolean exists){
        this.exists = exists;
    }
    
    public boolean isAlive(){
        return this.exists;
    }
    
    public boolean getCell(){
        return this.exists;
    }
    
    
}
