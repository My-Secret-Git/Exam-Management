package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.mapper.ShijuanMapper;
import com.pojo.Shijuan;
import com.pojo.ShijuanExample;



@Service("shijuanService")
public class ShijuanService {

	@Resource
	private ShijuanMapper shijuandao;
	
	private Logger logger = Logger.getLogger(ShijuanService.class);
	
	public boolean add(Shijuan shijuan) {
		shijuan.setStatus("no");
		return shijuandao.insertSelective(shijuan)==1;
	}
	
	 public Shijuan queryTimuBybjdh(String bjdh) {
		 ShijuanExample shijuanExample = new ShijuanExample();
		 shijuanExample.setDistinct(false);
		 shijuanExample.setOrderByClause("id asc");
		 ShijuanExample.Criteria criteria = shijuanExample.createCriteria();
		 criteria.andBjdhEqualTo(bjdh);
		 criteria.andStatusEqualTo("start");
		 List<Shijuan> list = shijuandao.selectByExample(shijuanExample);
		 Shijuan shijuan = list.get(0);
		 return shijuan;
	 }
	 
	 public List<Shijuan> ListAll() {
		 ShijuanExample shijuanExample = new ShijuanExample();
		 shijuanExample.setDistinct(false);
		 shijuanExample.setOrderByClause("id asc");
		 return shijuandao.selectByExample(shijuanExample);
	 }
	 
	 public boolean uptateByIdAndZhuangtai(String id1,String zhuangtai) {
		 Shijuan shijuan = new Shijuan();
		 shijuan.setId(Integer.parseInt(id1));
		 shijuan.setStatus(zhuangtai);
		 return shijuandao.updateByPrimaryKeySelective(shijuan)==1;
	 }
	
}
