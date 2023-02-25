package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class DriveSubsystem extends SubsystemBase {

    private final Spark leftMotor = new Spark(DriveConstants.LEFT_MOTOR_ID);
    private final Spark rightMotor = new Spark(DriveConstants.RIGHT_MOTOR_ID);

    private final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor, rightMotor);

    public DriveSubsystem() {
        rightMotor.setInverted(true);
    }

    public void tankDrive(double leftSpeed, double rightSpeed) {
        differentialDrive.tankDrive(leftSpeed, rightSpeed);
    }
}