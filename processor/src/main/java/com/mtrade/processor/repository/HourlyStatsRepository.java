package com.mtrade.processor.repository;

import com.mtrade.processor.model.HourlyStats;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

import java.math.BigInteger;

/**
 * @author jaroslav.psenicka@gmail.com
 */
public interface HourlyStatsRepository extends MongoRepository<HourlyStats, BigInteger> {

}

