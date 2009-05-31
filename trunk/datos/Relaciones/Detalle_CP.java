package datos.Relaciones;

import java.io.Serializable;

import datos.Actividad;
import datos.Caracter_Participacion;


public class Detalle_CP implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Actividad Act;
	private Caracter_Participacion Cp;
	private boolean esEval;
	private boolean emiteCert;
	private float Monto;	 
	private int PorcentMinAsist;
	
	public Detalle_CP(Actividad a,Caracter_Participacion cp,boolean eval,boolean emc, float m,int min){
		Act=a;
		Cp=cp;
		esEval=eval;
		emiteCert=emc;
		Monto = m;
		PorcentMinAsist=min;
	}

	public Actividad getAct() {
		return Act;
	}

	public void setAct(Actividad act) {
		Act = act;
	}

	public Caracter_Participacion getCp() {
		return Cp;
	}

	public void setCp(Caracter_Participacion cp) {
		Cp = cp;
	}

	public boolean isEsEval() {
		return esEval;
	}

	public void setEsEval(boolean esEval) {
		this.esEval = esEval;
	}

	public boolean isEmiteCert() {
		return emiteCert;
	}

	public void setEmiteCert(boolean emiteCert) {
		this.emiteCert = emiteCert;
	}

	public float getMonto() {
		return Monto;
	}

	public void setMonto(float monto) {
		Monto = monto;
	}

	public int getPorcentMinAsist() {
		return PorcentMinAsist;
	}

	public void setPorcentMinAsist(int porcentMinAsist) {
		PorcentMinAsist = porcentMinAsist;
	}
}
