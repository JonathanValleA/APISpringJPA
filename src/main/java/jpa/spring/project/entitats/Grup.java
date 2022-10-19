package jpa.spring.project.entitats;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grup{
	//Atributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private long id;
	private String nomGrup;
	private String cicle;
	private int curs;
	private int aula;
	
	
	//Setters i getters
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNomGrup() {
		return nomGrup;
	}
	public void setNomGrup(String nomGrup) {
		this.nomGrup = nomGrup;
	}
	public String getCicle() {
		return cicle;
	}
	public void setCicle(String cicle) {
		this.cicle = cicle;
	}
	public int getCurs() {
		return curs;
	}
	public void setCurs(int curs) {
		this.curs = curs;
	}
	public int getAula() {
		return aula;
	}
	public void setAula(int aula) {
		this.aula = aula;
	}
	
	//to String
	@Override
	public String toString() {
		return "Grup [nomGrup=" + nomGrup + ", cicle=" + cicle + ", curs=" + curs + ", aula=" + aula + "]";
	}
	
	//Constructors
	
	public Grup(long id, String nomGrup, String cicle, int curs, int aula) {
		super();
		this.id = id;
		this.nomGrup = nomGrup;
		this.cicle = cicle;
		this.curs = curs;
		this.aula = aula;
	}
	
	public Grup() {
		
	}
	
	
	
	
}
