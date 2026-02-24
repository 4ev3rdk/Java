package interfaces;

public interface Engine {


    //we can create variable too they are BYDEFAULT STATIC AND FINAL (we dont have to mention it)
    static final int PRICE = 700000;


    //in intefaces the methods are BYDEFAULT PUBLIC ABSTRACT VOID METHODNAME
    //Q: Why interface methods always public?
    //interfaces method are always contract for outside world and must be accessible everywhere
    //contrac to outside means it tells classe and packages outside to use it (java forces to)
    void start();
    void stop();
    void acc();
}
