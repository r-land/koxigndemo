package koxign.join.service;

public interface JoinService {

	//���̵� �ߺ�üũ
	public int duplicateCheck(JoinVO vo) throws Exception;
	
	//ȸ������
	public String insertJoin(JoinVO vo) throws Exception;

}
