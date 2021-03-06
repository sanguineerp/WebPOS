package com.sanguine.webpos.bean;

public class clsPOSGroupSubGroupWiseSales {
	
	private String groupCode;
    private String subGroupCode;  
    private String groupName;
    private String subGroupName;
    private String posName;
    private double qty;
    private double subTotal;
    private double salesAmt;
    private double discAmt;
    private double grandTotal;
    private double dblNetTotalPlusTax;
    private double dblNetTotal;
    private int intNoOfBills;
    private double dblGroupWiseAIPBAvg;
    private String strAreaName;
   	public clsPOSGroupSubGroupWiseSales()
    {
        
    }        
    //for groupWise sales
    public clsPOSGroupSubGroupWiseSales(String groupCode, String groupName, String posName, double qty, double subTotal, double salesAmt, double discAmt,double grandTotal)
    {
        this.groupCode = groupCode;
        this.groupName = groupName;
        this.posName = posName;
        this.qty = qty;
        this.subTotal = subTotal;
        this.salesAmt = salesAmt;
        this.discAmt = discAmt;
        this.grandTotal = grandTotal;
    }   
    
    //for subGroupWise sales
    public clsPOSGroupSubGroupWiseSales(String subGroupCode, String subGroupName,double qty, double subTotal, double salesAmt, double discAmt, String posName)
    {
        this.subGroupCode = subGroupCode;
        this.subGroupName = subGroupName;
        this.posName = posName;
        this.qty = qty;
        this.subTotal = subTotal;
        this.salesAmt = salesAmt;
        this.discAmt = discAmt;
    }  

    public String getGroupCode()
    {
        return groupCode;
    }

    public void setGroupCode(String groupCode)
    {
        this.groupCode = groupCode;
    }

    public String getGroupName()
    {
        return groupName;
    }

    public void setGroupName(String groupName)
    {
        this.groupName = groupName;
    }

    public String getSubGroupCode()
    {
        return subGroupCode;
    }

    public void setSubGroupCode(String subGroupCode)
    {
        this.subGroupCode = subGroupCode;
    }

    public String getSubGroupName()
    {
        return subGroupName;
    }

    public void setSubGroupName(String subGroupName)
    {
        this.subGroupName = subGroupName;
    }
    
    public String getPosName()
    {
        return posName;
    }

    public void setPosName(String posName)
    {
        this.posName = posName;
    }

    public double getQty()
    {
        return qty;
    }

    public void setQty(double qty)
    {
        this.qty = qty;
    }

    public double getSubTotal()
    {
        return subTotal;
    }

    public void setSubTotal(double subTotal)
    {
        this.subTotal = subTotal;
    }

    public double getSalesAmt()
    {
        return salesAmt;
    }

    public void setSalesAmt(double salesAmt)
    {
        this.salesAmt = salesAmt;
    }

    public double getDiscAmt()
    {
        return discAmt;
    }

    public void setDiscAmt(double discAmt)
    {
        this.discAmt = discAmt;
    }

    public double getGrandTotal() {
        return grandTotal;
    }

    public void setGrandTotal(double grandTotal) {
        this.grandTotal = grandTotal;
    }
	public double getDblNetTotalPlusTax() {
		return dblNetTotalPlusTax;
	}
	public void setDblNetTotalPlusTax(double dblNetTotalPlusTax) {
		this.dblNetTotalPlusTax = dblNetTotalPlusTax;
	}
	public double getDblNetTotal()
	{
		return dblNetTotal;
	}
	public void setDblNetTotal(double dblNetTotal)
	{
		this.dblNetTotal = dblNetTotal;
	}
	
	public int getIntNoOfBills()
	{
		return intNoOfBills;
	}
	public void setIntNoOfBills(int intNoOfBills)
	{
		this.intNoOfBills = intNoOfBills;
	}
	public double getDblGroupWiseAIPBAvg()
	{
		return dblGroupWiseAIPBAvg;
	}
	public void setDblGroupWiseAIPBAvg(double dblGroupWiseAIPBAvg)
	{
		this.dblGroupWiseAIPBAvg = dblGroupWiseAIPBAvg;
	}
	public String getStrAreaName()
	{
		return strAreaName;
	}
	public void setStrAreaName(String strAreaName)
	{
		this.strAreaName = strAreaName;
	}

}
