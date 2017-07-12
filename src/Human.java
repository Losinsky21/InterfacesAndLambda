import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;

public class Human implements IHumanActions{

    private String s_name;
    private int i_age;
    private int i_healthPoints;
    private ArrayList<WorkActions> workArray = new ArrayList<>();
    private ArrayList<UseActions> useArray = new ArrayList<>();
    private ArrayList<DrinkActions> drinkArray = new ArrayList<>();
    private ArrayList<EatActions> eatArray = new ArrayList<>();

    public class WorkActions
    {
        String s_action;

        public WorkActions(String _action)
        {
            s_action = _action;
        }

        public void removeAction()
        {
            workArray.remove(this);
        }

        public void addAction()
        {
            workArray.add(this);
        }

        @Override
        public String toString()
        {
            return s_name + " - " + i_age + " - " + s_action;
        }

    }

    class UseActions
    {
        String s_action;

        public UseActions(String _action)
        {
            this.s_action = _action;
        }

        public void addAction()
        {
            useArray.add(this);
        }

        public void removeUseAction()
        {
            useArray.remove(this);
        }

        @Override
        public String toString()
        {
            return s_name + " - " + i_age + " - " + s_action;
        }

    }

    class DrinkActions
    {
        String s_action;

        public DrinkActions(String _action)
        {
            this.s_action = _action;
        }

        public void addAction()
        {
            drinkArray.add(this);
        }

        public void removeDrinkAction()
        {
            drinkArray.remove(this);
        }

        @Override
        public String toString()
        {
            return s_name + " - " + i_age + " - " + s_action;
        }
    }

    class EatActions
    {
        private String s_action;

        public EatActions(String _action)
        {
            this.s_action = _action;
        }

        public void addAction()
        {
            eatArray.add(this);
        }

        public void removeEatAction()
        {
            eatArray.remove(this);
        }

        @Override
        public String toString()
        {
            return s_name + " - " + i_age + " - " + s_action;
        }
    }

    public Human(String _s_name, int _i_age)
    {
        this.s_name = _s_name;
        this.i_age = _i_age;
        i_healthPoints = 100;
    }

    public WorkActions addWorkAction(String _action)
    {
        WorkActions action = new WorkActions(_action);
        action.addAction();
        return action;
    }

    public EatActions addEatAction (String _action)
    {
        EatActions action = new EatActions(_action);
        action.addAction();
        return action;
    }

    public UseActions addUseAction(String _action)
    {
        UseActions action = new UseActions(_action);
        action.addAction();
        return action;
    }

    public DrinkActions addDrinkAction (String _action)
    {
        DrinkActions action = new DrinkActions(_action);
        action.addAction();
        return action;
    }

    @Override
    public boolean canMove() {
        return i_healthPoints > 0;
    }

    @Override
    public boolean isDead() {
        return i_healthPoints <= 0;
    }

    @Override
    public float work(int n) {
        return 0;
    }

    @Override
    public float use(int n) {
        return 0;
    }

    @Override
    public float drink(int n) {
        return 0;
    }

    @Override
    public float eat(int n) {
        return 0;
    }

    public ArrayList<WorkActions> getWorkArray ()
    {
        return workArray;
    }

    public ArrayList<UseActions> getUseArray ()
    {
        return useArray;
    }

    public ArrayList<DrinkActions> getDrinkArray ()
    {
        return drinkArray;
    }

    public ArrayList<EatActions> getEatArray ()
    {
        return eatArray;
    }
}
