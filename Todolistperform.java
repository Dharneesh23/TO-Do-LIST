import java.util.ArrayList;
import java.util.Scanner;

public class Todolistperform
{
    public static String addlist(Scanner scanner, ArrayList<String> list,Action action)
    {
        System.out.println("Add your TO-DO-List");
        String addtodo=scanner.next();

        action.setlist(addtodo);
        return addtodo;
    }
    public static void removelist(Action action,Scanner scanner,ArrayList<String>list)
    {
        System.out.println("Remove your List :"+action.getlist());
        System.out.println("Enter your index to remove your list");
        int userindex=scanner.nextInt();
        int ind=userindex-1;
         list.remove(ind);

    }
    public static void viewlist(Action action)
    {
        action.getlist();
    }


}





