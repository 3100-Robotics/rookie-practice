/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.commands.DefaultDrive;

public class Drive extends SubsystemBase {

  private static Spark left = new Spark(1);
  private static Spark right = new Spark(2);

  /**
   * Creates a new Drive subsystem
   */
  public Drive() {

  }
  public void initDefaultCommand(){

    setDefaultCommand(new DefaultDrive());

  }

  public static void leftSpeed(double speed) {

    left.set(speed);

  }
  public static void rightSpeed(double speed){

    right.set(speed);

  }


  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
