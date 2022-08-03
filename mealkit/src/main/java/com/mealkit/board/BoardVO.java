package com.mealkit.board;

import java.util.Date;

public class BoardVO {
	
	private Integer bno;
	private String title;
	private String content;
	private String mId;
	private int mLevel;
	private Date regDate;
	private int viewcnt;
	
	public Integer getBno() {
		return bno;
	}
	
	public void setBno(Integer bno) {
		this.bno = bno;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getmId() {
		return mId;
	}
	
	public void setmId(String mId) {
		this.mId = mId;
	}
	
	public int getmLevel() {
		return mLevel;
	}
	
	public void setmLevel(int mLevel) {
		this.mLevel = mLevel;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public int getViewcnt() {
		return viewcnt;
	}
	
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [bno=" + bno + ", title=" + title + ", content=" + content + ", mId=" + mId + ", mLevel="
				+ mLevel + ", regDate=" + regDate + ", viewcnt=" + viewcnt + "]";
	}
	
}
