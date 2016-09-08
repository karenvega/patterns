/**
 * Created by karenvega on 8/09/16.
 */
public class ModelDuck extends Duck {

    public ModelDuck () {
        flyBehaviour = new FlyNoWay();
        quackBehaviour = new Quack();
    }
    @Override
    public void display() {

    }
}
