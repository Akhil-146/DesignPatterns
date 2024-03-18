package Flyweight;

public class ChessUserExtrinsicState {
    private Colour colour;
    private int currentGameStreak;
    private ChessUserIntrinsicState user;

    public ChessUserExtrinsicState(Colour colour, int currentGameStreak, ChessUserIntrinsicState user) {
        this.colour = colour;
        this.currentGameStreak = currentGameStreak;
        this.user = user;
    }

    @Override
    public String toString() {
        return "ChessUserExtrinsicState {" +
                "colour=" + colour +
                ", currentGameStreak=" + currentGameStreak +
                ", user=" + user.toString() +
                '}';
    }

    public Colour getColour() {
        return colour;
    }

    public int getCurrentGameStreak() {
        return currentGameStreak;
    }

    public ChessUserIntrinsicState getUser() {
        return user;
    }
}
