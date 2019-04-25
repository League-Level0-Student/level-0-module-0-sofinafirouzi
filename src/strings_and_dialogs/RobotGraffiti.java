package strings_and_dialogs;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {
	public static void main(String[] args) {
		Robot batman = new Robot();
		batman.setSpeed(100000);
		batman.turn(-90);
		batman.move(300);
		batman.penDown();
		batman.move(100);
		batman.turn(-90);
		batman.move(100);
		batman.turn(-90);
		batman.move(100);
		batman.turn(90);
		batman.move(100);
		batman.turn(90);
		batman.move(100);
		
		batman.penUp();
		
		 batman.turn(180);
		 batman.move(150);
		 batman.penDown();
         batman.move(100);
         for(int i=0; i<4; i++) {
		 batman.turn(-90);
		 batman.move(100);
         }
	
         batman.penUp();
         batman.move(50);
         batman.turn(-90);
         batman.penDown();
         batman.move(200);
         batman.turn(90);
         batman.move(100);
         batman.penUp();
         batman.turn(90);
         batman.move(100);
         batman.turn(90);
         batman.penDown();
         batman.move(100);
         
         batman.penUp();
         
         batman.turn(-90);
         batman.move(100);
         batman.turn(-90);
         batman.move(150);
         batman.turn(-90);
         batman.penDown();
         batman.move(100);
         batman.penUp();
         batman.move(50);
         batman.penDown();
         batman.move(50);
         
         batman.penUp();
         
         batman.turn(180);
         batman.move(200);
         batman.turn(-90);
         batman.move(50);
         batman.turn(-90);
         batman.penDown();
         batman.move(100);
         batman.turn(180);
         batman.move(20);
         batman.turn(-90);
         batman.move(75);
         batman.turn(90);
         batman.move(80);
         
         batman.penUp();
    
         batman.turn(-90);
         batman.move(50);
         batman.penDown();
         batman.turn(-90);
         batman.move(100);
         for(int i=0; i<5; i++) {
		 batman.turn(90);
		 batman.move(100);
         }
         batman.turn(-90);
         batman.move(100);
         batman.turn(-90);
         batman.move(100);
         
         batman.penUp();
         batman.move(200);
         batman.turn(90);
         batman.move(200);
         

    
            
         

         
         
         
         
	}
	
}

