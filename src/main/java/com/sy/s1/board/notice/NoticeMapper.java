package com.sy.s1.board.notice;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.sy.s1.board.BoardMapper;

//@Repository
@Mapper
public interface NoticeMapper extends BoardMapper {
	// setInsert 상속 받아 존재
	// setDelete 
	// NoticeMapper를 찾아오기 때문에, NAMESPACE 따로 작성하지 않아도 됨
	
}
