/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compoundpatternsexample1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author sachin
 */
public class Flock implements Quackable{

    ArrayList<Quackable> quackers = new ArrayList<>();
    
    public void add(Quackable quacker){
        quackers.add(quacker);
    }
    
    @Override
    public void quack() {
        Iterator<Quackable> iterator = quackers.iterator();
        
        while(iterator.hasNext()){
            Quackable quackable = iterator.next();
            quackable.quack();
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        for (Quackable quacker : quackers) {
            quacker.registerObserver(observer);
        }
    }

    @Override
    public void notifyObservers() {
//        for (Quackable quacker : quackers) {
//            quacker.notifyObservers();
//            
//        }
    }
}
