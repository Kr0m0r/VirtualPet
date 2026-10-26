import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      String name = "";
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("What is your pet's name?");
      name = input.nextLine();
      System.out.println("Your pet's name is " + name);

      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
      while((happiness < 15) && (hunger < 10) && (energy > 0) && (choice != 5)) {

         // TODO 2:
         // Display happiness, hunger, and energy.
         
         System.out.println("--------------------------");
         System.out.println("Happiness: " + happiness);
         System.out.println("Hunger: " + hunger);
         System.out.println("Energy: " + energy);
         System.out.println("--------------------------\n");
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
         
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.
         while(choice < 1 || choice > 6) {
            System.out.println("Invalid option, please choose an available option");
            choice = input.nextInt();
         }
         if(choice == 1) {
            happiness += 1;
            hunger -= 3;
            System.out.println(name + " enjoyed their food.\n");
         }
         else if(choice == 2) {
            happiness += 3;
            hunger += 2;
            energy -= 2;
            System.out.println("You ran around with " + name + " and they had a great time.\n");
         }
         else if(choice == 3) {
            happiness -= 1;
            hunger += 1;
            energy += 3;
            System.out.println(name + " took a nap on your bed.\n");
         }
         else if(choice == 4) {
            happiness += 2;
            hunger += 1;
            energy -= 1;
            System.out.println("You gave " + name + " a bath.\n");
         }
         else if(choice == 6) {
            System.out.println(name + " learnt how to speak English! You both went viral and got rich.\n" + name + " couldn't have had a better life.");
            happiness = 99;
            hunger = 0;
            energy = 99;
         }
            
      }
      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      //
      // Print the appropriate ending message.
      if(choice == 5) {
         System.out.println("Goodbye!");
      }
      if(energy <= 0) {
         System.out.println("--------------------------");
         System.out.println("Happiness: " + happiness);
         System.out.println("Hunger: " + hunger);
         System.out.println("Energy: " + energy);
         System.out.println("--------------------------\n");
         
         System.out.println(name + " died from exhaustion. Poor thing.");
      }
      else if(hunger >= 10) {
         System.out.println("--------------------------");
         System.out.println("Happiness: " + happiness);
         System.out.println("Hunger: " + hunger);
         System.out.println("Energy: " + energy);
         System.out.println("--------------------------\n");
         
         System.out.println(name + " ran off in search of food.");
      }
      else if(happiness >= 15) {
         System.out.println("--------------------------");
         System.out.println("Happiness: " + happiness);
         System.out.println("Hunger: " + hunger);
         System.out.println("Energy: " + energy);
         System.out.println("--------------------------\n");
         
         System.out.println("YOU WIN!");
      }
      input.close();
   }
}