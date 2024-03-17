package fp.dam.examenes.java20240311;

import java.time.LocalDate;
import java.util.Objects;

public class Automóvil implements Comparable<Automóvil> {

	private String marca;
	private String modelo;
	private int año;
	private Motor motor;
	private float potencia;
	
	public Automóvil(String marca, String modelo, int año, Motor motor, float potencia) {
		if (año < 0 || año > LocalDate.now().getYear() || potencia <= 0)
			throw new IllegalArgumentException();
		this.marca = marca;
		this.modelo = modelo;
		this.año = año;
		this.motor = motor;
		this.potencia = potencia;
	}

	public Automóvil(String marca, String modelo, Motor motor, float potencia) {
		this(marca, modelo, LocalDate.now().getYear(), motor, potencia);
	}

	@Override
	public int compareTo(Automóvil o) {
		int resultado = marca.compareTo(o.marca);
		if (resultado == 0) {
			resultado = modelo.compareTo(o.modelo);
			if (resultado == 0) {
				resultado = motor.compareTo(o.motor);
				if (resultado == 0) {
					resultado = ((Float) potencia).compareTo(o.potencia);
					if (resultado == 0)
						resultado = ((Integer) año).compareTo(o.año);
				}
			}
		}
		return resultado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, marca, modelo, motor, potencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automóvil other = (Automóvil) obj;
		return año == other.año && Objects.equals(marca, other.marca) && Objects.equals(modelo, other.modelo) && motor == other.motor
				&& Float.floatToIntBits(potencia) == Float.floatToIntBits(other.potencia);
	}

	@Override
	public String toString() {
		return "Automóvil [marca=" + marca + ", modelo=" + modelo + ", año=" + año
				+ ", motor=" + motor + ", potencia=" + potencia + "]";
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAño() {
		return año;
	}

	public Motor getMotor() {
		return motor;
	}

	public float getPotencia() {
		return potencia;
	}	
	
}
