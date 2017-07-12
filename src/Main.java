import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Average average = new Average();
        System.out.println(averageNumber(average,4));*/

        Human jasiek = new Human("Jan",20);

        Human.WorkActions dishWash = jasiek.addWorkAction("Washing dishes");
        Human.EatActions apple = jasiek.addEatAction("Apple");
        Human.UseActions useToilerPaper = jasiek.addUseAction("Use toilet paper");
        Human.DrinkActions whisky = jasiek.addDrinkAction("Whisky");

        System.out.println(jasiek.getWorkArray());
        System.out.println(jasiek.getDrinkArray());
    }

    public static double averageNumber(IIntSequence intSequence, int n)
    {
        int count = 0;
        double sum = 0;

        while (intSequence.hasNext() && count < n)
        {
            count++;
            sum += intSequence.next();
        }

        return count == 0 ? 0 : sum/count;
    }

    public static void live(IHumanActions humanActions)
    {
        Scanner enterAction = new Scanner(System.in);
        String action;

        System.out.println("Welcome to the simple human simulator. \n Enter action to continue. \n To get action list type info. ");

        while (humanActions.canMove() && !humanActions.isDead())
        {
            System.out.println("Enter action: ");
            action = enterAction.nextLine();


            System.out.flush();
        }
    }
}
