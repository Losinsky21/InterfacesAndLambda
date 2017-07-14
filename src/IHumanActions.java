import java.util.ArrayList;

public interface IHumanActions {

    boolean canMove();
    boolean isDead();

    ArrayList<Human.WorkActions> getWorkArray();
    ArrayList<Human.UseActions> getUseArray();
    ArrayList<Human.EatActions> getEatArray();
    ArrayList<Human.DrinkActions> getDrinkArray();

    Human.WorkActions addWorkAction(String _action);
    Human.EatActions addEatAction(String _action);
    Human.UseActions addUseAction(String _action);
    Human.DrinkActions addDrinkAction(String _acttion);

}