package corejsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "tp")
@SessionScoped
public class TabbedPane {
	private int index;
	private static final int MTA_INDEX = 0;
	private static final int BK_INDEX = 1;
	private static final int CN_INDEX = 2;

	// private String[] tabTooltips = { "mtaTooltip", "bkTooltip", "cnTooltip" };

	public TabbedPane() {
		index = MTA_INDEX;
	}
	// action listeners that set the current tab

	public void mtaAction(ActionEvent e) {
		index = MTA_INDEX;
	}

	public void bkAction(ActionEvent e) {
		index = BK_INDEX;
	}

	public void cnAction(ActionEvent e) {
		index = CN_INDEX;
	}

	// methods for determining the current tab

	public boolean isMTACurrent() {
		return index == MTA_INDEX;
	}

	public boolean isBKCurrent() {
		return index == BK_INDEX;
	}

	public boolean isCNCurrent() {
		return index == CN_INDEX;
	}

}
