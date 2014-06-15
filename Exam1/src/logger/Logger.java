package logger;


	public class Logger {
		
		private int level;

		public Logger() {
			level = 3;
		}

		public Logger(int level) {
			setLevel(level);
		}
		
		public Logger(Logger logger) {
			setLevel(logger.getLevel());
		}

		public void setLevel(int level) {
			if (level > 0) {
	            this.level = level;
	        } else
	            this.level = 3;
		}

		public int getLevel() {
			return level;
		}

	public void log(int level, String message) {
		if (level <= 0 || level < this.level) {
			System.err.println(("The level must be positive and higher than current level!"));
		} else {
			if(message.equals(null)) {
				message = "";
			    System.out.println(level + " => " + message);
			}
		}
	}

		public void log(String message) {
			if (this.getLevel() >= 3) {
				if(message.equals(null)) {
					message = "";
				    System.out.println(this.getLevel() + " => " + message);
				}
			}
		}

	}


