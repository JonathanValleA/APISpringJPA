package jpa.spring.project.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import jpa.spring.project.entitats.Alumne;
import jpa.spring.project.entitats.Grup;
import jpa.spring.project.repositoris.AlumneRepositori;
import jpa.spring.project.repositoris.GrupRepositori;


@RestController
@RequestMapping("api")
public class AlumneController {
	
	@Autowired         //diu a Spring que crei ell l'objecte
	AlumneRepositori alumneRep; //no cal fer new ja que ho fa spring
	GrupRepositori grupRep;
	
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
	public List<String> getFaltes(){
	    
	    List<String> llistaAlumnes = new ArrayList<>();
	    
	    for (long i=0; i<alumneRep.count(); i++)
	        llistaAlumnes.add("Nom: "+alumneRep.findById(i).get().getNom()+ " Cognom: "+ alumneRep.findById(i).get().getCognom1() 
	                + " Faltes: " + alumneRep.findById(i).get().getFaltes() 
	                + " Faltas justificadas: "+alumneRep.findById(i).get().getFaltesJust() 
	                + " Percentatge de faltes Justificadas: "+(((double)alumneRep.findById(i).get().getFaltesJust()*100)/(alumneRep.findById(i).get().getFaltes())) + " %");
	    
	    return llistaAlumnes;
	}
	
	@GetMapping("alumne/faltes/{nElement}")
	public String getFaltes(@PathVariable int nElement){
	    
	    List<String> llistaAlumnes = new ArrayList<>();
	    for (long i=0; i<alumneRep.count(); i++)
	        llistaAlumnes.add("Nom: "+alumneRep.findById(i).get().getNom()+ " Cognom: "+ alumneRep.findById(i).get().getCognom1() 
	                + " Faltes: " + alumneRep.findById(i).get().getFaltes() 
	                + " Faltas justificadas: "+alumneRep.findById(i).get().getFaltesJust() 
	                + " Percentatge de faltes Justificadas: "+(((double)alumneRep.findById(i).get().getFaltesJust()*100)/(alumneRep.findById(i).get().getFaltes())) + " %");
	    
	    return llistaAlumnes.get(nElement);
	}
	
	
	@GetMapping("alumne/smix1")
	public List<String> getGrupAlumne(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("SMIX1")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	
	@GetMapping("alumne/smix2")
	public List<String> getGrupAlumne2(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("SMIX2")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	@GetMapping("alumne/daw1")
	public List<String> getGrupAlumne3(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAW1")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	@GetMapping("alumne/daw2")
	public List<String> getGrupAlumne4(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAW2")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	@GetMapping("alumne/dam1")
	public List<String> getGrupAlumne5(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAM1")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	@GetMapping("alumne/dam2")
	public List<String> getGrupAlumne6(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("DAM2")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	@GetMapping("alumne/asix1")
	public List<String> getGrupAlumne7(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("ASIX1")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	@GetMapping("alumne/asix2")
	public List<String> getGrupAlumne8(){
		
		List<String> llistaGrup = new ArrayList<>();
		for(long i=0; i<alumneRep.count(); i++) {
			if(alumneRep.findById(i).get().getGrup().toUpperCase().equals("ASIX2")) {
				llistaGrup.add("Grup: "+alumneRep.findById(i).get().getGrup()+", Nom: "+alumneRep.findById(i).get().getNom()+ ", Cognom: "+ alumneRep.findById(i).get().getCognom1()+", Email: "+alumneRep.findById(i).get().getEmail());
			}
		}
		return llistaGrup;
	}
	
	//Mapping per a retorn de grup
	
	
	@GetMapping("grup")
	public Iterable<Grup> getAGrup() {
		return grupRep.findAll();
	}

}


