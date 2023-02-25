package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.function.DoubleSupplier;

public class TankDrive extends CommandBase {
    private final DriveSubsystem driveSubsystem;
    private final DoubleSupplier xSpeed;
    private final DoubleSupplier ySpeed;

    public TankDrive(
        DriveSubsystem driveSubsystem,
        DoubleSupplier xSpeed,
        DoubleSupplier ySpeed) {
        this.driveSubsystem = driveSubsystem;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        addRequirements(driveSubsystem);
    }

    @Override
    public void execute() {
        driveSubsystem.tankDrive(
        -xSpeed.getAsDouble(),
        -ySpeed.getAsDouble());
    }
}
