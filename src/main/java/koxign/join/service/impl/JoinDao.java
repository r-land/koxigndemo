package koxign.join.service.impl;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import koxign.join.service.JoinVO;
@Mapper
@Repository
public interface JoinDao {

	//ID�ߺ�üũ
	int duplicateCheck(JoinVO vo) throws Exception;
	
	//ȸ�����
	void insertJoin(JoinVO vo) throws Exception;
	
		}
