import java.util.ArrayList;
public class CafeUtil{

    public int getStreakGoal(){
        // variable result needs a value assigned 
        int result = 0;
        for(int i=1; i<=10; i++){
        result += i;

    }
        return result;
    }

    public double getOrderTotal(double[]prices){
        double sum = 0;
        for(int i=0; i<prices.length ; i++) {
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String>menuItems){
        for(int i=0 ; i<menuItems.size(); i++){
            System.out.println(i + " : " + menuItems.get(i));
        }
    }

    public String addCustomer(ArrayList<String>customers){
        System.out.println("Please enter your name: " );
        String username = System.console().readLine();
        System.out.println("Hello " +username);
        // add user to the list 
        customers.add(username);
        int line = customers.size()-1;
        System.out.println("There are " + line + " people in front of you");
        System.out.println(customers);
        return null;
    }


}