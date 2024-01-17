package controller;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import event.Event;
import event.EventService;
import event.EventType;
import event.SearchOption;

@Controller
@RequestMapping("/event/")
public class EventController {
	
  private EventService eventService = new EventService();
  
  @ModelAttribute("recEventList") //model.addAttribute("recEvenList",return List<Event>)
  public List<Event> recommend() {
	  return eventService.getRecommendedEventService();
  }
  
	@RequestMapping("list")
	public String list(Model model, SearchOption option) { //Model : Request 역활
		System.out.println(option);
		List<Event> eventList = eventService.getOpenedEventList(option);
		System.out.println(eventList.size());
		model.addAttribute("eventList",eventList); //request.setAttribute
		model.addAttribute("eventTypes",EventType.values()); //enum
		return "event/list";
	}
	
	@InitBinder  //400에러 방지
	protected void initBinder(WebDataBinder binder) {
		CustomDateEditor dateEditor = new CustomDateEditor (
			new SimpleDateFormat("yyyMMdd"), true);
		binder.registerCustomEditor(Date.class, dateEditor);
		}
	
	@RequestMapping("detail")
	public String detail(Model model, SearchOption option) { //Model :request역활
		
		return "event/detail";
	}
	}

