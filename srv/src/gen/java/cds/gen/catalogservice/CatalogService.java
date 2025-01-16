package cds.gen.catalogservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.services.cds.ApplicationService;
import com.sap.cds.services.cds.CqnService;
import com.sap.cds.services.cds.RemoteService;
import com.sap.cds.services.draft.DraftService;
import javax.annotation.processing.Generated;

@Generated(
    value = "cds-maven-plugin",
    date = "2025-01-16T08:07:18.185995437Z",
    comments = "com.sap.cds:cds-maven-plugin:3.5.0 / com.sap.cds:cds4j-api:3.5.0"
)
@CdsName(CatalogService_.CDS_NAME)
public interface CatalogService extends CqnService {
  interface Application extends ApplicationService, CatalogService {
  }

  interface Remote extends RemoteService, CatalogService {
  }

  interface Draft extends DraftService, CatalogService {
  }
}
