package dz;

public abstract class WheelyTransport extends Transport{

    public WheelyTransport(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }
}
