package com.spring.reactive.loan.repository;

import com.spring.reactive.loan.entity.LoanDetails;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoanRepository extends ReactiveMongoRepository<LoanDetails,String> {

}
