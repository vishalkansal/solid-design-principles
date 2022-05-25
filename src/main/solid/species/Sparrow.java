package main.solid.species;

import main.solid.entity.Bird;
import main.solid.fly.Fylable;

public class Sparrow extends Bird implements Fylable {

    public void fly(){
        System.out.println("In sparrow");
    }

}
