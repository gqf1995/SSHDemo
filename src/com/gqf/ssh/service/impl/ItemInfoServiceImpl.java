package com.gqf.ssh.service.impl;

import com.gqf.ssh.dao.ItemInfoInterface;
import com.gqf.ssh.dao.impl.ItemInfoImpl;
import com.gqf.ssh.modle.ItemInfoModle;
import com.gqf.ssh.service.ItemInfoServiceInterface;

public class ItemInfoServiceImpl implements ItemInfoServiceInterface{

	private ItemInfoInterface mItemInfoImpl;
	
	public void setmItemInfoImpl(ItemInfoInterface mItemInfoImpl) {
		this.mItemInfoImpl = mItemInfoImpl;
	}

	@Override
	public boolean addItemInfo(ItemInfoModle iteminfo) {
		/*
		 * 1.д�����߼�
		 * 2.����Dao�еķ����������ݿ����
		 */
		
		
		return mItemInfoImpl.addItemInfo(iteminfo);
	}
	
}
