package Application;

import com.jfoenix.controls.*;

public class listItems {
	public JFXProgressBar prog;
	public java.lang.Process proc;
	
	public listItems(java.lang.Process proc, JFXProgressBar prog) {
		this.prog = prog;
		this.proc = proc;
		prog.setProgress(proc.getCurrentBurst().timeWorked/proc.getCurrentBurst().timeNeeded);
	}
}
