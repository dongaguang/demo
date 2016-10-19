package exception;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ExpOperate {
	public static void main(String[] args) {
		//激活全局日志记录器
		Logger.getGlobal().setLevel(Level.INFO);
		Logger.getGlobal().info("hehe");
	}
}
