package main;

import main.female.FemaleFactory;
import main.male.MaleFactory;

public class FactoryProducer {
    public static enum HumanFactoryType{
        MALE,
        FEMALE
    }
    public static AbstractFactory getFactory(HumanFactoryType type) {
        switch (type){
            case MALE: return new MaleFactory();
            case FEMALE: return new FemaleFactory();
            default: return null;
        }
    }
}
