public class GameController {
    private boolean[]buttons=new boolean[4];
    public GameController(){
        for(int i=0;i<this.buttons.length;i++){
            buttons[i]=false;
        }
    }
    public boolean isPressed(int button){
        return buttons[button];
    }
    public void pressButton(int button) {
        buttons[button] = true;
    }
    
    public void releaseButton(int button) {
        buttons[button] = false;
    }
}