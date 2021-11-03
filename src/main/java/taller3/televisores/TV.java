package taller3.televisores;

public class TV {
	private int canal =1;
	private int precio=500;
	private int volumen=1;
	private boolean estado= false;
	private Marca marca;
	private Control control;
	private static int numTV =0;
	
	public TV(Marca marca,boolean estado) {
		this.setMarca(marca);
		this.estado=estado;
		setNumTV(getNumTV() +1);
	}
	
	public void turnOn() {
		estado=true;
	}
	
	public void turnOff() {
		estado=false;
	}
	public void setCanal(int nuevoCanal) {
		if(estado && nuevoCanal >=1 && nuevoCanal <=120) {
			canal=nuevoCanal;
		}
	}
	
	public void setVolumen(int nuevoVolumen) {
		if(estado && nuevoVolumen >=0 && nuevoVolumen <=7) {
			volumen=nuevoVolumen;
		}
	}
	
	public void setPrecio(int nuevoPrecio) {
		precio=nuevoPrecio;
	}
	
	public void setMarca(Marca nuevaMarca) {
		marca=nuevaMarca;
	}
	
	public void setControl(Control nuevoControl) {
		control=nuevoControl;		
	}
	
	public static void setNumTV(int nuevoNumTv) {
		numTV=nuevoNumTv;
	}
	
	public void canalUp() {
		canal++;
	}
	
	public void canalDown() {
		canal--;
	}
	
	public void volumenUp() {
		volumen++;
	}
	
	public void volumenDown() {
		volumen--;
	}
	
	//Ahora se implementa los metodos getters 
	
	public boolean getEstado() {
		return estado;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public int getvolumen() {
		return volumen;
	}
	
	public Marca getMarca() {
		return marca;
	}
	
	public Control getControl() {
		return control;
	}
	
	public static int getNumTV() {
		return numTV;
	}

}
