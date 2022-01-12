package day_31_Constructors.Restourant;

public class LocalRestaurant {

    public static void main(String[] args) {

        Server server1 = new Server("John", 1235, 15, true);
        Server server2 = new Server("Rachel", 1225, 15, false);
        Server server3 = new Server("Miguel", 1325, 15, true);
        Server server4 = new Server("Jack", 1652, 15, false);

        Server[] servers = {server2, server3, server4};

        Chef chef1 = new Chef("Farangis", 2536, 20, true);
        Chef chef2 = new Chef("Farangez", 2354, 25, false);
        Chef chef3 = new Chef("Edison", 2534, 20, true);
        Chef chef4 = new Chef("Duygu", 3215, 25, false);

        Chef[] chefs = {chef1, chef3, chef4};

        Restaurant restaurantsInfo = new Restaurant("Kerem", "1556 NY", 5);

        restaurantsInfo.hireServer(server1);
        restaurantsInfo.hireServer(servers);

        restaurantsInfo.hireChef(chef2);
        restaurantsInfo.hireChef(chefs);

        restaurantsInfo.terminateChef(2536);

        restaurantsInfo.terminateServer(1225);

        System.out.println(restaurantsInfo);











    }
}
