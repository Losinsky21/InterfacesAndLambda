import java.lang.reflect.Array;
import java.util.ArrayList;

public interface IHumanActions {

    boolean canMove();
    boolean isDead();
    float work(int n);
    float use(int n);
    float drink(int n);
    float eat(int n);

    ArrayList<Human.WorkActions> getWorkArray();
    ArrayList<Human.UseActions> getUseArray();
    ArrayList<Human.EatActions> getEatArray();
    ArrayList<Human.DrinkActions> getDrinkArray();

}
