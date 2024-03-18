package decorator.custom;

import decorator.Ingredient;
import decorator.IngredientDecorator;

public class MangoScoop extends IngredientDecorator {
    public MangoScoop(Ingredient baseIngredient) {
        super(baseIngredient);
    }

    @Override
    public double getCost() {
        return baseIngredient.getCost() + 40;
    }

    @Override
    public String getDescription() {
        return baseIngredient.getDescription() + " + Mango Scoop";
    }
}
