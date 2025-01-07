import java.util.ArrayList;
import java.util.Scanner;

public class Action {
    ArrayList<String> list = new ArrayList<>();
    public void start()
    {
        Scanner scanner=new Scanner(System.in);
        while(true) {
            System.out.println("Welcome to My TO_DO_LIST");
            System.out.println("  1.Add_List \n 2.Remove_List \n 3.View_List \n 4.Exit");
            System.out.println("  Select your option :");
            int option = scanner.nextInt();
            if (option == 4) {
                System.out.println("Exiting.....");
                break;
            }
                switch (option) {
                    case 1:
                        Todolistperform.addlist(scanner, list, this);
                        break;
                    case 2:
                        Todolistperform.removelist(this, scanner, list);
                    case 3:
                        Todolistperform.viewlist(this);
                        break;
                    case 4:
                        if (option == 4) {
                            System.out.println("Exiting.....");
                            break;
                        }
                    default:
                        System.out.println("Sorry your option is not their so please retry!!!!");
                }
            }
        }



    public void setlist(String getlist)
    {
        list.add(getlist);
    }
    public ArrayList<String> getlist()
    {
        if(list.isEmpty())
        {
            System.out.println("Sorry your list is already empty !!!!!");
            return null;
        }
        else {
            int index=1;
            for (String newlist : list) {
                System.out.println("Your list are :" + index++  + " "+ newlist);
            }
            return list;
        }
    }




}


