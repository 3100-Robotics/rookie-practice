/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.RobotContainer;
import frc.robot.subsystems.Drive;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class DefaultDrive extends CommandBase {

 
  /**
   * Creates a new ExampleCommand.
   * @param left       The control input for the left side of the drive
   * @param right      The control input for the right sight of the drive
   * @param subsystem  The subsystem used by this command.
   */
  public DefaultDrive() {
   
    // Use addRequirements() here to declare subsystem dependencies.
   
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {

    double leftStickY = RobotContainer.getDriverRawAxis(1);
    double rightStickY = RobotContainer.getDriverRawAxis(0);

    Drive.leftSpeed(leftStickY);
    Drive.rightSpeed(rightStickY);


  }

  

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {

    Drive.leftSpeed(0);
    Drive.rightSpeed(0);

  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
