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

import ro.emanuel.dao.PrezentaDAO;
import ro.emanuel.pojo.Prezenta;

@Controller
public class PrezentaController {
	
//read list
	@RequestMapping(value = "list-prezente.htm", method = RequestMethod.GET)
	public ModelAndView listPrezenta() throws SQLException {
		ModelMap model = new ModelMap();
		ArrayList<Prezenta> prezente = PrezentaDAO.getPrezenta();
		model.put("prezente",prezente);
		return new ModelAndView("prezenta_web/listaPrezenta.jsp", model);

	}
	
	@RequestMapping(value = "create-prezenta.htm", method = RequestMethod.GET)
	public ModelAndView createPrezenta(Model model) throws SQLException {
		Prezenta prez=new Prezenta();
		model.addAttribute("prezenta",prez);	
		return new ModelAndView("prezenta_web/addPrezenta.jsp","model",model);
	}
	@RequestMapping(value = "add-prezenta.htm", method = RequestMethod.POST)
	public ModelAndView adaugareprezenta(@ModelAttribute ("prezenta") Prezenta prz, ModelMap model, BindingResult result) throws SQLException {
		try {
			PrezentaDAO.createPrezenta(prz);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/list-prezente.htm");
	}
	
	@RequestMapping(value = "edit-prezenta.htm", method = RequestMethod.GET)
	public ModelAndView editPrezenta(@RequestParam Integer id, Model model) throws SQLException {
		Prezenta prz=PrezentaDAO.getPrezentaByID(id);
		model.addAttribute("prezenta",prz);	
		return new ModelAndView("prezenta_web/editPrezenta.jsp","model",model);
	}
	
	@RequestMapping(value = "salvare-prezenta.htm", method = RequestMethod.POST)
	public ModelAndView salvarePrezenta(@ModelAttribute ("prezenta") Prezenta md, ModelMap model, BindingResult result) throws SQLException {
		try {
            PrezentaDAO.updatePrezenta(md);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return new ModelAndView("redirect:/list-prezente.htm");
		
	}
	
	
	@RequestMapping(value = "delete-prezenta.htm", method = RequestMethod.GET)
	public ModelAndView deletePrezenta(@RequestParam Integer id) throws SQLException {
		PrezentaDAO.deletePrezenta(id);
		return new ModelAndView("redirect:/list-prezente.htm");		
	}
//	read-details
	@RequestMapping(value = "detalii-prezenta.htm", method = RequestMethod.GET)
	public ModelAndView detailiiPrezenta(@RequestParam Integer id) throws SQLException { 
		ModelMap model = new ModelMap();
		Prezenta prz=PrezentaDAO.getPrezentaByID(id);
		model.put("prezenta",prz);
		return new ModelAndView("prezenta_web/detaliiPrezenta.jsp", model);
	}
	
}
