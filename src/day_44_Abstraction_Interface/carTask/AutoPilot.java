package day_44_Abstraction_Interface.carTask;

public interface AutoPilot extends AutoPark{

    public boolean hasAutopilot = true;

    public abstract void selfDrive();
}
