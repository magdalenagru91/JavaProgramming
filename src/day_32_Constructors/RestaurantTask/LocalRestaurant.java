package day_32_Constructors.RestaurantTask;

public class LocalRestaurant {

    /*
    6.4. Create a class LocalRestaurant that has a main method with the following:
	        	- Make a Restaurant object
	        	- Create an array of servers with their information set.
	        	Add those initial servers to the ArrayList of Servers in the Restaurant object
	            - Create an array of chefs with their information set.
	            Add those initial chefs to the ArrayList of Chefs in the Restaurant object

	            - Print your whole restaurants information
     */
    public static void main(String[] args) {

        Restaurant restaurant1 = new Restaurant("Stachu", "Katowice", 5);

        Server server1 = new Server("Adam", 13, 15, true);
        Server server2 = new Server("Magda", 10, 20, false);

        Server [] serversList = {server1,server2};

        restaurant1.hireServer(serversList);

        Chef chef1 = new Chef("Hela", 20, 25, true);
        Chef chef2 = new Chef("Ula", 9, 26, false);
        Chef chef3 = new Chef("Lola", 7, 18, false);

        Chef [] chefsList = {chef1, chef2, chef3};

        restaurant1.hireChef(chefsList);

        System.out.println(restaurant1);

    }
}
