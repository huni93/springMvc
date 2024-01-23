package controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import member.MemberInfo;
import service.MemberService;

@RestController  //@responseBody를 사용하지 않아도 된다.
public class RestJsonController {

	@Autowired
	MemberService memberService;
	
	@RequestMapping("/rest/list")
	public List<MemberInfo> jsonList() {
		return memberService.getMembers();
	}
	@RequestMapping("/rest/map")
	public Map<String, MemberInfo> jsonMap() {
		return memberService.memberMap;
	}
}
