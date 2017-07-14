import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*Average average = new Average();
        System.out.println(averageNumber(average,4));*/

        Human jasiek = new Human("Jan",20);

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

    public static void live(IHumanActions humanActions) {
        Scanner enterAction = new Scanner(System.in);
        String action;

        Human.WorkActions dishWash = humanActions.addWorkAction("Washing dishes");
        Human.WorkActions cleanRoom = humanActions.addWorkAction("Clean room");
        Human.WorkActions doLaundry = humanActions.addWorkAction("Do laundry");
        Human.EatActions apple = humanActions.addEatAction("Apple");
        Human.EatActions pizza = humanActions.addEatAction("Pizza");
        Human.EatActions burrito = humanActions.addEatAction("Burrito");
        Human.UseActions exercise = humanActions.addUseAction("Exercise");
        Human.UseActions readBook = humanActions.addUseAction("Read book");
        Human.UseActions useToilerPaper = humanActions.addUseAction("Use toilet paper");
        Human.DrinkActions whisky = humanActions.addDrinkAction("Whisky");
        Human.DrinkActions beer = humanActions.addDrinkAction("Beer");
        Human.DrinkActions coffee = humanActions.addDrinkAction("Coffee");

        System.out.println("Welcome to the simple human simulator. \n Enter action to continue. \n To get action list type 'info'. " +
                "\n To get informations about character type 'character info'. ");



        while (humanActions.canMove() && !humanActions.isDead())
        {
            System.out.println("Actions: 'Work actions', 'Use Actions', 'Eat Actions', 'Drink Actions', 'info', 'character info'");
            System.out.println("Enter action: ");
            action = enterAction.nextLine();

            switch (action.toLowerCase())
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
                    break;

                case "work actions":
                    System.out.println("Actions: 'Washing dishes', 'Clean room', 'Do laundry'. ");
                    System.out.println("Enter kind of a work action");
                    action = enterAction.nextLine();

                    switch (action.toLowerCase())
                    {
                        case "washing dishes":
                            dishWash.work();
                            System.out.println("*** Washing dishes has been done. ***\n" + dishWash.getActionPoints()*(-1) + " points has been removed. ");
                            break;
                        case "clean room":
                            cleanRoom.work();
                            System.out.println("*** Cleaning room has been done. ***\n" + cleanRoom.getActionPoints()*(-1) + " points has been removed.");
                            break;
                        case "do laundry":
                            doLaundry.work();
                            System.out.println("*** Laundry has been done. ***\n" + doLaundry.getActionPoints()*(-1) + " points has been removed. ");
                            break;
                        default:
                            System.out.println("Wrong work action has been choosen. ");
                            break;
                    }
                    break;

                case "eat actions":
                    System.out.println("Actions: 'Apple', 'Pizza', 'Burrito'. ");
                    System.out.println("Enter kind of an eat action: ");
                    action = enterAction.nextLine();

                    switch (action.toLowerCase())
                    {
                        case "apple":
                            apple.eat();
                            System.out.println("*** You've eaten an apple! ***\n" + apple.getActionPoints() + " points has been added! ");
                            break;
                        case "pizza":
                            pizza.eat();
                            System.out.println("*** You've eaten a pizza! ***\n" + pizza.getActionPoints() + " points has been added! ");
                            break;
                        case "burrito":
                            burrito.eat();
                            System.out.println("*** You've eaten a buttiro! ***\n" + burrito.getActionPoints() + " points has been added! ");
                            break;
                        default:
                            System.out.println("Wrong eat action has been choosen. ");
                            break;
                    }
                    break;

                case "use actions":
                    System.out.println("Actions: 'Exercise', 'Read book', 'Use toilet paper'. ");
                    System.out.println("Enter kind of an use action: ");
                    action = enterAction.nextLine();

                    switch (action)
                    {
                        case "exercise":
                            exercise.use();
                            System.out.println("*** Execrise has been done. ***\n" + exercise.getActionPoints()*(-1) + " points has been removed. ");
                            break;
                        case "read book":
                            readBook.use();
                            System.out.println("*** Reading book has been done. ***\n" + readBook.getActionPoints()*(-1) + " points has been removed. ");
                            break;
                        case "use toilet paper":
                            useToilerPaper.use();
                            System.out.println("*** Using toilet paper has been done. ***\n" + useToilerPaper.getActionPoints()*(-1) + " points has been removed. ");
                            break;
                        default:
                            System.out.println("Wrong  action has been choosen. ");
                            break;
                    }
                    break;

                case "drink actions":
                    System.out.println("Actions: 'Whisky', 'Beer', 'Coffee'. ");
                    System.out.println("Enter kind of an use action: ");
                    action = enterAction.nextLine();

                    switch (action)
                    {
                        case "whisky":
                            whisky.drink();
                            System.out.println("*** You've drank a whisky! ***\n" + whisky.getActionPoints() + " points has been added! ");
                            break;
                        case "beer":
                            beer.drink();
                            System.out.println("*** You've drank a beer! ***\n" + beer.getActionPoints() + " points has been added! ");
                            break;
                        case "coffee":
                            coffee.drink();
                            System.out.println("*** You've drank a coffee! ***\n" + coffee.getActionPoints() + " points has been added! ");
                            break;
                        default:
                            System.out.println("No right action has been choosen. ");
                            break;
                    }
                    break;

                case "character info":
                    System.out.println(humanActions.toString());
                    break;

                default:
                    System.out.println("No right action has been choosen");
                    break;
            }
        }
        System.out.println("You're dead!");
    }
}