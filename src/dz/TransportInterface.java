package dz;

public interface TransportInterface {
    String getModelName();

    void setModelName(String modelName);

    int getWheelsCount();

    void setWheelsCount(int wheelsCount);

    @Override
    String toString();
}
