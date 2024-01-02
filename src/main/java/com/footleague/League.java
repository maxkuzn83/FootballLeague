package com.footleague;

import java.util.Date;

public class League {
  private int id;
  private String name;
  private Date beginDate;
  private Date endDate;
  
  public int getID()
  {
	  return this.id;
  }
  
  public String getName()
  {
	  return this.name;
  }
  
  public Date getBeginDate()
  {
	  return this.beginDate;
  }
  
  public Date getEndDate()
  {
	  return this.endDate;
  }
}
