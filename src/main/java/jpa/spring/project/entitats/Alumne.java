package jpa.spring.project.entitats;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Alumne {

	//Atributs
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
		private long id;
		private String nom;
		private String cognom1;
		private String cognom2;
		private LocalDate dataNaixement;
		private String dni;
		private int classestotals;
		private int faltes;
		private int faltesJust;
		private String grup;
		private String email;
		
		//To string
		@Override
		public String toString() {
			return "Alumne [id=" + id + ", nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2
					+ ", dataNaixement=" + dataNaixement + ", dni=" + dni + ", classestotals=" + classestotals
					+ ", faltes=" + faltes + ", faltesJust=" + faltesJust + ", grup=" + grup + ", email=" + email + "]";
		}

		//Getters i setters
		
		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}
		
		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getCognom1() {
			return cognom1;
		}

		public void setCognom1(String cognom1) {
			this.cognom1 = cognom1;
		}

		public String getCognom2() {
			return cognom2;
		}

		public void setCognom2(String cognom2) {
			this.cognom2 = cognom2;
		}

		public LocalDate getDataNaixement() {
			return dataNaixement;
		}

		public void setDataNaixement(LocalDate dataNaixement) {
			this.dataNaixement = dataNaixement;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public int getClassestotals() {
			return classestotals;
		}

		public void setClassestotals(int classestotals) {
			this.classestotals = classestotals;
		}

		public int getFaltes() {
			return faltes;
		}

		public void setFaltes(int faltes) {
			this.faltes = faltes;
		}
		
		public int getFaltesJust() {
			return faltesJust;
		}

		public void setFaltesJust(int faltesJust) {
			this.faltesJust = faltesJust;
		}

		public String getGrup() {
			return grup;
		}

		public void setGrup(String grup) {
			this.grup = grup;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		//Constructors

		
		
		public Alumne() {
			
		}

		public Alumne(long id, String nom, String cognom1, String cognom2, LocalDate dataNaixement, String dni,
				int classestotals, int faltes, int faltesJust, String grup, String email) {
			super();
			this.id = id;
			this.nom = nom;
			this.cognom1 = cognom1;
			this.cognom2 = cognom2;
			this.dataNaixement = dataNaixement;
			this.dni = dni;
			this.classestotals = classestotals;
			this.faltes = faltes;
			this.faltesJust = faltesJust;
			this.grup = grup;
			this.email = email;
		}
		
		
	}
		
		
		
		
		
		

