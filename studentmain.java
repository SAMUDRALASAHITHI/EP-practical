package com.klu.main;
import java.util.Scanner;

import com.klu.bean.studentbean;
import com.klu.insert.studentinsertion;

public class studentmain {
	public static void main(String args[]) throws Exception
	{
	   Scanner s=new Scanner(System.in);
	   studentbean gb=new studentbean();
	   studentinsertion gid=new studentinsertion();
	   while(true) {
		   System.out.println("1.INSERTION");
		   System.out.println("2.DISPLAY");
		   System.out.println("3.TOTAL COST");
		   System.out.println("4.Exit");
		   System.out.println("ENTER choice");
		   int choice=s.nextInt();
		   switch(choice) {
		   case 1:
			   System.out.println("Enter item details as itemid,itemname,cost");
			   int num=s.nextInt();
			   String name=s.next();
			   int cost=s.nextInt();
			   gb.setItemid(num);
			   gb.setItemname(name);
			   gb.setCost(cost);
			   int result_insertion=gid.Insert(gb);
			   if(result_insertion>0)
			   {
				   System.out.println("Insertion successful");
			   }
			   else
			   {
				   System.out.println("Insertion unsucessfull");
				   
			   }
			   break;
		   case 2:
			   gid.Display();
			   break;
		   case 3:
			   
			   int total=gid.TotalCost();
			   if(total>0)
			   {
				   System.out.println("Total cost is displayed");
			   }
			   else
			   {
				    System.out.println("Total cost cannot be displayed");
				    
			   }
			   break;
		   case 4:
			   System.out.println("Thank you");
			   System.exit(0);
			   default:
				   System.out.println("please enter a valid choice");
			   
			   
		   }


		   
		   
	   }
	   
	   
	}

};