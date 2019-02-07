package com.oop.bean;



public class paymentBean {
	

	private int CardNumber;
	
	private int CardExpiry;
	
	private int cardcv;
	
	private int couponcode;
	

	public int getCardNumber(){

		return CardNumber;
	
	}
	public void setCardNumber(int cn){

		this.CardNumber=cn;
	}

	
	public int getCardExpiry(){

		return CardExpiry;
	
	}
	
	
	public void setCardExpiry(int ce){

		this.CardExpiry=ce;

	}
	public int getcouponcode(){

		return couponcode;
	
	}
	public void setcouponcode(int cc){

		this.couponcode=cc;
	}

	public int getcardcv(){

		return cardcv;
	}

	public void setcardcv(int cv){

		this.cardcv=cv;
	}
}

