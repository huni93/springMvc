package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import member.MemberInfo;
import service.MemberService;

@Controller
public class MemberController {

	@Autowired
	MemberService memberService;

	@RequestMapping("/members")
	public String members(Model model) {
		List<MemberInfo> members = memberService.getMembers();
		model.addAttribute("members", members);
		return "member/members";
	}

	@RequestMapping("members/{memberId}")
	public String memberDetail(@PathVariable String memberId, Model model) {
		MemberInfo mi = memberService.getMemberInfo(memberId);
		if(mi == null) {
			return "member/memberNotFound";
		}
		model.addAttribute("member",mi);
		return "member/memberDetail";
	}
}
