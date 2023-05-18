package learn_design_patterns.creational.abstract_factory.drink_factory_example.ingredients;

public class BIngredient implements Ingredient {

    @Override
    public void add() {
        System.out.println("add ingredient B");
    }
}
