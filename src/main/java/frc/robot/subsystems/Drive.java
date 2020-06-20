/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drive extends SubsystemBase {

  //We need a DifferentialDrive defined here


  /**
   * Creates a new Drive subsystem
   */
  public Drive() {

  }

  public void drive(double left, double right){

    //We need to declare what type of drivetrain we want here (Tank or Arcade drive)

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
