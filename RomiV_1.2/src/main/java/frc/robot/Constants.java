// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static final class DriveConstants {
        public static final double kCountsPerRevolution = 1440.0;
        public static final double kWheelDiameterInch = 2.75591; // 70 mm

        public static final int LEFT_MOTOR_ID = 0;
        public static final int RIGHT_MOTOR_ID = 1;
        public static final int[] LEFT_ENCODER_IDS = {4, 5};
        public static final int[] RIGHT_ENCODER_IDS = {6, 7};
    }
    public static final class IOConstants {
       public static final int XBOX_PORT = 0;
       
    }
}
