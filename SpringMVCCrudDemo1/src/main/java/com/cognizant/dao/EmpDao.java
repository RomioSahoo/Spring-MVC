package com.cognizant.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.cognizant.beans.Emp;    
    
public class EmpDao {    
JdbcTemplate template;    
    
public void setTemplate(JdbcTemplate template) {    
    this.template = template;    
}    
public int save(Emp p){    
    String sql="insert into emp_info102(name,salary,designation) values('"+p.getName()+"',"+p.getSalary()+",'"+p.getDesignation()+"')";    
    return template.update(sql);    
}    
public int update(Emp p){    
    String sql="update emp_info102 set name='"+p.getName()+"', salary="+p.getSalary()+",designation='"+p.getDesignation()+"' where id="+p.getId()+"";    
   return template.update(sql);    
}    
public int delete(int id){    
	String sql="delete from emp_info102 where id="+id+"";    
	return template.update(sql);    
}    
public Emp getEmpById(int id){    
    String sql="select * from emp_info102 where id=?";    
    return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));    
}    
public List<Emp> getEmployees(){    
   /*return template.query("select * from emp_info101",new RowMapper<Emp>(){    
        public Emp mapRow(ResultSet rs, int row) throws SQLException {    
            Emp e=new Emp();    
            e.setId(rs.getInt(1));    
            e.setName(rs.getString(2));    
            e.setSalary(rs.getInt(3));    
            e.setDesignation(rs.getString(4));    
            return e;    
        }    
    });*/
	
	return template.query("select * from emp_info102",new ResultSetExtractor<List<Emp>>()
			{
		  
	     public List<Emp> extractData(ResultSet rs) throws SQLException,  DataAccessException {  
	      
	        List<Emp> list=new ArrayList<Emp>();  
	        while(rs.next()){  
	        Emp e=new Emp();  
	        e.setId(rs.getInt(1));  
	        e.setName(rs.getString(2));  
	        e.setSalary(rs.getInt(3));  
	        list.add(e);  
	        }  
	        return list;  
	        }  
	    });  
		
			
}    
}   
