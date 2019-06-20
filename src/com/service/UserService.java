package com.service;
 
import java.io.FileInputStream;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.stereotype.Service;
 
import com.mapper.UserMapper;
import com.pojo.User;
import com.pojo.UserExample;
import com.utils.MD5;





 
@Service("userService")
public class UserService {
	@Resource
	private UserMapper userdao;
	
	private final Logger logger = Logger.getLogger(UserService.class);


	 public boolean addUserFromExcel(User user) {
	        boolean insertSuccessFlag=false;
	        try {
				if(userdao.insertSelective(user)==1) {
					insertSuccessFlag=true;
				}
			} catch (Exception e) {
				logger.warn("addUserFromExcel方法出错："+e.getMessage());
			}      
	        return insertSuccessFlag;
	 }
	 
	 public void importFromExcel(String fileName,String bjdh) {
		 try {
				// 通过得到的文件输入流inputstream创建一个HSSFWordbook对象
				HSSFWorkbook wb = new HSSFWorkbook(new FileInputStream(fileName));
				HSSFSheet sheet = wb.getSheetAt(0);// 第一个工作表

				// 遍历所有的行
				for (Row row : sheet) {
					// 第一行标题行不读取
					if (row.getRowNum() < 1) {
						continue;
					}
					
					
					String userID = row.getCell(0).toString().trim();
					String userName = row.getCell(1).toString().trim();
					addUserFromExcel(new User(userID,userName,bjdh));
					
				}
				wb.close();
			} catch (Exception e) {
				logger.warn("importFromExcel方法出现错误" + e.getMessage());
				
			}
		 
	    }
	 
	 public int findUserByUserIDAndPassword(String userID,String password) {   
	        int result = 0;
	       
	        try {
	        	password = MD5.getMD5(password);
	        	
	        	User user=userdao.findUserByUserIDAndPassword(new User(userID,password));
	            if(user!=null) {
	                if ("01".equals(user.getUserType())) {
	                    //管理员登陆成功
	                    result = 1;
	                } else {
	                    //普通用户登陆成功
	                    result = 2;
	                }
	            }else {
	                //   "登陆失败"
	                result = 3;
	            }

	        } catch (Exception e) {
	        	logger.warn("findUserByUserIDAndPassword方法出现错误" + e.getMessage());
	        }

	        return result;

	    }
	 
	 public User getUser(String userID,String password){ 
		    try {
		    	
			    password = MD5.getMD5(password);
			    User user = new User();
			    user.setUserID(userID);
			    user.setPassword(password);
				return (User)userdao.findUserByUserIDAndPassword(user);
				
			} catch (Exception e) {
				logger.warn("getUser方法出现错误" + e.getMessage());
			}
	       return null;

	   }
	 
	 public boolean checkUser(String userName) { 
		 return userdao.selectByPrimaryKey(userName)!=null;
	 }
	 
	 public boolean updatePassword(String userID, String pass) throws NoSuchAlgorithmException {
		 User user = new User();
		 user.setUserID(userID);
		 pass=MD5.getMD5(pass);
		 user.setPassword(pass);
		 return userdao.updateByPrimaryKeySelective(user)==1;
	 }
	 
	 public boolean updatePhoto(String userID, String photo) {
		 User user = new User();
		 user.setUserID(userID);
		 user.setPhoto(photo);
		 return userdao.updateByPrimaryKeySelective(user)==1;
	 }
	 
	 public User queryByUserID(String id) {
		 return (User)userdao.selectByPrimaryKey(id);
	 }
	 
	 public String querybjdhByUserID(String id) {
		 User user = userdao.selectByPrimaryKey(id);
		 return user.getBjdh();
	 }
	 
	 public boolean isExistUser(String id) {
		 return userdao.selectByPrimaryKey(id)!=null;
	 }
	 
	 public List<User> queryAll() {
		 UserExample userExample = new UserExample();
		 userExample.setDistinct(false);
		 userExample.setOrderByClause("userID asc");
		 return userdao.selectByExample(userExample);
	 }
	 
	 public boolean del(String userID) {
		 return userdao.deleteByPrimaryKey(userID)==1;
	 }
	 
	 public boolean add(User user) {
		 return userdao.insertSelective(user)==1;
	 }
	 
	 public User getUser(String userID) {
		 return (User)userdao.selectByPrimaryKey(userID);
	 }
	 
	 public boolean update(User user) {
		 return userdao.updateByPrimaryKeySelective(user)==1;
	 }
	 
	 
	 
}