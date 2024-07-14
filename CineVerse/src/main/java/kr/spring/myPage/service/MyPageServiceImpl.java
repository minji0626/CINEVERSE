package kr.spring.myPage.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import kr.spring.board.vo.BoardCommentVO;
import kr.spring.board.vo.BoardVO;
import kr.spring.myPage.dao.MyPageMapper;
import kr.spring.myPage.vo.MyPageVO;

@Service
@Transactional
public class MyPageServiceImpl implements MyPageService{

	@Autowired
	MyPageMapper myPageMapper;
	@Override
	public MyPageVO selectMember(long mem_num) {
		return myPageMapper.selectMember(mem_num);
		
	}

	@Override
	public Integer selectMemberCoupon(long mem_num) {
		Integer coupon = myPageMapper.selectMemberCoupon(mem_num);
		return coupon != null ? coupon : 0;
	}
	@Override
	public List<MyPageVO> selectMemCouponList(Map<String, Object> map) {
		return myPageMapper.selectMemCouponList(map);
	}

	@Override
	public List<BoardVO> selectMemcBoardWriteList(Map<String, Object> map) {
		return myPageMapper.selectMemcBoardWriteList(map);
	}

	@Override
	public Integer cBoardWriteListcnt(Map<String, Object> map) {
		return myPageMapper.cBoardWriteListcnt(map);
	}
	@Override
	public Integer pointHistoryCnt(long mem_num) {
		return myPageMapper.pointHistoryCnt(mem_num);
	}

	@Override
	public List<MyPageVO> selectMemPointList(Map<String, Object> map) {
		return myPageMapper.selectMemPointList(map);
	}

	@Override
	public void updatePassword(MyPageVO mypage) {
		myPageMapper.updatePassword(mypage);
	}

	@Override
	public List<BoardCommentVO> cBoardReplyList(Map<String, Object> map) {
		return myPageMapper.cBoardReplyList(map);
	}

	@Override
	public Integer cBoardReplyListcnt(Map<String, Object> map) {
		return myPageMapper.cBoardReplyListcnt(map);
	}

	@Override
	public void updateMember_detail(MyPageVO mypage) {
		myPageMapper.updateMember_detail(mypage);
	}

	@Override
	public void updateProfile(MyPageVO myPageVO) {
		myPageMapper.updateProfile(myPageVO);
	}

	
}
