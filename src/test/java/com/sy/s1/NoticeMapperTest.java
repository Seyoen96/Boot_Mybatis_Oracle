package com.sy.s1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sy.s1.board.notice.NoticeMapper;
import com.sy.s1.board.notice.NoticeVO;

@SpringBootTest
class NoticeMapperTest {
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Test
	public void setInsertTest() throws Exception{
		
		NoticeVO noticeVO = new NoticeVO();
		
		noticeVO.setContents("contents1");
		noticeVO.setWriter("writer1");
		noticeVO.setTitle("title1");
		
		int res = noticeMapper.setInsert(noticeVO);
		assertEquals(1, res);
	}

//	@Test
	public void setDeleteTest() throws Exception{
		
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(1);
		int res = noticeMapper.setDelete(noticeVO);
		assertEquals(1, res);
		
	}
	
}
