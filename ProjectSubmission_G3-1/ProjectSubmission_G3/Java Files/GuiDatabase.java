import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
/*
 * Created by JFormDesigner on Mon Apr 15 00:47:37 EDT 2024
 */



/**
 * @author rhett
 */
public class GuiDatabase extends JFrame {
	public GuiDatabase() {
		initComponents();
	}

	private void mainMenuAddDatabaseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void mainMenuGradeClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addDepartmentCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addDepartmentSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addGradeCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addGradeSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addInstructorCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addInstructorSubmitCLicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuStudentClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuDepartmentClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuCourseClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuInstructorClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuSectionClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuGradesClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addMenuCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addSectionCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addSectionSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addStudentCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addStudentSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void mainMenuCoursebyDepartmentClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void mainMenuCoursebyInstructorClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void mainMenuCheckPrereqClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void mainMenuExitProgramClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addCourseCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void addCourseSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void gradeReportCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void gradeReportSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void prereqCheckCancelClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void prereqCheckSubmitClicked(MouseEvent e) {
		// TODO add your code here
	}

	private void coursebyInstructorCancelClicked(MouseEvent e) {
		// TODO add your code here
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
		// TODO add your code here
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents  @formatter:off
		// Generated using JFormDesigner Evaluation license - Rhett Alan Smithgall
		loadingScreen = new JPanel();
		label64 = new JLabel();
		label62 = new JLabel();
		progressBar1 = new JProgressBar();
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
		addStudentNumberInput = new JTextField();
		addStudentSSNInput = new JTextField();
		addStudentFnameInput = new JTextField();
		addStudentMidinitInput = new JTextField();
		addStudentLnameInput = new JTextField();
		label40 = new JLabel();
		label41 = new JLabel();
		addStudentDOBInput = new JTextField();
		comboBox1 = new JComboBox<>();
		label42 = new JLabel();
		label43 = new JLabel();
		label44 = new JLabel();
		label45 = new JLabel();
		label46 = new JLabel();
		addStudentCurrPhoneInput = new JTextField();
		addStudentPermPhoneInput = new JTextField();
		addStudentStreetInput = new JTextField();
		comboBox2 = new JComboBox<>();
		addStudentZipInput = new JTextField();
		label47 = new JLabel();
		label48 = new JLabel();
		label49 = new JLabel();
		label50 = new JLabel();
		addStudentClassInput = new JTextField();
		addStudentDegreeInput = new JTextField();
		addStudentMajorInput = new JTextField();
		addStudentMinorInput = new JTextField();
		button18 = new JButton();
		button19 = new JButton();
		addStudentErrorMessage = new JLabel();
		progressBar2 = new JProgressBar();
		addDepartment = new JPanel();
		label21 = new JLabel();
		separator2 = new JSeparator();
		label5 = new JLabel();
		label6 = new JLabel();
		label7 = new JLabel();
		label8 = new JLabel();
		textField5 = new JTextField();
		textField6 = new JTextField();
		textField7 = new JTextField();
		textField8 = new JTextField();
		label22 = new JLabel();
		textField10 = new JTextField();
		label61 = new JLabel();
		button3 = new JButton();
		button4 = new JButton();
		addCourse = new JPanel();
		label20 = new JLabel();
		separator1 = new JSeparator();
		label1 = new JLabel();
		label2 = new JLabel();
		label3 = new JLabel();
		label4 = new JLabel();
		addCourseNumberInput = new JTextField();
		addCourseNameInput = new JTextField();
		addCourseHoursInput = new JTextField();
		addCourseDepartmentInput = new JTextField();
		label19 = new JLabel();
		addCoursePrereqInput = new JTextField();
		addCourseCancelClicked = new JButton();
		addCourseSubmitClicked = new JButton();
		addCourseErrorMessage = new JLabel();
		addCourseProgressBar = new JProgressBar();
		addInstructor = new JPanel();
		label25 = new JLabel();
		separator4 = new JSeparator();
		label67 = new JLabel();
		label12 = new JLabel();
		label13 = new JLabel();
		label14 = new JLabel();
		label15 = new JLabel();
		addInstructorNumberInput = new JTextField();
		addInstructorSSNInput = new JTextField();
		addInstructorFnameInput = new JTextField();
		addInstructorMidinitInput = new JTextField();
		addInstructorLnameInput = new JTextField();
		label68 = new JLabel();
		label26 = new JLabel();
		label16 = new JLabel();
		label17 = new JLabel();
		addInstructorAgeInput = new JTextField();
		addInstructorDateInput = new JTextField();
		addInstructorOfficeInput = new JTextField();
		addInstructorStreetAddressInput = new JTextField();
		addInstructorErrorMessage = new JLabel();
		button7 = new JButton();
		button8 = new JButton();
		addSection = new JPanel();
		label28 = new JLabel();
		separator6 = new JSeparator();
		label29 = new JLabel();
		label30 = new JLabel();
		label31 = new JLabel();
		addSectionSectionNumInput = new JTextField();
		addSectionCourseNumInput = new JTextField();
		addSectionSemesterInput = new JTextField();
		label32 = new JLabel();
		label33 = new JLabel();
		addSectionYearInput = new JTextField();
		addSectionInstructorNumInput = new JTextField();
		addSectionErrorMessage = new JLabel();
		button16 = new JButton();
		button17 = new JButton();
		addGrade = new JPanel();
		label23 = new JLabel();
		separator3 = new JSeparator();
		label9 = new JLabel();
		label10 = new JLabel();
		label66 = new JLabel();
		label11 = new JLabel();
		addGradeStudentNumberInput = new JTextField();
		addGradeSectionNumberInput = new JTextField();
		addGradeSemesterInput = new JTextField();
		addGradeCourseNumberInput = new JTextField();
		label24 = new JLabel();
		textField14 = new JTextField();
		scrollPane1 = new JScrollPane();
		list1 = new JList<>();
		label65 = new JLabel();
		button5 = new JButton();
		button6 = new JButton();
		generateGradereport = new JPanel();
		label52 = new JLabel();
		textField41 = new JTextField();
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
		prereqCheckNumber = new JTextField();
		prereqCheckCourse = new JTextField();
		prereqCheckOutputText = new JTextField();
		button26 = new JButton();
		button27 = new JButton();

		//======== this ========
		setTitle("Database Project - Group 3");
		Container contentPane = getContentPane();
		contentPane.setLayout(new CardLayout());

		//======== loadingScreen ========
		{
			loadingScreen.setBorder(new javax.swing.border.CompoundBorder(new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(
			0,0,0,0), "JF\u006frmD\u0065sig\u006eer \u0045val\u0075ati\u006fn",javax.swing.border.TitledBorder.CENTER,javax.swing.border.TitledBorder
			.BOTTOM,new java.awt.Font("Dia\u006cog",java.awt.Font.BOLD,12),java.awt.Color.
			red),loadingScreen. getBorder()));loadingScreen. addPropertyChangeListener(new java.beans.PropertyChangeListener(){@Override public void propertyChange(java.
			beans.PropertyChangeEvent e){if("\u0062ord\u0065r".equals(e.getPropertyName()))throw new RuntimeException();}});
			loadingScreen.setLayout(new GridBagLayout());
			((GridBagLayout)loadingScreen.getLayout()).columnWidths = new int[] {124, 689, 156, 0};
			((GridBagLayout)loadingScreen.getLayout()).rowHeights = new int[] {64, 61, 186, 0, 0, 0};
			((GridBagLayout)loadingScreen.getLayout()).columnWeights = new double[] {0.0, 1.0, 0.0, 1.0E-4};
			((GridBagLayout)loadingScreen.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label64 ----
			label64.setText("Database Project - Group 3");
			label64.setFont(new Font("Segoe UI", Font.PLAIN, 28));
			label64.setHorizontalAlignment(SwingConstants.CENTER);
			loadingScreen.add(label64, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label62 ----
			label62.setText("Loading...");
			loadingScreen.add(label62, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			loadingScreen.add(progressBar1, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
		}
		contentPane.add(loadingScreen, "card14");

		//======== mainMenu ========
		{
			mainMenu.setLayout(new GridBagLayout());
			((GridBagLayout)mainMenu.getLayout()).columnWidths = new int[] {50, 261, 70, 373, 0};
			((GridBagLayout)mainMenu.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)mainMenu.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)mainMenu.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label51 ----
			label51.setText("Main Menu");
			label51.setHorizontalAlignment(SwingConstants.CENTER);
			label51.setFont(new Font("Segoe UI", Font.PLAIN, 20));
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
			((GridBagLayout)addMenu.getLayout()).columnWidths = new int[] {453, 0, 0, 0};
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
			((GridBagLayout)addStudent.getLayout()).columnWidths = new int[] {61, 155, 45, 155, 45, 155, 45, 155, 140, 0};
			((GridBagLayout)addStudent.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addStudent.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0E-4};
			((GridBagLayout)addStudent.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label34 ----
			label34.setText("Add Student");
			addStudent.add(label34, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(separator7, new GridBagConstraints(1, 2, 7, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label35 ----
			label35.setText("student number");
			addStudent.add(label35, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label36 ----
			label36.setText("social security number");
			addStudent.add(label36, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label37 ----
			label37.setText("First name");
			addStudent.add(label37, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label38 ----
			label38.setText("Middle Inital");
			addStudent.add(label38, new GridBagConstraints(6, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label39 ----
			label39.setText("Last name");
			addStudent.add(label39, new GridBagConstraints(7, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentNumberInput, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentSSNInput, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentFnameInput, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentMidinitInput, new GridBagConstraints(6, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentLnameInput, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label40 ----
			label40.setText("Date");
			addStudent.add(label40, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label41 ----
			label41.setText("Sex");
			addStudent.add(label41, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addStudentDOBInput ----
			addStudentDOBInput.setText("DD/MM/YYYY");
			addStudent.add(addStudentDOBInput, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- comboBox1 ----
			comboBox1.setModel(new DefaultComboBoxModel<>(new String[] {
				"Male",
				"Female",
				"Other"
			}));
			addStudent.add(comboBox1, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label42 ----
			label42.setText("Current Phone");
			addStudent.add(label42, new GridBagConstraints(1, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label43 ----
			label43.setText("Permanent Phone");
			addStudent.add(label43, new GridBagConstraints(3, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label44 ----
			label44.setText("Street");
			addStudent.add(label44, new GridBagConstraints(5, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label45 ----
			label45.setText("State");
			addStudent.add(label45, new GridBagConstraints(6, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label46 ----
			label46.setText("Zip code");
			addStudent.add(label46, new GridBagConstraints(7, 8, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentCurrPhoneInput, new GridBagConstraints(1, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentPermPhoneInput, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentStreetInput, new GridBagConstraints(5, 9, 1, 1, 0.0, 0.0,
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
			addStudent.add(comboBox2, new GridBagConstraints(6, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentZipInput, new GridBagConstraints(7, 9, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label47 ----
			label47.setText("Class");
			addStudent.add(label47, new GridBagConstraints(1, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label48 ----
			label48.setText("Degree");
			addStudent.add(label48, new GridBagConstraints(3, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label49 ----
			label49.setText("Major");
			addStudent.add(label49, new GridBagConstraints(5, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label50 ----
			label50.setText("Minor");
			addStudent.add(label50, new GridBagConstraints(7, 11, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentClassInput, new GridBagConstraints(1, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentDegreeInput, new GridBagConstraints(3, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentMajorInput, new GridBagConstraints(5, 12, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(addStudentMinorInput, new GridBagConstraints(7, 12, 1, 1, 0.0, 0.0,
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
			addStudent.add(button19, new GridBagConstraints(5, 14, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addStudentErrorMessage ----
			addStudentErrorMessage.setText("an error occured...");
			addStudentErrorMessage.setForeground(Color.red);
			addStudent.add(addStudentErrorMessage, new GridBagConstraints(6, 14, 2, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addStudent.add(progressBar2, new GridBagConstraints(5, 15, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
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
			addDepartment.add(textField5, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(textField6, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(textField7, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(textField8, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label22 ----
			label22.setText("College");
			addDepartment.add(label22, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addDepartment.add(textField10, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label61 ----
			label61.setText("an error occured...");
			label61.setForeground(Color.red);
			addDepartment.add(label61, new GridBagConstraints(5, 7, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

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
			((GridBagLayout)addCourse.getLayout()).columnWidths = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 84, 43, 0, 0};
			((GridBagLayout)addCourse.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addCourse.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addCourse.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

			//---- label20 ----
			label20.setText("Add Course");
			addCourse.add(label20, new GridBagConstraints(1, 1, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(separator1, new GridBagConstraints(1, 2, 8, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

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
			addCourse.add(addCourseNumberInput, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(addCourseNameInput, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(addCourseHoursInput, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(addCourseDepartmentInput, new GridBagConstraints(7, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label19 ----
			label19.setText("Prerequisites");
			addCourse.add(label19, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addCourse.add(addCoursePrereqInput, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addCourseCancelClicked ----
			addCourseCancelClicked.setText("Cancel");
			addCourseCancelClicked.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addCourseCancelClicked(e);
				}
			});
			addCourse.add(addCourseCancelClicked, new GridBagConstraints(1, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addCourseSubmitClicked ----
			addCourseSubmitClicked.setText("Submit");
			addCourseSubmitClicked.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					addCourseSubmitClicked(e);
				}
			});
			addCourse.add(addCourseSubmitClicked, new GridBagConstraints(5, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addCourseErrorMessage ----
			addCourseErrorMessage.setText("an error occured...");
			addCourseErrorMessage.setForeground(Color.red);
			addCourse.add(addCourseErrorMessage, new GridBagConstraints(8, 8, 3, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));
			addCourse.add(addCourseProgressBar, new GridBagConstraints(5, 9, 4, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 0, 5), 0, 0));
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

			//---- label67 ----
			label67.setText("Instructor Number");
			addInstructor.add(label67, new GridBagConstraints(1, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label12 ----
			label12.setText("social security number");
			addInstructor.add(label12, new GridBagConstraints(2, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label13 ----
			label13.setText("First name");
			addInstructor.add(label13, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label14 ----
			label14.setText("Middle Inital");
			addInstructor.add(label14, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label15 ----
			label15.setText("Last name");
			addInstructor.add(label15, new GridBagConstraints(5, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));
			addInstructor.add(addInstructorNumberInput, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorSSNInput, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorFnameInput, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorMidinitInput, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorLnameInput, new GridBagConstraints(5, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

			//---- label68 ----
			label68.setText("Age");
			addInstructor.add(label68, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label26 ----
			label26.setText("Date");
			addInstructor.add(label26, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label16 ----
			label16.setText("Office Phone");
			addInstructor.add(label16, new GridBagConstraints(3, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label17 ----
			label17.setText("Street Address");
			addInstructor.add(label17, new GridBagConstraints(4, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorAgeInput, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addInstructorDateInput ----
			addInstructorDateInput.setText("DD/MM/YYYY");
			addInstructor.add(addInstructorDateInput, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorOfficeInput, new GridBagConstraints(3, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addInstructor.add(addInstructorStreetAddressInput, new GridBagConstraints(4, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addInstructorErrorMessage ----
			addInstructorErrorMessage.setText("an error occured...");
			addInstructorErrorMessage.setForeground(Color.red);
			addInstructor.add(addInstructorErrorMessage, new GridBagConstraints(3, 7, 2, 1, 0.0, 0.0,
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
					addInstructorSubmitCLicked(e);
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
			addSection.add(addSectionSectionNumInput, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(addSectionCourseNumInput, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(addSectionSemesterInput, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label32 ----
			label32.setText("Year");
			addSection.add(label32, new GridBagConstraints(1, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label33 ----
			label33.setText("Instructor number");
			addSection.add(label33, new GridBagConstraints(2, 5, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(addSectionYearInput, new GridBagConstraints(1, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addSection.add(addSectionInstructorNumInput, new GridBagConstraints(2, 6, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- addSectionErrorMessage ----
			addSectionErrorMessage.setText("an error occured...");
			addSectionErrorMessage.setForeground(Color.red);
			addSection.add(addSectionErrorMessage, new GridBagConstraints(3, 7, 1, 1, 0.0, 0.0,
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
			((GridBagLayout)addGrade.getLayout()).columnWidths = new int[] {0, 108, 108, 90, 0, 0};
			((GridBagLayout)addGrade.getLayout()).rowHeights = new int[] {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
			((GridBagLayout)addGrade.getLayout()).columnWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};
			((GridBagLayout)addGrade.getLayout()).rowWeights = new double[] {0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0E-4};

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

			//---- label66 ----
			label66.setText("Semester");
			addGrade.add(label66, new GridBagConstraints(3, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label11 ----
			label11.setText("Course number");
			addGrade.add(label11, new GridBagConstraints(4, 3, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));
			addGrade.add(addGradeStudentNumberInput, new GridBagConstraints(1, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(addGradeSectionNumberInput, new GridBagConstraints(2, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(addGradeSemesterInput, new GridBagConstraints(3, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));
			addGrade.add(addGradeCourseNumberInput, new GridBagConstraints(4, 4, 1, 1, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 0), 0, 0));

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
			addGrade.add(scrollPane1, new GridBagConstraints(3, 6, 1, 3, 0.0, 0.0,
				GridBagConstraints.CENTER, GridBagConstraints.BOTH,
				new Insets(0, 0, 5, 5), 0, 0));

			//---- label65 ----
			label65.setText("an error has occured...");
			label65.setForeground(Color.red);
			addGrade.add(label65, new GridBagConstraints(3, 9, 1, 1, 0.0, 0.0,
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
			addGrade.add(button5, new GridBagConstraints(1, 10, 1, 1, 0.0, 0.0,
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
			addGrade.add(button6, new GridBagConstraints(3, 10, 1, 1, 0.0, 0.0,
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
			generateGradereport.add(textField41, new GridBagConstraints(1, 2, 3, 1, 0.0, 0.0,
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
	private JPanel loadingScreen;
	private JLabel label64;
	private JLabel label62;
	private JProgressBar progressBar1;
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
	private JTextField addStudentNumberInput;
	private JTextField addStudentSSNInput;
	private JTextField addStudentFnameInput;
	private JTextField addStudentMidinitInput;
	private JTextField addStudentLnameInput;
	private JLabel label40;
	private JLabel label41;
	private JTextField addStudentDOBInput;
	private JComboBox<String> comboBox1;
	private JLabel label42;
	private JLabel label43;
	private JLabel label44;
	private JLabel label45;
	private JLabel label46;
	private JTextField addStudentCurrPhoneInput;
	private JTextField addStudentPermPhoneInput;
	private JTextField addStudentStreetInput;
	private JComboBox<String> comboBox2;
	private JTextField addStudentZipInput;
	private JLabel label47;
	private JLabel label48;
	private JLabel label49;
	private JLabel label50;
	private JTextField addStudentClassInput;
	private JTextField addStudentDegreeInput;
	private JTextField addStudentMajorInput;
	private JTextField addStudentMinorInput;
	private JButton button18;
	private JButton button19;
	private JLabel addStudentErrorMessage;
	private JProgressBar progressBar2;
	private JPanel addDepartment;
	private JLabel label21;
	private JSeparator separator2;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JTextField textField5;
	private JTextField textField6;
	private JTextField textField7;
	private JTextField textField8;
	private JLabel label22;
	private JTextField textField10;
	private JLabel label61;
	private JButton button3;
	private JButton button4;
	private JPanel addCourse;
	private JLabel label20;
	private JSeparator separator1;
	private JLabel label1;
	private JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JTextField addCourseNumberInput;
	private JTextField addCourseNameInput;
	private JTextField addCourseHoursInput;
	private JTextField addCourseDepartmentInput;
	private JLabel label19;
	private JTextField addCoursePrereqInput;
	private JButton addCourseCancelClicked;
	private JButton addCourseSubmitClicked;
	private JLabel addCourseErrorMessage;
	private JProgressBar addCourseProgressBar;
	private JPanel addInstructor;
	private JLabel label25;
	private JSeparator separator4;
	private JLabel label67;
	private JLabel label12;
	private JLabel label13;
	private JLabel label14;
	private JLabel label15;
	private JTextField addInstructorNumberInput;
	private JTextField addInstructorSSNInput;
	private JTextField addInstructorFnameInput;
	private JTextField addInstructorMidinitInput;
	private JTextField addInstructorLnameInput;
	private JLabel label68;
	private JLabel label26;
	private JLabel label16;
	private JLabel label17;
	private JTextField addInstructorAgeInput;
	private JTextField addInstructorDateInput;
	private JTextField addInstructorOfficeInput;
	private JTextField addInstructorStreetAddressInput;
	private JLabel addInstructorErrorMessage;
	private JButton button7;
	private JButton button8;
	private JPanel addSection;
	private JLabel label28;
	private JSeparator separator6;
	private JLabel label29;
	private JLabel label30;
	private JLabel label31;
	private JTextField addSectionSectionNumInput;
	private JTextField addSectionCourseNumInput;
	private JTextField addSectionSemesterInput;
	private JLabel label32;
	private JLabel label33;
	private JTextField addSectionYearInput;
	private JTextField addSectionInstructorNumInput;
	private JLabel addSectionErrorMessage;
	private JButton button16;
	private JButton button17;
	private JPanel addGrade;
	private JLabel label23;
	private JSeparator separator3;
	private JLabel label9;
	private JLabel label10;
	private JLabel label66;
	private JLabel label11;
	private JTextField addGradeStudentNumberInput;
	private JTextField addGradeSectionNumberInput;
	private JTextField addGradeSemesterInput;
	private JTextField addGradeCourseNumberInput;
	private JLabel label24;
	private JTextField textField14;
	private JScrollPane scrollPane1;
	private JList<String> list1;
	private JLabel label65;
	private JButton button5;
	private JButton button6;
	private JPanel generateGradereport;
	private JLabel label52;
	private JTextField textField41;
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
	// JFormDesigner - End of variables declaration  //GEN-END:variables  @formatter:on
}
