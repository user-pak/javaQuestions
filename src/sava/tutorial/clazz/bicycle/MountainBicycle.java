package sava.tutorial.clazz.bicycle;

public class MountainBicycle extends Bicycle{

	
	@Override
	public String toString() {
		return "gear:" + super.gear + "cadence: " + super.cadence + "speed: " + super.speed;
		
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Bicycle other = (Bicycle)obj;
		
		if(this.gear == other.gear && this.cadence == other.cadence && this.speed ==other.speed) {
			
			return true;
		}
		else {
			
			return false;
		}
	}
}
