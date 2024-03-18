package Flyweight;

import java.util.HashMap;

public class FlyweightRegistryImpl implements FlyweightRegistry {
    private final HashMap<String, ChessUserIntrinsicState> flyweightRegistryMap = new HashMap<>();
    @Override
    public void addUser(ChessUserIntrinsicState user) {
        flyweightRegistryMap.put(user.getEmail(), user);
    }

    @Override
    public ChessUserIntrinsicState getUser(String email) {
        return flyweightRegistryMap.get(email);
    }
}
