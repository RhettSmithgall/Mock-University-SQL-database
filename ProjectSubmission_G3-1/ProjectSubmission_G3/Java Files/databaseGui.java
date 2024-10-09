import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 15 00:47:37 EDT 2024
 */



/**
 * @author rhett
 */
@SuppressWarnings("serial")
public class databaseGui extends JFrame {
	Connection conn;
	
	public databaseGui(Connection conn) {
		this.conn = conn;
		initComponents();
	}

	private void mainMenuAddDatabaseClicked(MouseEvent e) {
		this.addDepartmentErrorMessage.setVisible(false);
		this.mainMenu.setVisible(false);
		this.addMenu.setVisible(true);
		this.prereqCheckErrorMessage.setVisible(false);
	}

	private void mainMenuGradeClicked(MouseEvent e) {
		this.mainMenu.setVisible(false);
		this.generateGradereport.setVisible(true);
	}

	private void addDepartmentCancelClicked(MouseEvent e) {
		this.addDepartment.setVisible(false);
		this.addMenu.setVisible(true);
	}

	private void addDepartmentSubmitClicked(MouseEvent e) {
		ArrayList<String> studentGradeInfo = new ArrayList<String>();
		
		studentGradeInfo.add(addDepartmentNameInput.getText()); //name
		studentGradeInfo.add(addDepartmentCodeInput.getText()); //code
		studentGradeInfo.add(addDepartmentNumberInput.getText()); //office number
		studentGradeInfo.add(addDepartmentPhoneInput.getText()); //phone
		studentGradeInfo.add(addDepartmentCollegeInput.getText()); //college
		
		if(!(DatabaseProject.addDepartment(conn,studentGradeInfo)))
			addDepartmentErrorMessage.setVisible(true);
		else
			addDepartmentErrorMessage.setVisible(false);
			
		
	}

	private void addGradeCancelClicked(MouseEvent e) {
		this.addGrade.setVisible(false);
		this.addMenu.setVisible(true);
	}

	private void addGradeSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addInstructorCancelClicked(MouseEvent e) {
		this.addInstructor.setVisible(false);
		this.addMenu.setVisible(true);
	}

	private void addInstructorSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuStudentClicked(MouseEvent e) {
		this.addMenu.setVisible(false);
		this.addStudent.setVisible(true);
	}

	private void addMenuDepartmentClicked(MouseEvent e) {
		this.addDepartmentErrorMessage.setVisible(false);
		this.addMenu.setVisible(false);
		this.addDepartment.setVisible(true);
	}

	private void addMenuCourseClicked(MouseEvent e) {
		this.addMenu.setVisible(false);
		this.addCourse.setVisible(true);
	}

	private void addMenuInstructorClicked(MouseEvent e) {
		this.addMenu.setVisible(false);
		this.addInstructor.setVisible(true);
	}

	private void addMenuSectionClicked(MouseEvent e) {
		this.addMenu.setVisible(false);
		this.addSection.setVisible(true);
	}

	private void addMenuGradesClicked(MouseEvent e) {
		this.addMenu.setVisible(false);
		this.addGrade.setVisible(true);
	}

	private void addMenuCancelClicked(MouseEvent e) {
		this.addMenu.setVisible(false);
		this.mainMenu.setVisible(true);
	}

	private void addSectionCancelClicked(MouseEvent e) {
		this.addSection.setVisible(false);
		this.addMenu.setVisible(true);
	}

	private void addSectionSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addStudentCancelClicked(MouseEvent e) {
		this.addStudent.setVisible(false);
		this.addMenu.setVisible(true);
	}

	private void addStudentSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void mainMenuCoursebyDepartmentClicked(MouseEvent e) {
		this.mainMenu.setVisible(false);
		this.getCoursebyDepartment.setVisible(true);
	}

	private void mainMenuCoursebyInstructorClicked(MouseEvent e) {
		this.mainMenu.setVisible(false);
		this.getCoursebyInstructor.setVisible(true);
	}

	private void mainMenuCheckPrereqClicked(MouseEvent e) {
		this.mainMenu.setVisible(false);
		this.prereqCheck.setVisible(true);
	}

	private void mainMenuExitProgramClicked(MouseEvent e) {
		dispose();
	}

	private void addCourseCancelClicked(MouseEvent e) {
		this.addCourse.setVisible(false);
		this.addMenu.setVisible(true);
	}

	private void addCourseSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void gradeReportCancelClicked(MouseEvent e) {
		clearGradeReport();
		this.generateGradereport.setVisible(false);
		this.mainMenu.setVisible(true);
	}

	private void clearGradeReport()
	{
		table3.setModel(new DefaultTableModel(
				new Object[][] {
					{"GRADE REPORT FOR STUDENT:", null},
				},
				new String[] {
						null, null
				}
				));

		table1.setModel(new DefaultTableModel(
				new Object[][] {},
				new String[] {
						"course No.", "course name", "credit hours", "department", "section no.", "semester", "year", "instructor", "letter grade", "grade point"
				}
				));

		table2.setModel(new DefaultTableModel(
				new Object[][] {
					{"TOTAL GPA:", null},
				},
				new String[] {
						null, null
				}
				));
	}

