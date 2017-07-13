import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.Random;

public class Human implements IHumanActions{

    private String s_name;
    private int i_age;
    private int i_healthPoints;
    private ArrayList<WorkActions> workArray = new ArrayList<>();
    private ArrayList<UseActions> useArray = new ArrayList<>();
    private ArrayList<DrinkActions> drinkArray = new ArrayList<>();
    private ArrayList<EatActions> eatArray = new ArrayList<>();
    private Random random = new Random();

    public class WorkActions
    {
        private String s_action;
        private int i_points;

        public WorkActions(String _action)
        {
            s_action = _action;
            i_points = random.nextInt(31)-32;
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
            return s_name + "\t|\t" + i_age + "\t|\t" + s_action + "\t|\t" +i_points+"\n";
        }

    }

    public class UseActions
    {
        private String s_action;
        private int i_points;

        public UseActions(String _action)
        {
            this.s_action = _action;
            this.i_points = random.nextInt(11)-12;
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

    public class DrinkActions
    {
        private String s_action;
        private int i_points;

        public DrinkActions(String _action)
        {
            this.s_action = _action;
            this.i_points = random.nextInt(9)+1;
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

    public class EatActions
    {
        private String s_action;
        private int i_points;

        public EatActions(String _action)
        {
            this.s_action = _action;
            this.i_points = random.nextInt(20)+1;
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

    @Override
    public ArrayList<WorkActions> getWorkArray ()
    {
        System.out.println("NAME"+"\t|\t"+"AGE"+"\t|\t"+"ACTION"+"\t\t|\t"+"POINTS");
        return workArray;
    }

    @Override
    public ArrayList<UseActions> getUseArray ()
    {
        return useArray;
    }

    @Override
    public ArrayList<DrinkActions> getDrinkArray ()
    {
        return drinkArray;
    }

    @Override
    public ArrayList<EatActions> getEatArray ()
    {
        return eatArray;
    }
}
