/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {
  private final Talon motorLeft = new Talon(0);
  private final Talon motorRight = new Talon(1);
  // We need a DifferentialDrive defined here

  /**
   * Creates a new Drive subsystem
   */
  public Drive() {

  }

  public void drive(final double left, final double right) {

    //We need to declare what type of drivetrain we want here (Tank or Arcade drive)

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void setLeftMotor(double speed){

    motorLeft.set(ControlMode.PercentOutput, speed);
  }
  public void setRightMotor(double speed){

    motorRight.set(ControlMode.PercentOutput, -1*speed);
  }
}
