// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import static frc.robot.Constants.*;

public class Drivetrain extends SubsystemBase {

  // The Romi has the left and right motors set to
  // PWM channels 0 and 1 respectively
  private final Spark leftMotor = new Spark(DriveConstants.LEFT_MOTOR_ID);
  private final Spark rightMotor = new Spark(DriveConstants.RIGHT_MOTOR_ID);

  private final Encoder leftEncoder = new Encoder(DriveConstants.LEFT_ENCODER_IDS[0], 
                                                  DriveConstants.LEFT_ENCODER_IDS[1]);
  private final Encoder rightEncoder = new Encoder(DriveConstants.RIGHT_ENCODER_IDS[0], 
                                                   DriveConstants.RIGHT_ENCODER_IDS[1]);

  // Set up the differential drive controller
  private final DifferentialDrive differentialDrive = new DifferentialDrive(leftMotor, rightMotor);
  /** Creates a new Drivetrain. */
  public Drivetrain() {
    // We need to invert one side of the drivetrain so that positive voltages
    // result in both sides moving forward. Depending on how your robot's
    // gearbox is constructed, you might have to invert the left side instead.
    rightMotor.setInverted(true);

    // Use inches as unit for encoder distances
    leftEncoder.setDistancePerPulse((Math.PI * DriveConstants.kWheelDiameterInch) / DriveConstants.kCountsPerRevolution);
    rightEncoder.setDistancePerPulse((Math.PI * DriveConstants.kWheelDiameterInch) / DriveConstants.kCountsPerRevolution);
    resetEncoders();
  }

  public void tankDrive(double leftSpeed, double rightSpeed) {
    differentialDrive.tankDrive(leftSpeed, rightSpeed);
  }

  public void resetEncoders() {
    leftEncoder.reset();
    rightEncoder.reset();
  }

  public int getLeftEncoderCount() {
    return leftEncoder.get();
  }

  public int getRightEncoderCount() {
    return rightEncoder.get();
  }
}
