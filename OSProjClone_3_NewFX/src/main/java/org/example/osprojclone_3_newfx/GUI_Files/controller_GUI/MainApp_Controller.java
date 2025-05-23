package org.example.osprojclone_3_newfx.GUI_Files.controller_GUI;

import java.awt.EventQueue;
import java.util.List;

import javax.swing.WindowConstants;
import org.example.osprojclone_3_newfx.GUI_Files.module_GUI.ProcessModule;
import org.example.osprojclone_3_newfx.GUI_Files.viewer_GUI.MainApp_Viewer;

public class MainApp_Controller {

	public static void RunMainApp(String title, List<ProcessModule> processList) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					MainApp_Viewer mainPage = new MainApp_Viewer(title, processList);
					mainPage.setSize(1080, 720);
					mainPage.setLocationRelativeTo(null);
					mainPage.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
					mainPage.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}
