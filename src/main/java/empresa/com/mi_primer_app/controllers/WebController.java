package empresa.com.mi_primer_app.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import empresa.com.mi_primer_app.models.Celular;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RestController

public class WebController {

	@GetMapping("/")
	public String root() {
		return " Root page";
	}
	@GetMapping("/hello")
	public String holaMundo(){
		return " Hola Mundo";
	}
	@GetMapping("/hola/{nombre}")
	public String holaNombre(@PathVariable("nombre") String nombre){
		return "Hola " + nombre;
	}
	
	@GetMapping("/hello/by") 
	public String holaNombre2(@RequestParam(value = "nombre", defaultValue = "pepe") String nombre){
		return "Hola " + nombre;
	}
	@GetMapping("/hola2") //http://localhost:8080/hola2?nombre=pepe
	public String Hola2(@RequestParam String nombre){
		return "Hola " + nombre;
		
	}
	@PostMapping("/celular/crear")
	public Celular crearCelular(@RequestBody Celular celular) {
		return celular;
	}
}

