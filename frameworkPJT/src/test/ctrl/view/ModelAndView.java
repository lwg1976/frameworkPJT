package test.ctrl.view;

public class ModelAndView {
	private String path;
	private boolean send;
	
	public ModelAndView() {
		super();
	}
	public ModelAndView(String path, boolean send) {
		super();
		this.path = path;
		this.send = send;
	}
	
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public boolean isSend() {
		return send;
	}
	public void setSend(boolean send) {
		this.send = send;
	}
	
}
