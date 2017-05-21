package com.brave.jooq.controller;

import com.brave.jooq.service.SampleService;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.util.derby.sys.Sys;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.jooq.util.maven.sample.Tables.AUTHOR;

/**
 * Created by junzhang on 2017/5/20.
 */
@RestController
public class SampleController {

    @Autowired
    SampleService sampleService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public void sample(){
        Result<Record> records = sampleService.getResult();
        records.stream().forEach(
                record -> {
                    System.out.println(record.getValue(AUTHOR.ID));
                    System.out.println(record.getValue(AUTHOR.FIRST_NAME));
                    System.out.println(record.getValue(AUTHOR.LAST_NAME));


                }
        );
    }

    @GetMapping(value = "/v4")
    public void sample4(){
        Result<?> result = sampleService.getRecord();
        result.stream().forEach(re->{
            System.out.println(re.getValue(0));
            System.out.println(re.getValue(1));
            System.out.println(re.getValue(2));
            System.out.println(re.getValue(3));
        });
        sampleService.addBook();
    }

    @GetMapping(value = "/v5")
    public void testTrans(){
        sampleService.transactionTest();;
    }
}
