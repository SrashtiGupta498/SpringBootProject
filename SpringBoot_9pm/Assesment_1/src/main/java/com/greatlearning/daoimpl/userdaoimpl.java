package com.greatlearning.daoimpl;

import com.greatlearning.dao.usersdao;
import com.greatlearning.entity.User;
import org.springframework.jdbc.core.JdbcTemplate;
public class userdaoimpl  implements usersdao{
	
	private  JdbcTemplate Template;
	@Override
	public int Userinfo(User user) {
		String query ="insert into user(Emailid ,Password) values(?,?)";
		int result = this.Template.update(query,user.getEmailid(),user.getPassword());
		return result;	
		
	}
	public JdbcTemplate getJdbcTemplate() {
		return Template;
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.Template = jdbcTemplate;
	}
	
	

}
