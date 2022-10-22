package jpa.spring.project.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jpa.spring.project.entitats.Alumne;
import jpa.spring.project.entitats.Grup;
import jpa.spring.project.repositoris.AlumneRepositori;
import jpa.spring.project.repositoris.GrupRepositori;

@RestController
@RequestMapping("api")
public class AlumneController {

	@Autowired // diu a Spring que crei ell l'objecte
	AlumneRepositori alumneRep; // no cal fer new ja que ho fa spring
	GrupRepositori grupRep;

	// RF1 Llistat d'alumnes
	@GetMapping("alumne")
	public Iterable<Alumne> getAlumnes() {
		return alumneRep.findAll();
	}

	@GetMapping("alumne/{id}")
	public Alumne getAlumne(@PathVariable long id) {
		Alumne alumne = alumneRep.findById(id).get();

		return alumne;
	}

	@GetMapping("alumne/faltes")
	public List<String> getFaltes() {

		List<String> llistaAlumnes = new ArrayList<>();

		for (long i = 1; i <=alumneRep.count(); i++)
			llistaAlumnes.add("Nom: " + alumneRep.findById(i).get().getNom() + " Cognom: "
					+ alumneRep.findById(i).get().getCognom1() + " Faltes: " + alumneRep.findById(i).get().getFaltes()
					+ " Faltas justificadas: " + alumneRep.findById(i).get().getFaltesJust()
					+ " Percentatge de faltes Justificadas: "
					+ (((double) alumneRep.findById(i).get().getFaltesJust() * 100)
							/ (alumneRep.findById(i).get().getFaltes()))
					+ " %");

		return llistaAlumnes;
	}

	@GetMapping("alumne/faltes/{nElement}")
	public String getFaltes(@PathVariable int nElement) {

		List<String> llistaAlumnes = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++)
			llistaAlumnes.add("Nom: " + alumneRep.findById(i).get().getNom() + " Cognom: "
					+ alumneRep.findById(i).get().getCognom1() + " Faltes: " + alumneRep.findById(i).get().getFaltes()
					+ " Faltas justificadas: " + alumneRep.findById(i).get().getFaltesJust()
					+ " Percentatge de faltes Justificadas: "
					+ (((double) alumneRep.findById(i).get().getFaltesJust() * 100)
							/ (alumneRep.findById(i).get().getFaltes()))
					+ " %");

		return llistaAlumnes.get(nElement);
	}

	// RF2 Llistat d'alumnes per grup
	@GetMapping("alumne/smix1")
	public List<String> getGrupAlumne() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("SMIX1")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/smix2")
	public List<String> getGrupAlumne2() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("SMIX2")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/daw1")
	public List<String> getGrupAlumne3() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAW1")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/daw2")
	public List<String> getGrupAlumne4() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAW2")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/dam1")
	public List<String> getGrupAlumne5() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAM1")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/dam2")
	public List<String> getGrupAlumne6() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAM2")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/asix1")
	public List<String> getGrupAlumne7() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("ASIX1")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	@GetMapping("alumne/asix2")
	public List<String> getGrupAlumne8() {

		List<String> llistaGrup = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			if (alumneRep.findById(i).get().getGrup().toUpperCase().equals("ASIX2")) {
				llistaGrup.add("Grup: " + alumneRep.findById(i).get().getGrup() + ", Nom: "
						+ alumneRep.findById(i).get().getNom() + ", Cognom: " + alumneRep.findById(i).get().getCognom1()
						+ ", Email: " + alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}

	// RF3 Llistat de grups

	@GetMapping("grup")
	public Iterable<Grup> getAGrup() {
		return grupRep.findAll();
	}

	// RF4 Llistat d'hora d'entrada i sortida
	@GetMapping("alumne/hora")
	public List<String> getHora() {

		List<String> llistaHora = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			llistaHora.add("Nom: " + alumneRep.findById(i).get().getNom() + ", Cognom: "
					+ alumneRep.findById(i).get().getCognom1() + ", Hora d'entrada: "
					+ alumneRep.findById(i).get().getHoraEnt() + ", Hora sortida: "
					+ alumneRep.findById(i).get().getHoraSort() + ", Aula: " + alumneRep.findById(i).get().getAula());
		}

		return llistaHora;
	}

	@GetMapping("alumne/hora/{nElement}")
	public String getHora(@PathVariable int nElement) {

		List<String> llistaHora = new ArrayList<>();
		for (long i = 1; i <= alumneRep.count(); i++) {
			llistaHora.add("Nom: " + alumneRep.findById(i).get().getNom() + ", Cognom: "
					+ alumneRep.findById(i).get().getCognom1() + ", Hora d'entrada: "
					+ alumneRep.findById(i).get().getHoraEnt() + ", Hora sortida: "
					+ alumneRep.findById(i).get().getHoraSort() + ", Aula: " + alumneRep.findById(i).get().getAula());

		}
		return llistaHora.get(nElement);
	}
	
	// afegint alumnes (Mètode Post)
	@PostMapping("alumne")
	public Alumne saveAlumne(@RequestBody Alumne alumne) {
		return alumneRep.save(alumne);
	}
	
	// Eliminant un alumne per id (Mètode Delete)
	@DeleteMapping("alumne/{id}")
	public ResponseEntity<Alumne> deleteAlumne(@PathVariable long id){
		alumneRep.deleteById(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	// Actualitzant/Modificant un alumne per id(Mètode Put)	
	@PutMapping("alumne/{id}")
	public ResponseEntity<Alumne> update(@PathVariable long id, @RequestBody Alumne alumne) {
		Alumne updateAlumne = alumneRep.findById(id).orElseThrow();
		
		updateAlumne.setNom(alumne.getNom());
		updateAlumne.setCognom1(alumne.getCognom1());
		updateAlumne.setCognom2(alumne.getCognom2());
		updateAlumne.setDataNaixement(alumne.getDataNaixement());
		updateAlumne.setDni(alumne.getDni());
		updateAlumne.setClassestotals(alumne.getClassestotals());
		updateAlumne.setFaltes(alumne.getFaltes());
		updateAlumne.setFaltesJust(alumne.getFaltesJust());
		updateAlumne.setGrup(alumne.getGrup());
		updateAlumne.setEmail(alumne.getEmail());
		updateAlumne.setAula(alumne.getAula());
		updateAlumne.setHoraEnt(alumne.getHoraEnt());
		updateAlumne.setHoraSort(alumne.getHoraSort());
		
		alumneRep.save(updateAlumne);
		return ResponseEntity.ok(updateAlumne);
	} 
}
