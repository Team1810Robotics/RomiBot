// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.Drivetrain;
import edu.wpi.first.wpilibj2.command.CommandBase;

import java.util.function.DoubleSupplier;

public class TankDrive extends CommandBase {
  private final Drivetrain m_drivetrain;
  private final DoubleSupplier m_xaxisSpeedSupplier;
  private final DoubleSupplier m_zaxisRotateSupplier;

  /**
   * Creates a new ArcadeDrive. This command will drive your robot according to the speed supplier
   * lambdas. This command does not terminate.
   *
   * @param drivetrain The drivetrain subsystem on which this command will run
   * @param xaxisSpeedSupplier Lambda supplier of forward/backward speed
   * @param zaxisRotateSupplier Lambda supplier of rotational speed
   */
  public TankDrive(
      Drivetrain drivetrain,
      DoubleSupplier xaxisSpeedSupplier,
      DoubleSupplier zaxisRotateSupplier) {
    m_drivetrain = drivetrain;
    m_xaxisSpeedSupplier = xaxisSpeedSupplier;
    m_zaxisRotateSupplier = zaxisRotateSupplier;
    addRequirements(drivetrain);
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    System.out.println(String.format("X: %.2f\tY: %.2f", m_xaxisSpeedSupplier.getAsDouble(), m_zaxisRotateSupplier.getAsDouble()));
    m_drivetrain.tankDrive(m_xaxisSpeedSupplier.getAsDouble(), m_zaxisRotateSupplier.getAsDouble());
  }
}
