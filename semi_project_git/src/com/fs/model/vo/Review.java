package com.fs.model.vo;

import java.sql.Date;

public class Review {
	private int memberNo;
	private String perfNo;
	private String revContent;
	private int revScore;
	private Date revDate;
	private String memberId;//
	
	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(int memberNo, String perfNo, String revContent, int revScore, Date revDate, String memberId) {
		super();
		this.memberNo = memberNo;
		this.perfNo = perfNo;
		this.revContent = revContent;
		this.revScore = revScore;
		this.revDate = revDate;
		this.memberId = memberId;
	}
	
	
	
	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}

	public String getPerfNo() {
		return perfNo;
	}

	public void setPerfNo(String perfNo) {
		this.perfNo = perfNo;
	}

	public String getRevContent() {
		return revContent;
	}

	public void setRevContent(String revContent) {
		this.revContent = revContent;
	}

	public int getRevScore() {
		return revScore;
	}

	public void setRevScore(int revScore) {
		this.revScore = revScore;
	}

	public Date getRevDate() {
		return revDate;
	}

	public void setRevDate(Date revDate) {
		this.revDate = revDate;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	@Override
	public String toString() {
		return "Review [memberNo=" + memberNo + ", perfNo=" + perfNo + ", revContent=" + revContent + ", revScore="
				+ revScore + ", revDate=" + revDate + ", memberId=" + memberId + "]";
	}
	
	
}
