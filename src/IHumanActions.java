public interface IHumanActions {

    boolean canMove();
    boolean isDead();
    float work(int n);
    float use(int n);
    float drink(int n);
    float eat(int n);
}
