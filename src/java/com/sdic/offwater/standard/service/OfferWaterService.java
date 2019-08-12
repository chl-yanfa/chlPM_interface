package com.sdic.offwater.standard.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sdic.common.Constants;
import com.sdic.common.ResultDTO;
import com.sdic.offwater.dao.OfferWaterDao;
import com.sdic.offwater.entity.OfferWaterInfo;


/**
 * 项目名称：	sdicPM_interface
 * 类名称：	OfferWaterService
 * 类描述：	出价流水逻辑层
 * 创建人：	zhangwanxin
 * 创建时间： 	2018年11月29日 下午2:03:12
 */
@Service
public class OfferWaterService {
	
	@Autowired 
	private OfferWaterDao offerWaterDao;
	
	/**
	 * 根据订单id查询本拍品出价记录
	 * @param orderId
	 */
	public ResultDTO<OfferWaterInfo> getOfferWaterListByOrderId(OfferWaterInfo info){
		ResultDTO<OfferWaterInfo> res = new ResultDTO<OfferWaterInfo>();
		if(null!=info&&StringUtils.isNotBlank(info.getOrderId())) {
			List<OfferWaterInfo> list = offerWaterDao.getOfferWaterListByOrderId(info.getOrderId());
			if(list!=null&&list.size()>0) {
				for (OfferWaterInfo offerWaterInfo : list) {
					/*String nickname = offerWaterInfo.getNickname();
					if(StringUtils.isNotBlank(nickname)) {
						nickname = nickname.replaceAll("(.{2})(.*)(.{2})", "$1" + "****" + "$3");
						offerWaterInfo.setNickname(nickname);
					}*/
					offerWaterInfo.setNickname("******");
				}				
			}
			int total = offerWaterDao.getOfferWaterTotalByOrderId(info.getOrderId());
			res.setReturnCode(Constants.RETURN_CODE_SUCCESS);
			res.setReturnMsg("成功");
			res.setRows(list);
			res.setTotal(total);
			return res;
		}else {
			res.setReturnCode(Constants.RETURN_CODE_PARAMETER_NULL);
			res.setReturnMsg("参数为空");
			return res;
		}
	}
	
}
