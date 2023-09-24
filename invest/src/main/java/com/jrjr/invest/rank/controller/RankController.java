package com.jrjr.invest.rank.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jrjr.invest.rank.dto.RedisUserDTO;
import com.jrjr.invest.rank.service.UserRankService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/rank")
@RequiredArgsConstructor
@Slf4j
public class RankController {

	private final UserRankService userRankService;

	@PostMapping("/users")
	ResponseEntity<Map<String, Object>> insertUserRankingInfo(@RequestBody RedisUserDTO redisUserDTO) {
		log.info("========== 유저 랭킹 정보 추가 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		userRankService.insertUserInfo(redisUserDTO);

		log.info("========== 유저 랭킹 정보 추가 완료 ==========");
		resultMap.put("success", true);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

	@PutMapping("/users")
	ResponseEntity<Map<String, Object>> updateUserRankingInfo(@RequestBody RedisUserDTO redisUserDTO) {
		log.info("========== 유저 랭킹 정보 수정 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		userRankService.updateUserProfileInfo(redisUserDTO);

		log.info("========== 유저 랭킹 정보 수정 완료 ==========");
		resultMap.put("success", true);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

	@GetMapping("/test/users/{seq}")
	ResponseEntity<Map<String, Object>> testUpdateUserRankingTierAndRateInfo(@PathVariable(value = "seq") Long seq) {
		log.info("========== 티어 및 수익률 정보 업데이트 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		userRankService.updateUserTierAndRateInfo(seq);

		log.info("========== 티어 및 수익률 정보 업데이트 완료 ==========");
		resultMap.put("success", true);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

	@GetMapping("/test/users")
	ResponseEntity<Map<String, Object>> testUpdateAllUserRankingTierAndRateInfo() {
		log.info("========== 전체 회원 티어 및 수익률 정보 업데이트 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		userRankService.updateAllUserTierAndRateInfo();

		log.info("========== 전체 회원 티어 및 수익률 정보 업데이트 완료 ==========");
		resultMap.put("success", true);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

	@GetMapping("/test/sort")
	ResponseEntity<Map<String, Object>> testSortUserRankingInfo() {
		log.info("========== 개인 랭킹 정보 업데이트 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		userRankService.updateUserRankingInfo();

		log.info("========== 개인 랭킹 정보 업데이트 완료 ==========");
		resultMap.put("success", true);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

	@GetMapping("/test/info")
	ResponseEntity<Map<String, Object>> testGetUserRankingInfo(@RequestParam Long start,
		@RequestParam Long end) {
		log.info("========== 개인 랭킹 정보 불러오기 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		Set<RedisUserDTO> userRankingInfo = userRankService.getUserRankingInfo(start, end);

		log.info("========== 개인 랭킹 정보 불러오기 완료 ==========");
		resultMap.put("success", true);
		resultMap.put("UserRankingInfo", userRankingInfo);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}

	@GetMapping("/test/info/{seq}")
	ResponseEntity<Map<String, Object>> testGetMyRankingInfo(@PathVariable(value = "seq") Long seq) {
		log.info("========== 개인 랭킹 정보 불러오기 시작 ==========");
		Map<String, Object> resultMap = new HashMap<>();

		RedisUserDTO myRankingInfo = userRankService.getMyRankingInfo(seq);

		log.info("========== 개인 랭킹 정보 불러오기 완료 ==========");
		resultMap.put("success", true);
		resultMap.put("MyRankingInfo", myRankingInfo);
		return new ResponseEntity<>(resultMap, HttpStatus.OK);
	}
}