	private void gradeReportSubmitClicked(MouseEvent e) {
		ArrayList<String> studentGradeInfo = DatabaseProject.getGradeReport(conn,gradeReportInput.getText());
		clearGradeReport();
		//set student name
		table3.setModel(new DefaultTableModel(
				new Object[][] {
					{"GRADE REPORT FOR STUDENT:", studentGradeInfo.get(0)},},new String[] {null, null}
				));

		//set student course information
		for(int i = 0;i<studentGradeInfo.size()-2;i+=10)
		{
			DefaultTableModel model = (DefaultTableModel) table1.getModel();
			model.addRow(new Object[]{studentGradeInfo.get(i+1),studentGradeInfo.get(i+2),studentGradeInfo.get(i+3),studentGradeInfo.get(i+4),studentGradeInfo.get(i+5),studentGradeInfo.get(i+6),
					studentGradeInfo.get(i+7),studentGradeInfo.get(i+8),studentGradeInfo.get(i+9),studentGradeInfo.get(i+10)});
		}

		//set gpa
		table2.setModel(new DefaultTableModel(
				new Object[][] {
					{"TOTAL GPA:", studentGradeInfo.get(studentGradeInfo.size()-1)},},new String[] {null, null}
				));
	}

	private void prereqCheckCancelClicked(MouseEvent e) {
		prereqCheckNumber.setText("");
		prereqCheckCourse.setText("");
		prereqCheckOutputText.setText("");
		this.prereqCheck.setVisible(false);
		this.mainMenu.setVisible(true);
	}

	private void prereqCheckSubmitClicked(MouseEvent e) {
		String studentID = prereqCheckNumber.getText(); 
		String courseCheck = prereqCheckCourse.getText();
		
		boolean satisfied = DatabaseProject.checkPrerequisites(conn, studentID, courseCheck);
		
		if(satisfied) {
			prereqCheckErrorMessage.setVisible(false);
			prereqCheckOutputText.setText("Student Satisfies Prerequisites");
		} else {
			prereqCheckErrorMessage.setVisible(true);
			prereqCheckOutputText.setText("Student Does NOT Satisfy Prerequisites");
		}
		prereqCheckNumber.setText("");
		prereqCheckCourse.setText("");
			
	}

	private void coursebyInstructorCancelClicked(MouseEvent e) {
		this.getCoursebyInstructor.setVisible(false);
		this.mainMenu.setVisible(true);
	}

