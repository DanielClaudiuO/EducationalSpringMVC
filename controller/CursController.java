package ro.emanuel.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import ro.emanuel.dao.CursDAO;
import ro.emanuel.dao.PrezentaDAO;
import ro.emanuel.dao.ProfesorDAO;
import ro.emanuel.dao.StudentDAO;
import ro.emanuel.pojo.Curs;
import ro.emanuel.pojo.Prezenta;
import ro.emanuel.pojo.Profesor;
import ro.emanuel.pojo.Student;

@Controller
public class CursController {
	
//read list
	@RequestMapping(value = "list-cursuri.htm", method = RequestMethod.GET)
	public ModelAndView listCurs() throws SQLException {
		ModelMap model = new ModelMap();
		ArrayList<Curs> curs = CursDAO.getCurs();
		model.put("cursuri",curs);
		ArrayList<Profesor> profesori = ProfesorDAO.getProfesor();
		HashMap<Integer, String> profesoriMap = new HashMap<Integer, String>();
		for(Profesor f: profesori) {
			profesoriMap.put(f.getId(), f.getNume());
		}
		model.put("profesori", profesoriMap);
		return new ModelAndView("curs_web/listaCurs.jsp", model);
	}
	
	@RequestMapping(value = "home.htm", method = RequestMethod.GET)
	public ModelAndView countCurs() throws SQLException {
		ModelMap model = new ModelMap();
		ArrayList<Curs> curs = CursDAO.getCurs();
		ArrayList<Prezenta> prezenta = PrezentaDAO.getPrezenta();
		ArrayList<Profesor> profesori = ProfesorDAO.getProfesor();
		ArrayList<Student> studenti = StudentDAO.getStudent();
		model.put("cursuri",curs);
		model.put("prezente",prezenta);
		model.put("profesori",profesori);
		model.put("studenti",studenti);
		return new ModelAndView("home.jsp", model);
	}
	
	@RequestMapping(value = "create-curs.htm", method = RequestMethod.GET)
	public ModelAndView createCurs(Model model) throws SQLException {
		Curs crs=new Curs();
		model.addAttribute("curs",crs);	
		ArrayList<Profesor> prof = ProfesorDAO.getProfesor();
		model.addAttribute("profesori",prof);	
		return new ModelAndView("curs_web/addCurs.jsp","model",model);
	}
	@RequestMapping(value = "add-curs.htm", method = RequestMethod.POST)
	public ModelAndView adaugareCurs(@ModelAttribute ("curs") Curs md, ModelMap model, BindingResult result) throws SQLException {
		try {
			CursDAO.createCurs(md);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/list-cursuri.htm");
	}
	
	@RequestMapping(value = "edit-curs.htm", method = RequestMethod.GET)
	public ModelAndView editcurs(@RequestParam Integer id, Model model) throws SQLException {
		Curs crs=CursDAO.getCursByID(id);
		model.addAttribute("curs",crs);	
		return new ModelAndView("curs_web/editCurs.jsp","model",model);
	}
	
	@RequestMapping(value = "salvare-curs.htm", method = RequestMethod.POST)
	public ModelAndView salvareCurs(@ModelAttribute ("curs") Curs md, ModelMap model, BindingResult result) throws SQLException {
		try {
            CursDAO.updateCurs(md);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return new ModelAndView("redirect:/list-cursuri.htm");
		
	}
	
	
	@RequestMapping(value = "delete-curs.htm", method = RequestMethod.GET)
	public ModelAndView deletecurs(@RequestParam Integer id) throws SQLException {
		CursDAO.deleteCurs(id);
		return new ModelAndView("redirect:/list-cursuri.htm");		
	}
//	read-details
	@RequestMapping(value = "detalii-curs.htm", method = RequestMethod.GET)
	public ModelAndView detailiicurs(@RequestParam Integer id) throws SQLException { 
		ModelMap model = new ModelMap();
		Curs crs=CursDAO.getCursByID(id);
		model.put("curs",crs);
		
		ArrayList<Profesor> profesori = ProfesorDAO.getProfesor();
		for(Profesor f: profesori) {
			if(f.getId() == crs.getProfesor()) {
				model.put("numeProfesor", f.getNume());
			}
		}
		return new ModelAndView("curs_web/detaliiCurs.jsp", model);
	}
	
}
