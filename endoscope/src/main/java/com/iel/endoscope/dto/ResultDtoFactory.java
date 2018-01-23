package com.iel.endoscope.dto;

import com.iel.endoscope.constant.ResultCode;
import org.springframework.stereotype.Component;

@Component
public class ResultDtoFactory {
    
    public ResultDtoFactory() {
    }

    public static ResultDto toSuccess(String reason) {
        return toSuccess(reason, null);
    }

    public static ResultDto toSuccess(Object data) {
        return toSuccess("success", data);
    }

    public static ResultDto toSuccess(String reason, Object result) {
        ResultDto dto = new ResultDto();
        dto.setResultCode("0");
        dto.setReason(reason);
        dto.setResult(result);
        return dto;
    }

    public static ResultDto toSuccess(ResultCode rc) {
        return toSuccess("success");
    }
    
    public static ResultDto toUnknowError(){
    	ResultDto dto = new ResultDto();
        dto.setResultCode("-1");
        dto.setReason("UnknowError");
        dto.setResult(null);
        return dto;
    }
    
    public static ResultDto toError(ResultCode rc) {
        ResultDto dto = new ResultDto();
        dto.setResultCode(rc.getCode());
        dto.setReason(rc.getMessage());
        dto.setResult(null);
        return dto;
    }
    
    public ResultDto toInvalideTokenError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("10004");
        dto.setReason("InvalideTokenErrer");
        dto.setResult(null);
        return dto;
    }
    
    public ResultDto toNopermissionsError() {
        ResultDto dto = new ResultDto();
        dto.setResultCode("30000");
        dto.setReason("NopermissionsError");
        dto.setResult(null);
        return dto;
    }

    public static ResultDto toError(String string, String str) {
        ResultDto dto = new ResultDto();
        dto.setResultCode("90001");
        dto.setReason(str);
        dto.setResult(null);
        return dto;
    }
    
    public static ResultDto toGetTError(){
    	ResultDto dto = new ResultDto();
        dto.setResultCode("-1");
        dto.setReason("key or secret error");
        dto.setResult(null);
        return dto;
    }
    
    public static ResultDto toGetTSuccess(Object data){
    	return toSuccess("success", data);
    }
    
}
