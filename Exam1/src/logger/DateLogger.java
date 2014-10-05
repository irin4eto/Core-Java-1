package logger;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateLogger extends Logger {

	public DateLogger(int level) {
		super(level);
	}

	public DateLogger() {
		super();
	}

	public void log(String message) {
		if (getLevel() >= 3) {
			Date time = new Date();
			DateFormat dateFormat = new SimpleDateFormat("|hh:mm:ss dd.MM.YY| ");
			System.out.println(dateFormat.format(time) + getLevel() + " => "
					+ message);
		}
	}

	public void log(int level, String message) {
		if (level <= 0 || level < getLevel()) {
			System.out.println(
					("The level must be positive and higher than current level!"));
		} else {
			Date time = new Date();
			DateFormat dateFormat = new SimpleDateFormat("|hh:mm:ss dd.MM.YY| ");
			System.out.println(dateFormat.format(time) + level + " => "
					+ message);
		}
	}

}
