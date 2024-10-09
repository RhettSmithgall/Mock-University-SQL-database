import java.io.IOException;
import java.util.ArrayList; // import the ArrayList class

import java.sql.*;

import javax.swing.JFrame;

import java.io.*;

public class DatabaseProject {
	

	public static void main(String[] args)throws SQLException{
//forms

		//System.out.print("userid: ");
		String uid = "g03";

		//System.out.print("password: ");
		String pword = "kh8nDbN7";

		String url = "jdbc:oracle:thin:@cisvm-oracle.unfcsd.unf.edu:1521:orcl";
		// Load the Oracle JDBC driver

		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		// Connect to the database

		Connection conn = DriverManager.getConnection (url, uid, pword);

		displayTitle();
		boolean MenuFlag = true;

		while(MenuFlag)
		{
			//databaseGui gui = new databaseGui(conn);
			//gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			//gui.setVisible(true);

			
			mainMenu();	
			

			switch(getInt()) {
			case 1:
				addMenu(conn);
				break;
			case 2:
				getGradeReport(conn);
				break;
			case 3:
				getCoursebyDepartment(conn);
				break;
			case 4:
				getCoursesbyInstructor(conn);
				break;
			case 5:
				checkPrerequisites(conn);
				break;
			case 6:
				MenuFlag = false;
				break;
			default:
				System.out.printf("Please select a valid option\n");
				break;

			}


		}
		goodbyeUser();
		if(!conn.isClosed()) { conn.close(); }
	}
	
