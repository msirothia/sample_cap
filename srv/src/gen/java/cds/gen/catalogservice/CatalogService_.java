package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-16T08:07:18.185995437Z",
    comments = "com.sap.cds:cds-maven-plugin:3.5.0 / com.sap.cds:cds4j-api:3.5.0"
)
@CdsName("CatalogService")
public interface CatalogService_ {
  String CDS_NAME = "CatalogService";

  Class<BooksTexts_> BOOKS_TEXTS = BooksTexts_.class;

  Class<Books_> BOOKS = Books_.class;
}
