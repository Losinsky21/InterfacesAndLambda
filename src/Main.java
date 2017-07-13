import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Average average = new Average();
        System.out.println(averageNumber(average,4));*/

        Human jasiek = new Human("Jan",20);

        Human.WorkActions dishWash = jasiek.addWorkAction("Washing dishes");
        Human.WorkActions cleanRoom = jasiek.addWorkAction("Clean room");
        Human.WorkActions doLaundry = jasiek.addWorkAction("Do laundry");
        Human.EatActions apple = jasiek.addEatAction("Apple");
        Human.EatActions pizza = jasiek.addEatAction("Pizza");
        Human.EatActions burrito = jasiek.addEatAction("Burrito");
        Human.UseActions exercise = jasiek.addUseAction("Exercise");
        Human.UseActions readBook = jasiek.addUseAction("Read book");
        Human.UseActions useToilerPaper = jasiek.addUseAction("Use toilet paper");
        Human.DrinkActions whisky = jasiek.addDrinkAction("Whisky");
        Human.DrinkActions beer = jasiek.addDrinkAction("Beer");
        Human.DrinkActions coffee = jasiek.addDrinkAction("Coffee");

        live(jasiek);
       // System.out.println(jasiek.getDrinkArray());
    }
/*
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
    }*/

    public static void live(IHumanActions humanActions)
    {
        Scanner enterAction = new Scanner(System.in);
        String action;

        System.out.println("Welcome to the simple human simulator. \n Enter action to continue. \n To get action list type 'info'. ");

        while (humanActions.canMove() && !humanActions.isDead())
        {
            System.out.println("Enter action: ");
            action = enterAction.nextLine();

            switch (action)
            {
                case "info":
                    System.out.println("To get information just write one of those:");
                    System.out.println("'Work Actions' | 'Eat Actions' | 'Use Actions' | 'Drink Actions' ");
                    action = enterAction.nextLine();

                    switch (action.toLowerCase())
                    {
                        case "work actions":
                            System.out.println(humanActions.getWorkArray());
                            break;
                        case "eat actions":
                            System.out.println(humanActions.getEatArray());
                            break;
                        case "use actions":
                            System.out.println(humanActions.getUseArray());
                            break;
                        case "drink actions":
                            System.out.println(humanActions.getDrinkArray());
                            break;
                        default:
                            System.out.println("No information about those actions");
                            break;
                    }
                case "work actions":
                    System.out.println("Enter kind of a work action");
                    action = enterAction.nextLine();

                    switch (action.toLowerCase())
                    {
                        case "washing dishes":
                            //washing action
                            break;
                        case "clean room":
                            //clean action
                            break;
                        case "do laundry":
                            //laundry action
                            break;
                        default:
                            System.out.println("No action has been choosen. ");
                            break;
                    }
                case "eat actions":
                    System.out.println("Enter kind of an eat action: ");
                    action = enterAction.nextLine();

                    switch (action.toLowerCase())
                    {
                        case "apple":
                            //eat apple
                            break;
                        case "pizza":
                            //eat pizza
                            break;
                        case "burrito":
                            //eat burrito
                            break;
                    }



                    break;
                default:
                    System.out.println("No work action has been choosen");
                    break;
            }
            System.out.flush();
        }

        System.out.println("You're dead!");
    }
}