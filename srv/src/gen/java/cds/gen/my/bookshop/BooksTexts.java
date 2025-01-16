package cds.gen.my.bookshop;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import javax.annotation.processing.Generated;

@CdsName("my.bookshop.Books.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-16T08:07:18.185995437Z",
    comments = "com.sap.cds:cds-maven-plugin:3.5.0 / com.sap.cds:cds4j-api:3.5.0"
)
public interface BooksTexts extends CdsData {
  String LOCALE = "locale";

  String ID = "ID";

  String TITLE = "title";

  String getLocale();

  void setLocale(String locale);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  String getTitle();

  void setTitle(String title);

  BooksTexts_ ref();

  static BooksTexts create() {
    return Struct.create(BooksTexts.class);
  }

  static BooksTexts of(Map<String, Object> map) {
    return Struct.access(map).as(BooksTexts.class);
  }
}
