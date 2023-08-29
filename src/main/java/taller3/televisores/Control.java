package taller3.televisores;

public class Control {
	private TV tv;
	
	private void enlazar(TV televisor) {
		this.tv = televisor;
		tv.setControl(this);		
	}
	public void turnOn() {
		this.tv.turnOn ;
	}
	public void turnOff(){
		this.tv.turnOff();
	}
	public void setTV (TV tv) {
		this.tv = tv;
	}
	
	public TV getTV() {
		return this.tv;
		
	}
	public void canalDown() {
		this.tv.canalDown();
	
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void volumeDown() {
		this.tv.volumeDown();
	}
	public void volumeUp() {
		this.tv.volumeUp();
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public void setVolume(int volumen) {
		this.tv.setVolumen(volumen);
	}
}