package staticInterface;

public interface B extends A{
    void fun();
}
//always remember when using access modifier in child or implemented class must be higher accessible and cant
//be lower like private etc if its protected then it can be public in child but not lower
//nothing less restrictive than parents
