package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.ColorSensor;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.ServoController;

/**
 * Created by Robotics on 11/13/2017.
 */

public class RobotHardware {

    public static DcMotor rightMotor = null;
    public static DcMotor leftMotor = null;
    public static DcMotor strafeMotor = null;
    public static DcMotor liftMotor = null;

    public static ServoController clampRight = null;
    public static ServoController clampLeft = null;
    public static ServoController liftRight = null;
    public static ServoController liftLeft = null;

    public static ColorSensor ColorSensorREV = null;
}
