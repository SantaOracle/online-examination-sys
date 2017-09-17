package online_examination_sys.domain.dao.dto;

public class BaseDTO {
    //请求结果，0请求执行失败，1请求执行成功
    private int resultCode;
    //返回前端附加信息
    private String resultMsg;

    public BaseDTO(){
        this.resultCode = 0;
        this.resultMsg = new String();
    }

    public BaseDTO(int resultCode, String resultMsg){
        this.resultCode = resultCode;
        this.resultMsg = resultMsg;
    }

    public int getResultCode() {
        return resultCode;
    }

    public void setResultCode(int resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultMsg() {
        return resultMsg;
    }

    public void setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
    }
}
