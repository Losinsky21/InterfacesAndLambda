import java.util.ArrayList;
import java.util.Random;

public class Human implements IHumanActions{

    private String s_name;
    private int i_age;
    private int i_healthPoints;
    private int i_healthPointsLevel;
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

        public int getActionPoints()
        {
            return this.i_points;
        }

        @Override
        public String toString()
        {
            return s_name + "\t|\t" + i_age + "\t|\t" + s_action + "\t|\t" +i_points+"\n";
        }

        public void work() {
            i_healthPoints += this.i_points;
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

        public int getActionPoints()
        {
            return this.i_points;
        }

        @Override
        public String toString()
        {
            return s_name + "\t|\t" + i_age + "\t|\t" + s_action + "\t|\t" +i_points+"\n";
        }

        public void use() {
            i_healthPoints += this.i_points;
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

        public int getActionPoints()
        {
            return this.i_points;
        }

        @Override
        public String toString()
        {
            return s_name + "\t|\t" + i_age + "\t|\t" + s_action + "\t|\t" +i_points+"\n";
        }

        public void drink() {
            i_healthPoints -= this.i_points;
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
            return s_name + "\t|\t" + i_age + "\t|\t" + s_action + "\t|\t" +i_points+"\n";
        }

        public void eat()
        {
            if (i_healthPoints + this.i_points <= i_healthPointsLevel) {
                i_healthPoints += this.i_points;
            } else {
                i_healthPoints = i_healthPointsLevel;
            }
        }

        public int getActionPoints()
        {
            return this.i_points;
        }
    }

    public Human(String _s_name, int _i_age)
    {
        this.s_name = _s_name;
        this.i_age = _i_age;
        this.i_healthPoints = 100;
        this.i_healthPointsLevel = this.i_healthPoints;
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
    public ArrayList<WorkActions> getWorkArray ()
    {
        System.out.println("NAME"+"\t|\t"+"AGE"+"\t|\t"+"ACTION"+"\t\t|\t"+"POINTS");
        return workArray;
    }

    @Override
    public ArrayList<UseActions> getUseArray ()
    {
        System.out.println("NAME"+"\t|\t"+"AGE"+"\t|\t"+"ACTION"+"\t\t|\t"+"POINTS");
        return useArray;
    }

    @Override
    public ArrayList<DrinkActions> getDrinkArray ()
    {
        System.out.println("NAME"+"\t|\t"+"AGE"+"\t|\t"+"ACTION"+"\t\t|\t"+"POINTS");
        return drinkArray;
    }

    @Override
    public ArrayList<EatActions> getEatArray ()
    {
        System.out.println("NAME"+"\t|\t"+"AGE"+"\t|\t"+"ACTION"+"\t\t|\t"+"POINTS");
        return eatArray;
    }

    @Override
    public String toString()
    {
        return "Name: "+this.s_name + ", " + "age: " + this.i_age + ", " + "health points left: " + this.i_healthPoints;
    }
}


