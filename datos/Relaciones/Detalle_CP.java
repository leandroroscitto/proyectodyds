package datos.Relaciones;

import datos.Elemento_Serializable;

public class Detalle_CP extends Elemento_Serializable{

	private int Actividad_id;
	private float Monto;	 

	public Detalle_CP(int a_id, float m){
		Actividad_id = a_id;
		Monto = m;
	}

	public int getActividad_id() {
		return Actividad_id;
	}

	public void setActividad_id(int actividad_id) {
		Actividad_id = actividad_id;
	}

	public float getMonto() {
		return Monto;
	}

	public void setMonto(float monto) {
		Monto = monto;
	}
	

}
