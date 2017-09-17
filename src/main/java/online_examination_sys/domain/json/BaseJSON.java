package online_examination_sys.domain.json;

public class BaseJSON {
	
	protected String resultMsg="成功";
	protected int resultCode=0;
	public BaseJSON(){
	}
	
	public BaseJSON(int resultCode,String resultMsg){
		this.resultCode=resultCode;
		this.resultMsg=resultMsg;
	}
	
	public String getResultMsg() {
		return resultMsg;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}

	public int getResultCode() {
		return resultCode;
	}

	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
}
