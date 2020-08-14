package lesson.inheritance.robot;

import arachne.lib.ArachneRobot;
import arachne.lib.game.GameState;
import arachne.lib.systems.Subsystem;

public class Robot extends ArachneRobot {
    public static void main(String[] args) {
        startRobot(Robot::new);
    }

    public Intake intake;

    @Override
    protected void initialize() {
        intake = Subsystem.create(Intake::new);
    }

    @Override
    protected void execute(GameState state) {
        intake.run();
    }
}
