package com.sopra.servlet;
 
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.*;
import org.springframework.stereotype.Controller;
import com.sopra.Estudiante;
import java.util.ArrayList;


@Controller
public class EstudianteController{
	
	private static ArrayList<Estudiante> estudiantesList = new ArrayList<Estudiante>();
	private String guardoNom, guardoApe, guardoCur;
	
	@RequestMapping(value="/estudiante", method=RequestMethod.GET)
	public ModelAndView estudiante(){
		return new ModelAndView("estudiante", "command", new Estudiante());
	}
	
	@RequestMapping(value="/addEstudiante", method=RequestMethod.POST)
	public String addEstudiante(@ModelAttribute Estudiante estudiante, ModelMap modelo){
		guardoNom = estudiante.getNombre();
		guardoApe = estudiante.getApellidos();
		guardoCur = estudiante.getCurso();
		modelo.addAttribute("id", estudiante.getId());
		modelo.addAttribute("nombre", guardoNom);
		modelo.addAttribute("apellidos", guardoApe);
		modelo.addAttribute("edad", estudiante.getEdad());
		modelo.addAttribute("curso", guardoCur);		
		estudiantesList.add(estudiante);
		
		return "resultado";
	}
		
	@RequestMapping(value="/bienvenidaEstudiante", method=RequestMethod.POST)
	public String bienvenidaEstudiante(@ModelAttribute Estudiante estudiante, ModelMap modelo){
		
		int j=estudiantesList.size();
		StringBuffer sb = new StringBuffer();
		modelo.addAttribute("nombreB", guardoNom);
		modelo.addAttribute("apellidosB", guardoApe);
		modelo.addAttribute("cursoB", guardoCur);
		String guardo = guardoCur.trim();
		//se pone j-1 para que salga la lista de todos menos de la persona registrada
		//asi salen los compañeros de la persona registrada
		for(int i=0; i<j-1 ; i++){
			if(guardo.equals(((Estudiante)estudiantesList.get(i)).getCurso())){
				sb.append(((Estudiante)estudiantesList.get(i)).getNombre() + " " + ((Estudiante)estudiantesList.get(i)).getApellidos() + ",\n\n");
			}
		}
		modelo.addAttribute("listacursoB", sb.toString() + "\n\n");
				
		return "bienvenida";
	}
	
	@RequestMapping(value="/mediaEstudiante", method=RequestMethod.POST)
	public String mediaEstudiante(@ModelAttribute Estudiante estudiante, ModelMap modelo){
		System.out.println(estudiantesList.size());
		int j=estudiantesList.size();
		double media = 0;
		int cont = 0;
		modelo.addAttribute("cursoC", guardoCur);
		String guardo = guardoCur.trim();
		for(int i=0; i<j ; i++){
			if(guardo.equals(((Estudiante)estudiantesList.get(i)).getCurso())){
				media += ((Estudiante)estudiantesList.get(i)).getEdad();
				cont++;
			}
		}
		media = media/cont;
		modelo.addAttribute("media", media);
				
		return "media";
	}
}

