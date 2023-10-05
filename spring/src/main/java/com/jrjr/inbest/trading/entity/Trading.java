package com.jrjr.inbest.trading.entity;

import com.jrjr.inbest.global.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "trading")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
public class Trading extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long seq;

	private Long simulationSeq;

	private Long userSeq;

	private String nickname;

	private Long amount;

	private Long price;

	private String stockType;

	private String stockCode;

	private String stockName;

	private Integer tradingType;

	private Integer conclusionType;

	@Builder
	public Trading(Long simulationSeq, Long userSeq, String nickname, Long amount, Long price, String stockType,
		String stockCode, String stockName, Integer tradingType, Integer conclusionType) {
		this.simulationSeq = simulationSeq;
		this.userSeq = userSeq;
		this.nickname = nickname;
		this.amount = amount;
		this.price = price;
		this.stockType = stockType;
		this.stockCode = stockCode;
		this.stockName = stockName;
		this.tradingType = tradingType;
		this.conclusionType = conclusionType;
	}
}