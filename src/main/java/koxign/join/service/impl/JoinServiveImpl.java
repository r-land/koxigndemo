package koxign.join.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import koxign.join.service.JoinService;
import koxign.join.service.JoinVO;

@Service
public class JoinServiveImpl implements JoinService {

	@Autowired
	private JoinDao joinDao;

	//ID�ߺ�üũ
		public int duplicateCheck(JoinVO vo) throws Exception {
			return joinDao.duplicateCheck(vo);
		}

		@Override
		public String insertJoin(JoinVO vo) throws Exception {
			return null;
		}
		
	
		
		
	}

