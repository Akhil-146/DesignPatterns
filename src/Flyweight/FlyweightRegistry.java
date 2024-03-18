package Flyweight;

public interface FlyweightRegistry {
    void addUser(ChessUserIntrinsicState user);

    ChessUserIntrinsicState getUser(String email);
}
