package interfaces;

public class NiceCar  {

    private Engine engine; //reference variable of type interface(Engine) like int engine`
    private Media player = new CDPlayer(); //direct initliaze and fixed alwaays Nicecar always CDPlayer    we can do this for above as well

    public NiceCar() {
        this.engine= new PowerEngine();  //default engine
    }

//    public NiceCar(Engine engine) {
//        this.engine = engine;  //custom engine choose Nicecar car = new Nicecar(new ElectricalEngine());
//    }

    public void start(){
        engine.start();

    }
    public void stop(){
        engine.stop();
    }
    public void acc() {
        engine.acc();
    }

    public void upgradeEngine() {
        this.engine= new ElectricEngine();
    }

    public void StartMusic() {
        player.start();
    }
}