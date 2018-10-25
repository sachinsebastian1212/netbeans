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
    
    public void simulate(AbstractDuckFactory duckFactory){

        Quackable redHeadDuck = duckFactory.createRedHeadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        
        System.out.println("Duck Simulator: With Composite - Flocks");
        
        Flock flockOfDucks = new Flock();
        flockOfDucks.add(redHeadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);
        
        Flock flockOfMallards = new Flock();
        Quackable mallardOne = duckFactory.createMallardDuck();
        Quackable mallardTwo = duckFactory.createMallardDuck();
        Quackable mallardThree = duckFactory.createMallardDuck();
        Quackable mallardFour = duckFactory.createMallardDuck();
        
        flockOfMallards.add(mallardOne);
        flockOfMallards.add(mallardTwo);
        flockOfMallards.add(mallardThree);
        flockOfMallards.add(mallardFour);
        
        flockOfDucks.add(flockOfMallards);
        
        System.out.println("\nDuck simulator: Whole Flock Simulation");
        simulate(flockOfDucks);
        
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        
        System.out.println("\nDuck simulator: Mallard Flock Simulation");
        simulate(flockOfDucks);
        
        System.out.println("Ducks quacked " + QuackCounter.getQuackCount() + " times");
    }
    
    private void simulate(Quackable duck){
        duck.quack();
    }
}
