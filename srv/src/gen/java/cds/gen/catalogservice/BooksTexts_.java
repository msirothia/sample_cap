package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.processing.Generated;

@CdsName("CatalogService.Books.texts")
@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-16T08:07:18.185995437Z",
    comments = "com.sap.cds:cds-maven-plugin:3.5.0 / com.sap.cds:cds4j-api:3.5.0"
)
public interface BooksTexts_ extends StructuredType<BooksTexts_> {
  String ID = "ID";

  String CDS_NAME = "CatalogService.Books.texts";

  ElementRef<String> locale();

  @CdsName(ID)
  ElementRef<Integer> ID();

  ElementRef<String> title();
}
