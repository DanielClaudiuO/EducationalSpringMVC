package ro.emanuel.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ro.emanuel.dao.ProfesorDAO;
import ro.emanuel.pojo.Profesor;


@Controller
public class ProfesorController {
	
//read list
	@RequestMapping(value = "list-profesori.htm", method = RequestMethod.GET)
	public ModelAndView listProfesor() throws SQLException {
		ModelMap model = new ModelMap();
		ArrayList<Profesor> profesor = ProfesorDAO.getProfesor();
		model.put("profesori",profesor);
		return new ModelAndView("profesor_web/listaProfesor.jsp", model);

	}
	
	@RequestMapping(value = "create-profesor.htm", method = RequestMethod.GET)
	public ModelAndView createProfesor(Model model) throws SQLException {
		Profesor pr=new Profesor();
		model.addAttribute("profesor",pr);	
		return new ModelAndView("profesor_web/addProfesor.jsp","model",model);
	}
	@RequestMapping(value = "add-profesor.htm", method = RequestMethod.POST)
	public ModelAndView adaugareProfesor(@ModelAttribute ("profesor") Profesor md, ModelMap model, BindingResult result) throws SQLException {
		try {
			ProfesorDAO.createProfesor(md);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/list-profesori.htm");
	}
	
	@RequestMapping(value = "editare-profesor.htm", method = RequestMethod.GET)
	public ModelAndView editProfesor(@RequestParam Integer id, Model model) throws SQLException {
		Profesor pr=ProfesorDAO.getProfesorByID(id);
		model.addAttribute("profesor",pr);	
		return new ModelAndView("profesor_web/editProfesor.jsp","model",model);
	}
	
	@RequestMapping(value = "salvare-profesor.htm", method = RequestMethod.POST)
	public ModelAndView salvareProfesor(@ModelAttribute ("profesor") Profesor md, ModelMap model, BindingResult result) throws SQLException {
		try {
            ProfesorDAO.updateProfesor(md);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return new ModelAndView("redirect:/list-profesori.htm");
		
	}
	
	
	@RequestMapping(value = "delete-profesor.htm", method = RequestMethod.GET)
	public ModelAndView deleteprofesor(@RequestParam Integer id) throws SQLException {
		ProfesorDAO.deleteProfesor(id);
		return new ModelAndView("redirect:/list-profesori.htm");		
	}
//	read-details
	@RequestMapping(value = "detalii-profesor.htm", method = RequestMethod.GET)
	public ModelAndView detailiiprofesor(@RequestParam Integer id) throws SQLException { 
		ModelMap model = new ModelMap();
		Profesor dr=ProfesorDAO.getProfesorByID(id);
		model.put("profesor",dr);
		return new ModelAndView("profesor_web/detaliiProfesor.jsp", model);
	}
	
}
