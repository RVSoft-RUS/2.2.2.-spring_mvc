package web.controller;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;

@Controller
@RequestMapping("/")
public class HelloController {
	@Autowired
	private CarService carService;

	@RequestMapping(value = "hello", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		List<String> messages = new ArrayList<>();
		messages.add("Hello!");
		messages.add("I'm Spring MVC application");
		messages.add("5.2.0 version by sep'19 ");
		model.addAttribute("messages", messages);
		return "hello";
	}

	@RequestMapping(value = "cars", method = RequestMethod.GET)
	public String printCars(@RequestParam(value = "locale", required = false,
			defaultValue = "ru") String locale, ModelMap model) {
//		ResourceBundle resourceBundle = null;
		List<String> messages = new ArrayList<>();
		if (locale.equals("ru")) {
//			resourceBundle = ResourceBundle.getBundle("messages.properties", new Locale("ru", "RU"));
			messages.add("МАШИНЫ");
		}
		if (locale.equals("en")) {
//			resourceBundle = ResourceBundle.getBundle("resources.lang.properties", new Locale("en", "EN"));
			messages.add("CARS");
		}


		List<Car> carList = carService.getAllCars();
		model.addAttribute("messages", messages);
		model.addAttribute("carList", carList);
		return "cars";
	}

	@GetMapping("/raw")
	@ResponseBody
	public String raw() {
		return "raw data";
	}
}