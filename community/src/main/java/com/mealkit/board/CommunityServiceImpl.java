package com.mealkit.board;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

@Service
public class CommunityServiceImpl implements CommunityService {

  @Inject
  private CommunityDAO dao;

//  @Override
//  public void regist(CommunityVO board) throws Exception {
//    dao.write(board);
//  }
//
  @Override
  public CommunityVO read(Integer cNo) throws Exception {
    return dao.read(cNo);
  }

  @Override
  public void update(CommunityVO community) throws Exception {
    dao.update(community);
  }

  @Override
  public void delete(Integer cNo) throws Exception {
    dao.delete(cNo);
  }

  @Override
  public List<CommunityVO> list() throws Exception {
    return dao.list();
  }

//  @Override
//  public List<CommunityVO> listCriteria(Criteria cri) throws Exception {
//
//    return dao.listCriteria(cri);
//  }
//
//  @Override
//  public int listCountCriteria(Criteria cri) throws Exception {
//
//    return dao.countPaging(cri);
//  }
//
//  @Override
//  public List<CommunityVO> listSearchCriteria(SearchCriteria cri) throws Exception {
//
//    return dao.listSearch(cri);
//  }

//  @Override
//  public int listSearchCount(SearchCriteria cri) throws Exception {
//
//    return dao.listSearchCount(cri);
//  }

}
