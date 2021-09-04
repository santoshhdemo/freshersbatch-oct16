

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import mvc.quest10.Employee;

@Controller
public class EmployeeController {
	List<Employee> list= Arrays.asList(
			new Employee(1,"A",12345L),
			new Employee(2,"B",67890L),
			new Employee(3,"C",98765L),
			new Employee(4,"D",43210L),
			new Employee(5,"E",7410L),
			new Employee(6,"F",8520L),
			new Employee(7,"G",9630L)
			);
	
	@RequestMapping(value="/view-employees")
	public ModelAndView home() {
		return new ModelAndView("Quest9/Home");
	}
	
	@RequestMapping(value = "/view/{offset}")
    public ModelAndView view(@PathVariable("offset")Integer offset){
        ModelAndView mv=new ModelAndView("Quest9/Employees");
        if(offset*5>list.size())
        	mv.addObject("list",list.subList((offset-1)*5,list.size()));
        else
        	mv.addObject("list",list.subList((offset-1)*5,offset*5));
        mv.addObject("length",((list.size())/5)+1);
        return mv;

    }
}
