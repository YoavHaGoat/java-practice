public class BallSensor extends BaseSensor {
    boolean isThereABall;
    public BallSensor(){
        super();
    }
    public boolean haveBall(){
        return isThereABall;
    }
}