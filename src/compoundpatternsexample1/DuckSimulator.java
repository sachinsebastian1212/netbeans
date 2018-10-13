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
public class DuckSimulator {
    
    public void simulate(){
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable redHeadDuck = new QuackCounter(new RedHeadDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
        Quackable gooseDuck = new GooseAdapter(new Goose());
        
        System.out.println("Duck  Simulator");
        
        simulate(mallardDuck);
        simulate(redHeadDuck);
        simulate(duckCall);
        simulate(rubberDuck);
        simulate(gooseDuck);
        
        System.out.println("Ducks quacked " + QuackCounter.getQuackCount() + "times");
    }
    
    public void simulate(Quackable duck){
        duck.quack();
    }
}
