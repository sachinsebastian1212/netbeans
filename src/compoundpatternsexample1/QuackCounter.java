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
public class QuackCounter implements Quackable{

    Quackable duck;
    static int noOfQuacks;

    public QuackCounter(Quackable duck) {
        this.duck=duck;
    }
    
    
    @Override
    public void quack() {
        duck.quack();
        noOfQuacks++;
    }
    
    public static int getQuackCount(){
        return noOfQuacks;
    }

    @Override
    public void registerObserver(Observer observer) {
        duck.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        duck.notifyObservers();
    }
    
}
