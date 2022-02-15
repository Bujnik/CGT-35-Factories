package main.female;

import main.Human;

public class FemaleFactory {
    public Human getPerson(int age){
        if (age < 13) return new KidGirl();
        else if (age < 20) return new TeenGirl();
        else return new Woman();
    }
}
