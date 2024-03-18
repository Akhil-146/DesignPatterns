import Flyweight.ChessUserExtrinsicState;
import Flyweight.ChessUserIntrinsicState;
import Flyweight.Colour;
import Flyweight.FlyweightRegistryImpl;

public class FlyweightClient {
    private static final FlyweightRegistryImpl flyweightRegistry = new FlyweightRegistryImpl();

    public static void main(String[] args) {
        //Initialize User Registration
        registerUsers();

        //Initialize Users
        ChessUserExtrinsicState user1 = new ChessUserExtrinsicState(Colour.WHITE, 0, flyweightRegistry.getUser("abc@gmail.com"));
        ChessUserExtrinsicState user2 = new ChessUserExtrinsicState(Colour.BLACK, 1, flyweightRegistry.getUser("def@gmail.com"));

        System.out.println(user1);
        System.out.println(user2);
    }

    public static void registerUsers() {
        ChessUserIntrinsicState user1 = new ChessUserIntrinsicState("User1", 26, "Male", "abc@gmail.com", "9238942", new Byte[]{});
        ChessUserIntrinsicState user2 = new ChessUserIntrinsicState("User2", 22, "Female", "def@gmail.com", "9232342", new Byte[]{});
        ChessUserIntrinsicState user3 = new ChessUserIntrinsicState("User3", 28, "Male", "ghi@gmail.com", "9238912", new Byte[]{});
        ChessUserIntrinsicState user4 = new ChessUserIntrinsicState("User4", 29, "Female", "jkl@gmail.com", "9098942", new Byte[]{});
        ChessUserIntrinsicState user5 = new ChessUserIntrinsicState("User5", 25, "Male", "xyz@gmail.com", "9237542", new Byte[]{});

        flyweightRegistry.addUser(user1);
        flyweightRegistry.addUser(user2);
        flyweightRegistry.addUser(user3);
        flyweightRegistry.addUser(user4);
        flyweightRegistry.addUser(user5);
    }
}
