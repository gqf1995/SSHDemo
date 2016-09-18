package com.gqf.ssh.action;

import java.io.IOException;

import org.apache.struts2.ServletActionContext;

import com.google.gson.Gson;
import com.gqf.ssh.modle.ItemInfoModle;
import com.gqf.ssh.service.ItemInfoServiceInterface;

public class ItemInfoAction {
	
	private ItemInfoServiceInterface mItemInfoService;

	public void setmItemInfoService(ItemInfoServiceInterface mItemInfoService) {
		this.mItemInfoService = mItemInfoService;
	}
	
	private String params;
	
	
	public void setParams(String params) {
		this.params = params;
	}

	//{"itemid":"gqfitem","productid":"gqfproduct","listprice":12,"unitcost":12,"supplier":1,"status":"P","attr1":"gqfdemo"}
	/**
	 * ����ѧ����Ϣ
	 */
	public void addItemInfo(){
		//��json���ݽ�����modle
		
		Gson g=new Gson();
		ItemInfoModle itemInfo=g.fromJson(params, ItemInfoModle.class);
		boolean result=mItemInfoService.addItemInfo(itemInfo);
		try {
			if(result){
				//����ɹ�
				
				ServletActionContext.getResponse().getWriter()
						.print("{\"type\":0,\"msg\":\"success\"}");
					
			}else{
				//ʧ��
				ServletActionContext.getResponse().getWriter()
						.print("{\"type\":1,\"msg\":\"fail\"}");

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} 
}
