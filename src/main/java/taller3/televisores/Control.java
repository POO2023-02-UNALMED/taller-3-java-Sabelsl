package taller3.televisores;

public class Control {
	private TV tv;
	
	private void enlazar (TV televisor){
		this.tv = televisor;
		tv.setControl(this);		
	}
	public void turnOff(){
		this.tv.turnOff();
	}
	public void turnOn() {
		this.tv.turnOn();
	}
	public void setTV (TV tv) {
		this.tv = tv;
	}
	
	public TV getTv () {
		return this.tv;
		
	}
	public void canalDown() {
		this.tv.canalDown();
	
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
	public void volumenUp() {
		this.tv.volumenUp; 
	}
	public void setCanal(int canal) {
		this.tv.setCanal(canal);
	}
	public void setVolume(int volumen) {
		this.tv.setVolumen(volumen);
	}
}
