package com.controller;
 




import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.pojo.Banji;
import com.pojo.User;
import com.service.BanjiService;
import com.service.UserService;
import com.utils.CommonUtil;
import com.utils.MD5;
 
@Controller
@RequestMapping("/user")  
public class UserController {
	
	@Resource(name="userService")
	private UserService userService;
	@Resource(name="banjiService")
	private BanjiService banjiService;
	
	Logger logger = Logger.getLogger(UserController.class);

	
	@RequestMapping("list")
	public String list(Model model) {
		List<User> list = userService.queryAll();
		model.addAttribute("list",list);
		return "admin/user/list";
	}
	
	@RequestMapping("update")
	public String update(Model model,User user) {
		if(userService.update(user)) {
			model.addAttribute("msg","修改用户成功");
		}else {
			model.addAttribute("msg","修改用户失败");
		}
		return "admin/user/update_do";
	}
	
	@RequestMapping("insert")
	public String insert(Model model,User user) throws NoSuchAlgorithmException {
		
		user.setPassword(MD5.getMD5(user.getPassword()));
		if(userService.add(user)) {
			model.addAttribute("msg","添加用户成功");
		}else {
			model.addAttribute("msg","添加用户失败");
		}
		return "admin/user/insert_do";
	}
	
	@RequestMapping("del")
	@ResponseBody
	public List<User> del(Model model,String userID) {
		if(userService.del(userID)) {
			List<User> list = userService.queryAll();
			return list;
		}else {		
			return null;
		}
		
	}
	
	@RequestMapping("updatepre/{userID}")
	public String updatepre(Model model,@PathVariable("userID") String userID ) {
		User user = userService.getUser(userID);
		List<Banji>  banjis= banjiService.ListAll();
		model.addAttribute("banjis",banjis);
		model.addAttribute("s",user);
		return "admin/user/update";
	}
	
	@RequestMapping("insertpre")
	public String insertpre(Model model) {
		List<Banji>  banjis= banjiService.ListAll();
		model.addAttribute("banjis",banjis);
		return "admin/user/insert";
	}
	
	@RequestMapping("/login")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response,Model model,String verifyCode,String userID,String password){
		response.setCharacterEncoding("UTF-8");
		HttpSession session = request.getSession();
		String code = (String) session.getAttribute("code");
		String input = verifyCode;
		if (!code.equalsIgnoreCase(input)) {
			
			return new ModelAndView("redirect:/login.jsp","VadalitionError","error");
		}
		
		User user = userService.getUser(userID, password);
		
		if (user != null) {
			
			if (user.getUserType().equals(CommonUtil.ADMIN)) {
				session.setAttribute("userID", userID);
				session.setAttribute("pw", password);
				session.setAttribute("userName", user.getUserName());
				return new ModelAndView("redirect:/user/adminindex/admin_main");
			} else {
				session.setAttribute("userID", userID);
				session.setAttribute("pw", password);
				session.setAttribute("userName", user.getUserName());
				
				return new ModelAndView("redirect:/user/userindex/user_main");
				
			}
		}else {
			
			return new ModelAndView("redirect:/login.jsp","userNamePasswordLevelError","error");
		}
	
	}
	
	@RequestMapping("/ImageServlet")
	public void ImageServlet(HttpServletRequest request,HttpServletResponse response) {
		try {
			BufferedImage bi=new BufferedImage(78, 30,BufferedImage.TYPE_INT_RGB);//创建图像缓冲区
	         Graphics g=bi.getGraphics(); //通过缓冲区创建一个画布
	         Color c=new Color(192,192,192); //创建颜色
	         /*根据背景画了一个矩形框
	          */
	         g.setColor(c);//为画布创建背景颜色
	         g.fillRect(0, 0, 78,30); //fillRect:填充指定的矩形
	         g.setFont(new Font("Times New Roman",Font.PLAIN,22));
	         char[] ch="ABCDEFGHJKMNPQRSTUVWXYZ23456789".toCharArray();//转化为字符型的数组
	         Random r=new Random();
	         int len=ch.length;
	         int index; //index用于存放随机数字
	         StringBuffer sb=new StringBuffer();
	         for(int i=0;i<4;i++)
	         {
	             index=r.nextInt(len);//产生随机数字
	             g.setColor(new Color(r.nextInt(88),r.nextInt(188),r.nextInt(255)));  //设置颜色
	             g.drawString(ch[index]+"",(i*15)+10, 22);//画数字以及数字的位置
	             sb.append(ch[index]);
	         }
	         request.getSession().setAttribute("code",sb.toString()); //将数字保留在session中，便于后续的使用
	         ImageIO.write(bi, "JPG", response.getOutputStream()); 
		} catch (Exception e) {
			logger.warn("User下ImageServlet出错："+e.getMessage());
		}	
		
	}
	
	@RequestMapping("/upload")
	public void upload(MultipartFile file,HttpServletRequest request,HttpServletResponse response) {
				
		try {
			response.setCharacterEncoding("UTF-8");
			PrintWriter out = response.getWriter();
			HttpSession session = request.getSession();
			String savePath = request.getSession().getServletContext().getRealPath("/")+"upload";
			String fileName = UUID.randomUUID().toString().replace("-", "").toUpperCase()+file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
			File f = new File(savePath+File.separator+fileName);						
			file.transferTo(f);	
			System.out.println("上传地址："+savePath);
			String photo = request.getContextPath()+File.separator+"upload"+File.separator+fileName;
			if(userService.updatePhoto((String)session.getAttribute("userID"),photo)) {
				out.println("<script>alert('上传成功');window.location='./userindex/frame_c';</script>");
			}else {
				out.println("<script>alert('上传失败');window.location='./userindex/frame_c';</script>");
			}

			} catch (Exception e) {
				logger.warn("User下upload出错："+e.getMessage());
				
			}
		
	}
	
	@RequestMapping("/adminindex/{urlAd}")
	public String userindex(@PathVariable("urlAd") String s) {
		return "admin/"+s;
	}
	
	@RequestMapping("/userindex/{urlAd}")
	public String adminindex(@PathVariable("urlAd") String s)  {
		return "user/"+s;
	}
	
	@RequestMapping("/loginout")
	public ModelAndView loginout(HttpServletRequest request,HttpServletResponse response){
	
		    HttpSession session = request.getSession();
		    session.invalidate();
			return new ModelAndView("redirect:/login.jsp");
		
	
	}
	
	
}
