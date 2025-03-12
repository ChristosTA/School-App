package gr.aueb.cf.schoolapp;

import gr.aueb.cf.schoolapp.view_controller.InsertTeacherPage;
import gr.aueb.cf.schoolapp.view_controller.TeacherView;
import gr.aueb.cf.schoolapp.view_controller.UpdateTeacherPage;
import gr.aueb.cf.schoolapp.view_controller.ViewTeachersPage;
import gr.aueb.cf.schoolapp.view_controller.Dashboard;
import gr.aueb.cf.schoolapp.view_controller.LoginPage;
import gr.aueb.cf.schoolapp.view_controller.LandingPage;

import java.awt.EventQueue;

public class Main {
	private final static LandingPage LandingPage = new LandingPage();
	private final static LoginPage LoginPage = new LoginPage();
	private static final Dashboard Dashboard = new Dashboard();
	private static final InsertTeacherPage insertTeacherPage = new InsertTeacherPage();
	private static final ViewTeachersPage viewTeachersPage = new ViewTeachersPage();
	private static final TeacherView teacherView = new TeacherView();
	private static final UpdateTeacherPage updateTeacherPage = new UpdateTeacherPage();

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					LandingPage.setVisible(true);
					LandingPage.setLocationRelativeTo(null);
					
					LoginPage.setVisible(false);
					LoginPage.setLocationRelativeTo(null);
					
					Dashboard.setVisible(false);
					Dashboard.setLocationRelativeTo(null);
					
					insertTeacherPage.setVisible(false);
					insertTeacherPage.setLocationRelativeTo(null);
					
					viewTeachersPage.setVisible(false);
					viewTeachersPage.setLocationRelativeTo(null);
					
					teacherView.setVisible(false);
					teacherView.setLocationRelativeTo(null);
					
					updateTeacherPage.setVisible(false);
					updateTeacherPage.setLocationRelativeTo(null);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static LandingPage getLandingpage() {
		return LandingPage;
	}
	
	public static LoginPage getLoginpage() {
		return LoginPage;
	}
	
	public static Dashboard getDashboard() {
		return Dashboard;
	}
	
	
	public static InsertTeacherPage getInsertTeacherPage() {
		return insertTeacherPage;
	}
	
	public static ViewTeachersPage getViewTeachersPage() {
		return viewTeachersPage;
	}

	public static TeacherView getTeacherView() {
		return teacherView;
	}

	public static UpdateTeacherPage getUpdateTeacherPage() {
		return updateTeacherPage;
	}

}