	private void coursebyInstructorSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void coursebyDepartmentNameSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void coursebyDepartmentCodeSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void coursebyDepartmentCancelClicked(MouseEvent e) {
		this.getCoursebyDepartment.setVisible(false);
		this.mainMenu.setVisible(true);
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Rhett Alan Smithgall
		mainMenu = new JPanel();
		label51 = new JLabel();
		separator8 = new JSeparator();
		addtoDatabaseButton = new JButton();
		generateGradeButton = new JButton();
		button22 = new JButton();
		button23 = new JButton();
		button24 = new JButton();
		button25 = new JButton();
		addMenu = new JPanel();
		label18 = new JLabel();
		label27 = new JLabel();
		separator5 = new JSeparator();
		button9 = new JButton();
		button10 = new JButton();
		button11 = new JButton();
		button12 = new JButton();
		button13 = new JButton();
		button14 = new JButton();
		button15 = new JButton();
		addStudent = new JPanel();
		label34 = new JLabel();
		separator7 = new JSeparator();
		label35 = new JLabel();
		label36 = new JLabel();
		label37 = new JLabel();
		label38 = new JLabel();
		label39 = new JLabel();
		textField27 = new JTextField();
		textField28 = new JTextField();
		textField29 = new JTextField();
		textField30 = new JTextField();
		textField31 = new JTextField();
		label40 = new JLabel();
		label41 = new JLabel();
		textField32 = new JTextField();
		comboBox1 = new JComboBox<>();
		label42 = new JLabel();
		label43 = new JLabel();
		label44 = new JLabel();
		label45 = new JLabel();
		label46 = new JLabel();
		textField33 = new JTextField();
		textField34 = new JTextField();
		textField35 = new JTextField();
		comboBox2 = new JComboBox<>();
		textField36 = new JTextField();
		label47 = new JLabel();
		label48 = new JLabel();
		label49 = new JLabel();
		label50 = new JLabel();
		textField37 = new JTextField();
		textField38 = new JTextField();
		textField39 = new JTextField();
		textField40 = new JTextField();
		button18 = new JButton();
		button19 = new JButton();
		addDepartment = new JPanel();
		label21 = new JLabel();
		separator2 = new JSeparator();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		addDepartmentNameInput = new JTextField();
		addDepartmentCodeInput = new JTextField();
		addDepartmentNumberInput = new JTextField();
		addDepartmentPhoneInput = new JTextField();
		label22 = new JLabel();
		addDepartmentCollegeInput = new JTextField();
		button3 = new JButton();
		button4 = new JButton();
		addCourse = new JPanel();
		label20 = new JLabel();
		separator1 = new JSeparator();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		textField1 = new JTextField();
		textField2 = new JTextField();
		textField3 = new JTextField();
		textField4 = new JTextField();
		label19 = new JLabel();
		textField9 = new JTextField();
		button2 = new JButton();
		button1 = new JButton();
		addInstructor = new JPanel();
		label25 = new JLabel();
		separator4 = new JSeparator();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		label15 = new JLabel();
		textField15 = new JTextField();
		textField16 = new JTextField();
		textField17 = new JTextField();
		textField18 = new JTextField();
		label26 = new JLabel();
		label16 = new JLabel();
		label17 = new JLabel();
		textField19 = new JTextField();
		textField20 = new JTextField();
		textField21 = new JTextField();
		button7 = new JButton();
		button8 = new JButton();
		addSection = new JPanel();
		label28 = new JLabel();
		separator6 = new JSeparator();
		label29 = new JLabel();
		label30 = new JLabel();
		label31 = new JLabel();
		textField22 = new JTextField();
		textField23 = new JTextField();
		textField24 = new JTextField();
		label32 = new JLabel();
		label33 = new JLabel();
		textField25 = new JTextField();
		textField26 = new JTextField();
		button16 = new JButton();
		button17 = new JButton();
		addGrade = new JPanel();
		label23 = new JLabel();
		separator3 = new JSeparator();
		label9 = new JLabel();
		label10 = new JLabel();
		label11 = new JLabel();
		textField11 = new JTextField();
		textField12 = new JTextField();
		textField13 = new JTextField();
		label24 = new JLabel();
		textField14 = new JTextField();
		scrollPane1 = new JScrollPane();
		list1 = new JList<>();
		button5 = new JButton();
		button6 = new JButton();
		generateGradereport = new JPanel();
		label52 = new JLabel();
		gradeReportInput = new JTextField();
		table3 = new JTable();
		scrollPane2 = new JScrollPane();
		table1 = new JTable();
		table2 = new JTable();
		button20 = new JButton();
		button21 = new JButton();
		getCoursebyDepartment = new JPanel();
		label58 = new JLabel();
		separator10 = new JSeparator();
		label59 = new JLabel();
		label60 = new JLabel();
		textField44 = new JTextField();
		button30 = new JButton();
		textField45 = new JTextField();
		button31 = new JButton();
		scrollPane4 = new JScrollPane();
		table5 = new JTable();
		button32 = new JButton();
		getCoursebyInstructor = new JPanel();
		label55 = new JLabel();
		separator9 = new JSeparator();
		label56 = new JLabel();
		label57 = new JLabel();
		textField42 = new JTextField();
		textField43 = new JTextField();
		scrollPane3 = new JScrollPane();
		table4 = new JTable();
		button28 = new JButton();
		button29 = new JButton();
		prereqCheck = new JPanel();
		label53 = new JLabel();
		label54 = new JLabel();
		addDepartmentErrorMessage = new JLabel();
		prereqCheckErrorMessage = new JLabel();
		prereqCheckNumber = new JTextField();
		prereqCheckCourse = new JTextField();
		prereqCheckOutputText = new JTextField();
		button26 = new JButton();
		button27 = new JButton();

		//======== this ========
		Container contentPane = getContentPane();
		contentPane.setLayout(new CardLayout());

		//======== mainMenu ========
		{
			mainMenu.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.
			swing.border.EmptyBorder(0,0,0,0), "JF\u006frmDes\u0069gner \u0045valua\u0074ion",javax.swing.border
			.TitledBorder.CENTER,javax.swing.border.TitledBorder.BOTTOM,new java.awt.Font("D\u0069alog"
			,java.awt.Font.BOLD,12),java.awt.Color.red),mainMenu. getBorder
			()));mainMenu. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java
			.beans.PropertyChangeEvent e){if("\u0062order".equals(e.getPropertyName()))throw new RuntimeException
			();}});
			mainMenu.setLayout(new GridBagLayout());
			((GridBagLayout)mainMenu.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
			((GridBagLayout)mainMenu.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)mainMenu.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)mainMenu.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label51 ----
			label51.setText("Main Menu");
			label51.setHorizontalAlignment(SwingConstants.CENTER);
			mainMenu.add(label51, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			mainMenu.add(separator8, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addtoDatabaseButton ----
			addtoDatabaseButton.setText("Add to database");
			addtoDatabaseButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainMenuAddDatabaseClicked(e);
				}
			});
			mainMenu.add(addtoDatabaseButton, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- generateGradeButton ----
			generateGradeButton.setText("Generate a grade report");
			generateGradeButton.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainMenuGradeClicked(e);
				}
			});
			mainMenu.add(generateGradeButton, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button22 ----
			button22.setText("See coursed offered by department");
			button22.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainMenuCoursebyDepartmentClicked(e);
				}
			});
			mainMenu.add(button22, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button23 ----
			button23.setText("See coursed offered by instructor");
			button23.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainMenuCoursebyInstructorClicked(e);
				}
			});
			mainMenu.add(button23, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button24 ----
			button24.setText("Check prerequisites");
			button24.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainMenuCheckPrereqClicked(e);
				}
			});
			mainMenu.add(button24, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button25 ----
			button25.setText("Exit program");
			button25.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					mainMenuExitProgramClicked(e);
				}
			});
			mainMenu.add(button25, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(mainMenu, "card7");

		//======== addMenu ========
		{
			addMenu.setLayout(new GridBagLayout());
			((GridBagLayout)addMenu.getLayout()).columnWidths = new int[] {0, 0, 0, 0};
			((GridBagLayout)addMenu.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addMenu.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addMenu.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label18 ----
			label18.setText("Add menu");
			label18.setHorizontalAlignment(SwingConstants.CENTER);
			addMenu.add(label18, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label27 ----
			label27.setText("What would you like to add?");
			label27.setHorizontalAlignment(SwingConstants.CENTER);
			addMenu.add(label27, new GridBagConstraints(1, 2, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addMenu.add(separator5, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button9 ----
			button9.setText("Student");
			button9.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuStudentClicked(e);
				}
			});
			addMenu.add(button9, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button10 ----
			button10.setText("Department");
			button10.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuDepartmentClicked(e);
				}
			});
			addMenu.add(button10, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button11 ----
			button11.setText("Course");
			button11.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuCourseClicked(e);
				}
			});
			addMenu.add(button11, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button12 ----
			button12.setText("Instructor");
			button12.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuInstructorClicked(e);
				}
			});
			addMenu.add(button12, new GridBagConstraints(1, 7, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button13 ----
			button13.setText("Section");
			button13.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuSectionClicked(e);
				}
			});
			addMenu.add(button13, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button14 ----
			button14.setText("Grades");
			button14.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuGradesClicked(e);
				}
			});
			addMenu.add(button14, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button15 ----
			button15.setText("Cancel");
			button15.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addMenuCancelClicked(e);
				}
			});
			addMenu.add(button15, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addMenu, "card4");

		//======== addStudent ========
		{
			addStudent.setLayout(new GridBagLayout());
			((GridBagLayout)addStudent.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addStudent.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addStudent.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addStudent.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label34 ----
			label34.setText("Add Student");
			addStudent.add(label34, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(separator7, new GridBagConstraints(1, 2, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label35 ----
			label35.setText("student number");
			addStudent.add(label35, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label36 ----
			label36.setText("social security number");
			addStudent.add(label36, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label37 ----
			label37.setText("First name");
			addStudent.add(label37, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label38 ----
			label38.setText("Middle Inital");
			addStudent.add(label38, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label39 ----
			label39.setText("Last name");
			addStudent.add(label39, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField27, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField28, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField29, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField30, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField31, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label40 ----
			label40.setText("Date");
			addStudent.add(label40, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label41 ----
			label41.setText("Sex");
			addStudent.add(label41, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- textField32 ----
			textField32.setText("DD/MM/YYYY");
			addStudent.add(textField32, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- comboBox1 ----
			comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
				"Male",
				"Female",
				"Other"
			}));
			addStudent.add(comboBox1, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label42 ----
			label42.setText("Current Phone");
			addStudent.add(label42, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label43 ----
			label43.setText("Permanent Phone");
			addStudent.add(label43, new GridBagConstraints(2, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label44 ----
			label44.setText("Street");
			addStudent.add(label44, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label45 ----
			label45.setText("State");
			addStudent.add(label45, new GridBagConstraints(4, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label46 ----
			label46.setText("Zip code");
			addStudent.add(label46, new GridBagConstraints(5, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField33, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField34, new GridBagConstraints(2, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField35, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- comboBox2 ----
			comboBox2.setModel(new DefaultComboBoxModel<>(new String[] {
				"AK",
				"AZ",
				"AR",
				"CA",
				"CO",
				"CT",
				"DE",
				"FL",
				"GA",
				"HI",
				"ID",
				"IL",
				"IN",
				"IA",
				"KS",
				"KY",
				"LA",
				"ME",
				"MD",
				"MA",
				"MI",
				"MN",
				"MS",
				"MO",
				"MT",
				"NE",
				"NV",
				"NH",
				"NJ",
				"NM",
				"NY",
				"NC",
				"ND",
				"OH",
				"OK",
				"OR",
				"PA",
				"RI",
				"SC",
				"SD",
				"TN",
				"TX",
				"UT",
				"VT",
				"VA",
				"WA",
				"WV",
				"WI",
				"WY"
			}));
			addStudent.add(comboBox2, new GridBagConstraints(4, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField36, new GridBagConstraints(5, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label47 ----
			label47.setText("Class");
			addStudent.add(label47, new GridBagConstraints(1, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label48 ----
			label48.setText("Degree");
			addStudent.add(label48, new GridBagConstraints(2, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label49 ----
			label49.setText("Major");
			addStudent.add(label49, new GridBagConstraints(3, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label50 ----
			label50.setText("Minor");
			addStudent.add(label50, new GridBagConstraints(4, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField37, new GridBagConstraints(1, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField38, new GridBagConstraints(2, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField39, new GridBagConstraints(3, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(textField40, new GridBagConstraints(4, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button18 ----
			button18.setText("Cancel");
			button18.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addStudentCancelClicked(e);
				}
			});
			addStudent.add(button18, new GridBagConstraints(1, 14, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button19 ----
			button19.setText("Submit");
			button19.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addStudentSubmitClicked(e);
				}
			});
			addStudent.add(button19, new GridBagConstraints(3, 14, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addStudent, "card6");

		//======== addDepartment ========
		{
			addDepartment.setLayout(new GridBagLayout());
			((GridBagLayout)addDepartment.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addDepartment.getLayout()).rowHeights = new int[] {37, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addDepartment.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addDepartment.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label21 ----
			label21.setText("Add Department");
			addDepartment.add(label21, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(separator2, new GridBagConstraints(1, 2, 8, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label5 ----
			label5.setText("Department Name");
			addDepartment.add(label5, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label6 ----
			label6.setText("Department Code");
			addDepartment.add(label6, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label7 ----
			label7.setText("Office Number");
			addDepartment.add(label7, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label8 ----
			label8.setText("Office Phone");
			addDepartment.add(label8, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(addDepartmentNameInput, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(addDepartmentCodeInput, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(addDepartmentNumberInput, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(addDepartmentPhoneInput, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label22 ----
			label22.setText("College");
			addDepartment.add(label22, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(addDepartmentCollegeInput, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			
			//---- addDepartmentErrorMessage ----
			addDepartmentErrorMessage.setText("an error occured...");
			addDepartmentErrorMessage.setForeground(Color.red);
			addDepartment.add(addDepartmentErrorMessage, new GridBagConstraints(5, 7, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartmentErrorMessage.setVisible(false);

			//---- button3 ----
			button3.setText("Cancel");
			button3.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addDepartmentCancelClicked(e);
				}
			});
			addDepartment.add(button3, new GridBagConstraints(1, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button4 ----
			button4.setText("Submit");
			button4.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addDepartmentSubmitClicked(e);
				}
			});
			addDepartment.add(button4, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addDepartment, "card1");

		//======== addCourse ========
		{
			addCourse.setLayout(new GridBagLayout());
			((GridBagLayout)addCourse.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addCourse.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addCourse.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addCourse.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label20 ----
			label20.setText("Add Course");
			addCourse.add(label20, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(separator1, new GridBagConstraints(1, 2, 8, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label1 ----
			label1.setText("Course number");
			addCourse.add(label1, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label2 ----
			label2.setText("Course name");
			addCourse.add(label2, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label3 ----
			label3.setText("Credit hours");
			addCourse.add(label3, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label4 ----
			label4.setText("Department");
			addCourse.add(label4, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(textField1, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(textField2, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(textField3, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(textField4, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label19 ----
			label19.setText("Prerequisites");
			addCourse.add(label19, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(textField9, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button2 ----
			button2.setText("Cancel");
			button2.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addCourseCancelClicked(e);
				}
			});
			addCourse.add(button2, new GridBagConstraints(1, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button1 ----
			button1.setText("Submit");
			button1.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addCourseSubmitClicked(e);
				}
			});
			addCourse.add(button1, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addCourse, "card8");

		//======== addInstructor ========
		{
			addInstructor.setLayout(new GridBagLayout());
			((GridBagLayout)addInstructor.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addInstructor.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addInstructor.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addInstructor.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label25 ----
			label25.setText("Add Instructor");
			addInstructor.add(label25, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(separator4, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label12 ----
			label12.setText("social security number");
			addInstructor.add(label12, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label13 ----
			label13.setText("First name");
			addInstructor.add(label13, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label14 ----
			label14.setText("Middle Inital");
			addInstructor.add(label14, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label15 ----
			label15.setText("Last name");
			addInstructor.add(label15, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(textField15, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(textField16, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(textField17, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(textField18, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label26 ----
			label26.setText("Date");
			addInstructor.add(label26, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label16 ----
			label16.setText("Office Phone");
			addInstructor.add(label16, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label17 ----
			label17.setText("Street Address");
			addInstructor.add(label17, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- textField19 ----
			textField19.setText("DD/MM/YYYY");
			addInstructor.add(textField19, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(textField20, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(textField21, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button7 ----
			button7.setText("Cancel");
			button7.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addInstructorCancelClicked(e);
				}
			});
			addInstructor.add(button7, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button8 ----
			button8.setText("Submit");
			button8.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addInstructorSubmitClicked(e);
				}
			});
			addInstructor.add(button8, new GridBagConstraints(3, 8, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addInstructor, "card3");

		//======== addSection ========
		{
			addSection.setLayout(new GridBagLayout());
			((GridBagLayout)addSection.getLayout()).columnWidths = new int[] {69, 235, 366, 184, 70, 0};
			((GridBagLayout)addSection.getLayout()).rowHeights = new int[] {93, 0, 0, 0, 0, 0, 0, 0, 28, 174, 0};
			((GridBagLayout)addSection.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addSection.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label28 ----
			label28.setText("Add Section");
			addSection.add(label28, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(separator6, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label29 ----
			label29.setText("Section number");
			addSection.add(label29, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label30 ----
			label30.setText("Course number");
			addSection.add(label30, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label31 ----
			label31.setText("Semester");
			addSection.add(label31, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(textField22, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(textField23, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(textField24, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label32 ----
			label32.setText("Year");
			addSection.add(label32, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label33 ----
			label33.setText("Instructor numbr");
			addSection.add(label33, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(textField25, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(textField26, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button16 ----
			button16.setText("Cancel");
			button16.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addSectionCancelClicked(e);
				}
			});
			addSection.add(button16, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button17 ----
			button17.setText("Submit");
			button17.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addSectionSubmitClicked(e);
				}
			});
			addSection.add(button17, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addSection, "card5");

		//======== addGrade ========
		{
			addGrade.setLayout(new GridBagLayout());
			((GridBagLayout)addGrade.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
			((GridBagLayout)addGrade.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addGrade.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addGrade.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label23 ----
			label23.setText("Add Grade");
			addGrade.add(label23, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(separator3, new GridBagConstraints(1, 2, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label9 ----
			label9.setText("Student number");
			addGrade.add(label9, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label10 ----
			label10.setText("Section number");
			addGrade.add(label10, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label11 ----
			label11.setText("Course number");
			addGrade.add(label11, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(textField11, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(textField12, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(textField13, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label24 ----
			label24.setText("Grade point");
			addGrade.add(label24, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(textField14, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//======== scrollPane1 ========
			{

				//---- list1 ----
				list1.setModel(new AbstractListModel<String>() {
					String[] values = {
						"A: 4.0",
						"B: 3.0",
						"C: 2.0",
						"D: 1.0",
						"F: 0.0"
					};
					@Override
					public int getSize() { return values.length; }
					@Override
					public String getElementAt(int i) { return values[i]; }
				});
				scrollPane1.setViewportView(list1);
			}
			addGrade.add(scrollPane1, new GridBagConstraints(3, 5, 1, 4, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button5 ----
			button5.setText("Cancel");
			button5.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addGradeCancelClicked(e);
				}
			});
			addGrade.add(button5, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button6 ----
			button6.setText("Submit");
			button6.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addGradeSubmitClicked(e);
				}
			});
			addGrade.add(button6, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(addGrade, "card2");

		//======== generateGradereport ========
		{
			generateGradereport.setLayout(new GridBagLayout());
			((GridBagLayout)generateGradereport.getLayout()).columnWidths = new int[] {0, 75, 0, 156, 607, 0, 0, 95, 0};
			((GridBagLayout)generateGradereport.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 124, 0, 0, 0, 0, 0};
			((GridBagLayout)generateGradereport.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)generateGradereport.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label52 ----
			label52.setText("Student N number");
			generateGradereport.add(label52, new GridBagConstraints(1, 1, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			generateGradereport.add(gradeReportInput, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- table3 ----
			table3.setModel(new DefaultTableModel(
				new Object[][] {
					{"GRADE REPORT FOR STUDENT:", "name"},
				},
				new String[] {
					null, null
				}
			));
			{
				TableColumnModel cm = table3.getColumnModel();
				cm.getColumn(0).setMinWidth(200);
				cm.getColumn(0).setMaxWidth(200);
				cm.getColumn(0).setPreferredWidth(200);
			}
			generateGradereport.add(table3, new GridBagConstraints(2, 4, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//======== scrollPane2 ========
			{

				//---- table1 ----
				table1.setModel(new DefaultTableModel(
					new Object[][] {
						{null, null, null, null, null, null, null, null, null, null},
						{null, null, null, null, null, null, null, null, null, null},
					},
					new String[] {
						"course No.", "course name", "credit hours", "department", "section no.", "semester", "year", "instructor", "letter grade", "grade point"
					}
				));
				scrollPane2.setViewportView(table1);
			}
			generateGradereport.add(scrollPane2, new GridBagConstraints(2, 5, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- table2 ----
			table2.setModel(new DefaultTableModel(
				new Object[][] {
					{"TOTAL GPA:", null},
				},
				new String[] {
					null, null
				}
			));
			{
				TableColumnModel cm = table2.getColumnModel();
				cm.getColumn(0).setMinWidth(80);
				cm.getColumn(0).setMaxWidth(80);
				cm.getColumn(0).setPreferredWidth(80);
			}
			generateGradereport.add(table2, new GridBagConstraints(2, 6, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button20 ----
			button20.setText("Cancel");
			button20.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					gradeReportCancelClicked(e);
				}
			});
			generateGradereport.add(button20, new GridBagConstraints(1, 8, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button21 ----
			button21.setText("Submit");
			button21.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					gradeReportSubmitClicked(e);
				}
			});
			generateGradereport.add(button21, new GridBagConstraints(5, 8, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(generateGradereport, "card9");

		//======== getCoursebyDepartment ========
		{
			getCoursebyDepartment.setLayout(new GridBagLayout());
			((GridBagLayout)getCoursebyDepartment.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)getCoursebyDepartment.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)getCoursebyDepartment.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)getCoursebyDepartment.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label58 ----
			label58.setText("Get Courses by Department");
			getCoursebyDepartment.add(label58, new GridBagConstraints(1, 1, 6, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));
			getCoursebyDepartment.add(separator10, new GridBagConstraints(1, 2, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label59 ----
			label59.setText("Department name");
			getCoursebyDepartment.add(label59, new GridBagConstraints(1, 3, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label60 ----
			label60.setText("Department code");
			getCoursebyDepartment.add(label60, new GridBagConstraints(4, 3, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));
			getCoursebyDepartment.add(textField44, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button30 ----
			button30.setText("Submit");
			button30.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					coursebyDepartmentNameSubmitClicked(e);
				}
			});
			getCoursebyDepartment.add(button30, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			getCoursebyDepartment.add(textField45, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button31 ----
			button31.setText("Submit");
			button31.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					coursebyDepartmentCodeSubmitClicked(e);
				}
			});
			getCoursebyDepartment.add(button31, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//======== scrollPane4 ========
			{

				//---- table5 ----
				table5.setModel(new DefaultTableModel(
					new Object[][] {
						{null},
					},
					new String[] {
						"Courses"
					}
				));
				scrollPane4.setViewportView(table5);
			}
			getCoursebyDepartment.add(scrollPane4, new GridBagConstraints(1, 6, 5, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button32 ----
			button32.setText("Cancel");
			button32.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					coursebyDepartmentCancelClicked(e);
				}
			});
			getCoursebyDepartment.add(button32, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(getCoursebyDepartment, "card12");

		//======== getCoursebyInstructor ========
		{
			getCoursebyInstructor.setLayout(new GridBagLayout());
			((GridBagLayout)getCoursebyInstructor.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0};
			((GridBagLayout)getCoursebyInstructor.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)getCoursebyInstructor.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)getCoursebyInstructor.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label55 ----
			label55.setText("Get Courses by Instructor");
			getCoursebyInstructor.add(label55, new GridBagConstraints(1, 1, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));
			getCoursebyInstructor.add(separator9, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label56 ----
			label56.setText("Instructor first Name");
			getCoursebyInstructor.add(label56, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label57 ----
			label57.setText("Instructor last name");
			getCoursebyInstructor.add(label57, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			getCoursebyInstructor.add(textField42, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			getCoursebyInstructor.add(textField43, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//======== scrollPane3 ========
			{

				//---- table4 ----
				table4.setModel(new DefaultTableModel(
					new Object[][] {
						{null},
					},
					new String[] {
						"Courses"
					}
				));
				scrollPane3.setViewportView(table4);
			}
			getCoursebyInstructor.add(scrollPane3, new GridBagConstraints(1, 6, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button28 ----
			button28.setText("Cancel");
			button28.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					coursebyInstructorCancelClicked(e);
				}
			});
			getCoursebyInstructor.add(button28, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- button29 ----
			button29.setText("Submit");
			button29.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					coursebyInstructorSubmitClicked(e);
				}
			});
			getCoursebyInstructor.add(button29, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
		}
		contentPane.add(getCoursebyInstructor, "card11");

		//======== prereqCheck ========
		{
			prereqCheck.setLayout(new GridBagLayout());
			((GridBagLayout)prereqCheck.getLayout()).columnWidths = new int[] {0, 63, 69, 79, 68, 0, 0, 0};
			((GridBagLayout)prereqCheck.getLayout()).rowHeights = new int[] {0, 0, 26, 0, 0, 37, 0, 0};
			((GridBagLayout)prereqCheck.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)prereqCheck.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label53 ----
			label53.setText("Student N number");
			prereqCheck.add(label53, new GridBagConstraints(1, 1, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label54 ----
			label54.setText("Course Number");
			prereqCheck.add(label54, new GridBagConstraints(4, 1, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			prereqCheck.add(prereqCheckNumber, new GridBagConstraints(1, 2, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			prereqCheck.add(prereqCheckCourse, new GridBagConstraints(4, 2, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			prereqCheck.add(prereqCheckOutputText, new GridBagConstraints(2, 4, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			
			//----- prereqCheckErrorMessage
			prereqCheckErrorMessage.setText("an error occured...");
			prereqCheckErrorMessage.setForeground(Color.red);
			prereqCheck.add(prereqCheckErrorMessage, new GridBagConstraints(5, 7, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			prereqCheckErrorMessage.setVisible(false);

			//---- button26 ----
			button26.setText("Cancel");
			button26.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					prereqCheckCancelClicked(e);
				}
			});
			prereqCheck.add(button26, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));

			//---- button27 ----
			button27.setText("Submit");
			button27.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					prereqCheckSubmitClicked(e);
				}
			});
			prereqCheck.add(button27, new GridBagConstraints(5, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
		}
		contentPane.add(prereqCheck, "card13");
		pack();
		setLocationRelativeTo(getOwner());
		// JFormDesigner - End of component initialization  //GEN-END:initComponents  @formatter:on
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables  @formatter:off
	// Generated using JFormDesigner Evaluation license - Rhett Alan Smithgall
	private JPanel mainMenu;
	private JLabel label51;
	private JSeparator separator8;
	private JButton addtoDatabaseButton;
	private JButton generateGradeButton;
	private JButton button22;
	private JButton button23;
	private JButton button24;
	private JButton button25;
	private JPanel addMenu;
	private JLabel label18;
	private JLabel label27;
	private JSeparator separator5;
	private JButton button9;
	private JButton button10;
	private JButton button11;
	private JButton button12;
	private JButton button13;
	private JButton button14;
	private JButton button15;
	private JPanel addStudent;
	private JLabel label34;
	private JSeparator separator7;
	private JLabel label35;
	private JLabel label36;
	private JLabel label37;
	private JLabel label38;
	private JLabel label39;
	private JTextField textField27;
	private JTextField textField28;
	private JTextField textField29;
	private JTextField textField30;
	private JTextField textField31;
	private JLabel label40;
	private JLabel label41;
	private JTextField textField32;
	private JComboBox<String> comboBox1;
	private JLabel label42;
	private JLabel label43;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JTextField textField33;
	private JTextField textField34;
	private JTextField textField35;
	private JComboBox<String> comboBox2;
	private JTextField textField36;
	private JLabel label47;
	private JLabel label48;
	private JLabel label49;
	private JLabel label50;
	private JTextField textField37;
	private JTextField textField38;
	private JTextField textField39;
	private JTextField textField40;
	private JButton button18;
	private JButton button19;
	private JPanel addDepartment;
	private JLabel label21;
	private JSeparator separator2;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JTextField addDepartmentNameInput;
	private JTextField addDepartmentCodeInput;
	private JTextField addDepartmentNumberInput;
	private JTextField addDepartmentPhoneInput;
	private JLabel label22;
	private JTextField addDepartmentCollegeInput;
	private JButton button3;
	private JButton button4;
	private JPanel addCourse;
	private JLabel label20;
	private JSeparator separator1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JLabel label19;
	private JTextField textField9;
	private JButton button2;
	private JButton button1;
	private JPanel addInstructor;
	private JLabel label25;
	private JSeparator separator4;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JTextField textField15;
	private JTextField textField16;
	private JTextField textField17;
	private JTextField textField18;
	private JLabel label26;
	private JLabel label16;
	private JLabel label17;
	private JTextField textField19;
	private JTextField textField20;
	private JTextField textField21;
	private JButton button7;
	private JButton button8;
	private JPanel addSection;
	private JLabel label28;
	private JSeparator separator6;
	private JLabel label29;
	private JLabel label30;
	private JLabel label31;
	private JTextField textField22;
	private JTextField textField23;
	private JTextField textField24;
	private JLabel label32;
	private JLabel label33;
	private JTextField textField25;
	private JTextField textField26;
	private JButton button16;
	private JButton button17;
	private JPanel addGrade;
	private JLabel label23;
	private JSeparator separator3;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JTextField textField11;
	private JTextField textField12;
	private JTextField textField13;
	private JLabel label24;
	private JTextField textField14;
	private JScrollPane scrollPane1;
	private JList<String> list1;
	private JButton button5;
	private JButton button6;
	private JPanel generateGradereport;
	private JLabel label52;
	private JTextField gradeReportInput;
	private JTable table3;
	private JScrollPane scrollPane2;
	private JTable table1;
	private JTable table2;
	private JButton button20;
	private JButton button21;
	private JPanel getCoursebyDepartment;
	private JLabel label58;
	private JSeparator separator10;
	private JLabel label59;
	private JLabel label60;
	private JTextField textField44;
	private JButton button30;
	private JTextField textField45;
	private JButton button31;
	private JScrollPane scrollPane4;
	private JTable table5;
	private JButton button32;
	private JPanel getCoursebyInstructor;
	private JLabel label55;
	private JSeparator separator9;
	private JLabel label56;
	private JLabel label57;
	private JTextField textField42;
	private JTextField textField43;
	private JScrollPane scrollPane3;
	private JTable table4;
	private JButton button28;
	private JButton button29;
	private JPanel prereqCheck;
	private JLabel label53;
	private JLabel label54;
	private JTextField prereqCheckNumber;
	private JTextField prereqCheckCourse;
	private JTextField prereqCheckOutputText;
	private JButton button26;
	private JButton button27;
	private JLabel addDepartmentErrorMessage;
	private JLabel prereqCheckErrorMessage;
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
