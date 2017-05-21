package com.brave.jooq.service;

import com.brave.jooq.repository.SampleRepos;
import org.jooq.Record;
import org.jooq.Record4;
import org.jooq.Result;
import org.jooq.util.derby.sys.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by junzhang on 2017/5/20.
 */
@Service
public class SampleService {
    @Autowired
    SampleRepos sampleRepos;

    public Result<Record> getResult(){
        return sampleRepos.getResult();
    }

    public Result<Record4<Integer, String, Integer, Integer>> getRecord(){
        return sampleRepos.getRecord();
    }

    public void addBook(){
       int result =  sampleRepos.insertBook();
       System.out.println(result);
    }

    @Transactional
    public void transactionTest(){
        sampleRepos.updateAuthor();
        sampleRepos.insertBookException();
    }
}
