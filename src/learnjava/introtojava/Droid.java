package learnjava.introtojava;

public class Droid {

    String name;
    int batteryLevel;

    public static void main(String[] args) {

        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("singing a song");
        codey.performTask("running");
        System.out.println(codey.energyReport());

        System.out.println();

        Droid theo = new Droid("Theo");
        System.out.println(theo);
        theo.performTask("cooking");
        theo.performTask("jumping");
        System.out.println(theo.energyReport());

    }

    // toString method
    public String toString() {
        return "Hello, I'm the droid " + name + ".";
    }

    //contructor method
    public Droid(String droidName){
        name = droidName;
        batteryLevel = 100;
    }

    //method performTask
    public void performTask(String task) {
        System.out.println(name + " is performing: " + task + ".");
        batteryLevel = batteryLevel - 10;
    }

    public String energyReport() {
        return "The battery level of " + name + " is now " + batteryLevel;
    }

}