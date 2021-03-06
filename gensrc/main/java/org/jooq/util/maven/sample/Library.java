/**
 * This class is generated by jOOQ
 */
package org.jooq.util.maven.sample;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Table;
import org.jooq.impl.SchemaImpl;
import org.jooq.util.maven.sample.tables.Author;
import org.jooq.util.maven.sample.tables.Book;
import org.jooq.util.maven.sample.tables.BookStore;
import org.jooq.util.maven.sample.tables.BookToBookStore;
import org.jooq.util.maven.sample.tables.Databasechangeloglock;
import org.jooq.util.maven.sample.tables.Language;


/**
 * This class is generated by jOOQ.
 */
@Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.6.4"
	},
	comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Library extends SchemaImpl {

	private static final long serialVersionUID = -1603628387;

	/**
	 * The reference instance of <code>library</code>
	 */
	public static final Library LIBRARY = new Library();

	/**
	 * No further instances allowed
	 */
	private Library() {
		super("library");
	}

	@Override
	public final List<Table<?>> getTables() {
		List result = new ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final List<Table<?>> getTables0() {
		return Arrays.<Table<?>>asList(
			Author.AUTHOR,
			Book.BOOK,
			BookStore.BOOK_STORE,
			BookToBookStore.BOOK_TO_BOOK_STORE,
			Databasechangeloglock.DATABASECHANGELOGLOCK,
			Language.LANGUAGE);
	}
}
