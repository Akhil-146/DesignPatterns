package decorator;

public abstract class IngredientDecorator implements Ingredient {
    protected Ingredient baseIngredient;

    public IngredientDecorator(Ingredient baseIngredient) {
        this.baseIngredient = baseIngredient;
    }
}