	public static boolean checkPrerequisites(Connection conn, String studentID, String courseNum) {
		ArrayList<String> prereqs = new ArrayList<String>();
		ArrayList<String> completed = new ArrayList<String>();

		boolean satisfied = false;
		
		
		// Prompt for student's N# & course#
		System.out.println("Enter Student's N Number:");
		System.out.println("Enter Course Number:");
		
		// Build query for
		String qPrereqs = "SELECT prereqnum\n"
				+ "FROM REQUIRES_PREREQUISITE\n"
				+ "WHERE coursenum = '" + courseNum + "'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(qPrereqs);
			ResultSet rset = pstmt.executeQuery();
			
			while(rset.next()) {
				prereqs.add(rset.getString(1));
			}
			
			if (prereqs.isEmpty()) { return true; }
			
			String qCompleted = "SELECT coursenum\n"
					+ "FROM ENROLLED_IN\n"
					+ "WHERE studentnum = '" + studentID + "' AND lettergrade != 'F' AND\n"
					+ "lettergrade != 'D' AND coursenum = ANY (SELECT prereqnum\n"
					+ "FROM REQUIRES_PREREQUISITE\r\n"
					+ "WHERE coursenum = '" + courseNum + "')";
			
	
			pstmt = conn.prepareStatement(qCompleted);
			rset = pstmt.executeQuery();
			
	
			while(rset.next()) {
				completed.add(rset.getString(1));
			}
			
			for (int i = 0; i < prereqs.size(); i++) {
				satisfied = completed.contains(prereqs.get(i));
			}
			
			return satisfied;
			
		} catch (SQLException e) {
	    	System.out.printf("Error: Something went wrong while checking prerequisites\n");
	    	System.out.printf("%s\n", e.getMessage());
			return false;
	    }
		

		
	}
	
	public static void checkPrerequisites(Connection conn) {
		ArrayList<String> prereqs = new ArrayList<String>();
		ArrayList<String> completed = new ArrayList<String>();

		boolean satisfied = false;
		
		// Prompt for student's N# & course#
		System.out.println("Enter Student's N Number:");
		String studID = getString();
		System.out.println("Enter Course Number:");
		String courseNum = getString();
		
		// Build query for
		String qPrereqs = "SELECT prereqnum\n"
				+ "FROM REQUIRES_PREREQUISITE\n"
				+ "WHERE coursenum = '" + courseNum + "'";
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(qPrereqs);
			ResultSet rset = pstmt.executeQuery();
			
			while(rset.next()) {
				prereqs.add(rset.getString(1));
			}  
			
			String qCompleted = "SELECT coursenum\n"
					+ "FROM ENROLLED_IN\n"
					+ "WHERE studentnum = '" + studID + "' AND lettergrade != 'F' AND\n"
					+ "lettergrade != 'D' AND coursenum = ANY (SELECT prereqnum\n"
					+ "FROM REQUIRES_PREREQUISITE\r\n"
					+ "WHERE coursenum = '" + courseNum + "')";
			
	
			pstmt = conn.prepareStatement(qCompleted);
			rset = pstmt.executeQuery();
			
	
			while(rset.next()) {
				completed.add(rset.getString(1));
			}
			
			for (int i = 0; i < prereqs.size(); i++) {
				satisfied = completed.contains(prereqs.get(i));
			}
			
			if (prereqs.isEmpty()) { satisfied = true; }
			
			if (satisfied) {
				System.out.println("Student satisfies the prerequisite requirements");
			} else {
				System.out.println("Student does NOT satisfy the prerequisite requirements");
			}
			
			
		} catch (SQLException e) {
	    	System.out.printf("Error: Something went wrong while checking prerequisites\n");
	    	System.out.printf("%s\n", e.getMessage());
	    }
		
	}

	private static ArrayList<String> getCoursesbyInstructor(Connection conn) throws SQLException {
		// still need to implement in GUI
		
		ArrayList<String> courses = new ArrayList<String>();
		
		// get name
		System.out.println("Please enter Instructor's First name: ");
		String fname = getString();
		System.out.println("Please enter Instructor's Last name: ");
		String lname = getString();
		
		// query using Name
		String q = "select COURSENAME " + 
			"from COURSE, INSTRUCTOR, TEACHES " + 
			"where COURSE.COURSENUM = TEACHES.COURSENUM AND "
			+ "INSTRUCTOR.INSTNUM = TEACHES.INSTNUM "
			+ "AND FNAME = '" + fname + "' AND LNAME = '" + lname + "'";
		
		// make + execute query
		PreparedStatement pstmt = conn.prepareStatement(q);
		ResultSet rset = pstmt.executeQuery();
					
		// print out results
		while(rset.next()) {
		String cname = rset.getString("COURSENAME");
		courses.add(cname);
		System.out.println(cname); // error checking
		}
		return courses;
	}

	private static ArrayList<String> getCoursebyDepartment(Connection conn) throws SQLException {
		// still need to implement in GUI
		
		// variables
		ArrayList<String> courses = new ArrayList<String>();
		boolean done = false;
		String q;
		
		do {
			// User chooses dept name or code
			System.out.println("Entering Department Name or Code?");
			System.out.println("(Enter: 1 for Name, 2 for Code");
			
			int v = getInt();
			if (v == 1) {
				// get name
				System.out.println("Please enter Department Name: ");
				String name = getString();
				
				// query using Dept Name
				q = "select COURSENAME " + 
					"from DEPARTMENT, COURSE, OFFERS " + 
					"where CODE = DEPTCODE AND OFFERS.COURSENUM = COURSE.COURSENUM AND DEPTNAME = '" + name + "'";
				
			}
			else if(v == 2) {
				// get code
				System.out.println("Please enter Department code: ");
				String code = getString();
				
				// query using Dept code
				q = "select COURSENAME " + 
					"from DEPARTMENT, COURSE, OFFERS " + 
					"where CODE = DEPTCODE AND OFFERS.COURSENUM = COURSE.COURSENUM AND DEPTCODE = '" + code + "'";
				
			}
			else {
				System.out.println("Invalid input, please try again.");
				continue;
			}
			
			// make + execute query
			PreparedStatement pstmt = conn.prepareStatement(q);
			ResultSet rset = pstmt.executeQuery();
			
			// get results
			while(rset.next()) {
				String cname = rset.getString("COURSENAME");
				courses.add(cname);
				System.out.println(cname); // error checking
			}
			done = true;
		} while(!done);
		
		return courses;
		
	} // end method

	public static ArrayList<String> getGradeReport(Connection conn,String input) {
		ArrayList<String> studentInfo = new ArrayList<String>();
		try {
			String nnumber = "'" + input + "'";
			
			String fname,minit,lname,courseNo,courseName,department,sectionNo,semester,year,instructor,letterGrade;
			int creditHours,gradePoint;
			
			double totalCreditHours=0;
			double totalGPA=0;
			
		    Statement stmt;
			stmt = conn.createStatement ();
			
			String q = "select FNAME,MINIT,LNAME " +
					   "from STUDENT " +
					   "where STUDENTNUM= " + nnumber;

		ResultSet rset = stmt.executeQuery(q);
		
		if(rset.next()) {
			fname = rset.getString("FNAME");
			minit = rset.getString("MINIT");
			lname = rset.getString("LNAME");
			
			if(minit == null)
			{
				minit = "";
			}
			else
				minit += " ";
			
			studentInfo.add(fname +" "+minit + lname);
			
			
			q = "Select COURSE.COURSENUM,COURSE.COURSENAME,course.credithours,DEPARTMENT.DEPTNAME,enrolled_in.sectionnum,enrolled_in.semester,enrolled_in.year,instructor.fname,instructor.lname,enrolled_in.gradepoint " +
					"from COURSE,ENROLLED_IN,offers,department,INSTRUCTOR,teaches " +
					"where ENROLLED_IN.STUDENTNUM = " + nnumber + " AND enrolled_in.coursenum = course.coursenum AND offers.deptcode = department.code AND offers.coursenum = enrolled_in.coursenum " + 
					"AND teaches.instnum = instructor.instnum AND teaches.coursenum = enrolled_in.coursenum AND teaches.sectionnum = enrolled_in.sectionnum ";
			
			rset = stmt.executeQuery(q);
			
			while(rset.next())
			{
				courseNo = rset.getString("COURSENUM");
				courseName = rset.getString("COURSENAME");
				creditHours = rset.getInt("CREDITHOURS");
				department = rset.getString("DEPTNAME");
				sectionNo = rset.getString("SECTIONNUM");
				semester = rset.getString("SEMESTER");
				year = rset.getString("YEAR");
				instructor = rset.getString("FNAME") + " " + rset.getString("LNAME");
				gradePoint = rset.getInt("GRADEPOINT");
				
				if      (gradePoint > 3.7)
					letterGrade = "A";
				else if((gradePoint > 3.3))
					letterGrade = "A-";
				else if((gradePoint > 3.0))
					letterGrade = "B+";
				else if((gradePoint > 2.7))
					letterGrade = "B";
				else if((gradePoint > 2.3))
					letterGrade = "B-";
				else if((gradePoint > 2.0))
					letterGrade = "C+";
				else if((gradePoint > 1.7))
					letterGrade = "C";
				else if((gradePoint > 1.3))
					letterGrade = "C-";
				else if((gradePoint > 1.0))
					letterGrade = "D+";
				else if((gradePoint > 0.7))
					letterGrade = "D";
				else if((gradePoint > 0.3))
					letterGrade = "D-";
				else if((gradePoint > 0.0))
					letterGrade = "F";
				else
					letterGrade = "NA";
				
				totalCreditHours += creditHours;
				totalGPA += gradePoint*creditHours;
				
				studentInfo.add(courseNo);
				studentInfo.add(courseName);
				studentInfo.add(Integer.toString(creditHours));
				studentInfo.add(department);
				studentInfo.add(sectionNo);
				studentInfo.add(semester);
				studentInfo.add(year);
				studentInfo.add(instructor);
				studentInfo.add(letterGrade);
				studentInfo.add(Integer.toString(gradePoint));
				                                                                                                      
			}
			
			studentInfo.add(Double.toString((totalGPA/totalCreditHours)));
			
			return studentInfo;
		}
		else
			System.out.printf("Student not found :(");
		
		} catch (SQLException e) {
			System.out.printf("%s\n", e.getMessage());
			return null;
		}
		return studentInfo;
	}
	
	private static void getGradeReport(Connection conn) {
		try 
		{
			String nnumber,courseNo,courseName,department,sectionNo,semester,year,instructor,letterGrade;
			int creditHours,gradePoint;
			
			double totalCreditHours=0;
			double totalGPA=0;
			
		    Statement stmt;
			stmt = conn.createStatement ();
			System.out.printf("Enter student n number:");
			
			nnumber = "'" + getString() + "'";
			String q = "select FNAME,MINIT,LNAME " +
					   "from STUDENT " +
					   "where STUDENTNUM= " + nnumber;
	
			ResultSet rset = stmt.executeQuery(q);
			
			if(rset.next()) 
			{
				System.out.printf("|------------------------------------------------------------------------------------------------------------------------------|\n");
				System.out.printf("| Grade report for student: %-98s |\n",rset.getString("FNAME") + " " + rset.getString("MINIT") + " " + rset.getString("LNAME"));
				System.out.printf("|------------------------------------------------------------------------------------------------------------------------------|\n");
				System.out.printf("| Course no | Course name | credit hours | Department | Section no | Semester | year | Instructor | Letter grade | grade point |\n");
				System.out.printf("|-----------|-------------|--------------|------------|------------|----------|------|------------|--------------|-------------|\n");
				
				q = "Select COURSE.COURSENUM,COURSE.COURSENAME,course.credithours,DEPARTMENT.DEPTNAME,enrolled_in.sectionnum,enrolled_in.semester,enrolled_in.year,instructor.fname,instructor.lname,enrolled_in.gradepoint " +
						"from COURSE,ENROLLED_IN,offers,department,INSTRUCTOR,teaches " +
						"where ENROLLED_IN.STUDENTNUM = " + nnumber + " AND enrolled_in.coursenum = course.coursenum AND offers.deptcode = department.code AND offers.coursenum = enrolled_in.coursenum " + 
						"AND teaches.instnum = instructor.instnum AND teaches.coursenum = enrolled_in.coursenum AND teaches.sectionnum = enrolled_in.sectionnum ";
				
				//System.out.printf(q);
				
				rset = stmt.executeQuery(q);
				
				while(rset.next())
				{
					//nnumber = rset.getString("STUDENTNUM");
					
					courseNo = rset.getString("COURSENUM");
					courseName = rset.getString("COURSENAME");
					creditHours = rset.getInt("CREDITHOURS");
					department = rset.getString("DEPTNAME");
					sectionNo = rset.getString("SECTIONNUM");
					semester = rset.getString("SEMESTER");
					year = rset.getString("YEAR");
					instructor = rset.getString("FNAME") + " " + rset.getString("LNAME");
					gradePoint = rset.getInt("GRADEPOINT");
					
					if      (gradePoint > 3.7)
						letterGrade = "A";
					else if((gradePoint > 3.3))
						letterGrade = "A-";
					else if((gradePoint > 3.0))
						letterGrade = "B+";
					else if((gradePoint > 2.7))
						letterGrade = "B";
					else if((gradePoint > 2.3))
						letterGrade = "B-";
					else if((gradePoint > 2.0))
						letterGrade = "C+";
					else if((gradePoint > 1.7))
						letterGrade = "C";
					else if((gradePoint > 1.3))
						letterGrade = "C-";
					else if((gradePoint > 1.0))
						letterGrade = "D+";
					else if((gradePoint > 0.7))
						letterGrade = "D";
					else if((gradePoint > 0.3))
						letterGrade = "D-";
					else if((gradePoint > 0.0))
						letterGrade = "F";
					else
						letterGrade = "NA";
				
					totalCreditHours += creditHours;
					totalGPA += gradePoint*creditHours;
					
					System.out.printf("| %-9s | %-11s | %-12s | %-10s | %-10s | %-8s | %-4s | %-10s | %-12s | %-11s |\n",courseNo,courseName,creditHours,department,sectionNo,semester,year,instructor,letterGrade,gradePoint);
					                                                                                                      
	
				}
				System.out.printf("|------------------------------------------------------------------------------------------------------------------------------|\n");
				System.out.printf("| TOTAL GPA: %1.2f                                                                                                              |\n",totalGPA/totalCreditHours);
				System.out.printf("|------------------------------------------------------------------------------------------------------------------------------|\n");
				
				//rset.close();
			}
			else
				System.out.printf("Student not found :(");
			
		} catch (SQLException e) {
			System.out.printf("%s\n", e.getMessage());
		}
		
		
	}
	
	public static void addMenu(Connection conn) throws SQLException
	{
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("|              Add Menu                |\n");
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("| What would you like to add?          |\n");
		System.out.printf("|1. Student                            |\n");
		System.out.printf("|2. Department                         |\n");
		System.out.printf("|3. Course                             |\n");
		System.out.printf("|4. Instructor                         |\n");
		System.out.printf("|5. Section                            |\n");
		System.out.printf("|6. a Student to a Section             |\n");
		System.out.printf("|7. Grades                             |\n");
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("Enter your selection:");

		switch(getInt()) {
		case 1:
			addStudent(conn);
			break;
		case 2:
			addDepartment(conn);
			break;
		case 3:
			addCourse(conn);
			break;
		case 4:
			addInstructor(conn);
			break;
		case 5:
			addSection(conn);
			break;
		case 6:
			enroll(conn);
		case 7:
			addGrades(conn);
			break;
		default:
			System.out.printf("Please select a valid option\n");
			break;

		}

	}
	
	public static void enroll(Connection conn)
	{
		boolean flag;

		do {
			flag = false;
			String q = "INSERT INTO \"G03\".\"ENROLLED_IN\" (STUDENTNUM, SECTIONNUM, COURSENUM) "
					+  "VALUES (";
			System.out.printf("Enter student number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter section number:");
			q += "" + getString() + ","; 
			System.out.printf("Enter course number:");
			q += "'" + getString() + "',"; 


			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeQuery();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				flag = true;
			}
		}while(flag);
		System.out.printf("Student enrolled successfully!\n");
		
	}

	public static void addStudent(Connection conn)
	{
		boolean flag;
		
		do {
			flag = false;
			String q = "INSERT INTO \"G03\".\"STUDENT\" (STUDENTNUM, SSN, FNAME, MINIT, LNAME, DOB, CURRPHONE, PERMPHONE, SEX, CLASS, DEGREE, STREET, CITY, STATE, ZIPCODE) "
		    		+  "VALUES (";
			System.out.printf("Enter Student Number:");
			String studentNum = getString();
			q += "'" + studentNum + "',"; 
			System.out.printf("Enter social security number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter first name:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter middle inital:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter last name:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter Date of Birth (YYYY-MM-DD):");
			q += "TO_DATE('" + getString() + " 00:00:00', 'YYYY-MM-DD HH24:MI:SS'),"; 
			System.out.printf("Enter current phone number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter permanent phone number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter sex:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter class:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter degree:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter major department:");
			String major = getString();
			System.out.printf("Enter minor department:");
			String minor = getString();
			System.out.printf("Enter street:");
			q += "'" + getString() + "',";
			System.out.printf("Enter city:");
			q += "'" + getString() + "',";
			System.out.printf("Enter state:");
			q += "'" + getString() + "',";
			System.out.printf("Enter zip code:");
			q += "'" + getString() + "')";
			
			
			String q2 = "INSERT INTO \"G03\".\"MAJOR_MINOR_IN\" (STUDENTNUM, MAJORDEPT, MINORDEPT) "
		    		+  "VALUES (";
			q2 += "'" + studentNum + "','" + major + "','" + minor + "')";
			
			try{
			// prepare/execute STUDENT table query
		    PreparedStatement pstmt = conn.prepareStatement (q);
		    pstmt.executeUpdate();
		    
			// prepare/execute MAJOR_MINOR_IN table query
		    pstmt = conn.prepareStatement(q2);
		    pstmt.executeUpdate();
		    
		    }catch(SQLException e)
		    {
		    	System.out.printf("Invalid entry\n");
		    	System.out.printf("%s\n", e.getMessage());
		    	flag = true;
		    }
		}while(flag);
		System.out.printf("Student added successfully!\n");
	}
	
	
	public static boolean addDepartment(Connection conn, ArrayList<String> departmentInfo)
	{

			String q = "INSERT INTO \"G03\".\"DEPARTMENT\" (DEPTNAME, CODE, OFFICENUM, OFFICEPHONE, COLLEGE) "
					+  "VALUES (";
			//department name
			q += "'" + departmentInfo.get(0) + "',"; 
			//department code
			q += "'" + departmentInfo.get(1) + "',"; 
			//office number
			q += "'" + departmentInfo.get(2) + "',"; 
			//office phone
			q += "'" + departmentInfo.get(3) + "',"; 
			//college
			q += "'" + departmentInfo.get(4) + "')";

			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				return false; 
			}

		return true;
	}

	public static void addDepartment(Connection conn)
	{
		
		boolean flag;

		do {
			flag = false;
			String q = "INSERT INTO \"G03\".\"DEPARTMENT\" (DEPTNAME, CODE, OFFICENUM, OFFICEPHONE, COLLEGE) "
					+  "VALUES (";
			System.out.printf("Enter department name:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter department code:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter office number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter office phone:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter college:");
			q += "'" + getString() + "')";

			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				flag = true;
			}
		}while(flag);
		System.out.printf("Department added successfully!\n");
	}

	public static void addCourse(Connection conn)
	{
		boolean flag;

		do {
			flag = false;
			
			String q = "INSERT INTO \"G03\".\"COURSE\" (COURSENUM, COURSENAME, CREDITHOURS) "
					+  "VALUES (";
			System.out.printf("Enter course number:");
			String courseNum = getString();
			q += "'" + courseNum + "',"; 
			System.out.printf("Enter course name:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter credit hours:");
			q += getString() + ")"; 
			System.out.printf("Enter department:");
			String department = getString();
			String q3 ="INSERT INTO OFFERS (DEPTCODE, COURSENUM) VALUES ('" + department + "','" + courseNum + "')"; 

			System.out.printf("Enter number of prerequisites:");		// allows multiple prereqs
			int num = getInt();

			try{
				PreparedStatement pstmt = conn.prepareStatement(q);

				pstmt.executeUpdate();
				pstmt = conn.prepareStatement(q3);
				pstmt.executeUpdate();
				if (num != 0) {
					for (int i = 0; i < num; i++) {
						System.out.println("Enter prereq course number: ");
						String prereq = getString();
						
						String q2 = "INSERT INTO REQUIRES_PREREQUISITE (COURSENUM, PREREQNUM) " 
								+ "VALUES ('" + courseNum + "', '" +  prereq + "')";
						pstmt = conn.prepareStatement(q2);
						pstmt.executeUpdate();
					}
				}
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				flag = true;
			}
		}while(flag);
		System.out.printf("Course added successfully!\n");
	}
	
	public static boolean addCourse(Connection conn,ArrayList<String> courseInfo)
	{

			String q = "INSERT INTO \"G03\".\"COURSE\" (COURSENUM, COURSENAME, CREDITHOURS, DEPARTMENT) "
					+  "VALUES (";
	
			q += "'" + courseInfo.get(0) + "',"; //coursenumber
			q += "'" + courseInfo.get(1)  + "',"; //course name
			q += "'" + courseInfo.get(2)  + "',"; //credit hours
			q += "'" + courseInfo.get(3)  + "',"; //department
			q += "'" + courseInfo.get(4)  + "')"; //prereqs

			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				return false;
			}
		return true;

	}

	public static void addInstructor(Connection conn)
	{
		boolean flag;

		do {
			flag = false;
			String q = "INSERT INTO \"G03\".\"INSTRUCTOR\" (INSTNUM, SSN, FNAME, MINIT, LNAME, CURRPHONE, ADDRESS) "
					+  "VALUES (";
			System.out.printf("Enter Instructor number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter social security number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter first name:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter middle inital:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter last name:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter current phone number:");
			q += "'" + getString() + "',";
			System.out.printf("Enter address:");
			q += "'" + getString() + "')";


			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				flag = true;
			}
		}while(flag);
		System.out.printf("Instructor added successfully!\n");
	}
	
	public static boolean addInstructor(Connection conn,ArrayList<String> instructorInfo)
	{
			String q = "INSERT INTO \"G03\".\"INSTRUCTOR\" (INSTNUM, SSN, FNAME, MINIT, LNAME, AGE, CURRPHONE, ADDRESS, OFFICE) "
					+  "VALUES (";
			
			q += "'" + instructorInfo.get(0) + "',"; //instructor number
			q += "'" + instructorInfo.get(1) + "',"; //SSN
			q += "'" + instructorInfo.get(2) + "',"; //First name
			q += "'" + instructorInfo.get(3) + "',"; //middle initial 
			q += "'" + instructorInfo.get(4) + "',"; //Last name
			q += "'" + instructorInfo.get(5) + "',"; //age
			q += "'" + instructorInfo.get(6) + "')"; //current phone
			q += "'" + instructorInfo.get(7) + "')"; //address
			q += "'" + instructorInfo.get(8) + "')"; //office number

			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				return false;
			}
			return true;
	}
	
	public static boolean addSection(Connection conn,ArrayList<String> sectionInfo)
	{

			String q = "INSERT INTO \"G03\".\"SECTION\" (COURSENUM, SECTIONNUM, SEMESTER, YEAR, INSTRUCTORNUM) "
					+  "VALUES (";
			
			q += "'" + sectionInfo.get(0) + "',"; //course number
			q += "" + sectionInfo.get(1) + ","; //section number
			q += "'" + sectionInfo.get(2) + "',"; //semester 
			q += "'" + sectionInfo.get(3) + "',"; //year
			q += "'" + sectionInfo.get(4) + "')"; //instructor


			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				return false;
			}
		return true;
	}

	public static void addSection(Connection conn)
	{
		boolean flag;

		do {
			flag = false;
			String q = "INSERT INTO \"G03\".\"SECTION\" (SECTIONNUM, COURSENUM, SEMESTER, YEAR, INSTRUCTORNUM) "
					+  "VALUES (";
			System.out.printf("Enter section number:");
			q += "" + getString() + ","; 
			System.out.printf("Enter course number:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter semester:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter year:");
			q += "'" + getString() + "',"; 
			System.out.printf("Enter instructor number:");
			q += "'" + getString() + "')";


			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				flag = true;
			}
		}while(flag);
		System.out.printf("Section added successfully!\n");
	}
	
	public static boolean addGrades(Connection conn,ArrayList<String> gradesInfo)
	{
			String q = "INSERT INTO \"G03\".\"ENROLLED_IN\" (STUDENTNUM, SECTIONNUM, COURSENUM, SEMESTER, GRADEPOINT) "
					+  "VALUES (";
			q += "'" + gradesInfo.get(0) + "',"; //student number
			q += "'" + gradesInfo.get(1) + "',"; //section number
			q += "'" + gradesInfo.get(2) + "',"; //course number
			q += "'" + gradesInfo.get(3) + "',"; //semester
			q += "'" + gradesInfo.get(4) + "',"; //year
			q += "'" + gradesInfo.get(5) + "')"; //grade point


			try{
				PreparedStatement pstmt = conn.prepareStatement (q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				return false;
			}
		return true;
	}

	public static void addGrades(Connection conn)
	{
		boolean flag;
		String year,Studnumber,Cnumber,semester,SecNumber,gradePoint,letterGrade,q;

		do {
			flag = false;
			
			System.out.printf("Enter the student number:");
			Studnumber = getString();
			System.out.printf("Enter the course number:");
			Cnumber = getString();
			System.out.printf("Enter the section number:");
			SecNumber = getString();
			System.out.printf("Enter the year:");
			year = getString();
			System.out.printf("Enter the Semester:");
			semester = getString();
			System.out.printf("Enter the grade point you would like to enter:");
			gradePoint = getString();
			System.out.printf("Enter the letter grade you would like to enter:");
			letterGrade = getString();
			
			q = "UPDATE G03.enrolled_in \n"
			  + "SET gradepoint = " + gradePoint + ", lettergrade = '" + letterGrade + "' \n"
			  + "WHERE studentnum = '" + Studnumber + "' AND coursenum = '" + Cnumber + "' AND sectionnum = " + SecNumber + " AND year = '" + year + "' AND semester = '" + semester + "' ";

			//System.out.println(q);

			try{
				PreparedStatement pstmt = conn.prepareStatement(q);

				pstmt.executeUpdate();
			}catch(SQLException e)
			{
				System.out.printf("Invalid entry\n");
				System.out.printf("%s\n", e.getMessage());
				flag = true;
			}
		}while(flag);
		System.out.printf("Student enrolled successfully!\n");
	}

	public static void displayTitle()
	{
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("|           Database Project           |\n");
		System.out.printf("|               Group 3                |\n");
	}

	public static void mainMenu()
	{
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("|              Main Menu               |\n");
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("|1. add to database                    |\n");
		System.out.printf("|2. generate a grade report            |\n");
		System.out.printf("|3. see courses offered by department  |\n");
		System.out.printf("|4. see courses offered by instructor  |\n");
		System.out.printf("|5. check prerequsites                 |\n");
		System.out.printf("|6. Exit Program                       |\n");
		System.out.printf("|--------------------------------------|\n");
		System.out.printf("enter selection:");
	}

	public static void goodbyeUser()
	{
		System.out.printf("Thanks for using database program!\n");
		System.out.printf("This program was created by:\n");
		System.out.printf("   _____                             ______                                         _   _____  _          _   _   \r\n"
				+ "  / ____|                           |  ____|                                       | | |  __ \\| |        | | | |  \r\n"
				+ " | |     __ _ _ __ ___  ___  _ __   | |__ _ __ __ _ ___  ___ _ __    __ _ _ __   __| | | |__) | |__   ___| |_| |_ \r\n"
				+ " | |    / _` | '__/ __|/ _ \\| '_ \\  |  __| '__/ _` / __|/ _ \\ '__|  / _` | '_ \\ / _` | |  _  /| '_ \\ / _ \\ __| __|\r\n"
				+ " | |___| (_| | |  \\__ \\ (_) | | | | | |  | | | (_| \\__ \\  __/ |    | (_| | | | | (_| | | | \\ \\| | | |  __/ |_| |_ \r\n"
				+ "  \\_____\\__,_|_|  |___/\\___/|_| |_| |_|  |_|  \\__,_|___/\\___|_|     \\__,_|_| |_|\\__,_| |_|  \\_\\_| |_|\\___|\\__|\\__|\r\n"
				+ "");
	}

	public static String getString() {
		try {
			StringBuffer buffer = new StringBuffer();
			int c = System.in.read();
			while (c != '\n' && c != -1) {
				buffer.append((char)c);
				c = System.in.read();
			}
			return buffer.toString().trim();
		}
		catch (IOException e){return "";}
	}

	public static int getInt() 
	{
		try {
			String s= getString();
			return Integer.parseInt(s);
		}
		catch(NumberFormatException e) {return -1;}
	}


}
