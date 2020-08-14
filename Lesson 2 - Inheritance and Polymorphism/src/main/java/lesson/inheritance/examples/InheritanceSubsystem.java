package lesson.inheritance.examples;

import arachne.lib.systems.Subsystem;

public class InheritanceSubsystem extends Subsystem {
    public InheritanceSubsystem() {
        super();
    }

    @Override
    protected void initialize() {
        // Code to run on initialization
    }
    
    @Override
    public void run() {
        super.run();
        // Code to run repeatedly during robot execution
    }
}
