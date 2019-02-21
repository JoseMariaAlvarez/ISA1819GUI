//crear una aplicacion con una etiqueta con la fecha y hora actual 
package pckYang;
import java.util.Date;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;


import java.text.SimpleDateFormat;


public class p01 extends JFrame {
	private JPanel timePanel;
	private JLabel timeLabel;
	private JLabel display;
	private String time;
	private int sec=1000;
	public p01(){
		
		timePanel=new JPanel();
		timeLabel=new JLabel("current time is:");
		display=new JLabel();
		configTimeArea();
		timePanel.add(timeLabel);
		timePanel.add(display);
		this.setContentPane(timePanel);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(200,200);
		this.setLocationRelativeTo(null); //"null" lets window appears at the center 
	    this.setVisible(true);
	}
	/*Timer是一种定时器工具，用来在一个后台线程计划执行指定任务。它可以计划执行一个任务一次或反复多次。TimerTask一个抽象类，它的子类代表一个可以被Timer计划的任务。
	We use java.util.Timer for threads.This class provides schedule tasks for future execution in a background thread. 
	We use java.util.TimerTask to set scheduled for one-time or repeated execution by a Timer*/
	public void configTimeArea() {
		Timer t=new Timer();
		t.schedule(new JLabelTimerTask(), new Date(), sec);
	}
	//TimerTask
	protected class JLabelTimerTask extends TimerTask {
		SimpleDateFormat date_format=new SimpleDateFormat("yy/MM/dd HH:mm:ss");
		@Override
		public void run() {
			//.format returns string 
			time = date_format.format(Calendar.getInstance().getTime());
			display.setText(time);
		}
	}
}
