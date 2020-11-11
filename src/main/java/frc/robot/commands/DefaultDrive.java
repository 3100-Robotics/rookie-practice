/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import frc.robot.Robot;
import frc.robot.RobotContainer;
import frc.robot.subsystems.Drive;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.CommandBase;

/**
 * An example command that uses an example subsystem.
 */
public class DefaultDrive extends CommandBase {

  private final Drive m_subsystem;
  private final DoubleSupplier m_left;
  private final DoubleSupplier m_right;

  /**
   * Creates a new ExampleCommand.
   * @param left       The control input for the left side of the drive
   * @param right      The control input for the right sight of the drive
   * @param subsystem  The subsystem used by this command.
   */
  public DefaultDrive(Drive subsystem, DoubleSupplier left, DoubleSupplier right) {
    m_subsystem = subsystem;
    m_left = left;
    m_right = right;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.Drive);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    double leftStickY = RobotContainer.DriverRawAxis(1);
    double rightStickY = RobotContainer.DriverRawAxis(4);

    Drive.setLeftMotor(leftStickY);
    Drive.setRightMotor(rightStickY);
    //We need to tell the robot to drive here

  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
