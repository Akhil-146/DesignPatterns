package decorator.base;

import decorator.Ingredient;

public class MangoCone implements Ingredient {
    @Override
    public double getCost() {
        return 15;
    }

    @Override
    public String getDescription() {
        return "Mango Cone";
    }
}
