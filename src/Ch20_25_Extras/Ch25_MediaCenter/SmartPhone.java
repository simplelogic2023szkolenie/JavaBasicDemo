package Ch20_25_Extras.Ch25_MediaCenter;

public class SmartPhone implements MessageDisplay, MusicPlayer{
    @Override
    public void displayMessage() {
        System.out.println("tutaj SmartPhone ma msg");

    }

    @Override
    public void playMusic() {
        System.out.println("tutaj SmartPhone puszcza muzyke");
    }
}
