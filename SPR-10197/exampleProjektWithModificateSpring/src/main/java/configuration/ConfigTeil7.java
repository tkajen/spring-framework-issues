package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import beans.DIObjekt1;
import beans.DIObjekt2;
import beans.DIObjekt3;
import beans.Service1;
import beans.Service1Impl;
import beans.Service2;
import beans.Service2Impl;
import beans.Service3;
import beans.Service3Impl;
import beans.Service4;
import beans.Service4Impl;


@Configuration
public class ConfigTeil7 {

	@Autowired private DIObjekt1 diObjekt1;
	@Autowired private DIObjekt2 diObjekt2;
	@Autowired private DIObjekt3 diObjekt3;
	
	@Bean public Service1 service70(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service71(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service72(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service73(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service74(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service75(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service76(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service77(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service78(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }
	@Bean public Service1 service79(){   Service1Impl Service1 = new Service1Impl();   Service1.setDIObjekt(diObjekt1);   return Service1;  }

}
