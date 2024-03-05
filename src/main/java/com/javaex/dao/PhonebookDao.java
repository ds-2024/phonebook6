package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.PersonVo;

@Repository
public class PhonebookDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public int personInsert(PersonVo personVo) {
		System.out.println("PhonebookDao.personInsert()");
		
		
	
		
		return sqlSession.insert("phonebook.insert",personVo);
	}

	public List<PersonVo> personSelect(){
		System.out.println("phonebookDao.exeList()");
		List<PersonVo> personList = sqlSession.selectList("phonebook.select");
		System.out.println(personList);
		return personList;
	}
}
