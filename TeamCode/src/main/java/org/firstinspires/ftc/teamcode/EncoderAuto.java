package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import static com.qualcomm.robotcore.hardware.DcMotor.RunMode.RUN_TO_POSITION;
import static com.qualcomm.robotcore.hardware.DcMotor.RunMode.RUN_USING_ENCODER;

/**
 * Created by Robotics on 3/27/2017.
 */

@Autonomous(name="AutoEncoderDrive", group="Pushbot")

public class EncoderAuto extends OpMode {
    static final double     COUNTS_PER_MOTOR_REV    = 1440 ;    // eg: TETRIX Motor Encoder
    static final double     DRIVE_GEAR_REDUCTION    = 1.0 ;     // This is < 1.0 if geared UP
    static final double     WHEEL_DIAMETER_INCHES   = 4.0 ;     // For figuring circumference
    static final double     COUNTS_PER_INCH         = (COUNTS_PER_MOTOR_REV * DRIVE_GEAR_REDUCTION) /
            (WHEEL_DIAMETER_INCHES * 3.1415);
    static final double     DRIVE_SPEED             = 0.6;
    static final double     TURN_SPEED              = 0.5;



    double inchesToMove = 12;


    @Override
    public void init() {

        RobotOther.leftDriveMotor = hardwareMap.dcMotor.get("left_drive");
        RobotOther.rightDriveMotor = hardwareMap.dcMotor.get("right_drive");

    }

    @Override
    public void start() {

        RobotOther.leftDriveMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
        RobotOther.rightDriveMotor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

        RobotOther.leftDriveMotor.setMode(RUN_USING_ENCODER);
        RobotOther.rightDriveMotor.setMode(RUN_USING_ENCODER);

        RobotOther.leftDriveMotor.setTargetPosition(RobotOther.leftDriveMotor.getCurrentPosition() + (int)(inchesToMove * COUNTS_PER_INCH));
        RobotOther.rightDriveMotor.setTargetPosition(RobotOther.rightDriveMotor.getCurrentPosition() + (int) (inchesToMove * COUNTS_PER_INCH));

        RobotOther.leftDriveMotor.setMode(RUN_TO_POSITION);
        RobotOther.rightDriveMotor.setMode(RUN_TO_POSITION);

        RobotOther.leftDriveMotor.setPower(.5);
        RobotOther.rightDriveMotor.setPower(.5);

        RobotOther.leftDriveMotor.setPower(0);
        RobotOther.rightDriveMotor.setPower(0);

        RobotOther.leftDriveMotor.setMode(RUN_USING_ENCODER);
        RobotOther.rightDriveMotor.setMode(RUN_USING_ENCODER);

    }

    @Override
    public void loop() {

    }
}
