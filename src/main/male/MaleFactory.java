package main.male;

import main.AbstractFactory;
import main.Human;

public class MaleFactory implements AbstractFactory {

    @Override
    public Human getPerson(int age){
        if (age < 13) return new KidBoy();
        else if (age < 20) return new TeenBoy();
        else return new Man();
    }
}
