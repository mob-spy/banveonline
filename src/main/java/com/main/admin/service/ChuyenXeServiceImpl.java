package com.main.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.main.admin.DAO.ChuyenXeDAO;
import com.main.admin.model.ChuyenXe;

@Service("ChuyenXeService")
public class ChuyenXeServiceImpl implements ChuyenXeService{
	
	@Autowired
	private ChuyenXeDAO chuyenXeDAO;

	@Override
	public Iterable<ChuyenXe> findAll() {
		return chuyenXeDAO.findAll();
	}

	@Override
	public void xoaChuyenXe(int id) {
		chuyenXeDAO.delete(id);
	}

	@Override
	public void luuChuyenXe(ChuyenXe chuyenXe) {
		chuyenXeDAO.save(chuyenXe);
	}

	@Override
	public ChuyenXe tim(int id) {
		return chuyenXeDAO.findOne(id);
	}

}
