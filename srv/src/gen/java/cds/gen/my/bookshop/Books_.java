package cds.gen.my.bookshop;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;
import javax.annotation.processing.Generated;

@CdsName("my.bookshop.Books")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-16T08:07:18.185995437Z",
    comments = "com.sap.cds:cds-maven-plugin:3.5.0 / com.sap.cds:cds4j-api:3.5.0"
)
public interface Books_ extends StructuredType<Books_> {
  String ID = "ID";

  String CDS_NAME = "my.bookshop.Books";

  @CdsName(ID)
  ElementRef<Integer> ID();

  ElementRef<String> title();

  ElementRef<Integer> stock();

  BooksTexts_ texts();

  BooksTexts_ texts(Function<BooksTexts_, CqnPredicate> filter);

  BooksTexts_ localized();

  BooksTexts_ localized(Function<BooksTexts_, CqnPredicate> filter);
}
