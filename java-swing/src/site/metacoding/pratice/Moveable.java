package site.metacoding.pratice;

public interface Moveable {
    void left();

    void right();

    void up();

    default void down() {
    };
}