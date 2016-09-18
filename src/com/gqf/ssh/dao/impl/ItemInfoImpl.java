package com.gqf.ssh.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.gqf.ssh.dao.ItemInfoInterface;
import com.gqf.ssh.modle.ItemInfoModle;

public class ItemInfoImpl implements ItemInfoInterface{
	
	/**
	 * ʹ��session�������ݿ�
	 * ʹ��sessionfactory��ȡsession
	 */
	private SessionFactory mSessionFactory;
	
	public void setmSessionFactory(SessionFactory mSessionFactory) {
		this.mSessionFactory = mSessionFactory;
	}

	private Session getSession(){
		return mSessionFactory.getCurrentSession();
	}
	
	@Override 
	public boolean addItemInfo(ItemInfoModle iteminfo) {
		//��������
		
		
		return getSession().save(iteminfo)!=null?true:false;
	}
	
}
