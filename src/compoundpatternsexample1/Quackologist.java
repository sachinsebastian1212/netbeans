/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundpatternsexample1;

/**
 *
 * @author sachi
 */
public class Quackologist implements Observer{

    @Override
    public void update(QuackObservable duck) {
        System.out.println("Quackologist: "+ duck.getClass().getSimpleName() + " just quacked .");
    }
    
}
