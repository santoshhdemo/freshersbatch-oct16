

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController{
	List<Employee> list= Arrays.asList(
			new Employee(1,"A",12345L),
			new Employee(2,"B",67890L),
			new Employee(3,"C",98765L),
			new Employee(4,"D",43210L),
			new Employee(5,"E",7410L),
			new Employee(6,"F",8520L),
			new Employee(7,"G",9630L),
			
			);

	@RequestMapping(value="/report", method=RequestMethod.GET)
	public ModelAndView employeeXls(HttpServletRequest req, HttpServletResponse res) {
		
		String type= req.getParameter("type");
		
		if(type!=null && type.equals("xls"))
			return new ModelAndView(new ExcelView(), "employeeList", list);
		
		return new ModelAndView("Quest10/EmployeeListReport", "employeeList", list);
	}
}
