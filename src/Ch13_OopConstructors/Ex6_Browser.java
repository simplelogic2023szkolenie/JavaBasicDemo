package Ch13_OopConstructors;

public class Ex6_Browser {
    public Ex6_Browser(String vendor, String name, int version) {
        this.vendor = vendor;
        this.name = name;
        this.version = version;
    }

    public String vendor;
    public String name;
    public int version;

    public String getBroweserData(){
        return vendor + " " + name + " " + version;
    }
}
