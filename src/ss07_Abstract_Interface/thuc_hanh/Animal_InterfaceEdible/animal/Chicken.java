package ss07_Abstract_Interface.thuc_hanh.Animal_InterfaceEdible.animal;

import ss07_Abstract_Interface.thuc_hanh.Animal_InterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: O` O' O O` O";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
