package builder;

import com.modelo.Gas;
import com.modelo.Motor;

public class MotorBuilder {
	private Motor motor;

	public Motor getMotor() {
		
		return  motor;
	}
	public void creoMotorGas(){
		motor= new Gas(); 
	}
}
