package Ch18_Super;

public class Ex1_Flower extends Ex1_Plant {
    public Ex1_Flower(String name, int height, String smell) {
        super(name, height);
        this.smell = smell;
    }

    private String smell;

    public String getSmell() {
        return smell;
    }

    public void setSmell(String smell) {
        this.smell = smell;
    }
}
