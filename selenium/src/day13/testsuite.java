package day13;

import com.orgHRM.Master.orgMaster;

public class testsuite {

	public static void main(String[] args)
	{
//		//login TC
		orgMaster om=new orgMaster();
//		
//		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
//		System.out.println(res);
//		
//		res=om.org_Login("Admin", "admin");
//		System.out.println(res);
//		
//		res=om.org_Logout();
//		System.out.println(res);
//		
//		om.org_Close();
//		
//		
//		//emp reg
//		
//		res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
//		System.out.println(res);
//		
//		res=om.org_Login("Admin", "admin");
//		System.out.println(res);
//		
//		res=om.org_Empreg("Venki","CH");
//		System.out.println(res);
//		
//		res=om.org_Logout();
//		System.out.println(res);
//		
//		om.org_Close();
		
		//userreg
		
//		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
//		System.out.println(res);
//		
//		res=om.org_Login("Admin", "admin");
//		System.out.println(res);
//		
//		res=om.org_Userreg("Venki CH", "Venki123456", "Venki123456", "Venki123456");
//		System.out.println(res);
//		
//		res=om.org_Logout();
//		System.out.println(res);
//		
//		om.org_Close();
		
		//user Login Tc
		
		String res=om.org_Launch("http://opensource.demo.orangehrmlive.com/");
		System.out.println(res);
		
		res=om.org_Login("Venki123456", "Venki123456");
		System.out.println(res);
		
		res=om.org_Logout();
		System.out.println(res);
		
		om.org_Close();

	}

}
