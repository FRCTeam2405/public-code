// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.settings;

import com.revrobotics.CANSparkMax.IdleMode;

import edu.wpi.first.math.geometry.Translation3d;
import edu.wpi.first.math.util.Units;
import swervelib.math.Matter;

/** Program-wide constants for the robot.
 *  For settings that should be changed before
 *  building and deploying the code.
 */
public final class Constants {
    public static final class Drivetrains {

        public static final class Swerve {

            public static final boolean FIELD_RELATIVE = true;
            public static final boolean OPEN_LOOP = false;

            public static final class Speed {
                public static final double MAX_TRANSLATION_MPS = 0.5;
                public static final double MAX_ANGULAR_RPS = 0.5 * (2 * Math.PI); // radians per second
            }

            public static final class Measurements {

                public static final double ROBOT_MASS = 0;
                public static final double CHASSIS_MASS = 0;
                public static final double MESSAGE_LOOP_TIME = 0.13;
                public static final Matter CHASSIS_CG = new Matter(new Translation3d(0, 0, Units.inchesToMeters(8)), CHASSIS_MASS);
            }

            public static final class Module {

                public static final String FRONT_LEFT_NAME = "FrontLeft";
                public static final String FRONT_RIGHT_NAME = "FrontRight";
                public static final String BACK_LEFT_NAME = "BackLeft";
                public static final String BACK_RIGHT_NAME = "BackRight";

            }
        }
    }

    public static final class Controllers {
        public static final int DRIVER_JOYSTICK_PORT = 0;
        public static final int DRIVER_WHEEL_PORT = 1;

        
        public static final class Axis {
            public static final int JOYSTICK_X = 0;
            public static final int JOYSTICK_Y = 1;

            public static final int WHEEL_X = 0;
        }
        
        public static final double joystickDeadband = 0.1;
        public static final double wheelDeadband = 0.2;
        

    }
}
