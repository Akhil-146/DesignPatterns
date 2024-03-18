package decorator.custom;

import decorator.Ingredient;
import decorator.IngredientDecorator;

public class StrawberrySyrup extends IngredientDecorator {
    public StrawberrySyrup(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + " + Strawberry Syrup ";
    }
}
