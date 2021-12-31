package interfacedemo;

public interface Vehicle extends Bank {
    void applyBrakes(int decrement);  // abstract,public
    void display();
    int n = 0; // public, static,final
}
