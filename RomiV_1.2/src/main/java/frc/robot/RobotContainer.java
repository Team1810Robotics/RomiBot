package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import frc.robot.commands.TankDrive;
import frc.robot.subsystems.DriveSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import static frc.robot.Constants.*;

public class RobotContainer {

    private final DriveSubsystem m_drivetrain = new DriveSubsystem();

    private final XboxController xboxController = new XboxController(IOConstants.XBOX_PORT);

    public RobotContainer() {
        m_drivetrain.setDefaultCommand(
        new TankDrive(
            m_drivetrain,
            () -> xboxController.getLeftY(),
            () -> xboxController.getRightY()
        ));

        configureButtonBindings();
    }

    private void configureButtonBindings() {}

    public Command getAutonomousCommand() {
        return null;
    }
}
