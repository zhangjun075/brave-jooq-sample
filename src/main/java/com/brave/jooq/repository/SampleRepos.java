package com.brave.jooq.repository;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Record4;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import static org.jooq.util.maven.sample.Tables.AUTHOR;
import static org.jooq.util.maven.sample.Tables.BOOK;

/**
 * Created by junzhang on 2017/5/20.
 */
@Repository
public class SampleRepos {
    @Autowired
    DSLContext dslContext;

    public Result<Record> getResult(){
        return dslContext.select().from(AUTHOR).fetch();
    }

    public Result<Record4<Integer,String,Integer,Integer>> getRecord(){
        return dslContext.select(AUTHOR.ID,BOOK.TITLE,BOOK.LANGUAGE_ID,BOOK.PUBLISHED_IN).from(AUTHOR)
                .join(BOOK)
                .on(BOOK.AUTHOR_ID.eq(AUTHOR.ID))
                .fetch();
    }

    public int insertBook(){
        int record = dslContext.insertInto(BOOK)
                .set(BOOK.ID,6)
                .set(BOOK.AUTHOR_ID, 1)
                .set(BOOK.TITLE, "test")
                .set(BOOK.PUBLISHED_IN, 1984)
                .set(BOOK.LANGUAGE_ID, 1)
                .execute();
        return record;
    }

    public int updateAuthor(){
        int record = dslContext.update(AUTHOR)
                .set(AUTHOR.FIRST_NAME,"heling")
                .where(AUTHOR.ID.eq(1))
                .execute();
        return record;
    }
    public int insertBookException(){
        int record = dslContext.insertInto(BOOK)
                .set(BOOK.AUTHOR_ID, 1)
                .set(BOOK.TITLE, "test")
                .set(BOOK.PUBLISHED_IN, 1984)
                .set(BOOK.LANGUAGE_ID, 1)
                .execute();
        return record;
    }

}
