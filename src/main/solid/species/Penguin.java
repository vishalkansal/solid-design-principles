package main.solid.species;

import main.solid.entity.Bird;
import main.solid.fly.Fylable;

public class Penguin extends Bird  implements Fylable {

    public void fly(){
        System.out.println("In Penguin");
    }

}
