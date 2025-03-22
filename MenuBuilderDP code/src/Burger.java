/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author cse
 */
public abstract class Burger implements Item{
    
    public Packing packing(){
        return new Wrapper();
    }
    
    
}
