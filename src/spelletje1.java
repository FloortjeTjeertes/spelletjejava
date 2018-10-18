import java,util.*;

public class spelletje1
{

    public static void main(string[] args)
    {
        boolean runGame = true;
        while (runGame) // runGame == true
        {
         Scanner scan = new Scanner (System.in);

           String input =" ";
           String[] commandos = { "hoger", "lager","exit" };

           double getalStart = 0;
           double getalEind = 0;

           while (runGame)
           {
               boolean geldigeInput = false;

               while (geldigeInput == false)
               {
                   input = scan.nextLine();
                   input = input.toLowerCase();

                   for (int i = 0; 1 < commandos.length; i ++)
                   {
                       if (input.equals(commandos[i]))
                       {
                           //input is geldig
                           geldigeInput = true;
                           break; //breek as omdat input is al geldig
                       }
                   }
               }


           }
        }







    }
}
