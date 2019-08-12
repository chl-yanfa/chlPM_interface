package com.sdic.RecoveryOrder.standard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdic.RecoveryOrder.dao.RecoverOrderDao;
import com.sdic.RecoveryOrder.dto.RecoverOrderDto;
import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;

@Service
public class RecoverOrderService {
	
	@Autowired
	private RecoverOrderDao recoverOrderDao;
	
	public ResultDTO<RecoverOrderDto>getRecoverOrderDetails(String id){
		ResultDTO<RecoverOrderDto> res = new ResultDTO<RecoverOrderDto>();
		RecoverOrderDto recoverOrderDto = recoverOrderDao.getRecoverOrderDetails(id);
		res.setEntity(recoverOrderDto);
		res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
		res.setReturnMsg(Constants.RETURN_MSG_SUCCESS);
		return res;
	}

}
