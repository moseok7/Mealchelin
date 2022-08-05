package com.mealkit.board;

import java.util.List;

public interface CommunityService {

//  public void regist(CommunityVO board) throws Exception;
//
  public CommunityVO read(Integer cNo) throws Exception;

  public void update(CommunityVO board) throws Exception;

  public void delete(Integer cNo) throws Exception;

  public List<CommunityVO> list() throws Exception;

//  public List<CommunityVO> listCriteria(Criteria cri) throws Exception;
//
//  public int listCountCriteria(Criteria cri) throws Exception;
//
//  public List<CommunityVO> listSearchCriteria(SearchCriteria cri) 
//      throws Exception;

//  public int listSearchCount(SearchCriteria cri) throws Exception;

}
