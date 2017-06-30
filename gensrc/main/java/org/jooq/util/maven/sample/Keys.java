/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.sample;


import javax.annotation.Generated;

import org.jooq.UniqueKey;
import org.jooq.impl.AbstractKeys;
import org.jooq.util.maven.sample.tables.Author;
import org.jooq.util.maven.sample.tables.Book;
import org.jooq.util.maven.sample.tables.BookStore;
import org.jooq.util.maven.sample.tables.BookToBookStore;
import org.jooq.util.maven.sample.tables.Databasechangeloglock;
import org.jooq.util.maven.sample.tables.Language;
import org.jooq.util.maven.sample.tables.records.AuthorRecord;
import org.jooq.util.maven.sample.tables.records.BookRecord;
import org.jooq.util.maven.sample.tables.records.BookStoreRecord;
import org.jooq.util.maven.sample.tables.records.BookToBookStoreRecord;
import org.jooq.util.maven.sample.tables.records.DatabasechangeloglockRecord;
import org.jooq.util.maven.sample.tables.records.LanguageRecord;


/**
 * A class modelling foreign key relationships between tables of the <code>library</code> 
 * schema
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = UniqueKeys0.KEY_AUTHOR_PRIMARY;
	public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = UniqueKeys0.KEY_BOOK_PRIMARY;
	public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME = UniqueKeys0.KEY_BOOK_STORE_NAME;
	public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = UniqueKeys0.KEY_BOOK_TO_BOOK_STORE_PRIMARY;
	public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = UniqueKeys0.KEY_DATABASECHANGELOGLOCK_PRIMARY;
	public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = UniqueKeys0.KEY_LANGUAGE_PRIMARY;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class UniqueKeys0 extends AbstractKeys {
		public static final UniqueKey<AuthorRecord> KEY_AUTHOR_PRIMARY = createUniqueKey(Author.AUTHOR, Author.AUTHOR.ID);
		public static final UniqueKey<BookRecord> KEY_BOOK_PRIMARY = createUniqueKey(Book.BOOK, Book.BOOK.ID);
		public static final UniqueKey<BookStoreRecord> KEY_BOOK_STORE_NAME = createUniqueKey(BookStore.BOOK_STORE, BookStore.BOOK_STORE.NAME);
		public static final UniqueKey<BookToBookStoreRecord> KEY_BOOK_TO_BOOK_STORE_PRIMARY = createUniqueKey(BookToBookStore.BOOK_TO_BOOK_STORE, BookToBookStore.BOOK_TO_BOOK_STORE.NAME, BookToBookStore.BOOK_TO_BOOK_STORE.BOOK_ID);
		public static final UniqueKey<DatabasechangeloglockRecord> KEY_DATABASECHANGELOGLOCK_PRIMARY = createUniqueKey(Databasechangeloglock.DATABASECHANGELOGLOCK, Databasechangeloglock.DATABASECHANGELOGLOCK.ID);
		public static final UniqueKey<LanguageRecord> KEY_LANGUAGE_PRIMARY = createUniqueKey(Language.LANGUAGE, Language.LANGUAGE.ID);
	}
}
