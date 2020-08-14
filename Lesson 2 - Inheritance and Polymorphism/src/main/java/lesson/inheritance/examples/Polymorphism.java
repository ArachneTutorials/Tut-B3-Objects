package lesson.inheritance.examples;

import arachne.lib.io.GettableDouble;
import arachne.lib.pipeline.DoublePipe;
import arachne.lib.pipeline.DoubleSource;

public class Polymorphism {

    DoubleSource source = new DoublePipe(0);
    GettableDouble gettable = new DoublePipe(0);
    Object object = new DoublePipe(0);

    DoublePipe pipe = new DoublePipe(0);
    
    GettableDouble getOutput() {
        return pipe;
    }
}