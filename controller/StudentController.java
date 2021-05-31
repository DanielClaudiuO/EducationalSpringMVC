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

import ro.emanuel.dao.StudentDAO;
import ro.emanuel.pojo.Student;

@Controller
public class StudentController {
	
//read list
	@RequestMapping(value = "list-studenti.htm", method = RequestMethod.GET)
	public ModelAndView listStudent() throws SQLException {
		ModelMap model = new ModelMap();
		ArrayList<Student> student = StudentDAO.getStudent();
		model.put("studenti",student);
		return new ModelAndView("student_web/listaStudent.jsp", model);

	}
	
	@RequestMapping(value = "create-student.htm", method = RequestMethod.GET)
	public ModelAndView createStudent(Model model) throws SQLException {
		Student pr=new Student();
		model.addAttribute("student",pr);	
		return new ModelAndView("student_web/addStudent.jsp","model",model);
	}
	@RequestMapping(value = "add-student.htm", method = RequestMethod.POST)
	public ModelAndView adaugareStudent(@ModelAttribute ("student") Student pr, ModelMap model, BindingResult result) throws SQLException {
		try {
			StudentDAO.createStudent(pr);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return new ModelAndView("redirect:/list-studenti.htm");
	}
	
	@RequestMapping(value = "editare-student.htm", method = RequestMethod.GET)
	public ModelAndView editStudent(@RequestParam Integer id, Model model) throws SQLException {
		Student st=StudentDAO.getStudentByID(id);
		model.addAttribute("student",st);	
		return new ModelAndView("student_web/editStudent.jsp","model",model);
	}
	
	@RequestMapping(value = "salvare-student.htm", method = RequestMethod.POST)
	public ModelAndView salvareStudent(@ModelAttribute ("student") Student pr, ModelMap model, BindingResult result) throws SQLException {
		try {
            StudentDAO.updateStudent(pr);
        } catch (SQLException e) {
            e.printStackTrace();
        }
		return new ModelAndView("redirect:/list-studenti.htm");
		
	}
	
	
	@RequestMapping(value = "delete-student.htm", method = RequestMethod.GET)
	public ModelAndView deleteStudenti(@RequestParam Integer id) throws SQLException {
		StudentDAO.deleteStudent(id);
		return new ModelAndView("redirect:/list-studenti.htm");		
	}
//	read-details
	@RequestMapping(value = "detalii-student.htm", method = RequestMethod.GET)
	public ModelAndView detailiiStudenti(@RequestParam Integer id) throws SQLException { 
		ModelMap model = new ModelMap();
		Student st=StudentDAO.getStudentByID(id);
		model.put("student",st);
		return new ModelAndView("student_web/detaliiStudent.jsp", model);
	}
	
}
