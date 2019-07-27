package br.com.newbietrader.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import com.mongodb.MongoClient;

import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.dto.StockValueDTO;

@ApplicationScoped
public class StockService {

	private List<StockDTO> database = new ArrayList<>();
	
	
	public List<StockDTO> findAll() {
		return database;
	}
	
}
