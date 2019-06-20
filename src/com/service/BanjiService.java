package com.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mapper.BanjiMapper;
import com.pojo.Banji;
import com.pojo.BanjiExample;



@Service("banjiService")
public class BanjiService {

	@Resource
	private BanjiMapper banjidao;
	
	public List<Banji> ListAll() {
		BanjiExample banjiExample = new BanjiExample();
		banjiExample.setDistinct(false);
		banjiExample.setOrderByClause("bjdh asc");
		return banjidao.selectByExample(banjiExample);
	}
	
	public List<Banji> changebj(String xydh){
		BanjiExample banjiExample = new BanjiExample();
		banjiExample.setDistinct(false);
		banjiExample.setOrderByClause("bjdh asc");
		BanjiExample.Criteria criteria = banjiExample.createCriteria();
		criteria.andXydhEqualTo(xydh);
		return banjidao.selectByExample(banjiExample);
	}
}
