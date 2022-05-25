package main.solid;

import main.solid.entity.Bird;
import main.solid.fly.Fylable;
import main.solid.species.Penguin;

public class Main {
    public static void main(String[] args) {
        Fylable f = new Penguin();
        f.fly();
    }
}
